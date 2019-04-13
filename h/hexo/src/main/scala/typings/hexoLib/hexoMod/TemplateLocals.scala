package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLocals extends js.Object {
  /**
    * Underscore object
    */
  @JSName("_")
  var __Original: underscoreLib.underscoreMod.UnderscoreStatic = js.native
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig = js.native
  var env: hexoLib.Anon_Args = js.native
  var layout: java.lang.String = js.native
  var page: hexoLib.hexoMod.LocalsNs.Post | hexoLib.hexoMod.LocalsNs.Page | hexoLib.hexoMod.LocalsNs.Category | hexoLib.hexoMod.LocalsNs.Tag | IndexPage | ArchivePage | CategoryPage | TagPage = js.native
  var path: java.lang.String = js.native
  var site: js.Any = js.native
  var theme: HexoConfig = js.native
  var url: java.lang.String = js.native
  var view_dir: java.lang.String = js.native
  /**
    * Underscore object
    */
  def `_`[T](value: T): underscoreLib.underscoreMod.Underscore[T] = js.native
  /**
    * Underscore object
    */
  def `_`[T](value: js.Array[T]): underscoreLib.underscoreMod.Underscore[T] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  /**
    * Underscore object
    */
  def `_`[T](value: underscoreLib.underscoreMod.Dictionary[T]): underscoreLib.underscoreMod.Underscore[T] = js.native
  /**
    * Underscore object
    */
  def `_`[T](value: underscoreLib.underscoreMod.List[T]): underscoreLib.underscoreMod.Underscore[T] = js.native
}

