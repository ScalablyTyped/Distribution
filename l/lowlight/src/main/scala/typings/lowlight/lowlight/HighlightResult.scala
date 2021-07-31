package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightResult extends StObject {
  
  var language: String
  
  var relevance: Double
  
  var value: js.Array[HastNode]
}
object HighlightResult {
  
  @scala.inline
  def apply(language: String, relevance: Double, value: js.Array[HastNode]): HighlightResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult]
  }
  
  @scala.inline
  implicit class HighlightResultMutableBuilder[Self <: HighlightResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[HastNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: HastNode*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
