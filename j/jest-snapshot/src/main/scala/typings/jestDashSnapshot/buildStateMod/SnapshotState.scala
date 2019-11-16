package typings.jestDashSnapshot.buildStateMod

import typings.jestDashSnapshot.Anon_Actual
import typings.jestDashSnapshot.Anon_Deleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotState extends js.Object {
  var _addSnapshot: js.Any = js.native
  var _counters: js.Any = js.native
  var _dirty: js.Any = js.native
  var _getBabelTraverse: js.Any = js.native
  var _getPrettier: js.Any = js.native
  var _index: js.Any = js.native
  var _initialData: js.Any = js.native
  var _inlineSnapshots: js.Any = js.native
  var _snapshotData: js.Any = js.native
  var _snapshotPath: js.Any = js.native
  var _uncheckedKeys: js.Any = js.native
  var _updateSnapshot: js.Any = js.native
  var added: Double = js.native
  var expand: Boolean = js.native
  var matched: Double = js.native
  var unmatched: Double = js.native
  var updated: Double = js.native
  def clear(): Unit = js.native
  def fail(testName: String, _received: js.Any): String = js.native
  def fail(testName: String, _received: js.Any, key: String): String = js.native
  def getUncheckedCount(): Double = js.native
  def getUncheckedKeys(): js.Array[String] = js.native
  def markSnapshotsAsCheckedForTest(testName: String): Unit = js.native
  def `match`(hasTestNameReceivedKeyInlineSnapshotError: SnapshotMatchOptions): Anon_Actual = js.native
  def removeUncheckedKeys(): Unit = js.native
  def save(): Anon_Deleted = js.native
}

