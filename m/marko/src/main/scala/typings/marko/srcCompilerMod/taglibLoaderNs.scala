package typings.marko.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "taglibLoader")
@js.native
object taglibLoaderNs extends js.Object {
  @js.native
  class Taglib ()
    extends typings.marko.srcCompilerTaglibDashLoaderMod.Taglib
  
  def clearCache(): Unit = js.native
  def createTaglib(filePath: String): typings.marko.srcCompilerTaglibDashLoaderMod.Taglib = js.native
  def loadTag(tagProps: js.Any, filePath: String): typings.marko.srcCompilerTaglibDashLoaderTagMod.^ = js.native
  def loadTaglibFromFile(filePath: String): typings.marko.srcCompilerTaglibDashLoaderMod.Taglib = js.native
  def loadTaglibFromProps(taglib: typings.marko.srcCompilerTaglibDashLoaderMod.Taglib, taglibProps: js.Any): typings.marko.srcCompilerTaglibDashLoaderMod.Taglib = js.native
}

