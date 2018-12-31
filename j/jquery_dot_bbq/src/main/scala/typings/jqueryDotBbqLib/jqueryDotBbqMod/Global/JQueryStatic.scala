package typings
package jqueryDotBbqLib.jqueryDotBbqMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var bbq: jqueryDotBbqLib.jqueryDotBbqMod.Global.JQueryBbqNs.JQuery = js.native
  @JSName("deparam")
  var deparam_Original: jqueryDotBbqLib.jqueryDotBbqMod.Global.JQueryBbqNs.JQueryDeparam = js.native
  /**
    * Deserialize a params string into an object, optionally coercing numbers,
    * booleans, null and undefined values; this method is the counterpart to the
    * internal jQuery.param method.
    *
    * @name params A params string to be parsed.
    * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
    */
  def deparam(params: java.lang.String): js.Any = js.native
  def deparam(params: java.lang.String, coerce: scala.Boolean): js.Any = js.native
  /**
    * Get the internal "Default URL attribute per tag" list, or augment the list
    * with additional tag-attribute pairs, in case the defaults are insufficient.
    *
    * @name tag_attr An object containing a list of tag names and their associated default attribute names in the format { tag: 'attr', ... } to be merged into the internal tag-attribute list.
    */
  def elemUrlAttr(): js.Any = js.native
  def elemUrlAttr(tag_attr: js.Any): js.Any = js.native
}

