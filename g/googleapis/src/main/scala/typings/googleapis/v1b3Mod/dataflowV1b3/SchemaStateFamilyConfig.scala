package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * State family configuration.
  */
trait SchemaStateFamilyConfig extends StObject {
  
  /**
    * If true, this family corresponds to a read operation.
    */
  var isRead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state family value.
    */
  var stateFamily: js.UndefOr[String] = js.undefined
}
object SchemaStateFamilyConfig {
  
  inline def apply(): SchemaStateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateFamilyConfig]
  }
  
  extension [Self <: SchemaStateFamilyConfig](x: Self) {
    
    inline def setIsRead(value: Boolean): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setIsReadUndefined: Self = StObject.set(x, "isRead", js.undefined)
    
    inline def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    inline def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
  }
}
