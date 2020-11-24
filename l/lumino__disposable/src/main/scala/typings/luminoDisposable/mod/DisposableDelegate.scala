package typings.luminoDisposable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/disposable", "DisposableDelegate")
@js.native
class DisposableDelegate protected () extends IDisposable {
  /**
    * Construct a new disposable delegate.
    *
    * @param fn - The callback function to invoke on dispose.
    */
  def this(fn: js.Function0[Unit]) = this()
  
  var _fn: js.Any = js.native
}
