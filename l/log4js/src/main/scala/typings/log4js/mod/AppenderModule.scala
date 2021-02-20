package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppenderModule extends StObject {
  
  var configure: js.Function = js.native
}
object AppenderModule {
  
  @scala.inline
  def apply(configure: js.Function): AppenderModule = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppenderModule]
  }
  
  @scala.inline
  implicit class AppenderModuleMutableBuilder[Self <: AppenderModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: js.Function): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
  }
}
