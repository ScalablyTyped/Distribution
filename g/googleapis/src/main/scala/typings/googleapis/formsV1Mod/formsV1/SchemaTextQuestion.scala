package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextQuestion extends StObject {
  
  /**
    * Whether the question is a paragraph question or not. If not, the question is a short text question.
    */
  var paragraph: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTextQuestion {
  
  inline def apply(): SchemaTextQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextQuestion]
  }
  
  extension [Self <: SchemaTextQuestion](x: Self) {
    
    inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphNull: Self = StObject.set(x, "paragraph", null)
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
  }
}
