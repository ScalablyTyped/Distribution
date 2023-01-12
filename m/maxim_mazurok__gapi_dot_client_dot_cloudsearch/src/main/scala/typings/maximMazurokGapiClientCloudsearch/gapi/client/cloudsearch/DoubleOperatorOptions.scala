package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to use the double property in sorting or as a facet. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object DoubleOperatorOptions {
  
  inline def apply(): DoubleOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleOperatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleOperatorOptions] (val x: Self) extends AnyVal {
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
