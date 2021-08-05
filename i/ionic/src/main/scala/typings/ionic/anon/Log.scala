package typings.ionic.anon

import typings.ionic.definitionsMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  var log: ILogger
}
object Log {
  
  inline def apply(log: ILogger): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  extension [Self <: Log](x: Self) {
    
    inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
