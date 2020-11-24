package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies FHIR paths to match, and how to handle de-identification of
  * matching fields.
  */
@js.native
trait SchemaFieldMetadata extends js.Object {
  
  /**
    * Deidentify action for one field.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * List of paths to FHIR fields to be redacted. Each path is a
    * period-separated list where each component is either a field name or FHIR
    * type name, for example: Patient, HumanName. For &quot;choice&quot; types
    * (those defined in the FHIR spec with the form: field[x]) we use two
    * separate components. e.g. &quot;deceasedAge.unit&quot; is matched by
    * &quot;Deceased.Age.unit&quot;. Supported types are:
    * AdministrativeGenderCode, Code, Date, DateTime, Decimal, HumanName, Id,
    * LanguageCode, Markdown, MimeTypeCode, Oid, String, Uri, Uuid, Xhtml.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
}
object SchemaFieldMetadata {
  
  @scala.inline
  def apply(): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
  
  @scala.inline
  implicit class SchemaFieldMetadataOps[Self <: SchemaFieldMetadata] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
}
