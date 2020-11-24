package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An notification channel used to watch for resource changes.
  */
@js.native
trait SchemaChannel extends js.Object {
  
  /**
    * The address where notifications are delivered for this channel.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Date and time of notification channel expiration, expressed as a Unix
    * timestamp, in milliseconds. Optional.
    */
  var expiration: js.UndefOr[String] = js.native
  
  /**
    * A UUID or similar unique string that identifies this channel.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies this as a notification channel used to watch for changes to a
    * resource. Value: the fixed string &quot;api#channel&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Additional parameters controlling delivery channel behavior. Optional.
    */
  var params: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A Boolean value to indicate whether payload is wanted. Optional.
    */
  var payload: js.UndefOr[Boolean] = js.native
  
  /**
    * An opaque ID that identifies the resource being watched on this channel.
    * Stable across different API versions.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * A version-specific identifier for the watched resource.
    */
  var resourceUri: js.UndefOr[String] = js.native
  
  /**
    * An arbitrary string delivered to the target address with each
    * notification delivered over this channel. Optional.
    */
  var token: js.UndefOr[String] = js.native
  
  /**
    * The type of delivery mechanism used for this channel.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaChannel {
  
  @scala.inline
  def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  @scala.inline
  implicit class SchemaChannelOps[Self <: SchemaChannel] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPayload(value: Boolean): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
