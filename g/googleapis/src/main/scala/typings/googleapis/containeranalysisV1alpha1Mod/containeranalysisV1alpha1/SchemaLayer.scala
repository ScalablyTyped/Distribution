package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLayer extends StObject {
  
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The recovered Dockerfile directive used to construct this layer.
    */
  var directive: js.UndefOr[String | Null] = js.undefined
}
object SchemaLayer {
  
  inline def apply(): SchemaLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayer]
  }
  
  extension [Self <: SchemaLayer](x: Self) {
    
    inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsNull: Self = StObject.set(x, "arguments", null)
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveNull: Self = StObject.set(x, "directive", null)
    
    inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
  }
}
