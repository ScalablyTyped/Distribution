package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppenderModule extends StObject {
  
  var configure: js.Function
}
object AppenderModule {
  
  inline def apply(configure: js.Function): AppenderModule = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppenderModule]
  }
  
  extension [Self <: AppenderModule](x: Self) {
    
    inline def setConfigure(value: js.Function): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
  }
}
