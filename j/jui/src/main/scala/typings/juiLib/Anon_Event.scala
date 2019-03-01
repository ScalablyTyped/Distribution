package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String/DOMElement} [target=null]
    * Designates a target selector when an autofill route is not a target
    */
  var target: js.UndefOr[js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Array} words
    * Designates words subject to autofill
    */
  var words: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(
    event: js.Any = null,
    target: js.Any = null,
    tpl: js.Any = null,
    words: js.Array[java.lang.String] = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Anon_Event]
  }
}

