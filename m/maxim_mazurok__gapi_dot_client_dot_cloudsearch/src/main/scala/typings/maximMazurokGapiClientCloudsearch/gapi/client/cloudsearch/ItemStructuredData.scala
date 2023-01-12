package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStructuredData extends StObject {
  
  /** Hashing value provided by the API caller. This can be used with the items.push method to calculate modified state. The maximum length is 2048 characters. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** The structured data object that should conform to a registered object definition in the schema for the data source. */
  var `object`: js.UndefOr[StructuredDataObject] = js.undefined
}
object ItemStructuredData {
  
  inline def apply(): ItemStructuredData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStructuredData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemStructuredData] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setObject(value: StructuredDataObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
