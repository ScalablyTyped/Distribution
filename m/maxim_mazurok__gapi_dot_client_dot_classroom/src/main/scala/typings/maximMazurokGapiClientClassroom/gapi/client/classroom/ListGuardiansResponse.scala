package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGuardiansResponse extends StObject {
  
  /** Guardians on this page of results that met the criteria specified in the request. */
  var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGuardiansResponse {
  
  inline def apply(): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuardiansResponse]
  }
  
  extension [Self <: ListGuardiansResponse](x: Self) {
    
    inline def setGuardians(value: js.Array[Guardian]): Self = StObject.set(x, "guardians", value.asInstanceOf[js.Any])
    
    inline def setGuardiansUndefined: Self = StObject.set(x, "guardians", js.undefined)
    
    inline def setGuardiansVarargs(value: Guardian*): Self = StObject.set(x, "guardians", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
