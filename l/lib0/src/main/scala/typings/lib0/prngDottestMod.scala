package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prngDottestMod {
  
  @JSImport("lib0/prng.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testGeneratorMt19937(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testGeneratorMt19937")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testGeneratorXoroshiro128plus(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testGeneratorXoroshiro128plus")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testGeneratorXorshift32(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testGeneratorXorshift32")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testNumberDistributions(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testNumberDistributions")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
