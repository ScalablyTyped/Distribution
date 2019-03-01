package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFold extends js.Object {
  /**
    * @cfg {Boolean} [autoFold=false]
    * When you click on a node, the node folding
    */
  var autoFold: js.UndefOr[scala.Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=null]
    * Sets an enabled node
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Boolean} [multipanel=false]
    */
  var multipanel: js.UndefOr[scala.Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_AutoFold {
  @scala.inline
  def apply(
    autoFold: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    index: scala.Int | scala.Double = null,
    multipanel: js.UndefOr[scala.Boolean] = js.undefined,
    tpl: js.Any = null
  ): Anon_AutoFold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFold)) __obj.updateDynamic("autoFold")(autoFold)
    if (event != null) __obj.updateDynamic("event")(event)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(multipanel)) __obj.updateDynamic("multipanel")(multipanel)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_AutoFold]
  }
}

