package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.run_start
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with AsyncEvent {
  
  var name: run_start
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setName(value: run_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
