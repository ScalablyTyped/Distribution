package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s past or current organization. Overlapping date ranges are
  * permitted.
  */
@js.native
trait SchemaOrganization extends js.Object {
  
  /**
    * True if the organization is the person&#39;s current organization; false
    * if the organization is a past organization.
    */
  var current: js.UndefOr[Boolean] = js.native
  
  /**
    * The person&#39;s department at the organization.
    */
  var department: js.UndefOr[String] = js.native
  
  /**
    * The domain name associated with the organization; for example,
    * `google.com`.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The end date when the person left the organization.
    */
  var endDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The read-only type of the organization translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  
  /**
    * The person&#39;s job description at the organization.
    */
  var jobDescription: js.UndefOr[String] = js.native
  
  /**
    * The location of the organization office the person works at.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the organization.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The name of the organization.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The phonetic name of the organization.
    */
  var phoneticName: js.UndefOr[String] = js.native
  
  /**
    * The start date when the person joined the organization.
    */
  var startDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The symbol associated with the organization; for example, a stock ticker
    * symbol, abbreviation, or acronym.
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * The person&#39;s job title at the organization.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of the organization. The type can be custom or  one of these
    * predefined values:  * `work` * `school`
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaOrganization {
  
  @scala.inline
  def apply(): SchemaOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganization]
  }
  
  @scala.inline
  implicit class SchemaOrganizationOps[Self <: SchemaOrganization] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEndDate(value: SchemaDate): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    
    @scala.inline
    def setJobDescription(value: String): Self = this.set("jobDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobDescription: Self = this.set("jobDescription", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = this.set("phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneticName: Self = this.set("phoneticName", js.undefined)
    
    @scala.inline
    def setStartDate(value: SchemaDate): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
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
