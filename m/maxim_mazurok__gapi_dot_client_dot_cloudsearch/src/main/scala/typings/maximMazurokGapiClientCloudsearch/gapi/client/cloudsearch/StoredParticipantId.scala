package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredParticipantId extends StObject {
  
  var gaiaId: js.UndefOr[String] = js.undefined
}
object StoredParticipantId {
  
  inline def apply(): StoredParticipantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoredParticipantId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoredParticipantId] (val x: Self) extends AnyVal {
    
    inline def setGaiaId(value: String): Self = StObject.set(x, "gaiaId", value.asInstanceOf[js.Any])
    
    inline def setGaiaIdUndefined: Self = StObject.set(x, "gaiaId", js.undefined)
  }
}
