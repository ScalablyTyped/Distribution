package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the timestamp property using the greater-than operator. For example, if greaterThanOperatorName is
    * *closedafter* and the property's name is *closeDate*, then queries like *closedafter:<value>* show results only where the value of the property named *closeDate* is later than
    * *<value>*. The operator name can only contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the operator name required in the query in order to isolate the timestamp property using the less-than operator. For example, if lessThanOperatorName is *closedbefore* and
    * the property's name is *closeDate*, then queries like *closedbefore:<value>* show results only where the value of the property named *closeDate* is earlier than *<value>*. The
    * operator name can only contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the operator name required in the query in order to isolate the timestamp property. For example, if operatorName is *closedon* and the property's name is *closeDate*, then
    * queries like *closedon:<value>* show results only where the value of the property named *closeDate* matches *<value>*. By contrast, a search that uses the same *<value>* without an
    * operator returns all items where *<value>* matches the value of any String properties or text within the content field for the item. The operator name can only contain lowercase
    * letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object TimestampOperatorOptions {
  
  inline def apply(): TimestampOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampOperatorOptions]
  }
  
  extension [Self <: TimestampOperatorOptions](x: Self) {
    
    inline def setGreaterThanOperatorName(value: String): Self = StObject.set(x, "greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOperatorNameUndefined: Self = StObject.set(x, "greaterThanOperatorName", js.undefined)
    
    inline def setLessThanOperatorName(value: String): Self = StObject.set(x, "lessThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setLessThanOperatorNameUndefined: Self = StObject.set(x, "lessThanOperatorName", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
