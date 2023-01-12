package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typings.grpcGrpcJs.buildSrcFilterMod.Filter
import typings.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.COMPLETE
import typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.DROP
import typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.QUEUE
import typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE
import typings.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPickerMod {
  
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
    /* 0 */ val COMPLETE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.COMPLETE & Double = js.native
    
    @js.native
    sealed trait DROP
      extends StObject
         with PickResultType
    /* 3 */ val DROP: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.DROP & Double = js.native
    
    @js.native
    sealed trait QUEUE
      extends StObject
         with PickResultType
    /* 1 */ val QUEUE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.QUEUE & Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE
      extends StObject
         with PickResultType
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE & Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "QueuePicker")
  @js.native
  open class QueuePicker protected () extends StObject {
    def this(loadBalancer: LoadBalancer) = this()
    
    /* private */ var calledExitIdle: Any = js.native
    
    /* private */ var loadBalancer: Any = js.native
    
    def pick(pickArgs: PickArgs): QueuePickResult = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/picker", "UnavailablePicker")
  @js.native
  open class UnavailablePicker ()
    extends StObject
       with Picker {
    def this(status: StatusObject) = this()
    
    /* CompleteClass */
    override def pick(pickArgs: PickArgs): PickResult = js.native
    
    /* private */ var status: Any = js.native
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
    
    inline def apply(extraFilterFactories: js.Array[FilterFactory[Filter]], pickResultType: COMPLETE, status: Null): CompletePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactories = extraFilterFactories.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], onCallStarted = null, subchannel = null)
      __obj.asInstanceOf[CompletePickResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletePickResult] (val x: Self) extends AnyVal {
      
      inline def setPickResultType(value: COMPLETE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropCallPickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactories")
    var extraFilterFactories_DropCallPickResult: js.Array[Any]
    
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
      extraFilterFactories: js.Array[Any],
      onCallStarted: Null,
      pickResultType: DROP,
      status: StatusObject,
      subchannel: Null
    ): DropCallPickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactories = extraFilterFactories.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropCallPickResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropCallPickResult] (val x: Self) extends AnyVal {
      
      inline def setExtraFilterFactories(value: js.Array[Any]): Self = StObject.set(x, "extraFilterFactories", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFactoriesVarargs(value: Any*): Self = StObject.set(x, "extraFilterFactories", js.Array(value*))
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: DROP): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickArgs extends StObject {
    
    var extraPickInfo: StringDictionary[String]
    
    var metadata: Metadata
  }
  object PickArgs {
    
    inline def apply(extraPickInfo: StringDictionary[String], metadata: Metadata): PickArgs = {
      val __obj = js.Dynamic.literal(extraPickInfo = extraPickInfo.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickArgs] (val x: Self) extends AnyVal {
      
      inline def setExtraPickInfo(value: StringDictionary[String]): Self = StObject.set(x, "extraPickInfo", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickResult extends StObject {
    
    /**
      * Extra FilterFactory (can be multiple encapsulated in a FilterStackFactory)
      * provided by the load balancer to be used with the call. For technical
      * reasons filters from this factory will not see sendMetadata events.
      */
    var extraFilterFactories: js.Array[FilterFactory[Filter]]
    
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
    var subchannel: SubchannelInterface | Null
  }
  object PickResult {
    
    inline def apply(extraFilterFactories: js.Array[FilterFactory[Filter]], pickResultType: PickResultType): PickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactories = extraFilterFactories.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], onCallStarted = null, status = null, subchannel = null)
      __obj.asInstanceOf[PickResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickResult] (val x: Self) extends AnyVal {
      
      inline def setExtraFilterFactories(value: js.Array[FilterFactory[Filter]]): Self = StObject.set(x, "extraFilterFactories", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFactoriesVarargs(value: FilterFactory[Filter]*): Self = StObject.set(x, "extraFilterFactories", js.Array(value*))
      
      inline def setOnCallStarted(value: () => Unit): Self = StObject.set(x, "onCallStarted", js.Any.fromFunction0(value))
      
      inline def setOnCallStartedNull: Self = StObject.set(x, "onCallStarted", null)
      
      inline def setPickResultType(value: PickResultType): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setSubchannel(value: SubchannelInterface): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
      
      inline def setPick(value: PickArgs => PickResult): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
    }
  }
  
  trait QueuePickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactories")
    var extraFilterFactories_QueuePickResult: js.Array[Any]
    
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
      extraFilterFactories: js.Array[Any],
      onCallStarted: Null,
      pickResultType: QUEUE,
      status: Null,
      subchannel: Null
    ): QueuePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactories = extraFilterFactories.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePickResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueuePickResult] (val x: Self) extends AnyVal {
      
      inline def setExtraFilterFactories(value: js.Array[Any]): Self = StObject.set(x, "extraFilterFactories", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFactoriesVarargs(value: Any*): Self = StObject.set(x, "extraFilterFactories", js.Array(value*))
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: QUEUE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransientFailurePickResult
    extends StObject
       with PickResult {
    
    @JSName("extraFilterFactories")
    var extraFilterFactories_TransientFailurePickResult: js.Array[Any]
    
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
      extraFilterFactories: js.Array[Any],
      onCallStarted: Null,
      pickResultType: TRANSIENT_FAILURE,
      status: StatusObject,
      subchannel: Null
    ): TransientFailurePickResult = {
      val __obj = js.Dynamic.literal(extraFilterFactories = extraFilterFactories.asInstanceOf[js.Any], onCallStarted = onCallStarted.asInstanceOf[js.Any], pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subchannel = subchannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransientFailurePickResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransientFailurePickResult] (val x: Self) extends AnyVal {
      
      inline def setExtraFilterFactories(value: js.Array[Any]): Self = StObject.set(x, "extraFilterFactories", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFactoriesVarargs(value: Any*): Self = StObject.set(x, "extraFilterFactories", js.Array(value*))
      
      inline def setOnCallStarted(value: Null): Self = StObject.set(x, "onCallStarted", value.asInstanceOf[js.Any])
      
      inline def setPickResultType(value: TRANSIENT_FAILURE): Self = StObject.set(x, "pickResultType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubchannel(value: Null): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
    }
  }
}
