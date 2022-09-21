package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBody extends StObject {
  
  /**
    * The contents of the body. The indexes for the body's content begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
}
object SchemaBody {
  
  inline def apply(): SchemaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBody]
  }
  
  extension [Self <: SchemaBody](x: Self) {
    
    inline def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
  }
}
