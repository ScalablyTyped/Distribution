package typings.jestUtil

import typings.jestTestResult.typesMod.AggregatedResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFailedSnapshotTestsMod {
  
  @JSImport("jest-util/build/getFailedSnapshotTests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(testResults: AggregatedResult): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(testResults.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
