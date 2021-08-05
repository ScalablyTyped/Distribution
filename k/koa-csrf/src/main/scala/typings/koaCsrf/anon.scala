package typings.koaCsrf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisableQuery extends StObject {
    
    var disableQuery: js.UndefOr[Boolean] = js.undefined
    
    var excludedMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var invalidSessionSecretMessage: js.UndefOr[String] = js.undefined
    
    var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.undefined
    
    var invalidTokenMessage: js.UndefOr[String] = js.undefined
    
    var invalidTokenStatusCode: js.UndefOr[Double] = js.undefined
  }
  object DisableQuery {
    
    inline def apply(): DisableQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableQuery]
    }
    
    extension [Self <: DisableQuery](x: Self) {
      
      inline def setDisableQuery(value: Boolean): Self = StObject.set(x, "disableQuery", value.asInstanceOf[js.Any])
      
      inline def setDisableQueryUndefined: Self = StObject.set(x, "disableQuery", js.undefined)
      
      inline def setExcludedMethods(value: js.Array[String]): Self = StObject.set(x, "excludedMethods", value.asInstanceOf[js.Any])
      
      inline def setExcludedMethodsUndefined: Self = StObject.set(x, "excludedMethods", js.undefined)
      
      inline def setExcludedMethodsVarargs(value: String*): Self = StObject.set(x, "excludedMethods", js.Array(value :_*))
      
      inline def setInvalidSessionSecretMessage(value: String): Self = StObject.set(x, "invalidSessionSecretMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidSessionSecretMessageUndefined: Self = StObject.set(x, "invalidSessionSecretMessage", js.undefined)
      
      inline def setInvalidSessionSecretStatusCode(value: Double): Self = StObject.set(x, "invalidSessionSecretStatusCode", value.asInstanceOf[js.Any])
      
      inline def setInvalidSessionSecretStatusCodeUndefined: Self = StObject.set(x, "invalidSessionSecretStatusCode", js.undefined)
      
      inline def setInvalidTokenMessage(value: String): Self = StObject.set(x, "invalidTokenMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidTokenMessageUndefined: Self = StObject.set(x, "invalidTokenMessage", js.undefined)
      
      inline def setInvalidTokenStatusCode(value: Double): Self = StObject.set(x, "invalidTokenStatusCode", value.asInstanceOf[js.Any])
      
      inline def setInvalidTokenStatusCodeUndefined: Self = StObject.set(x, "invalidTokenStatusCode", js.undefined)
    }
  }
}
