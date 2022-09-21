package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoggingConfig extends StObject {
  
  /**
    * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
    */
  var driverLogLevels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaLoggingConfig {
  
  inline def apply(): SchemaLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingConfig]
  }
  
  extension [Self <: SchemaLoggingConfig](x: Self) {
    
    inline def setDriverLogLevels(value: StringDictionary[String]): Self = StObject.set(x, "driverLogLevels", value.asInstanceOf[js.Any])
    
    inline def setDriverLogLevelsNull: Self = StObject.set(x, "driverLogLevels", null)
    
    inline def setDriverLogLevelsUndefined: Self = StObject.set(x, "driverLogLevels", js.undefined)
  }
}
