package typings
package heremapsLib.HNs.utilNs

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
  def this(opt_onprogress: js.Function1[/* req */ Request, scala.Unit]) = this()
  def this(opt_onprogress: js.Function1[/* req */ Request, scala.Unit], opt_total: scala.Double) = this()
  /**
    * Returns the number of processingsteps which have been failed
    * @returns {number}
    */
  def getFailed(): scala.Double = js.native
  /**
    * Returns the number of steps which are already processed by this request
    * @returns {number}
    */
  def getProcessed(): scala.Double = js.native
  /**
    * Returns the state of this request
    * @returns {H.util.Request.State}
    */
  def getState(): heremapsLib.HNs.utilNs.RequestNs.State = js.native
  /**
    * Returns the number of processing steps to complete this request
    * @returns {number}
    */
  def getTotal(): scala.Double = js.native
}

