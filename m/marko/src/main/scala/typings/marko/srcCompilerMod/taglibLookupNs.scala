package typings.marko.srcCompilerMod

import typings.marko.srcCompilerTaglibDashLoaderTaglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "taglibLookup")
@js.native
object taglibLookupNs extends js.Object {
  @js.native
  class TaglibLookup ()
    extends typings.marko.srcCompilerTaglibDashLookupMod.TaglibLookup
  
  val registeredTaglibs: js.Array[default] = js.native
  def buildLookup(dirname: String): typings.marko.srcCompilerTaglibDashLookupMod.TaglibLookup = js.native
  def clearCache(): Unit = js.native
  def registerTaglib(taglib: default): Unit = js.native
}

