package typings.heremaps.H.util

import typings.heremaps.H.util.Request.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic class to represent a handle for any kind of asynchronous processed requests
  */
@JSGlobal("H.util.Request")
@js.native
/**
  * Constructor
  * @param opt_onprogress {function(H.util.Request)=} - A callback to invoke every time when the request's progress state changes
  * @param opt_total {number=} - The total number of processing steps to complete this request, default is 1
  */
class Request () extends js.Object {
  def this(opt_onprogress: js.Function1[/* req */ Request, Unit]) = this()
  def this(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_total: Double) = this()
  /**
    * Returns the number of processingsteps which have been failed
    * @returns {number}
    */
  def getFailed(): Double = js.native
  /**
    * Returns the number of steps which are already processed by this request
    * @returns {number}
    */
  def getProcessed(): Double = js.native
  /**
    * Returns the state of this request
    * @returns {H.util.Request.State}
    */
  def getState(): State = js.native
  /**
    * Returns the number of processing steps to complete this request
    * @returns {number}
    */
  def getTotal(): Double = js.native
}

@JSGlobal("H.util.Request")
@js.native
object Request extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  /**
    * The supported states of an request
    */
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait CANCELLED extends State
    
    @js.native
    sealed trait COMPLETE extends State
    
    @js.native
    sealed trait ERROR extends State
    
    @js.native
    sealed trait PENDING extends State
    
    @js.native
    sealed trait PROCESSING extends State
    
    /* 3 */ val CANCELLED: typings.heremaps.H.util.Request.State.CANCELLED with Double = js.native
    /* 2 */ val COMPLETE: typings.heremaps.H.util.Request.State.COMPLETE with Double = js.native
    /* 4 */ val ERROR: typings.heremaps.H.util.Request.State.ERROR with Double = js.native
    /* 0 */ val PENDING: typings.heremaps.H.util.Request.State.PENDING with Double = js.native
    /* 1 */ val PROCESSING: typings.heremaps.H.util.Request.State.PROCESSING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
  }
  
}

