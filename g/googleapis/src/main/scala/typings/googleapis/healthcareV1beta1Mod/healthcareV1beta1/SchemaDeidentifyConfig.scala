package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures de-id options specific to different types of content. Each
  * submessage customizes the handling of an
  * https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are
  * applied in a nested manner at runtime.
  */
@js.native
trait SchemaDeidentifyConfig extends js.Object {
  /**
    * Configures de-id of application/DICOM content.
    */
  var dicom: js.UndefOr[SchemaDicomConfig] = js.native
  /**
    * Configures de-id of application/FHIR content.
    */
  var fhir: js.UndefOr[SchemaFhirConfig] = js.native
  /**
    * Configures de-identification of image pixels wherever they are found in
    * the source_dataset.
    */
  var image: js.UndefOr[SchemaImageConfig] = js.native
  /**
    * Configures de-identification of text wherever it is found in the
    * source_dataset.
    */
  var text: js.UndefOr[SchemaTextConfig] = js.native
}

object SchemaDeidentifyConfig {
  @scala.inline
  def apply(
    dicom: SchemaDicomConfig = null,
    fhir: SchemaFhirConfig = null,
    image: SchemaImageConfig = null,
    text: SchemaTextConfig = null
  ): SchemaDeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    if (dicom != null) __obj.updateDynamic("dicom")(dicom.asInstanceOf[js.Any])
    if (fhir != null) __obj.updateDynamic("fhir")(fhir.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeidentifyConfig]
  }
}

