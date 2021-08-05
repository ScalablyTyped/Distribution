package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly A security context.
  */
trait SchemaSecurityContext extends StObject {
  
  /**
    * The security types in this context.
    */
  var securities: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSecurityContext {
  
  inline def apply(): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityContext]
  }
  
  extension [Self <: SchemaSecurityContext](x: Self) {
    
    inline def setSecurities(value: js.Array[String]): Self = StObject.set(x, "securities", value.asInstanceOf[js.Any])
    
    inline def setSecuritiesUndefined: Self = StObject.set(x, "securities", js.undefined)
    
    inline def setSecuritiesVarargs(value: String*): Self = StObject.set(x, "securities", js.Array(value :_*))
  }
}
