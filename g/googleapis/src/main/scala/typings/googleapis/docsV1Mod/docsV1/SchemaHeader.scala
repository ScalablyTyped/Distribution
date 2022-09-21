package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeader extends StObject {
  
  /**
    * The contents of the header. The indexes for a header's content begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
  
  /**
    * The ID of the header.
    */
  var headerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaHeader {
  
  inline def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  
  extension [Self <: SchemaHeader](x: Self) {
    
    inline def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdNull: Self = StObject.set(x, "headerId", null)
    
    inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
