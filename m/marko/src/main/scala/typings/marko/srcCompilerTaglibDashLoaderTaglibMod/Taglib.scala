package typings.marko.srcCompilerTaglibDashLoaderTaglibMod

import org.scalablytyped.runtime.StringDictionary
import typings.marko.srcCompilerTaglibDashLoaderTagMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Taglib extends js.Object {
  var attributeGroups: StringDictionary[typings.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var attributes: StringDictionary[typings.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var dirname: String = js.native
  var filePath: String = js.native
  var id: String = js.native
  var imports: js.Any = js.native
  var importsLookup: js.Any = js.native
  var inputFilesLookup: js.Any = js.native
  /** @deprecated */
  var path: String = js.native
  var patternAttributes: js.Array[typings.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var tags: StringDictionary[^] = js.native
  var textTransformers: js.Array[typings.marko.srcCompilerTaglibDashLoaderTransformerMod.default] = js.native
  var transformers: js.Array[typings.marko.srcCompilerTaglibDashLoaderTransformerMod.default] = js.native
  def addAttribute(attribute: typings.marko.srcCompilerTaglibDashLoaderAttributeMod.default): Unit = js.native
  def addImport(path: String): Unit = js.native
  def addTag(tag: ^): Unit = js.native
  def addTextTransformer(transformer: typings.marko.srcCompilerTaglibDashLoaderTransformerMod.default): Unit = js.native
  def addTransformer(transformer: typings.marko.srcCompilerTaglibDashLoaderTransformerMod.default): Unit = js.native
  def forEachTag(callback: js.Function1[/* tag */ ^, Unit]): Unit = js.native
  def forEachTag(callback: js.Function1[/* tag */ ^, Unit], thisObj: js.Any): Unit = js.native
  def getAttribute(name: String): js.UndefOr[typings.marko.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def toJSON(): js.Any = js.native
}

