package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopic extends StObject {
  
  /**
    * Required. The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/x/topics/x`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaTopic {
  
  inline def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  
  extension [Self <: SchemaTopic](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
