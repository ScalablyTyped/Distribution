package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreprocessorsIpreprocessorMod {
  
  @js.native
  trait IPreprocessor extends StObject {
    
    /**
      * Gets the types of events this preprocessor supports.
      */
    def getSupportedEventTypes(): js.Array[String] = js.native
    
    /**
      * Processes an event, modifying it in-place if needed.
      * @param {any} event The event that should be processed.
      * @param {MatrixClient} client The Matrix client that is providing the event.
      * @param {EventKind|null|undefined} kind Optional kind identifier for an event. When not
      * supplied, the event is assumed to be a RoomEvent.
      * @returns {Promise<any>} Resolved when the event is has been modified. The resolved
      * value is ignored.
      */
    def processEvent(event: Any, client: MatrixClient): js.Promise[Any] = js.native
    def processEvent(event: Any, client: MatrixClient, kind: EventKind): js.Promise[Any] = js.native
  }
}
