package typings.jestRuntime

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runtime/build/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def createOutsideJestVmPath(path: String): String = js.native
  
  def decodePossibleOutsideJestVmPath(outsideJestVmPath: String): js.UndefOr[String] = js.native
  
  def findSiblingsWithFileExtension(moduleFileExtensions: js.Array[String], from: Path, moduleName: String): String = js.native
}
