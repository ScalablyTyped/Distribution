package typings
package heremapsLib.HNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Object which can be safely disposed.
         */
@JSGlobal("H.util.Disposable")
@js.native
class Disposable () extends js.Object {
  /**
               * Method adds a callback which will be triggered when the object is disposed
               * @param callback {Function}
               * @param opt_scope {Object=}
               */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
               * Method adds a callback which will be triggered when the object is disposed
               * @param callback {Function}
               * @param opt_scope {Object=}
               */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
}

