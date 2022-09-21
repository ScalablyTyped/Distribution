package typings.googleapis.gameservicesV1Mod.gameservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfig extends StObject {
  
  /**
    * Cloud audit options.
    */
  var cloudAudit: js.UndefOr[SchemaCloudAuditOptions] = js.undefined
  
  /**
    * Counter options.
    */
  var counter: js.UndefOr[SchemaCounterOptions] = js.undefined
  
  /**
    * Data access options.
    */
  var dataAccess: js.UndefOr[SchemaDataAccessOptions] = js.undefined
}
object SchemaLogConfig {
  
  inline def apply(): SchemaLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfig]
  }
  
  extension [Self <: SchemaLogConfig](x: Self) {
    
    inline def setCloudAudit(value: SchemaCloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    inline def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    inline def setCounter(value: SchemaCounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDataAccess(value: SchemaDataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    inline def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
