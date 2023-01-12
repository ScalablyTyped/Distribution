package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Correction extends StObject {
  
  /** The contexts for the correction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.undefined
  
  /** Additional details about what was corrected. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The type of correction that was applied to the creative. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Correction {
  
  inline def apply(): Correction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Correction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Correction] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: js.Array[ServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: ServingContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
