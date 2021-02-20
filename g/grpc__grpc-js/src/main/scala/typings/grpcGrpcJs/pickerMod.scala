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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @js.native
  sealed trait PickResultType extends StObject
  @JSImport("@grpc/grpc-js/build/src/picker", "PickResultType")
  @js.native
  object PickResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PickResultType with Double] = js.native
    
    @js.native
    sealed trait COMPLETE extends PickResultType
    /* 0 */ val COMPLETE: typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE with Double = js.native
    
    @js.native
    sealed trait DROP extends PickResultType
    /* 3 */ val DROP: typings.grpcGrpcJs.pickerMod.PickResultType.DROP with Double = js.native
    
    @js.native
    sealed trait QUEUE extends PickResultType
    /* 1 */ val QUEUE: typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE with Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE extends PickResultType
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "QueuePicker")
  @js.native
  class QueuePicker protected () extends StObject {
    def this(loadBalancer: LoadBalancer) = this()
    
    var calledExitIdle: js.Any = js.native
    
    var loadBalancer: js.Any = js.native
    
    def pick(pickArgs: PickArgs): QueuePickResult = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "UnavailablePicker")
  @js.native
  class UnavailablePicker () extends Picker {
    def this(status: StatusObject) = this()
    
    var status: js.Any = js.native
  }
  
  @js.native
  trait CompletePickResult extends PickResult {
    
    @JSName("pickResultType")
    var pickResultType_CompletePickResult: COMPLETE = js.native
    
    @JSName("status")
    var status_CompletePickResult: Null = js.native
  }
  object CompletePickResult {
    
    @scala.inline
    def apply(pickResultType: COMPLETE, status: Null): CompletePickResult = {
      val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletePickResult]
    }
    
    @scala.inline
    implicit class CompletePickResultMutableBuilder[Self <: CompletePickResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPickResultType(value: COMPLETE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropCallPickResult extends PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_DropCallPickResult: Null = js.native
    
    @JSName("onCallStarted")
    var onCallStarted_DropCallPickResult: Null = js.native
    
    @JSName("pickResultType")
    var pickResultType_DropCallPickResult: DROP = js.native
    
    @JSName("status")
    var status_DropCallPickResult: StatusObject = js.native
    
    @JSName("subchannel")
    var subchannel_DropCallPickResult: Null = js.native
  }
  object DropCallPickResult {
    
    @scala.inline
    def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: DROP,
      status: StatusObject,
      subchannel: Null
    ): DropCallPickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropCallPickResult]
    }
    
    @scala.inline
    implicit class DropCallPickResultMutableBuilder[Self <: DropCallPickResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickResultType(value: DROP): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickArgs extends StObject {
    
    var metadata: Metadata = js.native
  }
  object PickArgs {
    
    @scala.inline
    def apply(metadata: Metadata): PickArgs = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickArgs]
    }
    
    @scala.inline
    implicit class PickArgsMutableBuilder[Self <: PickArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickResult extends StObject {
    
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
    implicit class PickResultMutableBuilder[Self <: PickResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraFilterFactory(value: FilterFactory[Filter]): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFilterFactoryNull: Self = StObject.set(x, "extraFilterFactory", null)
      
      @scala.inline
      def setOnCallStarted(value: () => Unit): Self = StObject.set(x, "onCallStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCallStartedNull: Self = StObject.set(x, "onCallStarted", null)
      
      @scala.inline
      def setPickResultType(value: PickResultType): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
      
      @scala.inline
      def setSubchannel(value: Subchannel): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubchannelNull: Self = StObject.set(x, "subchannel", null)
    }
  }
  
  @js.native
  trait Picker extends StObject {
    
    def pick(pickArgs: PickArgs): PickResult = js.native
  }
  object Picker {
    
    @scala.inline
    def apply(pick: PickArgs => PickResult): Picker = {
      val __obj = js.Dynamic.literal(pick = js.Any.fromFunction1(pick))
      __obj.asInstanceOf[Picker]
    }
    
    @scala.inline
    implicit class PickerMutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPick(value: PickArgs => PickResult): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait QueuePickResult extends PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_QueuePickResult: Null = js.native
    
    @JSName("onCallStarted")
    var onCallStarted_QueuePickResult: Null = js.native
    
    @JSName("pickResultType")
    var pickResultType_QueuePickResult: QUEUE = js.native
    
    @JSName("status")
    var status_QueuePickResult: Null = js.native
    
    @JSName("subchannel")
    var subchannel_QueuePickResult: Null = js.native
  }
  object QueuePickResult {
    
    @scala.inline
    def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: QUEUE,
      status: Null,
      subchannel: Null
    ): QueuePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePickResult]
    }
    
    @scala.inline
    implicit class QueuePickResultMutableBuilder[Self <: QueuePickResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickResultType(value: QUEUE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransientFailurePickResult extends PickResult {
    
    @JSName("extraFilterFactory")
    var extraFilterFactory_TransientFailurePickResult: Null = js.native
    
    @JSName("onCallStarted")
    var onCallStarted_TransientFailurePickResult: Null = js.native
    
    @JSName("pickResultType")
    var pickResultType_TransientFailurePickResult: TRANSIENT_FAILURE = js.native
    
    @JSName("status")
    var status_TransientFailurePickResult: StatusObject = js.native
    
    @JSName("subchannel")
    var subchannel_TransientFailurePickResult: Null = js.native
  }
  object TransientFailurePickResult {
    
    @scala.inline
    def apply(
      extraFilterFactory: Null,
      onCallStarted: Null,
      pickResultType: TRANSIENT_FAILURE,
      status: StatusObject,
      subchannel: Null
    ): TransientFailurePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactory = extraFilterFactory.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransientFailurePickResult]
    }
    
    @scala.inline
    implicit class TransientFailurePickResultMutableBuilder[Self <: TransientFailurePickResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraFilterFactory(value: Null): Self = StObject.set(x, "extraFilterFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickResultType(value: TRANSIENT_FAILURE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
}
