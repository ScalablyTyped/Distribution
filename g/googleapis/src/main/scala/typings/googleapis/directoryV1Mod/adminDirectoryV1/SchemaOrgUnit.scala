package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Org Unit resource in Directory API.
  */
@js.native
trait SchemaOrgUnit extends js.Object {
  /**
    * Should block inheritance
    */
  var blockInheritance: js.UndefOr[Boolean] = js.native
  /**
    * Description of OrgUnit
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of OrgUnit
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Id of OrgUnit
    */
  var orgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of OrgUnit
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  /**
    * Id of parent OrgUnit
    */
  var parentOrgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of parent OrgUnit
    */
  var parentOrgUnitPath: js.UndefOr[String] = js.native
}

object SchemaOrgUnit {
  @scala.inline
  def apply(): SchemaOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnit]
  }
  @scala.inline
  implicit class SchemaOrgUnitOps[Self <: SchemaOrgUnit] (val x: Self) extends AnyVal {
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
    def setBlockInheritance(value: Boolean): Self = this.set("blockInheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockInheritance: Self = this.set("blockInheritance", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
    @scala.inline
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
    @scala.inline
    def setParentOrgUnitId(value: String): Self = this.set("parentOrgUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentOrgUnitId: Self = this.set("parentOrgUnitId", js.undefined)
    @scala.inline
    def setParentOrgUnitPath(value: String): Self = this.set("parentOrgUnitPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentOrgUnitPath: Self = this.set("parentOrgUnitPath", js.undefined)
  }
  
}

