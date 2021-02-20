package typings.marko

import typings.marko.tagMod.^
import typings.marko.taglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLoaderMod {
  
  @JSImport("marko/src/compiler/taglib-loader", "Taglib")
  @js.native
  class Taglib protected () extends default {
    def this(filePath: String) = this()
  }
  
  @JSImport("marko/src/compiler/taglib-loader", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "createTaglib")
  @js.native
  def createTaglib(filePath: String): Taglib = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "loadTag")
  @js.native
  def loadTag(tagProps: js.Any, filePath: String): ^ = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "loadTaglibFromFile")
  @js.native
  def loadTaglibFromFile(filePath: String): Taglib = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "loadTaglibFromProps")
  @js.native
  def loadTaglibFromProps(taglib: Taglib, taglibProps: js.Any): Taglib = js.native
}
