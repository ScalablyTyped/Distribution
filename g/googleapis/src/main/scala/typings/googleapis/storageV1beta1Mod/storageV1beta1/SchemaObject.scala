package typings.googleapis.storageV1beta1Mod.storageV1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Algorithm
import typings.googleapis.anon.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object.
  */
@js.native
trait SchemaObject extends js.Object {
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String] = js.native
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Object media data. Provided on your behalf when uploading raw media or
    * multipart/related with an auxiliary media part.
    */
  var media: js.UndefOr[Algorithm] = js.native
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Entity] = js.native
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaObject {
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  @scala.inline
  implicit class SchemaObjectOps[Self <: SchemaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAclVarargs(value: SchemaObjectAccessControl*): Self = this.set("acl", js.Array(value :_*))
    @scala.inline
    def setAcl(value: js.Array[SchemaObjectAccessControl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMedia(value: Algorithm): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: Entity): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

