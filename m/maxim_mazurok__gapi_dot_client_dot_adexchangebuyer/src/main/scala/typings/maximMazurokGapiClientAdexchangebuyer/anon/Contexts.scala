package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contexts extends StObject {
  
  /** All known serving contexts containing serving status information. */
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.undefined
  
  /** Additional details about the correction. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The type of correction that was applied to the creative. */
  var reason: js.UndefOr[String] = js.undefined
}
object Contexts {
  
  inline def apply(): Contexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contexts]
  }
  
  extension [Self <: Contexts](x: Self) {
    
    inline def setContexts(value: js.Array[AuctionType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: AuctionType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
