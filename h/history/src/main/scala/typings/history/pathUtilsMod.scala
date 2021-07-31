package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathUtilsMod {
  
  @JSImport("history/PathUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addLeadingSlash(path: Path): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("addLeadingSlash")(path.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  @scala.inline
  def createPath[S](location: LocationDescriptorObject[S]): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(location.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  @scala.inline
  def hasBasename(path: Path): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBasename")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parsePath(path: Path): Location[LocationState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[Location[LocationState]]
  
  @scala.inline
  def stripBasename(path: Path, prefix: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("stripBasename")(path.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  @scala.inline
  def stripLeadingSlash(path: Path): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLeadingSlash")(path.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  @scala.inline
  def stripTrailingSlash(path: Path): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingSlash")(path.asInstanceOf[js.Any]).asInstanceOf[Path]
}
