package typings.jestSnapshot.anon

import typings.jestTypes.configMod.SnapshotUpdateState
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutils extends js.Object {
  val SNAPSHOT_GUIDE_LINK: /* "https://goo.gl/fbAQLP" */ String = js.native
  val SNAPSHOT_VERSION: /* "1" */ String = js.native
  val SNAPSHOT_VERSION_WARNING: String = js.native
  def deepMerge(target: js.Any, source: js.Any): js.Any = js.native
  def ensureDirectoryExists(filePath: String): Unit = js.native
  def escapeBacktickString(str: String): String = js.native
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): Data = js.native
  def keyToTestName(key: String): String = js.native
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit = js.native
  def serialize(data: String): String = js.native
  def testNameToKey(testName: String, count: Double): String = js.native
  def unescape(data: String): String = js.native
}

object Typeofutils {
  @scala.inline
  def apply(
    SNAPSHOT_GUIDE_LINK: /* "https://goo.gl/fbAQLP" */ String,
    SNAPSHOT_VERSION: /* "1" */ String,
    SNAPSHOT_VERSION_WARNING: String,
    deepMerge: (js.Any, js.Any) => js.Any,
    ensureDirectoryExists: String => Unit,
    escapeBacktickString: String => String,
    getSnapshotData: (String, SnapshotUpdateState) => Data,
    keyToTestName: String => String,
    saveSnapshotFile: (Record[String, String], String) => Unit,
    serialize: String => String,
    testNameToKey: (String, Double) => String,
    unescape: String => String
  ): Typeofutils = {
    val __obj = js.Dynamic.literal(SNAPSHOT_GUIDE_LINK = SNAPSHOT_GUIDE_LINK.asInstanceOf[js.Any], SNAPSHOT_VERSION = SNAPSHOT_VERSION.asInstanceOf[js.Any], SNAPSHOT_VERSION_WARNING = SNAPSHOT_VERSION_WARNING.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), ensureDirectoryExists = js.Any.fromFunction1(ensureDirectoryExists), escapeBacktickString = js.Any.fromFunction1(escapeBacktickString), getSnapshotData = js.Any.fromFunction2(getSnapshotData), keyToTestName = js.Any.fromFunction1(keyToTestName), saveSnapshotFile = js.Any.fromFunction2(saveSnapshotFile), serialize = js.Any.fromFunction1(serialize), testNameToKey = js.Any.fromFunction2(testNameToKey), unescape = js.Any.fromFunction1(unescape))
    __obj.asInstanceOf[Typeofutils]
  }
  @scala.inline
  implicit class TypeofutilsOps[Self <: Typeofutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSNAPSHOT_GUIDE_LINK(value: /* "https://goo.gl/fbAQLP" */ String): Self = this.set("SNAPSHOT_GUIDE_LINK", value.asInstanceOf[js.Any])
    @scala.inline
    def setSNAPSHOT_VERSION(value: /* "1" */ String): Self = this.set("SNAPSHOT_VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSNAPSHOT_VERSION_WARNING(value: String): Self = this.set("SNAPSHOT_VERSION_WARNING", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeepMerge(value: (js.Any, js.Any) => js.Any): Self = this.set("deepMerge", js.Any.fromFunction2(value))
    @scala.inline
    def setEnsureDirectoryExists(value: String => Unit): Self = this.set("ensureDirectoryExists", js.Any.fromFunction1(value))
    @scala.inline
    def setEscapeBacktickString(value: String => String): Self = this.set("escapeBacktickString", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSnapshotData(value: (String, SnapshotUpdateState) => Data): Self = this.set("getSnapshotData", js.Any.fromFunction2(value))
    @scala.inline
    def setKeyToTestName(value: String => String): Self = this.set("keyToTestName", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveSnapshotFile(value: (Record[String, String], String) => Unit): Self = this.set("saveSnapshotFile", js.Any.fromFunction2(value))
    @scala.inline
    def setSerialize(value: String => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def setTestNameToKey(value: (String, Double) => String): Self = this.set("testNameToKey", js.Any.fromFunction2(value))
    @scala.inline
    def setUnescape(value: String => String): Self = this.set("unescape", js.Any.fromFunction1(value))
  }
  
}

