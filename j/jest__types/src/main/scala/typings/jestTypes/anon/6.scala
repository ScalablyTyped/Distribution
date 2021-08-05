package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.run_finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with AsyncEvent {
  
  var name: run_finish
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setName(value: run_finish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
