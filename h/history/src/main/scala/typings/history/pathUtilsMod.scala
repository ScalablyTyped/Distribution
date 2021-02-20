package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathUtilsMod {
  
  @JSImport("history/PathUtils", "addLeadingSlash")
  @js.native
  def addLeadingSlash(path: Path): Path = js.native
  
  @JSImport("history/PathUtils", "createPath")
  @js.native
  def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
  
  @JSImport("history/PathUtils", "hasBasename")
  @js.native
  def hasBasename(path: Path): Boolean = js.native
  
  @JSImport("history/PathUtils", "parsePath")
  @js.native
  def parsePath(path: Path): Location[LocationState] = js.native
  
  @JSImport("history/PathUtils", "stripBasename")
  @js.native
  def stripBasename(path: Path, prefix: String): Path = js.native
  
  @JSImport("history/PathUtils", "stripLeadingSlash")
  @js.native
  def stripLeadingSlash(path: Path): Path = js.native
  
  @JSImport("history/PathUtils", "stripTrailingSlash")
  @js.native
  def stripTrailingSlash(path: Path): Path = js.native
}
