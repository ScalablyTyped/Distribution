package typings.ionic.anon

import typings.ionic.definitionsMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends StObject {
  
  var log: ILogger = js.native
}
object Log {
  
  @scala.inline
  def apply(log: ILogger): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
