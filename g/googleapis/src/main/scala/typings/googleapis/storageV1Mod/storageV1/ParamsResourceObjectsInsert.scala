package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceObjectsInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's bucket value, if any.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * If set, sets the contentEncoding property of the final object to this
    * value. Setting this parameter is equivalent to setting the
    * contentEncoding metadata property. This can be useful when uploading an
    * object with uploadType=media to indicate the encoding of the content
    * being uploaded.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation matches the given value. Setting to 0 makes the operation
    * succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation does not match the given value. If no live object exists, the
    * precondition fails. Setting to 0 makes the operation succeed only if
    * there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Resource name of the Cloud KMS key, of the form
    * projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key,
    * that will be used to encrypt the object. Overrides the object metadata's
    * kms_key_name value, if any.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  /**
    * Name of the object. Required when the object metadata is not otherwise
    * provided. Overrides the object metadata's name value, if any. For
    * information about how to URL encode object names to be path safe, see
    * Encoding URI Path Parts.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Apply a predefined set of access controls to this object.
    */
  var predefinedAcl: js.UndefOr[String] = js.native
  /**
    * Set of properties to return. Defaults to noAcl, unless the object
    * resource specifies the acl property, when it defaults to full.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObject] = js.native
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.native
}

object ParamsResourceObjectsInsert {
  @scala.inline
  def apply(): ParamsResourceObjectsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsInsert]
  }
  @scala.inline
  implicit class ParamsResourceObjectsInsertOps[Self <: ParamsResourceObjectsInsert] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setIfGenerationMatch(value: String): Self = this.set("ifGenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationMatch: Self = this.set("ifGenerationMatch", js.undefined)
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = this.set("ifGenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationNotMatch: Self = this.set("ifGenerationNotMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: String): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaObject): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

