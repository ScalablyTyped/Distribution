package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(action: String = null, paths: js.Array[String] = null): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
}

