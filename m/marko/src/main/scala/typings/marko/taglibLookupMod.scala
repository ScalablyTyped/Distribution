package typings.marko

import typings.marko.taglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
@js.native
object taglibLookupMod extends js.Object {
  
  def buildLookup(dirname: String): TaglibLookup = js.native
  
  def clearCache(): Unit = js.native
  
  def registerTaglib(taglib: default): Unit = js.native
  
  val registeredTaglibs: js.Array[default] = js.native
  
  @js.native
  class TaglibLookup ()
    extends typings.marko.taglibLookupTaglibLookupMod.default
}
