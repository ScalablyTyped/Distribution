package typings
package gulpDashTypescriptLib.releaseHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/host", "Host")
@js.native
class Host protected ()
  extends typescriptLib.typescriptMod.tsNs.CompilerHost {
  def this(typescript: js.Any, currentDirectory: java.lang.String, input: gulpDashTypescriptLib.releaseInputMod.FileCache, options: typescriptLib.typescriptMod.tsNs.CompilerOptions) = this()
  var currentDirectory: java.lang.String = js.native
  var fallback: typescriptLib.typescriptMod.tsNs.CompilerHost = js.native
  var input: gulpDashTypescriptLib.releaseInputMod.FileCache = js.native
  var typescript: js.Any = js.native
  @JSName("directoryExists")
  def directoryExists_MHost(path: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def fileExists(fileName: java.lang.String): scala.Boolean = js.native
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MHost(): java.lang.String = js.native
  @JSName("getDefaultLibLocation")
  def getDefaultLibLocation_MHost(): java.lang.String = js.native
  @JSName("getDirectories")
  def getDirectories_MHost(path: java.lang.String): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  @JSName("realpath")
  def realpath_MHost(path: java.lang.String): java.lang.String = js.native
}

