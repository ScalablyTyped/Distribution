package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingDottestMod {
  
  @JSImport("lib0/testing.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testAsync")().asInstanceOf[js.Promise[Unit]]
  
  inline def testComparing(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testComparing")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testFailing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testFailing")().asInstanceOf[Unit]
  
  inline def testRepeatRepetition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatRepetition")().asInstanceOf[Unit]
  
  inline def testSkipping(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testSkipping")().asInstanceOf[Unit]
}
