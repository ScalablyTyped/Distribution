package typings.marko

import typings.marko.taglibLookupTaglibLookupMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLookupMod {
  
  @JSImport("marko/src/compiler/taglib-lookup", "TaglibLookup")
  @js.native
  class TaglibLookup () extends default
  
  @JSImport("marko/src/compiler/taglib-lookup", "buildLookup")
  @js.native
  def buildLookup(dirname: String): TaglibLookup = js.native
  
  @JSImport("marko/src/compiler/taglib-lookup", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-lookup", "registerTaglib")
  @js.native
  def registerTaglib(taglib: typings.marko.taglibMod.default): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-lookup", "registeredTaglibs")
  @js.native
  val registeredTaglibs: js.Array[typings.marko.taglibMod.default] = js.native
}
