package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutoHighlightResult extends IHighlightResultBase {
  var second_best: js.UndefOr[IAutoHighlightResult] = js.native
}

object IAutoHighlightResult {
  @scala.inline
  def apply(language: String, relevance: Double, value: String): IAutoHighlightResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoHighlightResult]
  }
  @scala.inline
  implicit class IAutoHighlightResultOps[Self <: IAutoHighlightResult] (val x: Self) extends AnyVal {
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
    def setSecond_best(value: IAutoHighlightResult): Self = this.set("second_best", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond_best: Self = this.set("second_best", js.undefined)
  }
  
}

