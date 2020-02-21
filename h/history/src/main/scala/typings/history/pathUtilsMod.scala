package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/PathUtils", JSImport.Namespace)
@js.native
object pathUtilsMod extends js.Object {
  def addLeadingSlash(path: Path): Path = js.native
  def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
  def hasBasename(path: Path): Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
  def stripBasename(path: Path, prefix: String): Path = js.native
  def stripLeadingSlash(path: Path): Path = js.native
  def stripTrailingSlash(path: Path): Path = js.native
}

