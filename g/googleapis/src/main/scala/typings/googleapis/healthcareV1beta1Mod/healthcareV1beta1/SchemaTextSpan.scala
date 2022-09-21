package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextSpan extends StObject {
  
  /**
    * The unicode codepoint index of the beginning of this span.
    */
  var beginOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The original text contained in this span.
    */
  var content: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextSpan {
  
  inline def apply(): SchemaTextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextSpan]
  }
  
  extension [Self <: SchemaTextSpan](x: Self) {
    
    inline def setBeginOffset(value: Double): Self = StObject.set(x, "beginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetNull: Self = StObject.set(x, "beginOffset", null)
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "beginOffset", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
