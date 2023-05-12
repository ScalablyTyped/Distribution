package typings.lib0

import typings.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoDottestMod {
  
  @JSImport("lib0/crypto.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testConsistentKeyGeneration(_tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testConsistentKeyGeneration")(_tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testEncryption(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEncryption")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testEncryptionPerformance(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testEncryptionPerformance")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testImportExport(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testImportExport")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testReapeatEncryption(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testReapeatEncryption")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def testSigning(tc: TestCase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("testSigning")(tc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
