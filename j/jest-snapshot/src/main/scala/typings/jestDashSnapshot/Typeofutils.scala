package typings.jestDashSnapshot

import typings.atJestTypes.buildConfigMod.SnapshotUpdateState
import typings.jestDashSnapshot.jestDashSnapshotStrings.`1`
import typings.jestDashSnapshot.jestDashSnapshotStrings.`https://gooDOTgl/fbAQLP`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofutils extends js.Object {
  val SNAPSHOT_GUIDE_LINK: `https://gooDOTgl/fbAQLP`
  val SNAPSHOT_VERSION: `1`
  val SNAPSHOT_VERSION_WARNING: String
  def deepMerge(target: js.Any, source: js.Any): js.Any
  def ensureDirectoryExists(filePath: String): Unit
  def escapeBacktickString(str: String): String
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): Anon_Data
  def keyToTestName(key: String): String
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit
  def serialize(data: String): String
  def testNameToKey(testName: String, count: Double): String
  def unescape(data: String): String
}

object Typeofutils {
  @scala.inline
  def apply(
    SNAPSHOT_GUIDE_LINK: `https://gooDOTgl/fbAQLP`,
    SNAPSHOT_VERSION: `1`,
    SNAPSHOT_VERSION_WARNING: String,
    deepMerge: (js.Any, js.Any) => js.Any,
    ensureDirectoryExists: String => Unit,
    escapeBacktickString: String => String,
    getSnapshotData: (String, SnapshotUpdateState) => Anon_Data,
    keyToTestName: String => String,
    saveSnapshotFile: (Record[String, String], String) => Unit,
    serialize: String => String,
    testNameToKey: (String, Double) => String,
    unescape: String => String
  ): Typeofutils = {
    val __obj = js.Dynamic.literal(SNAPSHOT_GUIDE_LINK = SNAPSHOT_GUIDE_LINK.asInstanceOf[js.Any], SNAPSHOT_VERSION = SNAPSHOT_VERSION.asInstanceOf[js.Any], SNAPSHOT_VERSION_WARNING = SNAPSHOT_VERSION_WARNING.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), ensureDirectoryExists = js.Any.fromFunction1(ensureDirectoryExists), escapeBacktickString = js.Any.fromFunction1(escapeBacktickString), getSnapshotData = js.Any.fromFunction2(getSnapshotData), keyToTestName = js.Any.fromFunction1(keyToTestName), saveSnapshotFile = js.Any.fromFunction2(saveSnapshotFile), serialize = js.Any.fromFunction1(serialize), testNameToKey = js.Any.fromFunction2(testNameToKey), unescape = js.Any.fromFunction1(unescape))
  
    __obj.asInstanceOf[Typeofutils]
  }
}

