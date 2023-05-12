package typings.libp2p

import typings.libp2p.distSrcComponentsMod.Components
import typings.libp2p.mod.Libp2pInit
import typings.libp2p.mod.Libp2pOptions
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfaceLibp2p.mod.ServiceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibp2pMod {
  
  @JSImport("libp2p/dist/src/libp2p", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/libp2p", "Libp2pNode")
  @js.native
  open class Libp2pNode[T /* <: ServiceMap */] protected () extends Libp2p[T] {
    def this(init: Libp2pInit[T]) = this()
    
    var components: Components = js.native
    
    /* private */ var configureComponent: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  inline def createLibp2pNode[T /* <: ServiceMap */](options: Libp2pOptions[T]): js.Promise[Libp2pNode[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLibp2pNode")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Libp2pNode[T]]]
}
