package typings.highlightJs

import typings.highlightJs.anon.OmitHighlightResultsecond
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightResult extends js.Object {
  
  var emitter: Emitter = js.native
  
  var errorRaised: js.UndefOr[Error] = js.native
  
  var illegal: Boolean = js.native
  
  var illegalBy: js.UndefOr[illegalData] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var relevance: Double = js.native
  
  // * for auto-highlight
  var second_best: js.UndefOr[OmitHighlightResultsecond] = js.native
  
  var sofar: js.UndefOr[String] = js.native
  
  var top: js.UndefOr[Language | CompiledMode] = js.native
  
  var value: String = js.native
}
object HighlightResult {
  
  @scala.inline
  def apply(emitter: Emitter, illegal: Boolean, relevance: Double, value: String): HighlightResult = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult]
  }
  
  @scala.inline
  implicit class HighlightResultOps[Self <: HighlightResult] (val x: Self) extends AnyVal {
    
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
    def setEmitter(value: Emitter): Self = this.set("emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegal(value: Boolean): Self = this.set("illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRaised(value: Error): Self = this.set("errorRaised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRaised: Self = this.set("errorRaised", js.undefined)
    
    @scala.inline
    def setIllegalBy(value: illegalData): Self = this.set("illegalBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIllegalBy: Self = this.set("illegalBy", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setSecond_best(value: OmitHighlightResultsecond): Self = this.set("second_best", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond_best: Self = this.set("second_best", js.undefined)
    
    @scala.inline
    def setSofar(value: String): Self = this.set("sofar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSofar: Self = this.set("sofar", js.undefined)
    
    @scala.inline
    def setTop(value: Language | CompiledMode): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
