package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.include_test_location_in_result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends AsyncEvent {
  
  var name: include_test_location_in_result = js.native
}
object `0` {
  
  @scala.inline
  def apply(name: include_test_location_in_result): `0` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: include_test_location_in_result): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
