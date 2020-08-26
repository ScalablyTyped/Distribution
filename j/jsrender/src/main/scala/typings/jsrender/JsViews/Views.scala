package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* $.views*/
@js.native
trait Views extends js.Object {
  /* $.views.converters() */
  @JSName("converters")
  var converters_Original: Store[Converter, Converter] = js.native
  /* $.views.helpers() */
  @JSName("helpers")
  var helpers_Original: Store[_, _] = js.native
  /* $.views.settings */
  var settings: Settings = js.native
  /* $.views.sub.xxx */
  var sub: Hash[_] = js.native
  /* $.views.tags() */
  @JSName("tags")
  var tags_Original: Store[Tag, TagSetter] = js.native
  /* $.views.templates() */
  @JSName("templates")
  var templates_Original: Templates = js.native
  /* $.views.viewModels() */
  @JSName("viewModels")
  var viewModels_Original: ViewModels = js.native
   // named item
  /* $.views.converters() */
  def converters(namedItems: Hash[Converter]): Views = js.native
  def converters(namedItems: Hash[Converter], parentTmpl: Template): Views = js.native
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
  /* $.views.converters() */
  def converters(name: String): Converter = js.native
  def converters(name: String, item: js.UndefOr[scala.Nothing], parentTmpl: Template): Converter = js.native
  def converters(name: String, item: Converter): Converter = js.native
  def converters(name: String, item: Converter, parentTmpl: Template): Converter = js.native
   // named item
  /* $.views.helpers() */
  def helpers(namedItems: Hash[_]): Views = js.native
  def helpers(namedItems: Hash[_], parentTmpl: Template): Views = js.native
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
  /* $.views.helpers() */
  def helpers(name: String): js.Any = js.native
  def helpers(name: String, item: js.UndefOr[scala.Nothing], parentTmpl: Template): js.Any = js.native
  def helpers(name: String, item: js.Any): js.Any = js.native
  def helpers(name: String, item: js.Any, parentTmpl: Template): js.Any = js.native
  /* $.views.map() */
  def map(any: js.Any): js.Any = js.native
   // named item
  /* $.views.tags() */
  def tags(namedItems: Hash[TagSetter]): Views = js.native
  def tags(namedItems: Hash[TagSetter], parentTmpl: Template): Views = js.native
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
  /* $.views.tags() */
  def tags(name: String): Tag = js.native
  def tags(name: String, item: js.UndefOr[TagSetter], parentTmpl: Template): Tag = js.native
  def tags(name: String, item: TagSetter): Tag = js.native
  /**
  	 * Additional $.templates() signature for compiling unnamed template
  	 *
  	 * @param {string|TemplateOptions}   markup or selector
  	 * @param {Template}                 [parentTmpl] For compling template as private resource of parent template
  	 * @returns {Template}               compiled template
  	 */
  /* $.views.templates() */
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
  def templates(markupOrSelectorOrOptions: String): Template = js.native
  def templates(markupOrSelectorOrOptions: String, parentTmpl: Template): Template = js.native
  def templates(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
  def templates(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
   // named item
  /* $.views.templates() */
  def templates(namedItems: Hash[TemplateSetter]): Views = js.native
  def templates(namedItems: Hash[TemplateSetter], parentTmpl: Template): Views = js.native
  def templates(name: String, item: js.UndefOr[TemplateSetter], parentTmpl: Template): Template = js.native
  def templates(name: String, item: TemplateSetter): Template = js.native
  /* $.views.viewModels() */
  def viewModels(namedItems: Hash[ViewModelOptions]): Hash[ViewModel] = js.native
  def viewModels(namedItems: Hash[ViewModelOptions], viewModels: Hash[ViewModel]): Hash[ViewModel] = js.native
  /* $.views.viewModels() */
  def viewModels(name: String, viewModel: ViewModelOptions): ViewModel = js.native
  def viewModels(name: String, viewModel: ViewModelOptions, viewModels: Hash[ViewModel]): ViewModel = js.native
  /* $.views.viewModels() */
  /* $.views.viewModels() */
  def viewModels(viewModel: ViewModelOptions): ViewModel = js.native
}

