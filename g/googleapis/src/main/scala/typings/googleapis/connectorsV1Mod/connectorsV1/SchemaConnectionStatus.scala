package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionStatus extends StObject {
  
  /**
    * Description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status provides detailed information for the state.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectionStatus {
  
  inline def apply(): SchemaConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionStatus]
  }
  
  extension [Self <: SchemaConnectionStatus](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
