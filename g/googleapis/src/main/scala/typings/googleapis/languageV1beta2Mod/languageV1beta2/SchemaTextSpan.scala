package typings.googleapis.languageV1beta2Mod.languageV1beta2

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
  
  @scala.inline
  def apply(): SchemaTextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextSpan]
  }
  
  @scala.inline
  implicit class SchemaTextSpanMutableBuilder[Self <: SchemaTextSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Double): Self = StObject.set(x, "beginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "beginOffset", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
