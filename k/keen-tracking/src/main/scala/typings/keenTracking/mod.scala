package typings.keenTracking

import org.scalablytyped.runtime.StringDictionary
import typings.keenTracking.anon.Created
import typings.keenTracking.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keen-tracking", JSImport.Default)
  @js.native
  class default protected () extends KeenTracking {
    def this(options: ProjectId) = this()
  }
  
  @js.native
  trait KeenTracking extends StObject {
    
    def recordEvent(collectionName: String, event: js.Object): js.Promise[Created] = js.native
    
    def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
  }
  object KeenTracking {
    
    @scala.inline
    def apply(
      recordEvent: (String, js.Object) => js.Promise[Created],
      recordEvents: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]
    ): KeenTracking = {
      val __obj = js.Dynamic.literal(recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
      __obj.asInstanceOf[KeenTracking]
    }
    
    @scala.inline
    implicit class KeenTrackingMutableBuilder[Self <: KeenTracking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecordEvent(value: (String, js.Object) => js.Promise[Created]): Self = StObject.set(x, "recordEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRecordEvents(value: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]): Self = StObject.set(x, "recordEvents", js.Any.fromFunction1(value))
    }
  }
}
