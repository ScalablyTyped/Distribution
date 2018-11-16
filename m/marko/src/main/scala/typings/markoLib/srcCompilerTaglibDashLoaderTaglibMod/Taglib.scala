package typings
package markoLib.srcCompilerTaglibDashLoaderTaglibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Taglib extends js.Object {
  var attributeGroups: ScalablyTyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var attributes: ScalablyTyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var dirname: java.lang.String = js.native
  var filePath: java.lang.String = js.native
  var id: java.lang.String = js.native
  var imports: js.Any = js.native
  var importsLookup: js.Any = js.native
  var inputFilesLookup: js.Any = js.native
  /** @deprecated */
  var path: java.lang.String = js.native
  var patternAttributes: js.Array[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var tags: ScalablyTyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced] = js.native
  var textTransformers: js.Array[markoLib.srcCompilerTaglibDashLoaderTransformerMod.default] = js.native
  var transformers: js.Array[markoLib.srcCompilerTaglibDashLoaderTransformerMod.default] = js.native
  def addAttribute(attribute: markoLib.srcCompilerTaglibDashLoaderAttributeMod.default): scala.Unit = js.native
  def addImport(path: java.lang.String): scala.Unit = js.native
  def addTag(tag: markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced): scala.Unit = js.native
  def addTextTransformer(transformer: markoLib.srcCompilerTaglibDashLoaderTransformerMod.default): scala.Unit = js.native
  def addTransformer(transformer: markoLib.srcCompilerTaglibDashLoaderTransformerMod.default): scala.Unit = js.native
  def forEachTag(
    callback: js.Function1[/* tag */ markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced, scala.Unit]
  ): scala.Unit = js.native
  def forEachTag(
    callback: js.Function1[/* tag */ markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced, scala.Unit],
    thisObj: js.Any
  ): scala.Unit = js.native
  def getAttribute(name: java.lang.String): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def toJSON(): js.Any = js.native
}

