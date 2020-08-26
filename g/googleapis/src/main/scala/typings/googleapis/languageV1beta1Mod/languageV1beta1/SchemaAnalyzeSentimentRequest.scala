package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment analysis request message.
  */
@js.native
trait SchemaAnalyzeSentimentRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate sentence offsets for the
    * sentence sentiment.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object SchemaAnalyzeSentimentRequest {
  @scala.inline
  def apply(): SchemaAnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSentimentRequest]
  }
  @scala.inline
  implicit class SchemaAnalyzeSentimentRequestOps[Self <: SchemaAnalyzeSentimentRequest] (val x: Self) extends AnyVal {
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
  }
  
}

