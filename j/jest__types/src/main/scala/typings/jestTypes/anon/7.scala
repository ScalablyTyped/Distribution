package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.teardown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`
  extends StObject
     with AsyncEvent {
  
  var name: teardown
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setName(value: teardown): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
