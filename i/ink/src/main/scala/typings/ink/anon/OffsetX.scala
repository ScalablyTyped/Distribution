package typings.ink.anon

import typings.ink.renderNodeToOutputMod.OutputTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var skipStaticElements: Boolean
  
  var transformers: js.UndefOr[js.Array[OutputTransformer]] = js.undefined
}
object OffsetX {
  
  @scala.inline
  def apply(skipStaticElements: Boolean): OffsetX = {
    val __obj = js.Dynamic.literal(skipStaticElements = skipStaticElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  
  @scala.inline
  implicit class OffsetXMutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setSkipStaticElements(value: Boolean): Self = StObject.set(x, "skipStaticElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
    
    @scala.inline
    def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value :_*))
  }
}
