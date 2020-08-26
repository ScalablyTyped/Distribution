package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHighlightResultBase extends js.Object {
  var language: String = js.native
  var relevance: Double = js.native
  var value: String = js.native
}

object IHighlightResultBase {
  @scala.inline
  def apply(language: String, relevance: Double, value: String): IHighlightResultBase = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightResultBase]
  }
  @scala.inline
  implicit class IHighlightResultBaseOps[Self <: IHighlightResultBase] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

