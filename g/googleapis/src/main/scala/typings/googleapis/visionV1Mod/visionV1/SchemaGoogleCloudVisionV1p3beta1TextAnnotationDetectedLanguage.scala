package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected language for a structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage extends js.Object {
  /**
    * Confidence of detected language. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguageOps[Self <: SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
  
}

