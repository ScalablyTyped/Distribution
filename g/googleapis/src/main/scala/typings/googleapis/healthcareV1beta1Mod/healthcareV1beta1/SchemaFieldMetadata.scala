package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies FHIR paths to match, and how to handle de-identification of
  * matching fields.
  */
@js.native
trait SchemaFieldMetadata extends StObject {
  
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
  implicit class SchemaFieldMetadataMutableBuilder[Self <: SchemaFieldMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
