package typings
package markoLib.srcCompilerTaglibDashLookupTaglibLookupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaglibLookup extends js.Object {
  var merged: markoLib.Anon_AttributeGroups = js.native
  var taglibsById: org.scalablytyped.runtime.StringDictionary[markoLib.srcCompilerTaglibDashLoaderTaglibMod.default] = js.native
  def addTaglib(taglib: markoLib.srcCompilerTaglibDashLoaderTaglibMod.default): scala.Unit = js.native
  def forEachAttribute(
    tagName: java.lang.String,
    callback: js.Function2[
      /* attrDef */ markoLib.srcCompilerTaglibDashLoaderAttributeMod.default, 
      /* tag */ markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEachNodeTransformer(
    node: js.Any,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _]
  ): scala.Unit = js.native
  def forEachNodeTransformer(
    node: js.Any,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachTag(
    callback: js.Function1[
      /* tag */ markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced, 
      scala.Unit | scala.Boolean
    ]
  ): scala.Unit = js.native
  def forEachTagTransformer(
    element: java.lang.String,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _]
  ): scala.Unit = js.native
  def forEachTagTransformer(
    element: java.lang.String,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _]
  ): scala.Unit = js.native
  def forEachTagTransformer(
    element: Element,
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachTemplateTransformer(callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _]): scala.Unit = js.native
  def forEachTemplateTransformer(
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _],
    thisObj: js.Any
  ): scala.Unit = js.native
  def forEachTextTransformer(callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _]): scala.Unit = js.native
  def forEachTextTransformer(
    callback: js.Function1[/* trans */ markoLib.srcCompilerTaglibDashLoaderTransformerMod.default, _],
    thisObj: js.Any
  ): scala.Unit = js.native
  def getAttribute(element: java.lang.String, attr: java.lang.String): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: java.lang.String, attr: markoLib.Anon_Name): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: Element, attr: java.lang.String): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getAttribute(element: Element, attr: markoLib.Anon_Name): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderAttributeMod.default] = js.native
  def getInputFiles(): js.Array[java.lang.String] = js.native
  def getTag(element: java.lang.String): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced] = js.native
  def getTag(element: Element): js.UndefOr[markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced] = js.native
  def getTagsSorted(): js.Array[markoLib.srcCompilerTaglibDashLoaderTagMod.namespaced] = js.native
  def hasTaglib(taglib: markoLib.srcCompilerTaglibDashLoaderTaglibMod.default): scala.Boolean = js.native
}

