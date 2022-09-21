package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheckLogConfig extends StObject {
  
  /**
    * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
    */
  var enable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHealthCheckLogConfig {
  
  inline def apply(): SchemaHealthCheckLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckLogConfig]
  }
  
  extension [Self <: SchemaHealthCheckLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableNull: Self = StObject.set(x, "enable", null)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
