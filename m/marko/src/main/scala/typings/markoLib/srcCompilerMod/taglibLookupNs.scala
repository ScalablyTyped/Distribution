package typings
package markoLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "taglibLookup")
@js.native
object taglibLookupNs extends js.Object {
  @js.native
  class TaglibLookup ()
    extends markoLib.srcCompilerTaglibDashLookupMod.TaglibLookup
  
  val registeredTaglibs: js.Array[markoLib.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def buildLookup(dirname: java.lang.String): markoLib.srcCompilerTaglibDashLookupMod.TaglibLookup = js.native
  def clearCache(): scala.Unit = js.native
  def registerTaglib(taglib: markoLib.srcCompilerTaglibDashLoaderTaglibMod.default): scala.Unit = js.native
}

