package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.teardown
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with AsyncEvent {
  
  var name: teardown
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setName(value: teardown): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
