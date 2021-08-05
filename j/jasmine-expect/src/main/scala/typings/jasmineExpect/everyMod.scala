package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object everyMod {
  
  @JSImport("jasmine-expect/dist/lib/every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def every(array: js.Any, truthTest: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], truthTest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
