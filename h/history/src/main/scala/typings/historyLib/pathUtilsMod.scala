package typings
package historyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/PathUtils", JSImport.Namespace)
@js.native
object pathUtilsMod extends js.Object {
  def addLeadingSlash(path: historyLib.historyMod.Path): historyLib.historyMod.Path = js.native
  def createPath(location: historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]): historyLib.historyMod.Path = js.native
  def hasBasename(path: historyLib.historyMod.Path): scala.Boolean = js.native
  def parsePath(path: historyLib.historyMod.Path): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
  def stripBasename(path: historyLib.historyMod.Path, prefix: java.lang.String): historyLib.historyMod.Path = js.native
  def stripLeadingSlash(path: historyLib.historyMod.Path): historyLib.historyMod.Path = js.native
  def stripTrailingSlash(path: historyLib.historyMod.Path): historyLib.historyMod.Path = js.native
}

