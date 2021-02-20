package typings.highlightJs

import typings.highlightJs.anon.OmitHighlightResultsecond
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightResult extends StObject {
  
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
  implicit class HighlightResultMutableBuilder[Self <: HighlightResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitter(value: Emitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRaised(value: Error): Self = StObject.set(x, "errorRaised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRaisedUndefined: Self = StObject.set(x, "errorRaised", js.undefined)
    
    @scala.inline
    def setIllegal(value: Boolean): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalBy(value: illegalData): Self = StObject.set(x, "illegalBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalByUndefined: Self = StObject.set(x, "illegalBy", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_best(value: OmitHighlightResultsecond): Self = StObject.set(x, "second_best", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_bestUndefined: Self = StObject.set(x, "second_best", js.undefined)
    
    @scala.inline
    def setSofar(value: String): Self = StObject.set(x, "sofar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSofarUndefined: Self = StObject.set(x, "sofar", js.undefined)
    
    @scala.inline
    def setTop(value: Language | CompiledMode): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
