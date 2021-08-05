package typings.koaWebpack

import typings.webpackHotClient.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    def close(): Unit
    
    var options: Options
    
    var server: js.Any
  }
  object Close {
    
    inline def apply(close: () => Unit, options: Options, server: js.Any): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setServer(value: js.Any): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
