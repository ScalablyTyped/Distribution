package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberDottestMod {
  
  @JSImport("lib0/number.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testNumber(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testNumber")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testShiftVsDivision(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testShiftVsDivision")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
