package typings.gulpHelpDoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Log extends StObject {
    
    var log: js.Function
  }
  object Log {
    
    @scala.inline
    def apply(log: js.Function): Log = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: js.Function): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
