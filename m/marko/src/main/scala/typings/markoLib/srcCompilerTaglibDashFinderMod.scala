package typings
package markoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-finder", JSImport.Namespace)
@js.native
object srcCompilerTaglibDashFinderMod extends js.Object {
  def clearCache(): scala.Unit = js.native
  def excludeDir(dir: java.lang.String): scala.Unit = js.native
  def excludePackage(name: java.lang.String): scala.Unit = js.native
  def find(
    dirname: java.lang.String,
    registeredTaglibs: js.Array[markoLib.srcCompilerTaglibDashLoaderTaglibMod.default]
  ): js.Array[markoLib.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def reset(): scala.Unit = js.native
}

