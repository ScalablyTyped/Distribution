package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseDottestMod {
  
  @JSImport("lib0/promise.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testRepeatPromise(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatPromise")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testispromise(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testispromise")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
