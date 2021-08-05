package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfusionMatrix extends StObject {
  
  /** Confidence threshold used when computing the entries of the confusion matrix. */
  var confidenceThreshold: js.UndefOr[Double] = js.undefined
  
  /** One row per actual label. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}
object ConfusionMatrix {
  
  inline def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  
  extension [Self <: ConfusionMatrix](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
