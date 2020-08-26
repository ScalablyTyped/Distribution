package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.subchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickResult extends js.Object {
  /**
    * Extra FilterFactory (can be multiple encapsulated in a FilterStackFactory)
    * provided by the load balancer to be used with the call. For technical
    * reasons filters from this factory will not see sendMetadata events.
    */
  var extraFilterFactory: FilterFactory[Filter] | Null = js.native
  var onCallStarted: js.Function0[Unit] | Null = js.native
  var pickResultType: PickResultType = js.native
  /**
    * The status object to end the call with. Populated if and only if
    * `pickResultType` is TRANSIENT_FAILURE.
    */
  var status: StatusObject | Null = js.native
  /**
    * The subchannel to use as the transport for the call. Only meaningful if
    * `pickResultType` is COMPLETE. If null, indicates that the call should be
    * dropped.
    */
  var subchannel: Subchannel | Null = js.native
}

object PickResult {
  @scala.inline
  def apply(pickResultType: PickResultType): PickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResult]
  }
  @scala.inline
  implicit class PickResultOps[Self <: PickResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPickResultType(value: PickResultType): Self = this.set("pickResultType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraFilterFactory(value: FilterFactory[Filter]): Self = this.set("extraFilterFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraFilterFactoryNull: Self = this.set("extraFilterFactory", null)
    @scala.inline
    def setOnCallStarted(value: () => Unit): Self = this.set("onCallStarted", js.Any.fromFunction0(value))
    @scala.inline
    def setOnCallStartedNull: Self = this.set("onCallStarted", null)
    @scala.inline
    def setStatus(value: StatusObject): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setSubchannel(value: Subchannel): Self = this.set("subchannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubchannelNull: Self = this.set("subchannel", null)
  }
  
}

