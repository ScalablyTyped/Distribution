package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the text annotation API, which can perform multiple
  * analysis types (sentiment, entities, and syntax) in one call.
  */
@js.native
trait SchemaAnnotateTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
  /**
    * The enabled features.
    */
  var features: js.UndefOr[SchemaFeatures] = js.native
}

object SchemaAnnotateTextRequest {
  @scala.inline
  def apply(): SchemaAnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateTextRequest]
  }
  @scala.inline
  implicit class SchemaAnnotateTextRequestOps[Self <: SchemaAnnotateTextRequest] (val x: Self) extends AnyVal {
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
    def setDocument(value: SchemaDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setEncodingType(value: String): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("encodingType", js.undefined)
    @scala.inline
    def setFeatures(value: SchemaFeatures): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
  }
  
}

