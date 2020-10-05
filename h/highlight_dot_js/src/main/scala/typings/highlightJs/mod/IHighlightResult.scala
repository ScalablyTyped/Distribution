package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighlightResult extends IHighlightResultBase {
  var top: ICompiledMode = js.native
}

object IHighlightResult {
  @scala.inline
  def apply(language: String, relevance: Double, top: ICompiledMode, value: String): IHighlightResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightResult]
  }
  @scala.inline
  implicit class IHighlightResultOps[Self <: IHighlightResult] (val x: Self) extends AnyVal {
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
    def setTop(value: ICompiledMode): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

