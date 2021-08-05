package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.run_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with AsyncEvent {
  
  var name: run_start
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setName(value: run_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
