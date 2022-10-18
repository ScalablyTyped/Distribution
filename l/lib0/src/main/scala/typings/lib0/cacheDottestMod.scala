package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheDottestMod {
  
  @JSImport("lib0/cache.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testCache(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testCache")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
