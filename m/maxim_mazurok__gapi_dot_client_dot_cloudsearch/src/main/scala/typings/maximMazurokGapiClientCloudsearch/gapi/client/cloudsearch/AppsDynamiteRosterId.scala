package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteRosterId extends StObject {
  
  /** Opaque, server-assigned ID of the Roster. */
  var id: js.UndefOr[String] = js.undefined
}
object AppsDynamiteRosterId {
  
  inline def apply(): AppsDynamiteRosterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteRosterId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteRosterId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
