package typings.highlightJs.mod

import typings.highlightJs.anon.OmitHighlightResultsecond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightResult extends StObject {
  
  var _emitter: Emitter
  
  // private
  var _illegalBy: js.UndefOr[illegalData] = js.undefined
  
  var _top: js.UndefOr[Language | CompiledMode] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var errorRaised: js.UndefOr[js.Error] = js.undefined
  
  var illegal: Boolean
  
  var language: js.UndefOr[String] = js.undefined
  
  var relevance: Double
  
  // * for auto-highlight
  var secondBest: js.UndefOr[OmitHighlightResultsecond] = js.undefined
  
  var value: String
}
object HighlightResult {
  
  inline def apply(_emitter: Emitter, illegal: Boolean, relevance: Double, value: String): HighlightResult = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrorRaised(value: js.Error): Self = StObject.set(x, "errorRaised", value.asInstanceOf[js.Any])
    
    inline def setErrorRaisedUndefined: Self = StObject.set(x, "errorRaised", js.undefined)
    
    inline def setIllegal(value: Boolean): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setSecondBest(value: OmitHighlightResultsecond): Self = StObject.set(x, "secondBest", value.asInstanceOf[js.Any])
    
    inline def setSecondBestUndefined: Self = StObject.set(x, "secondBest", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_emitter(value: Emitter): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
    
    inline def set_illegalBy(value: illegalData): Self = StObject.set(x, "_illegalBy", value.asInstanceOf[js.Any])
    
    inline def set_illegalByUndefined: Self = StObject.set(x, "_illegalBy", js.undefined)
    
    inline def set_top(value: Language | CompiledMode): Self = StObject.set(x, "_top", value.asInstanceOf[js.Any])
    
    inline def set_topUndefined: Self = StObject.set(x, "_top", js.undefined)
  }
}
