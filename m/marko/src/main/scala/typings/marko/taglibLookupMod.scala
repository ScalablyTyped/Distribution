package typings.marko

import typings.marko.taglibLookupTaglibLookupMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLookupMod {
  
  @JSImport("marko/src/compiler/taglib-lookup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("marko/src/compiler/taglib-lookup", "TaglibLookup")
  @js.native
  class TaglibLookup () extends default
  
  @scala.inline
  def buildLookup(dirname: String): TaglibLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLookup")(dirname.asInstanceOf[js.Any]).asInstanceOf[TaglibLookup]
  
  @scala.inline
  def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  @scala.inline
  def registerTaglib(taglib: typings.marko.taglibMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTaglib")(taglib.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("marko/src/compiler/taglib-lookup", "registeredTaglibs")
  @js.native
  val registeredTaglibs: js.Array[typings.marko.taglibMod.default] = js.native
}
