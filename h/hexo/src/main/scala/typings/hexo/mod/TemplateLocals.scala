package typings.hexo.mod

import typings.hexo.anon.Args
import typings.hexo.mod.Locals.Category
import typings.hexo.mod.Locals.Page
import typings.hexo.mod.Locals.Tag
import typings.underscore.mod.Dictionary
import typings.underscore.mod.List
import typings.underscore.mod.TypeOfDictionary
import typings.underscore.mod.Underscore
import typings.underscore.mod.UnderscoreStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLocals extends js.Object {
  /**
    * Underscore object
    */
  @JSName("_")
  var _underscore_Original: UnderscoreStatic = js.native
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig = js.native
  var env: Args = js.native
  var layout: String = js.native
  var page: typings.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage = js.native
  var path: String = js.native
  var site: js.Any = js.native
  var theme: HexoConfig = js.native
  var url: String = js.native
  var view_dir: String = js.native
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore[T](value: T): Underscore[T, T] = js.native
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore[T](value: js.Array[T]): Underscore[T, js.Array[T]] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore[T](value: List[T]): Underscore[T, List[T]] = js.native
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore_T_TypeOfDictionaryVV_DictionaryWildcard[T /* <: TypeOfDictionary[V] */, V /* <: Dictionary[_] */](value: V): Underscore[T, V] = js.native
}

