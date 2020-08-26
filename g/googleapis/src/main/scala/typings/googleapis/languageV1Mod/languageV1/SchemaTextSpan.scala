package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an output piece of text.
  */
@js.native
trait SchemaTextSpan extends js.Object {
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[Double] = js.native
  /**
    * The content of the output text.
    */
  var content: js.UndefOr[String] = js.native
}

object SchemaTextSpan {
  @scala.inline
  def apply(): SchemaTextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextSpan]
  }
  @scala.inline
  implicit class SchemaTextSpanOps[Self <: SchemaTextSpan] (val x: Self) extends AnyVal {
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
    def setBeginOffset(value: Double): Self = this.set("beginOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginOffset: Self = this.set("beginOffset", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

