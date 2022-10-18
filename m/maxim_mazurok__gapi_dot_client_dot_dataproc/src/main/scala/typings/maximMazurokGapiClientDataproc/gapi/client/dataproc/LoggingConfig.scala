package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /** The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG' */
  var driverLogLevels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object LoggingConfig {
  
  inline def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  
  extension [Self <: LoggingConfig](x: Self) {
    
    inline def setDriverLogLevels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "driverLogLevels", value.asInstanceOf[js.Any])
    
    inline def setDriverLogLevelsUndefined: Self = StObject.set(x, "driverLogLevels", js.undefined)
  }
}
