package typings.heremaps.global.H

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("H.lang")
@js.native
object lang extends js.Object {
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.IllegalOperationError.html
    */
  @js.native
  class IllegalOperationError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_message: js.Any) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_message: js.Any) = this()
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @js.native
  class InvalidArgumentError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_argNr: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_argNr: Double) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_argNr: js.UndefOr[scala.Nothing], opt_message: js.Any) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_argNr: Double, opt_message: js.Any) = this()
    def this(
      opt_caller: js.Function1[/* repeated */ js.Any, _],
      opt_argNr: js.UndefOr[scala.Nothing],
      opt_message: js.Any
    ) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_argNr: Double, opt_message: js.Any) = this()
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @js.native
  class OutOfRangeError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_val: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_val: Double) = this()
    def this(
      opt_caller: js.UndefOr[scala.Nothing],
      opt_val: js.UndefOr[scala.Nothing],
      opt_range: js.Array[Double]
    ) = this()
    def this(opt_caller: js.UndefOr[scala.Nothing], opt_val: Double, opt_range: js.Array[Double]) = this()
    def this(
      opt_caller: js.Function1[/* repeated */ js.Any, _],
      opt_val: js.UndefOr[scala.Nothing],
      opt_range: js.Array[Double]
    ) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_val: Double, opt_range: js.Array[Double]) = this()
  }
}
