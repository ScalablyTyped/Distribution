package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuilderConfig extends StObject {
  
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuilderConfig {
  
  inline def apply(): SchemaBuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuilderConfig]
  }
  
  extension [Self <: SchemaBuilderConfig](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
