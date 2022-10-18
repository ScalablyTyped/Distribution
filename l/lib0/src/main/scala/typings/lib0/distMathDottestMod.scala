package typings.lib0

import typings.lib0.distTestingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMathDottestMod {
  
  @JSImport("lib0/dist/math.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testMath(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testMath")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
