package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTDataSourceSettingsRestSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
    */
  var contentSerializer: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies the content type of the request
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for create requests
    */
  var create: js.UndefOr[RESTDataSourceSettingsRestSettingsCreate] = js.undefined
  
  /**
    * Specifies whether the ids of the removed resources are send through the request URI
    */
  var encodeRemoveInRequestUri: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Settings for remove requests
    */
  var remove: js.UndefOr[RESTDataSourceSettingsRestSettingsRemove] = js.undefined
  
  /**
    * Settings for update requests
    */
  var update: js.UndefOr[RESTDataSourceSettingsRestSettingsUpdate] = js.undefined
}
object RESTDataSourceSettingsRestSettings {
  
  inline def apply(): RESTDataSourceSettingsRestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettingsRestSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RESTDataSourceSettingsRestSettings] (val x: Self) extends AnyVal {
    
    inline def setContentSerializer(value: js.Function): Self = StObject.set(x, "contentSerializer", value.asInstanceOf[js.Any])
    
    inline def setContentSerializerUndefined: Self = StObject.set(x, "contentSerializer", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreate(value: RESTDataSourceSettingsRestSettingsCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setEncodeRemoveInRequestUri(value: Boolean): Self = StObject.set(x, "encodeRemoveInRequestUri", value.asInstanceOf[js.Any])
    
    inline def setEncodeRemoveInRequestUriUndefined: Self = StObject.set(x, "encodeRemoveInRequestUri", js.undefined)
    
    inline def setRemove(value: RESTDataSourceSettingsRestSettingsRemove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setUpdate(value: RESTDataSourceSettingsRestSettingsUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
