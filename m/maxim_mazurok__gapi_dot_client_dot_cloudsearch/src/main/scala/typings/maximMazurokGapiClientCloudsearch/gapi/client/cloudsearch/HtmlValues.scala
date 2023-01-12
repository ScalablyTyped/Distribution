package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlValues extends StObject {
  
  /** The maximum allowable length for html values is 2048 characters. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object HtmlValues {
  
  inline def apply(): HtmlValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlValues] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
