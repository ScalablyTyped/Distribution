package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal index definition.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1Index extends js.Object {
  /**
    * The index&#39;s ancestor mode.  Must not be ANCESTOR_MODE_UNSPECIFIED.
    * Required.
    */
  var ancestor: js.UndefOr[String] = js.native
  /**
    * The resource ID of the index. Output only.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * The entity kind to which this index applies. Required.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Project ID. Output only.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * An ordered sequence of property names and their index attributes.
    * Required.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]] = js.native
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1Index {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Index]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexOps[Self <: SchemaGoogleDatastoreAdminV1Index] (val x: Self) extends AnyVal {
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
    def setAncestor(value: String): Self = this.set("ancestor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAncestor: Self = this.set("ancestor", js.undefined)
    @scala.inline
    def setIndexId(value: String): Self = this.set("indexId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexId: Self = this.set("indexId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: SchemaGoogleDatastoreAdminV1IndexedProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

