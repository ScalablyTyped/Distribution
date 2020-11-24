package typings.jestSnapshot

import typings.jestSnapshot.anon.Data
import typings.jestSnapshot.typesMod.SnapshotData
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val SNAPSHOT_GUIDE_LINK: /* "https://goo.gl/fbAQLP" */ String = js.native
  
  val SNAPSHOT_VERSION: /* "1" */ String = js.native
  
  val SNAPSHOT_VERSION_WARNING: String = js.native
  
  def addExtraLineBreaks(string: String): String = js.native
  
  def deepMerge(target: js.Any, source: js.Any): js.Any = js.native
  
  def deserializeString(stringified: String): String = js.native
  
  def ensureDirectoryExists(filePath: Path): Unit = js.native
  
  def escapeBacktickString(str: String): String = js.native
  
  def getSnapshotData(snapshotPath: Path, update: SnapshotUpdateState): Data = js.native
  
  def keyToTestName(key: String): String = js.native
  
  def minify(`val`: js.Any): String = js.native
  
  def removeExtraLineBreaks(string: String): String = js.native
  
  def removeLinesBeforeExternalMatcherTrap(stack: String): String = js.native
  
  def saveSnapshotFile(snapshotData: SnapshotData, snapshotPath: Path): Unit = js.native
  
  def serialize(`val`: js.Any): String = js.native
  def serialize(`val`: js.Any, indent: Double): String = js.native
  
  def testNameToKey(testName: Path, count: Double): String = js.native
}
