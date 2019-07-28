package typings.marko.srcCompilerTaglibDashLookupMod

import typings.marko.srcCompilerTaglibDashLoaderTaglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val registeredTaglibs: js.Array[default] = js.native
  def buildLookup(dirname: String): TaglibLookup = js.native
  def clearCache(): Unit = js.native
  def registerTaglib(taglib: default): Unit = js.native
}

