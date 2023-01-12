package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextAttribute extends StObject {
  
  /**
    * The name of the attribute. It should not be empty. The maximum length is 32 characters. The name must start with a letter and can only contain letters (A-Z, a-z) or numbers (0-9).
    * The name will be normalized (lower-cased) before being matched.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Text values of the attribute. The maximum number of elements is 10. The maximum length of an element in the array is 32 characters. The value will be normalized (lower-cased) before
    * being matched.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ContextAttribute {
  
  inline def apply(): ContextAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextAttribute] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
