package typings
package grpcDashGcpLib.buildSrcChannelUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc-gcp/build/src/channel_ref", "ChannelRef")
@js.native
class ChannelRef protected () extends js.Object {
  /**
    * @param channel The underlying grpc channel.
    * @param channelId Id for creating unique channel.
    * @param affinityCount Initial affinity count.
    * @param activeStreamsCount Initial streams count.
    */
  def this(channel: grpcLib.grpcMod.Channel, channelId: scala.Double) = this()
  def this(channel: grpcLib.grpcMod.Channel, channelId: scala.Double, affinityCount: scala.Double) = this()
  def this(channel: grpcLib.grpcMod.Channel, channelId: scala.Double, affinityCount: scala.Double, activeStreamsCount: scala.Double) = this()
  var activeStreamsCount: js.Any = js.native
  var affinityCount: js.Any = js.native
  val channel: js.Any = js.native
  val channelId: js.Any = js.native
  def activeStreamsCountDecr(): scala.Unit = js.native
  def activeStreamsCountIncr(): scala.Unit = js.native
  def affinityCountDecr(): scala.Unit = js.native
  def affinityCountIncr(): scala.Unit = js.native
  def getActiveStreamsCount(): scala.Double = js.native
  def getAffinityCount(): scala.Double = js.native
  def getChannel(): grpcLib.grpcMod.Channel = js.native
}

