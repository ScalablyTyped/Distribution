package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an output piece of text.
  */
trait SchemaTextSpan extends StObject {
  
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The content of the output text.
    */
  var content: js.UndefOr[String] = js.undefined
}
object SchemaTextSpan {
  
  inline def apply(): SchemaTextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextSpan]
  }
  
  extension [Self <: SchemaTextSpan](x: Self) {
    
    inline def setBeginOffset(value: Double): Self = StObject.set(x, "beginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "beginOffset", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
