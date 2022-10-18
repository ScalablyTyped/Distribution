package typings.libp2p

import typings.libp2pComponents.mod.Components
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRecordUpdaterMod {
  
  @JSImport("libp2p/dist/src/peer-record-updater", "PeerRecordUpdater")
  @js.native
  open class PeerRecordUpdater protected ()
    extends StObject
       with Startable {
    def this(components: Components) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /**
      * Create (or update if existing) self peer record and store it in the AddressBook.
      */
    def update(): Unit = js.native
  }
}
