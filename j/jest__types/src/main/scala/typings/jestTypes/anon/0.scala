package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.include_test_location_in_result
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with AsyncEvent {
  
  var name: include_test_location_in_result
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(name = "include_test_location_in_result")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setName(value: include_test_location_in_result): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
