package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlsaBuilder extends StObject {
  
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlsaBuilder {
  
  inline def apply(): SchemaSlsaBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlsaBuilder]
  }
  
  extension [Self <: SchemaSlsaBuilder](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
