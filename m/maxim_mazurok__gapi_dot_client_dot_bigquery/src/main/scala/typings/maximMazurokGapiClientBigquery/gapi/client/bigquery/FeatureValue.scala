package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureValue extends StObject {
  
  /** The categorical feature value. */
  var categoricalValue: js.UndefOr[CategoricalValue] = js.undefined
  
  /** The feature column name. */
  var featureColumn: js.UndefOr[String] = js.undefined
  
  /** The numerical feature value. This is the centroid value for this feature. */
  var numericalValue: js.UndefOr[Double] = js.undefined
}
object FeatureValue {
  
  inline def apply(): FeatureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureValue] (val x: Self) extends AnyVal {
    
    inline def setCategoricalValue(value: CategoricalValue): Self = StObject.set(x, "categoricalValue", value.asInstanceOf[js.Any])
    
    inline def setCategoricalValueUndefined: Self = StObject.set(x, "categoricalValue", js.undefined)
    
    inline def setFeatureColumn(value: String): Self = StObject.set(x, "featureColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureColumnUndefined: Self = StObject.set(x, "featureColumn", js.undefined)
    
    inline def setNumericalValue(value: Double): Self = StObject.set(x, "numericalValue", value.asInstanceOf[js.Any])
    
    inline def setNumericalValueUndefined: Self = StObject.set(x, "numericalValue", js.undefined)
  }
}
