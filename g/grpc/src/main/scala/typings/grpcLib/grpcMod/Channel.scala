package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "Channel")
@js.native
class Channel protected () extends js.Object {
  /**
    * This constructor API is almost identical to the Client constructor,
    * except that some of the options for the Client constructor are not valid
    * here.
    * @param target The address of the server to connect to
    * @param credentials Channel credentials to use when connecting
    * @param options A map of channel options that will be passed to the core
    */
  def this(target: java.lang.String, credentials: ChannelCredentials, options: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) = this()
  /**
    * Close the channel. This has the same functionality as the existing grpc.Client.prototype.close
    */
  def close(): scala.Unit = js.native
  def createCall(method: java.lang.String, deadline: scala.Double): Call = js.native
  def createCall(method: java.lang.String, deadline: scala.Double, host: java.lang.String): Call = js.native
  def createCall(method: java.lang.String, deadline: scala.Double, host: java.lang.String, parentCall: Call): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: scala.Double,
    host: java.lang.String,
    parentCall: Call,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: scala.Double,
    host: java.lang.String,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(method: java.lang.String, deadline: scala.Double, host: scala.Null, parentCall: Call): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: scala.Double,
    host: scala.Null,
    parentCall: Call,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: scala.Double,
    host: scala.Null,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(method: java.lang.String, deadline: stdLib.Date): Call = js.native
  def createCall(method: java.lang.String, deadline: stdLib.Date, host: java.lang.String): Call = js.native
  def createCall(method: java.lang.String, deadline: stdLib.Date, host: java.lang.String, parentCall: Call): Call = js.native
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
  def createCall(
    method: java.lang.String,
    deadline: stdLib.Date,
    host: java.lang.String,
    parentCall: Call,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: stdLib.Date,
    host: java.lang.String,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(method: java.lang.String, deadline: stdLib.Date, host: scala.Null, parentCall: Call): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: stdLib.Date,
    host: scala.Null,
    parentCall: Call,
    propagateFlags: scala.Double
  ): Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: stdLib.Date,
    host: scala.Null,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): Call = js.native
  /**
    * Get the channel's current connectivity state.
    * @param tryToConnect If true, the channel will start connecting if it is
    *     idle. Otherwise, idle channels will only start connecting when a
    *     call starts.
    */
  def getConnectivityState(tryToConnect: scala.Boolean): connectivityState = js.native
  /**
    * Return the target that this channel connects to
    */
  def getTarget(): java.lang.String = js.native
  def watchConnectivityState(
    currentState: connectivityState,
    deadline: scala.Double,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
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
    deadline: stdLib.Date,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

