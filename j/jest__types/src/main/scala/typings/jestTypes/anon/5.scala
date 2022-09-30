package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.run_finish
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with AsyncEvent {
  
  var name: run_finish
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setName(value: run_finish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
