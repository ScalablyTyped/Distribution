package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Har extends StObject {
  
  /** This object represents the root of exported data. */
  var log: Log
}
object Har {
  
  @scala.inline
  def apply(log: Log): Har = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Har]
  }
  
  @scala.inline
  implicit class HarMutableBuilder[Self <: Har] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
