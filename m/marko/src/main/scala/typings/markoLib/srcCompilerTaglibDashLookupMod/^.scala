package typings
package markoLib.srcCompilerTaglibDashLookupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val registeredTaglibs: js.Array[markoLib.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def buildLookup(dirname: java.lang.String): markoLib.srcCompilerTaglibDashLookupMod.TaglibLookup = js.native
  def clearCache(): scala.Unit = js.native
  def registerTaglib(taglib: markoLib.srcCompilerTaglibDashLoaderTaglibMod.default): scala.Unit = js.native
}

