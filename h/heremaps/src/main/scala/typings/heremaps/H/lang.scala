package typings.heremaps.H

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.lang")
@js.native
object lang extends js.Object {
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.IllegalOperationError.html
    */
  @js.native
  class IllegalOperationError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_message: js.Any) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @js.native
  class InvalidArgumentError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_argNr: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_argNr: Double, opt_message: js.Any) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @js.native
  class OutOfRangeError () extends Error {
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _]) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_val: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ js.Any, _], opt_val: Double, opt_range: js.Array[Double]) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

