package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubDestination extends StObject {
  
  /**
    * The name of the Pub/Sub topic to publish job completion notification to. For example: `projects/{project\}/topics/{topic\}`.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubsubDestination {
  
  inline def apply(): SchemaPubsubDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubDestination]
  }
  
  extension [Self <: SchemaPubsubDestination](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
