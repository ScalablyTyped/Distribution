package typings.heremaps.global.H

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lang {
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.IllegalOperationError.html
    */
  @JSGlobal("H.lang.IllegalOperationError")
  @js.native
  open class IllegalOperationError ()
    extends StObject
       with Error {
    def this(opt_caller: js.Function1[/* repeated */ Any, Any]) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_message: Any) = this()
    def this(opt_caller: Unit, opt_message: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @JSGlobal("H.lang.InvalidArgumentError")
  @js.native
  open class InvalidArgumentError ()
    extends StObject
       with Error {
    def this(opt_caller: js.Function1[/* repeated */ Any, Any]) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_argNr: Double) = this()
    def this(opt_caller: Unit, opt_argNr: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_argNr: Double, opt_message: Any) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_argNr: Unit, opt_message: Any) = this()
    def this(opt_caller: Unit, opt_argNr: Double, opt_message: Any) = this()
    def this(opt_caller: Unit, opt_argNr: Unit, opt_message: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.lang.InvalidArgumentError.html
    */
  @JSGlobal("H.lang.OutOfRangeError")
  @js.native
  open class OutOfRangeError ()
    extends StObject
       with Error {
    def this(opt_caller: js.Function1[/* repeated */ Any, Any]) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_val: Double) = this()
    def this(opt_caller: Unit, opt_val: Double) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_val: Double, opt_range: js.Array[Double]) = this()
    def this(opt_caller: js.Function1[/* repeated */ Any, Any], opt_val: Unit, opt_range: js.Array[Double]) = this()
    def this(opt_caller: Unit, opt_val: Double, opt_range: js.Array[Double]) = this()
    def this(opt_caller: Unit, opt_val: Unit, opt_range: js.Array[Double]) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
