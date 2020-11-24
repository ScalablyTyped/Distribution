package typings.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightAutoResult extends HighlightResult {
  
  var secondBest: js.UndefOr[HighlightAutoResult] = js.native
}
object HighlightAutoResult {
  
  @scala.inline
  def apply(language: String, relevance: Double, value: js.Array[HastNode]): HighlightAutoResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightAutoResult]
  }
  
  @scala.inline
  implicit class HighlightAutoResultOps[Self <: HighlightAutoResult] (val x: Self) extends AnyVal {
    
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
    def setSecondBest(value: HighlightAutoResult): Self = this.set("secondBest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondBest: Self = this.set("secondBest", js.undefined)
  }
}
