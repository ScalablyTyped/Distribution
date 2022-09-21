package typings.googleapis.gmailpostmastertoolsV1beta1Mod.gmailpostmastertoolsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeedbackLoop extends StObject {
  
  /**
    * Feedback loop identifier that uniquely identifies individual campaigns.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ratio of user marked spam messages with the identifier vs the total number of inboxed messages with that identifier.
    */
  var spamRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFeedbackLoop {
  
  inline def apply(): SchemaFeedbackLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeedbackLoop]
  }
  
  extension [Self <: SchemaFeedbackLoop](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSpamRatio(value: Double): Self = StObject.set(x, "spamRatio", value.asInstanceOf[js.Any])
    
    inline def setSpamRatioNull: Self = StObject.set(x, "spamRatio", null)
    
    inline def setSpamRatioUndefined: Self = StObject.set(x, "spamRatio", js.undefined)
  }
}
