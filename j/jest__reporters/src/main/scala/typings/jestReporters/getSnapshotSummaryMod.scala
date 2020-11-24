package typings.jestReporters

import typings.jestTestResult.typesMod.SnapshotSummary
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/getSnapshotSummary", JSImport.Namespace)
@js.native
object getSnapshotSummaryMod extends js.Object {
  
  def default(snapshots: SnapshotSummary, globalConfig: GlobalConfig, updateCommand: String): js.Array[String] = js.native
}
