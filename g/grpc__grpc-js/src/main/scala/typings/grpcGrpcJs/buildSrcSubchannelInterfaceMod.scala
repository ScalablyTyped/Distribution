package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcSubchannelMod.Subchannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelInterfaceMod {
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/subchannel-interface", "BaseSubchannelWrapper")
  @js.native
  open class BaseSubchannelWrapper protected ()
    extends StObject
       with SubchannelInterface {
    def this(child: SubchannelInterface) = this()
    
    /* CompleteClass */
    override def addConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /* protected */ var child: SubchannelInterface = js.native
    
    /* CompleteClass */
    override def getAddress(): String = js.native
    
    /* CompleteClass */
    override def getChannelzRef(): SubchannelRef = js.native
    
    /* CompleteClass */
    override def getConnectivityState(): ConnectivityState = js.native
    
    /**
      * If this is a wrapper, return the wrapped subchannel, otherwise return this
      */
    /* CompleteClass */
    override def getRealSubchannel(): Subchannel = js.native
    
    /* CompleteClass */
    override def ref(): Unit = js.native
    
    /* CompleteClass */
    override def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /* CompleteClass */
    override def startConnecting(): Unit = js.native
    
    /* CompleteClass */
    override def unref(): Unit = js.native
  }
  
  type ConnectivityStateListener = js.Function3[
    /* subchannel */ SubchannelInterface, 
    /* previousState */ ConnectivityState, 
    /* newState */ ConnectivityState, 
    Unit
  ]
  
  trait SubchannelInterface extends StObject {
    
    def addConnectivityStateListener(listener: ConnectivityStateListener): Unit
    
    def getAddress(): String
    
    def getChannelzRef(): SubchannelRef
    
    def getConnectivityState(): ConnectivityState
    
    /**
      * If this is a wrapper, return the wrapped subchannel, otherwise return this
      */
    def getRealSubchannel(): Subchannel
    
    def ref(): Unit
    
    def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit
    
    def startConnecting(): Unit
    
    def unref(): Unit
  }
  object SubchannelInterface {
    
    inline def apply(
      addConnectivityStateListener: ConnectivityStateListener => Unit,
      getAddress: () => String,
      getChannelzRef: () => SubchannelRef,
      getConnectivityState: () => ConnectivityState,
      getRealSubchannel: () => Subchannel,
      ref: () => Unit,
      removeConnectivityStateListener: ConnectivityStateListener => Unit,
      startConnecting: () => Unit,
      unref: () => Unit
    ): SubchannelInterface = {
      val __obj = js.Dynamic.literal(addConnectivityStateListener = js.Any.fromFunction1(addConnectivityStateListener), getAddress = js.Any.fromFunction0(getAddress), getChannelzRef = js.Any.fromFunction0(getChannelzRef), getConnectivityState = js.Any.fromFunction0(getConnectivityState), getRealSubchannel = js.Any.fromFunction0(getRealSubchannel), ref = js.Any.fromFunction0(ref), removeConnectivityStateListener = js.Any.fromFunction1(removeConnectivityStateListener), startConnecting = js.Any.fromFunction0(startConnecting), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[SubchannelInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubchannelInterface] (val x: Self) extends AnyVal {
      
      inline def setAddConnectivityStateListener(value: ConnectivityStateListener => Unit): Self = StObject.set(x, "addConnectivityStateListener", js.Any.fromFunction1(value))
      
      inline def setGetAddress(value: () => String): Self = StObject.set(x, "getAddress", js.Any.fromFunction0(value))
      
      inline def setGetChannelzRef(value: () => SubchannelRef): Self = StObject.set(x, "getChannelzRef", js.Any.fromFunction0(value))
      
      inline def setGetConnectivityState(value: () => ConnectivityState): Self = StObject.set(x, "getConnectivityState", js.Any.fromFunction0(value))
      
      inline def setGetRealSubchannel(value: () => Subchannel): Self = StObject.set(x, "getRealSubchannel", js.Any.fromFunction0(value))
      
      inline def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setRemoveConnectivityStateListener(value: ConnectivityStateListener => Unit): Self = StObject.set(x, "removeConnectivityStateListener", js.Any.fromFunction1(value))
      
      inline def setStartConnecting(value: () => Unit): Self = StObject.set(x, "startConnecting", js.Any.fromFunction0(value))
      
      inline def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
}
