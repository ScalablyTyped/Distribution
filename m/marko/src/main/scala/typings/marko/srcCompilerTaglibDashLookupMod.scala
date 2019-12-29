package typings.marko

import typings.marko.srcCompilerTaglibDashLookupTaglibLookupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
@js.native
object srcCompilerTaglibDashLookupMod extends js.Object {
  @js.native
  class TaglibLookup () extends default
  
  val registeredTaglibs: js.Array[typings.marko.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def buildLookup(dirname: String): TaglibLookup = js.native
  def clearCache(): Unit = js.native
  def registerTaglib(taglib: typings.marko.srcCompilerTaglibDashLoaderTaglibMod.default): Unit = js.native
}

