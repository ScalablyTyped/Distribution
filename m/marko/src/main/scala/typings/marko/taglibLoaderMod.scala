package typings.marko

import typings.marko.tagMod.^
import typings.marko.taglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/compiler/taglib-loader", JSImport.Namespace)
@js.native
object taglibLoaderMod extends js.Object {
  
  def clearCache(): Unit = js.native
  
  def createTaglib(filePath: String): Taglib = js.native
  
  def loadTag(tagProps: js.Any, filePath: String): ^ = js.native
  
  def loadTaglibFromFile(filePath: String): Taglib = js.native
  
  def loadTaglibFromProps(taglib: Taglib, taglibProps: js.Any): Taglib = js.native
  
  @js.native
  class Taglib () extends default
}
