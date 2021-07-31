package typings.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "Channel")
@js.native
class Channel protected () extends StObject {
  /**
    * This constructor API is almost identical to the Client constructor,
    * except that some of the options for the Client constructor are not valid
    * here.
    * @param target The address of the server to connect to
    * @param credentials Channel credentials to use when connecting
    * @param options A map of channel options that will be passed to the core
    */
  def this(target: String, credentials: ChannelCredentials, options: StringDictionary[String | Double]) = this()
  
  /**
    * Close the channel. This has the same functionality as the existing grpc.Client.prototype.close
    */
  def close(): Unit = js.native
  
  def createCall(method: String, deadline: Double): Call = js.native
  def createCall(method: String, deadline: Double, host: String): Call = js.native
  def createCall(method: String, deadline: Double, host: String, parentCall: Null, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Double, host: String, parentCall: Call): Call = js.native
  def createCall(method: String, deadline: Double, host: String, parentCall: Call, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Double, host: Null, parentCall: Null, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Double, host: Null, parentCall: Call): Call = js.native
  def createCall(method: String, deadline: Double, host: Null, parentCall: Call, propagateFlags: Double): Call = js.native
  /**
    * Create a call object. Call is an opaque type that is used by the Client
    * and Server classes. This function is called by the gRPC library when
    * starting a request. Implementers should return an instance of Call that
    * is returned from calling createCall on an instance of the provided
    * Channel class.
    * @param method The full method string to request.
    * @param deadline The call deadline
    * @param host A host string override for making the request
    * @param parentCall A server call to propagate some information from
    * @param propagateFlags A bitwise combination of elements of grpc.propagate
    *     that indicates what information to propagate from parentCall.
    */
  def createCall(method: String, deadline: Date): Call = js.native
  def createCall(method: String, deadline: Date, host: String): Call = js.native
  def createCall(method: String, deadline: Date, host: String, parentCall: Null, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Date, host: String, parentCall: Call): Call = js.native
  def createCall(method: String, deadline: Date, host: String, parentCall: Call, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Date, host: Null, parentCall: Null, propagateFlags: Double): Call = js.native
  def createCall(method: String, deadline: Date, host: Null, parentCall: Call): Call = js.native
  def createCall(method: String, deadline: Date, host: Null, parentCall: Call, propagateFlags: Double): Call = js.native
  
  /**
    * Get the channel's current connectivity state.
    * @param tryToConnect If true, the channel will start connecting if it is
    *     idle. Otherwise, idle channels will only start connecting when a
    *     call starts.
    */
  def getConnectivityState(tryToConnect: Boolean): connectivityState = js.native
  
  /**
    * Return the target that this channel connects to
    */
  def getTarget(): String = js.native
  
  def watchConnectivityState(
    currentState: connectivityState,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  /**
    * Watch for connectivity state changes.
    * @param currentState The state to watch for transitions from. This should
    *     always be populated by calling getConnectivityState immediately
    *     before.
    * @param deadline A deadline for waiting for a state change
    * @param callback Called with no error when a state change, or with an
    *     error if the deadline passes without a state change.
    */
  def watchConnectivityState(
    currentState: connectivityState,
    deadline: Date,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
