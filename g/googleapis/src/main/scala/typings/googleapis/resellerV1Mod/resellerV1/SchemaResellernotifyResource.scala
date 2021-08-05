package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for resellernotify response.
  */
trait SchemaResellernotifyResource extends StObject {
  
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.undefined
}
object SchemaResellernotifyResource {
  
  inline def apply(): SchemaResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyResource]
  }
  
  extension [Self <: SchemaResellernotifyResource](x: Self) {
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
