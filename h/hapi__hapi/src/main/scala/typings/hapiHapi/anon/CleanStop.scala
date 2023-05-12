package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanStop extends StObject {
  
  /**
    * @default true
    * If true, the server keeps track of open connections and properly closes them when the server is stopped.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionsoperations)
    */
  var cleanStop: js.UndefOr[Boolean] = js.undefined
}
object CleanStop {
  
  inline def apply(): CleanStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleanStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CleanStop] (val x: Self) extends AnyVal {
    
    inline def setCleanStop(value: Boolean): Self = StObject.set(x, "cleanStop", value.asInstanceOf[js.Any])
    
    inline def setCleanStopUndefined: Self = StObject.set(x, "cleanStop", js.undefined)
  }
}
