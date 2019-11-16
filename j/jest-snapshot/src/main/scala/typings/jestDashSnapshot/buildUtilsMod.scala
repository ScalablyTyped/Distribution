package typings.jestDashSnapshot

import typings.atJestTypes.buildConfigMod.SnapshotUpdateState
import typings.jestDashSnapshot.jestDashSnapshotStrings.`1`
import typings.jestDashSnapshot.jestDashSnapshotStrings.`https://gooDOTgl/fbAQLP`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/utils", JSImport.Namespace)
@js.native
object buildUtilsMod extends js.Object {
  val SNAPSHOT_GUIDE_LINK: `https://gooDOTgl/fbAQLP` = js.native
  val SNAPSHOT_VERSION: `1` = js.native
  val SNAPSHOT_VERSION_WARNING: String = js.native
  def deepMerge(target: js.Any, source: js.Any): js.Any = js.native
  def ensureDirectoryExists(filePath: String): Unit = js.native
  def escapeBacktickString(str: String): String = js.native
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): Anon_Data = js.native
  def keyToTestName(key: String): String = js.native
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit = js.native
  def serialize(data: String): String = js.native
  def testNameToKey(testName: String, count: Double): String = js.native
  def unescape(data: String): String = js.native
}

