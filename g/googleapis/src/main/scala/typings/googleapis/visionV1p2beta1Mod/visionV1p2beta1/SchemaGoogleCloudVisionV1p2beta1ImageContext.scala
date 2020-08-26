package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image context and/or feature-specific parameters.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ImageContext extends js.Object {
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1CropHintsParams] = js.native
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
  var latLongRect: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1LatLongRect] = js.native
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ProductSearchParams] = js.native
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1WebDetectionParams] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1ImageContext {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageContext]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1ImageContextOps[Self <: SchemaGoogleCloudVisionV1p2beta1ImageContext] (val x: Self) extends AnyVal {
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
    def setCropHintsParams(value: SchemaGoogleCloudVisionV1p2beta1CropHintsParams): Self = this.set("cropHintsParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropHintsParams: Self = this.set("cropHintsParams", js.undefined)
    @scala.inline
    def setLanguageHintsVarargs(value: String*): Self = this.set("languageHints", js.Array(value :_*))
    @scala.inline
    def setLanguageHints(value: js.Array[String]): Self = this.set("languageHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageHints: Self = this.set("languageHints", js.undefined)
    @scala.inline
    def setLatLongRect(value: SchemaGoogleCloudVisionV1p2beta1LatLongRect): Self = this.set("latLongRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLongRect: Self = this.set("latLongRect", js.undefined)
    @scala.inline
    def setProductSearchParams(value: SchemaGoogleCloudVisionV1p2beta1ProductSearchParams): Self = this.set("productSearchParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSearchParams: Self = this.set("productSearchParams", js.undefined)
    @scala.inline
    def setWebDetectionParams(value: SchemaGoogleCloudVisionV1p2beta1WebDetectionParams): Self = this.set("webDetectionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebDetectionParams: Self = this.set("webDetectionParams", js.undefined)
  }
  
}

