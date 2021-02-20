package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridRestSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
    *
    */
  var contentSerializer: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies the content type of the request. See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Settings for create requests
    *
    */
  var create: js.UndefOr[IgGridRestSettingsCreate] = js.native
  
  /**
    * Specifies whether the ids of the removed resources are send through the request URI
    */
  var encodeRemoveInRequestUri: js.UndefOr[Boolean] = js.native
  
  /**
    * Settings for remove requests
    */
  var remove: js.UndefOr[IgGridRestSettingsRemove] = js.native
  
  /**
    * Settings for update requests
    */
  var update: js.UndefOr[IgGridRestSettingsUpdate] = js.native
}
object IgGridRestSettings {
  
  @scala.inline
  def apply(): IgGridRestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRestSettings]
  }
  
  @scala.inline
  implicit class IgGridRestSettingsMutableBuilder[Self <: IgGridRestSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSerializer(value: js.Function): Self = StObject.set(x, "contentSerializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSerializerUndefined: Self = StObject.set(x, "contentSerializer", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCreate(value: IgGridRestSettingsCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setEncodeRemoveInRequestUri(value: Boolean): Self = StObject.set(x, "encodeRemoveInRequestUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeRemoveInRequestUriUndefined: Self = StObject.set(x, "encodeRemoveInRequestUri", js.undefined)
    
    @scala.inline
    def setRemove(value: IgGridRestSettingsRemove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setUpdate(value: IgGridRestSettingsUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
