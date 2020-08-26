package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if no
    * source language was passed within the initial request. If the source
    * language was passed, auto-detection of the language will not occur and
    * this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String] = js.native
  /**
    * The `model` type used for this translation. Valid values are listed in
    * public documentation. Can be different from requested `model`. Present
    * only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Text translated into the target language.
    */
  var translatedText: js.UndefOr[String] = js.native
}

object SchemaTranslationsResource {
  @scala.inline
  def apply(): SchemaTranslationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsResource]
  }
  @scala.inline
  implicit class SchemaTranslationsResourceOps[Self <: SchemaTranslationsResource] (val x: Self) extends AnyVal {
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
    def setDetectedSourceLanguage(value: String): Self = this.set("detectedSourceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedSourceLanguage: Self = this.set("detectedSourceLanguage", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setTranslatedText(value: String): Self = this.set("translatedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslatedText: Self = this.set("translatedText", js.undefined)
  }
  
}

