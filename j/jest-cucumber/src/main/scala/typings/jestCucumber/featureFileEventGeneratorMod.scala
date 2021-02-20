package typings.jestCucumber

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFileEventGeneratorMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/report-event-generation/FeatureFileEventGenerator", "FeatureFileEventGenerator")
  @js.native
  class FeatureFileEventGenerator protected () extends StObject {
    def this(eventBroadcaster: EventEmitter) = this()
    
    var eventBroadcaster: js.Any = js.native
    
    def generateEventsFromFeatureFile(featureFilePath: String): js.Promise[Unit] = js.native
    
    var processedFeatureFiles: js.Any = js.native
  }
}
