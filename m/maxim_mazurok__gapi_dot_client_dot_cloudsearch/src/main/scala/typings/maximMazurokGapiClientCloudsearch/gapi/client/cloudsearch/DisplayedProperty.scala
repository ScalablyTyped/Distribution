package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayedProperty extends StObject {
  
  /**
    * The name of the top-level property as defined in a property definition for the object. If the name is not a defined property in the schema, an error is given when attempting to
    * update the schema.
    */
  var propertyName: js.UndefOr[String] = js.undefined
}
object DisplayedProperty {
  
  inline def apply(): DisplayedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayedProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayedProperty] (val x: Self) extends AnyVal {
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
  }
}
