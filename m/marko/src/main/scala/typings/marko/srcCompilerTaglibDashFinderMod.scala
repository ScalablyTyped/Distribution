package typings.marko

import typings.marko.srcCompilerTaglibDashLoaderTaglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-finder", JSImport.Namespace)
@js.native
object srcCompilerTaglibDashFinderMod extends js.Object {
  def clearCache(): Unit = js.native
  def excludeDir(dir: String): Unit = js.native
  def excludePackage(name: String): Unit = js.native
  def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = js.native
  def reset(): Unit = js.native
}

