package typings.lib0

import typings.lib0.distTestingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventloopDottestMod {
  
  @JSImport("lib0/dist/eventloop.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testAnimationFrame(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testAnimationFrame")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testDebouncer(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testDebouncer")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testEventloopOrder(_tc: TestCase): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEventloopOrder")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit]]]
  
  inline def testIdleCallback(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testIdleCallback")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testInterval(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testInterval")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testTimeout(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testTimeout")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
