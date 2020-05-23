package typings.heremaps.H.util

import typings.heremaps.H.util.Request.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic class to represent a handle for any kind of asynchronous processed requests
  */
trait Request extends js.Object {
  /**
    * Returns the number of processingsteps which have been failed
    * @returns {number}
    */
  def getFailed(): Double
  /**
    * Returns the number of steps which are already processed by this request
    * @returns {number}
    */
  def getProcessed(): Double
  /**
    * Returns the state of this request
    * @returns {H.util.Request.State}
    */
  def getState(): State
  /**
    * Returns the number of processing steps to complete this request
    * @returns {number}
    */
  def getTotal(): Double
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
    
  }
  
}

