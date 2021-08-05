package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Har extends StObject {
  
  /** This object represents the root of exported data. */
  var log: Log
}
object Har {
  
  inline def apply(log: Log): Har = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Har]
  }
  
  extension [Self <: Har](x: Self) {
    
    inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
