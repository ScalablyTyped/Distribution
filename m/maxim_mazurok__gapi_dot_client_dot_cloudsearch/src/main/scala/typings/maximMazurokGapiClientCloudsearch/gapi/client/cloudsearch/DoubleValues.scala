package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleValues extends StObject {
  
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object DoubleValues {
  
  @scala.inline
  def apply(): DoubleValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleValues]
  }
  
  @scala.inline
  implicit class DoubleValuesMutableBuilder[Self <: DoubleValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
