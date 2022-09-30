package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the logger
  */
trait LoggerOptions extends StObject {
  
  var useIcons: Boolean
}
object LoggerOptions {
  
  inline def apply(useIcons: Boolean): LoggerOptions = {
    val __obj = js.Dynamic.literal(useIcons = useIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
  
  extension [Self <: LoggerOptions](x: Self) {
    
    inline def setUseIcons(value: Boolean): Self = StObject.set(x, "useIcons", value.asInstanceOf[js.Any])
  }
}
