package typings.marko

import typings.marko.taglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLoaderMod {
  
  @JSImport("marko/src/compiler/taglib-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "Taglib")
  @js.native
  class Taglib protected () extends default {
    def this(filePath: String) = this()
  }
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def createTaglib(filePath: String): Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaglib")(filePath.asInstanceOf[js.Any]).asInstanceOf[Taglib]
  
  inline def loadTag(tagProps: js.Any, filePath: String): typings.marko.tagMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTag")(tagProps.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[typings.marko.tagMod.^]
  
  inline def loadTaglibFromFile(filePath: String): Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[Taglib]
  
  inline def loadTaglibFromProps(taglib: Taglib, taglibProps: js.Any): Taglib = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromProps")(taglib.asInstanceOf[js.Any], taglibProps.asInstanceOf[js.Any])).asInstanceOf[Taglib]
}
