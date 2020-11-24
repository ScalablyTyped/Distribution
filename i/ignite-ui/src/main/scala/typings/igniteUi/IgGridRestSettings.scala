package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
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
  implicit class IgGridRestSettingsOps[Self <: IgGridRestSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentSerializer(value: js.Function): Self = this.set("contentSerializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSerializer: Self = this.set("contentSerializer", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCreate(value: IgGridRestSettingsCreate): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setEncodeRemoveInRequestUri(value: Boolean): Self = this.set("encodeRemoveInRequestUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeRemoveInRequestUri: Self = this.set("encodeRemoveInRequestUri", js.undefined)
    
    @scala.inline
    def setRemove(value: IgGridRestSettingsRemove): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdate(value: IgGridRestSettingsUpdate): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
