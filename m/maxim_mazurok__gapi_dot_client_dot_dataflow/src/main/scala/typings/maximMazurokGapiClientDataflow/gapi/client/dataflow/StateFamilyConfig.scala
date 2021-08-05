package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateFamilyConfig extends StObject {
  
  /** If true, this family corresponds to a read operation. */
  var isRead: js.UndefOr[Boolean] = js.undefined
  
  /** The state family value. */
  var stateFamily: js.UndefOr[String] = js.undefined
}
object StateFamilyConfig {
  
  inline def apply(): StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateFamilyConfig]
  }
  
  extension [Self <: StateFamilyConfig](x: Self) {
    
    inline def setIsRead(value: Boolean): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setIsReadUndefined: Self = StObject.set(x, "isRead", js.undefined)
    
    inline def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    inline def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
  }
}
