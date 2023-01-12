package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  /** Number of items being predicted as this label. */
  var itemCount: js.UndefOr[String] = js.undefined
  
  /** The predicted label. For confidence_threshold > 0, we will also add an entry indicating the number of items under the confidence threshold. */
  var predictedLabel: js.UndefOr[String] = js.undefined
}
object Entry {
  
  inline def apply(): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setPredictedLabel(value: String): Self = StObject.set(x, "predictedLabel", value.asInstanceOf[js.Any])
    
    inline def setPredictedLabelUndefined: Self = StObject.set(x, "predictedLabel", js.undefined)
  }
}
