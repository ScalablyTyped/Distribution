package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification request message.
  */
@js.native
trait SchemaClassifyTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
}

object SchemaClassifyTextRequest {
  @scala.inline
  def apply(): SchemaClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextRequest]
  }
  @scala.inline
  implicit class SchemaClassifyTextRequestOps[Self <: SchemaClassifyTextRequest] (val x: Self) extends AnyVal {
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
  }
  
}

