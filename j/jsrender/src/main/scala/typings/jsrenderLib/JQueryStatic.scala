package typings
package jsrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ********************************** JsRender **********************************
@js.native
trait JQueryStatic extends js.Object {
  /* var htmlString = $.render.templateName(data, myHelpersObject); // Render named template */
  var render: org.scalablytyped.runtime.StringDictionary[jsrenderLib.JsViewsNs.TemplateRender] = js.native
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  @JSName("templates")
  var templates_Original: jsrenderLib.JsViewsNs.Templates = js.native
  /* $.views.xxx ... // JsRender/JsViews APIs */
  var views: jsrenderLib.JsViewsNs.Views = js.native
  /**
    * Additional $.templates() signature for compiling unnamed template
    *
    * @param {string|TemplateOptions}   markup or selector
    * @param {Template}                 [parentTmpl] For compling template as private resource of parent template
    * @returns {Template}               compiled template
    */
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  /**
    * Generic store() function to register item, named item, or hash of items
    * Also used as hash to store the registered items
    * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    *
    * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    * @param {any}           [item]       (e.g. markup for named template)
    * @param {Template}      [parentTmpl] For item being registered as private resource of template
    * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    */
  def templates(markupOrSelectorOrOptions: java.lang.String): jsrenderLib.JsViewsNs.Template = js.native
  def templates(markupOrSelectorOrOptions: java.lang.String, parentTmpl: jsrenderLib.JsViewsNs.Template): jsrenderLib.JsViewsNs.Template = js.native
  def templates(markupOrSelectorOrOptions: jsrenderLib.JsViewsNs.TemplateOptions): jsrenderLib.JsViewsNs.Template = js.native
  def templates(
    markupOrSelectorOrOptions: jsrenderLib.JsViewsNs.TemplateOptions,
    parentTmpl: jsrenderLib.JsViewsNs.Template
  ): jsrenderLib.JsViewsNs.Template = js.native
   // named item
  /* $.templates(...) or $.templates.templateName: Compile/get template */
  def templates(namedItems: jsrenderLib.JsViewsNs.Hash[jsrenderLib.JsViewsNs.TemplateSetter]): jsrenderLib.JsViewsNs.Views = js.native
  def templates(
    namedItems: jsrenderLib.JsViewsNs.Hash[jsrenderLib.JsViewsNs.TemplateSetter],
    parentTmpl: jsrenderLib.JsViewsNs.Template
  ): jsrenderLib.JsViewsNs.Views = js.native
  def templates(name: java.lang.String, item: jsrenderLib.JsViewsNs.TemplateSetter): jsrenderLib.JsViewsNs.Template = js.native
  def templates(
    name: java.lang.String,
    item: jsrenderLib.JsViewsNs.TemplateSetter,
    parentTmpl: jsrenderLib.JsViewsNs.Template
  ): jsrenderLib.JsViewsNs.Template = js.native
}

