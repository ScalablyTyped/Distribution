package typings
package markoLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "taglibLoader")
@js.native
object taglibLoaderNs extends js.Object {
  @js.native
  class Taglib ()
    extends markoLib.srcCompilerTaglibDashLoaderMod.Taglib
  
  def clearCache(): scala.Unit = js.native
  def createTaglib(filePath: java.lang.String): markoLib.srcCompilerTaglibDashLoaderMod.Taglib = js.native
  def loadTag(tagProps: js.Any, filePath: java.lang.String): markoLib.srcCompilerTaglibDashLoaderTagMod.^ = js.native
  def loadTaglibFromFile(filePath: java.lang.String): markoLib.srcCompilerTaglibDashLoaderMod.Taglib = js.native
  def loadTaglibFromProps(taglib: markoLib.srcCompilerTaglibDashLoaderMod.Taglib, taglibProps: js.Any): markoLib.srcCompilerTaglibDashLoaderMod.Taglib = js.native
}

