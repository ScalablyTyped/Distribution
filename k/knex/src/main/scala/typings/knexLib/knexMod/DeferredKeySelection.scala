package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredKeySelection[TBase, TKeys /* <: java.lang.String */] extends js.Object {
  var _base: TBase
  var _keys: TKeys
}

object DeferredKeySelection {
  @scala.inline
  def apply[TBase, TKeys /* <: java.lang.String */](_base: TBase, _keys: TKeys): DeferredKeySelection[TBase, TKeys] = {
    val __obj = js.Dynamic.literal(_base = _base.asInstanceOf[js.Any], _keys = _keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeferredKeySelection[TBase, TKeys]]
  }
}

