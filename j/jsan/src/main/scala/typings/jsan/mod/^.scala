package typings.jsan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsan", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  @JSName("parse")
  var parse_Original: js.Function2[
    /* text */ String, 
    /* reviver */ js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]], 
    _
  ] = js.native
  
  def stringify(value: js.Any): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    space: js.UndefOr[scala.Nothing],
    _options: Boolean
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    space: js.UndefOr[scala.Nothing],
    _options: Options
  ): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String, _options: Boolean): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String, _options: Options): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double, _options: Boolean): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double, _options: Options): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null]
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: js.UndefOr[scala.Nothing],
    _options: Boolean
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: js.UndefOr[scala.Nothing],
    _options: Options
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String,
    _options: Boolean
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String,
    _options: Options
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Boolean
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Options
  ): String = js.native
  @JSName("stringify")
  var stringify_Original: js.Function4[
    /* value */ js.Any, 
    /* replacer */ js.UndefOr[
      js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null]
    ], 
    /* space */ js.UndefOr[String | Double], 
    /* _options */ js.UndefOr[Options | Boolean], 
    String
  ] = js.native
}
