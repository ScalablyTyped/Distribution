package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFootnote extends StObject {
  
  /**
    * The contents of the footnote. The indexes for a footnote's content begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
  
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFootnote {
  
  inline def apply(): SchemaFootnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnote]
  }
  
  extension [Self <: SchemaFootnote](x: Self) {
    
    inline def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdNull: Self = StObject.set(x, "footnoteId", null)
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
