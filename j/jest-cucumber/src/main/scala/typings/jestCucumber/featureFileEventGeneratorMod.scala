package typings.jestCucumber

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/report-event-generation/FeatureFileEventGenerator", JSImport.Namespace)
@js.native
object featureFileEventGeneratorMod extends js.Object {
  
  @js.native
  class FeatureFileEventGenerator protected () extends js.Object {
    def this(eventBroadcaster: EventEmitter) = this()
    
    var eventBroadcaster: js.Any = js.native
    
    def generateEventsFromFeatureFile(featureFilePath: String): js.Promise[Unit] = js.native
    
    var processedFeatureFiles: js.Any = js.native
  }
}
