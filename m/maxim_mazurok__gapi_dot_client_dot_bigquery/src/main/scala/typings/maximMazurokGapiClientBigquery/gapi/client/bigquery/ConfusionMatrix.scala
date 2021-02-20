package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfusionMatrix extends StObject {
  
  /** Confidence threshold used when computing the entries of the confusion matrix. */
  var confidenceThreshold: js.UndefOr[Double] = js.native
  
  /** One row per actual label. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
}
object ConfusionMatrix {
  
  @scala.inline
  def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  
  @scala.inline
  implicit class ConfusionMatrixMutableBuilder[Self <: ConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
