package typings
package markoLib.srcCompilerTaglibDashLoaderTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  var attributeGroups: js.Array[java.lang.String] = js.native
  var attributes: ScalablyTyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var body: js.Any = js.native
  var bodyFunction: js.Any = js.native
  var codeGeneratorModulePath: java.lang.String | scala.Null = js.native
  var dir: java.lang.String = js.native
  var importedVariables: js.Any = js.native
  var isNestedTag: scala.Boolean = js.native
  var isRepeated: scala.Boolean | scala.Null = js.native
  var name: java.lang.String = js.native
  var nestedTags: ScalablyTyped.runtime.StringDictionary[Tag] | scala.Null = js.native
  var nestedVariables: js.Any = js.native
  var nodeFactoryPath: java.lang.String | scala.Null = js.native
  var openTagOnly: js.Any = js.native
  var parentTagName: java.lang.String | scala.Null = js.native
  var patternAttributes: js.Array[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  var renderer: js.Any = js.native
  var taglibId: java.lang.String | scala.Null = js.native
  var taglibPath: java.lang.String | scala.Null = js.native
  var targetProperty: js.UndefOr[java.lang.String] = js.native
  var template: js.Any = js.native
  var transformers: ScalablyTyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderTransformerMod.default] = js.native
  var `type`: js.Any = js.native
  def addAttribute(attr: markoLib.srcCompilerTaglibDashLoaderAttributeMod.default): scala.Unit = js.native
  def addImportedVariable(importedVariable: js.Any): scala.Unit = js.native
  def addNestedTag(nestedTag: Tag): scala.Unit = js.native
  def addNestedVariable(nestedVariable: js.Any): scala.Unit = js.native
  def addTransformer(transformer: markoLib.srcCompilerTaglibDashLoaderTransformerMod.default): scala.Unit = js.native
  def forEachAttribute(
    callback: js.Function1[/* attr */ markoLib.srcCompilerTaglibDashLoaderAttributeMod.default, scala.Unit]
  ): scala.Unit = js.native
  def forEachAttribute(
    callback: js.Function1[/* attr */ markoLib.srcCompilerTaglibDashLoaderAttributeMod.default, scala.Unit],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachImportedVariable(callback: js.Function1[/* importedVariable */ js.Any, scala.Unit]): scala.Unit = js.native
  def forEachImportedVariable(callback: js.Function1[/* importedVariable */ js.Any, scala.Unit], thisObj: js.Any): scala.Unit = js.native
  def forEachNestedTag(callback: js.Function1[/* nestedTag */ this.type, scala.Unit]): scala.Unit = js.native
  def forEachNestedTag(callback: js.Function1[/* nestedTag */ this.type, scala.Unit], thisObj: js.Any): scala.Unit = js.native
  def forEachTransformer(
    callback: js.Function1[
      /* transformer */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEachTransformer(
    callback: js.Function1[
      /* transformer */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, 
      scala.Unit
    ],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachVariable(callback: js.Function1[/* nestedVariable */ js.Any, scala.Unit]): scala.Unit = js.native
  def forEachVariable(callback: js.Function1[/* nestedVariable */ js.Any, scala.Unit], thisObj: js.Any): scala.Unit = js.native
  def getAttribute(attrName: java.lang.String): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getNodeFactory(): js.Any = js.native
  def hasAttribute(attrName: java.lang.String): scala.Boolean = js.native
  def hasNestedTags(): scala.Boolean = js.native
  def hasTransformers(): scala.Boolean = js.native
  def setBodyFunction(name: java.lang.String, params: js.Any): scala.Unit = js.native
  def setBodyProperty(propertyName: java.lang.String): scala.Unit = js.native
  def setTaglib(taglib: markoLib.srcCompilerTaglibDashLoaderTaglibMod.default): scala.Unit = js.native
}

