package typings.lib0

import typings.lib0.distTestingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventloopDottestMod {
  
  @JSImport("lib0/dist/eventloop.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testAnimationFrame(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testAnimationFrame")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testEventloopOrder(tc: TestCase): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEventloopOrder")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit]]]
  
  inline def testIdleCallback(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testIdleCallback")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testInterval(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testInterval")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testTimeout(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testTimeout")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
