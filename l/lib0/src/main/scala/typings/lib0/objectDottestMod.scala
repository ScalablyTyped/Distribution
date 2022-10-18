package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectDottestMod {
  
  @JSImport("lib0/object.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testObject(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testObject")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
