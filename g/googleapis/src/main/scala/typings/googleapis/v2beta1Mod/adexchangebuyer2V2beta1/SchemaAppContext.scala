package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppContext extends StObject {
  
  /**
    * The app types this restriction applies to.
    */
  var appTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAppContext {
  
  inline def apply(): SchemaAppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppContext]
  }
  
  extension [Self <: SchemaAppContext](x: Self) {
    
    inline def setAppTypes(value: js.Array[String]): Self = StObject.set(x, "appTypes", value.asInstanceOf[js.Any])
    
    inline def setAppTypesNull: Self = StObject.set(x, "appTypes", null)
    
    inline def setAppTypesUndefined: Self = StObject.set(x, "appTypes", js.undefined)
    
    inline def setAppTypesVarargs(value: String*): Self = StObject.set(x, "appTypes", js.Array(value*))
  }
}
