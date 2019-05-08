package typings
package grpcDashGcpLib.buildSrcGcpUnderscoreChannelUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc-gcp/build/src/gcp_channel_factory", "GcpChannelFactory")
@js.native
class GcpChannelFactory protected () extends js.Object {
  /**
    * @param address The address of the server to connect to.
    * @param credentials Channel credentials to use when connecting
    * @param options A map of channel options.
    */
  def this(address: java.lang.String, credentials: grpcLib.grpcMod.ChannelCredentials, options: js.Any) = this()
  var affinityKeyToChannelRef: js.Any = js.native
  var channelRefs: js.Any = js.native
  var credentials: js.Any = js.native
  var initMethodToAffinityMap: js.Any = js.native
  var maxConcurrentStreamsLowWatermark: js.Any = js.native
  var maxSize: js.Any = js.native
  var methodToAffinity: js.Any = js.native
  var options: js.Any = js.native
  var target: js.Any = js.native
  /**
    * Bind channel with affinity key.
    * @param channelRef ChannelRef instance that contains the grpc channel.
    * @param affinityKey The affinity key used for binding the channel.
    */
  def bind(
    channelRef: grpcDashGcpLib.buildSrcChannelUnderscoreRefMod.ChannelRef,
    affinityKey: java.lang.String
  ): scala.Unit = js.native
  /**
    * Close all channels in the channel pool.
    */
  def close(): scala.Unit = js.native
  def createCall(method: java.lang.String, deadline: grpcLib.grpcMod.Deadline): grpcLib.grpcMod.Call = js.native
  def createCall(method: java.lang.String, deadline: grpcLib.grpcMod.Deadline, host: java.lang.String): grpcLib.grpcMod.Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: java.lang.String,
    parentCall: grpcLib.grpcMod.Call
  ): grpcLib.grpcMod.Call = js.native
  /**
    * Create a call object. This function will not be called when using
    * grpc.Client class. But since it's a public function of grpc.Channel,
    * It needs to be implemented for potential use cases.
    * @param method The full method string to request.
    * @param deadline The call deadline.
    * @param host A host string override for making the request.
    * @param parentCall A server call to propagate some information from.
    * @param propagateFlags A bitwise combination of elements of
    *     {@link grpc.propagate} that indicates what information to propagate
    *     from parentCall.
    * @return a grpc call object.
    */
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: java.lang.String,
    parentCall: grpcLib.grpcMod.Call,
    propagateFlags: scala.Double
  ): grpcLib.grpcMod.Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: java.lang.String,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): grpcLib.grpcMod.Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: scala.Null,
    parentCall: grpcLib.grpcMod.Call
  ): grpcLib.grpcMod.Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: scala.Null,
    parentCall: grpcLib.grpcMod.Call,
    propagateFlags: scala.Double
  ): grpcLib.grpcMod.Call = js.native
  def createCall(
    method: java.lang.String,
    deadline: grpcLib.grpcMod.Deadline,
    host: scala.Null,
    parentCall: scala.Null,
    propagateFlags: scala.Double
  ): grpcLib.grpcMod.Call = js.native
  /**
    * Get AffinityConfig associated with a certain method.
    * @param methodName Method name of the request.
    */
  def getAffinityConfig(methodName: java.lang.String): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig = js.native
  /**
    * Picks a grpc channel from the pool and wraps it with ChannelRef.
    * @param affinityKey Affinity key to get the bound channel.
    * @return Wrapper containing the grpc channel.
    */
  def getChannelRef(): grpcDashGcpLib.buildSrcChannelUnderscoreRefMod.ChannelRef = js.native
  def getChannelRef(affinityKey: java.lang.String): grpcDashGcpLib.buildSrcChannelUnderscoreRefMod.ChannelRef = js.native
  /**
    * Get the current connectivity state of the channel pool.
    * @param tryToConnect If true, the channel will start connecting if it is
    *     idle. Otherwise, idle channels will only start connecting when a
    *     call starts.
    * @return connectivity state of channel pool.
    */
  def getConnectivityState(tryToConnect: scala.Boolean): grpcLib.grpcMod.connectivityState = js.native
  def getTarget(): java.lang.String = js.native
  /**
    * Unbind channel with affinity key.
    * @param boundKey Affinity key bound to a channel.
    */
  def unbind(): scala.Unit = js.native
  def unbind(boundKey: java.lang.String): scala.Unit = js.native
  /**
    * Watch for connectivity state changes. Currently This function will throw
    * not implemented error because the implementation requires lot of work but
    * has little use cases.
    * @param currentState The state to watch for transitions from. This should
    *     always be populated by calling getConnectivityState immediately before.
    * @param deadline A deadline for waiting for a state change
    * @param callback Called with no error when the state changes, or with an
    *     error if the deadline passes without a state change
    */
  def watchConnectivityState(
    currentState: grpcLib.grpcMod.connectivityState,
    deadline: grpcLib.grpcMod.Deadline,
    callback: js.Function
  ): scala.Unit = js.native
}

