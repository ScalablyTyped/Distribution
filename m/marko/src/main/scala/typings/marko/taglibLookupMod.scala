package typings.marko

import typings.marko.taglibLookupTaglibLookupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
@js.native
object taglibLookupMod extends js.Object {
  @js.native
  class TaglibLookup () extends default
  
  val registeredTaglibs: js.Array[typings.marko.taglibMod.default] = js.native
  def buildLookup(dirname: String): TaglibLookup = js.native
  def clearCache(): Unit = js.native
  def registerTaglib(taglib: typings.marko.taglibMod.default): Unit = js.native
}

