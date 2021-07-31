package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightAutoResult
  extends StObject
     with HighlightResult {
  
  var secondBest: js.UndefOr[HighlightAutoResult] = js.undefined
}
object HighlightAutoResult {
  
  @scala.inline
  def apply(language: String, relevance: Double, value: js.Array[HastNode]): HighlightAutoResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightAutoResult]
  }
  
  @scala.inline
  implicit class HighlightAutoResultMutableBuilder[Self <: HighlightAutoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecondBest(value: HighlightAutoResult): Self = StObject.set(x, "secondBest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondBestUndefined: Self = StObject.set(x, "secondBest", js.undefined)
  }
}
