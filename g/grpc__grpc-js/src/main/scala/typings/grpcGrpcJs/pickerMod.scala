package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE
import typings.grpcGrpcJs.pickerMod.PickResultType.DROP
import typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE
import typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE
import typings.grpcGrpcJs.subchannelMod.Subchannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @js.native
  sealed trait PickResultType extends StObject
  @JSImport("@grpc/grpc-js/build/src/picker", "PickResultType")
  @js.native
  object PickResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PickResultType & Double] = js.native
    
    @js.native
    sealed trait COMPLETE
      extends StObject
         with PickResultType
    /* 0 */ val COMPLETE: typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE & Double = js.native
    
    @js.native
    sealed trait DROP
      extends StObject
         with PickResultType
    /* 3 */ val DROP: typings.grpcGrpcJs.pickerMod.PickResultType.DROP & Double = js.native
    
    @js.native
    sealed trait QUEUE
      extends StObject
         with PickResultType
    /* 1 */ val QUEUE: typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE & Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE
      extends StObject
         with PickResultType
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE & Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "QueuePicker")
  @js.native
  class QueuePicker protected () extends StObject {
    def this(loadBalancer: LoadBalancer) = this()
    
    /* private */ var calledExitIdle: js.Any = js.native
    
    /* private */ var loadBalancer: js.Any = js.native
    
    def pick(pickArgs: PickArgs): QueuePickResult = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "UnavailablePicker")
  @js.native
  class UnavailablePicker ()
    extends StObject
       with Picker {
    def this(status: StatusObject) = this()
    
    /* CompleteClass */
    override def pick(pickArgs: PickArgs): PickResult = js.native
    
    /* private */ var status: js.Any = js.native
  }
  
  trait CompletePickResult
    extends StObject
       with PickResult {
    
    @JSName("pickResultType")
    var pickResultType_CompletePickResult: COMPLETE
    
    @JSName("status")
    var status_CompletePickResult: Null
  }
  object CompletePickResult {
    
    inline def apply(pickResultType: COMPLETE, status: Null): CompletePickResult = {
      val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], extraFilterFactory = null, onCallStarted = null, subchannel = null)
      __obj.asInstanceOf[CompletePickResult]
    }
    
    extension [Self <: CompletePickResult](x: Self) {
      
      inline def setPickResultType(value: COMPLETE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropCallPickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_DropCallPickResult: Null
    
    @JSName("onCallStarted")
    var onCallStarted_DropCallPickResult: Null
    
    @JSName("pickResultType")
    var pickResultType_DropCallPickResult: DROP
    
    @JSName("status")
    var status_DropCallPickResult: StatusObject
    
    @JSName("subchannel")
    var subchannel_DropCallPickResult: Null
  }
  object DropCallPickResult {
    
    inline def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: DROP,
      status: StatusObject,
      subchannel: Null
    ): DropCallPickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropCallPickResult]
    }
    
    extension [Self <: DropCallPickResult](x: Self) {
      
      inline def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: DROP): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickArgs extends StObject {
    
    var metadata: Metadata
  }
  object PickArgs {
    
    inline def apply(metadata: Metadata): PickArgs = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickArgs]
    }
    
    extension [Self <: PickArgs](x: Self) {
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickResult extends StObject {
    
    /**
      * Extra FilterFactory (can be multiple encapsulated in a FilterStackFactory)
      * provided by the load balancer to be used with the call. For technical
      * reasons filters from this factory will not see sendMetadata events.
      */
    var extraFilterFactory: FilterFactory[Filter] | Null
    
    var onCallStarted: js.Function0[Unit] | Null
    
    var pickResultType: PickResultType
    
    /**
      * The status object to end the call with. Populated if and only if
      * `pickResultType` is TRANSIENT_FAILURE.
      */
    var status: StatusObject | Null
    
    /**
      * The subchannel to use as the transport for the call. Only meaningful if
      * `pickResultType` is COMPLETE. If null, indicates that the call should be
      * dropped.
      */
    var subchannel: Subchannel | Null
  }
  object PickResult {
    
    inline def apply(pickResultType: PickResultType): PickResult = {
      val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], extraFilterFactory = null, onCallStarted = null, status = null, subchannel = null)
      __obj.asInstanceOf[PickResult]
    }
    
    extension [Self <: PickResult](x: Self) {
      
      inline def setExtraFilterFactory(value: FilterFactory[Filter]): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFactoryNull: Self = StObject.set(x, "extraFilterFactory", null)
      
      inline def setOnCallStarted(value: () => Unit): Self = StObject.set(x, "onCallStarted", js.Any.fromFunction0(value))
      
      inline def setOnCallStartedNull: Self = StObject.set(x, "onCallStarted", null)
      
      inline def setPickResultType(value: PickResultType): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setSubchannel(value: Subchannel): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
      
      inline def setSubchannelNull: Self = StObject.set(x, "subchannel", null)
    }
  }
  
  trait Picker extends StObject {
    
    def pick(pickArgs: PickArgs): PickResult
  }
  object Picker {
    
    inline def apply(pick: PickArgs => PickResult): Picker = {
      val __obj = js.Dynamic.literal(pick = js.Any.fromFunction1(pick))
      __obj.asInstanceOf[Picker]
    }
    
    extension [Self <: Picker](x: Self) {
      
      inline def setPick(value: PickArgs => PickResult): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
    }
  }
  
  trait QueuePickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_QueuePickResult: Null
    
    @JSName("onCallStarted")
    var onCallStarted_QueuePickResult: Null
    
    @JSName("pickResultType")
    var pickResultType_QueuePickResult: QUEUE
    
    @JSName("status")
    var status_QueuePickResult: Null
    
    @JSName("subchannel")
    var subchannel_QueuePickResult: Null
  }
  object QueuePickResult {
    
    inline def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: QUEUE,
      status: Null,
      subchannel: Null
    ): QueuePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePickResult]
    }
    
    extension [Self <: QueuePickResult](x: Self) {
      
      inline def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: QUEUE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransientFailurePickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_TransientFailurePickResult: Null
    
    @JSName("onCallStarted")
    var onCallStarted_TransientFailurePickResult: Null
    
    @JSName("pickResultType")
    var pickResultType_TransientFailurePickResult: TRANSIENT_FAILURE
    
    @JSName("status")
    var status_TransientFailurePickResult: StatusObject
    
    @JSName("subchannel")
    var subchannel_TransientFailurePickResult: Null
  }
  object TransientFailurePickResult {
    
    inline def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: TRANSIENT_FAILURE,
      status: StatusObject,
      subchannel: Null
    ): TransientFailurePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransientFailurePickResult]
    }
    
    extension [Self <: TransientFailurePickResult](x: Self) {
      
      inline def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: TRANSIENT_FAILURE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
}
