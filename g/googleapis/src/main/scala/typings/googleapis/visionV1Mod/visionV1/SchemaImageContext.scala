package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image context and/or feature-specific parameters.
  */
@js.native
trait SchemaImageContext extends js.Object {
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaCropHintsParams] = js.native
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty
    * value yields the best results since it enables automatic language
    * detection. For languages based on the Latin alphabet, setting
    * `language_hints` is not needed. In rare cases, when the language of the
    * text in the image is known, setting a hint will help get better results
    * (although it will be a significant hindrance if the hint is wrong). Text
    * detection returns an error if one or more of the specified languages is
    * not one of the [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[SchemaLatLongRect] = js.native
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaProductSearchParams] = js.native
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaWebDetectionParams] = js.native
}

object SchemaImageContext {
  @scala.inline
  def apply(
    cropHintsParams: SchemaCropHintsParams = null,
    languageHints: js.Array[String] = null,
    latLongRect: SchemaLatLongRect = null,
    productSearchParams: SchemaProductSearchParams = null,
    webDetectionParams: SchemaWebDetectionParams = null
  ): SchemaImageContext = {
    val __obj = js.Dynamic.literal()
    if (cropHintsParams != null) __obj.updateDynamic("cropHintsParams")(cropHintsParams.asInstanceOf[js.Any])
    if (languageHints != null) __obj.updateDynamic("languageHints")(languageHints.asInstanceOf[js.Any])
    if (latLongRect != null) __obj.updateDynamic("latLongRect")(latLongRect.asInstanceOf[js.Any])
    if (productSearchParams != null) __obj.updateDynamic("productSearchParams")(productSearchParams.asInstanceOf[js.Any])
    if (webDetectionParams != null) __obj.updateDynamic("webDetectionParams")(webDetectionParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageContext]
  }
}

