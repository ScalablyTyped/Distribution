package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an organization entry.
  */
@js.native
trait SchemaUserOrganization extends js.Object {
  /**
    * The cost center of the users department.
    */
  var costCenter: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Department within the organization.
    */
  var department: js.UndefOr[String] = js.native
  /**
    * Description of the organization.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The domain to which the organization belongs to.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The full-time equivalent percent within the organization (100000 = 100%).
    */
  var fullTimeEquivalent: js.UndefOr[Double] = js.native
  /**
    * Location of the organization. This need not be fully qualified address.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Name of the organization
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If it user&#39;s primary organization.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Symbol of the organization.
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Title (designation) of the user in the organization.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example organization could be of school, work etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * CustomType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserOrganization {
  @scala.inline
  def apply(): SchemaUserOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserOrganization]
  }
  @scala.inline
  implicit class SchemaUserOrganizationOps[Self <: SchemaUserOrganization] (val x: Self) extends AnyVal {
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
    def setCostCenter(value: String): Self = this.set("costCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostCenter: Self = this.set("costCenter", js.undefined)
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setFullTimeEquivalent(value: Double): Self = this.set("fullTimeEquivalent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTimeEquivalent: Self = this.set("fullTimeEquivalent", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

