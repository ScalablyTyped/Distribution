package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object which can be safely disposed.
  */
@js.native
trait Disposable extends js.Object {
  
  /**
    * Method adds a callback which will be triggered when the object is disposed
    * @param callback {Function}
    * @param opt_scope {Object=}
    */
  def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
}
