package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredDataObject extends StObject {
  
  /** The properties for the object. The maximum number of elements is 1000. */
  var properties: js.UndefOr[js.Array[NamedProperty]] = js.undefined
}
object StructuredDataObject {
  
  inline def apply(): StructuredDataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredDataObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructuredDataObject] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[NamedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: NamedProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
