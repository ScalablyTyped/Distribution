package typings.ipfsCore.publishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishSettings extends js.Object {
  
  /**
    * - When offline, save the IPNS record
    * to the the local datastore without broadcasting to the network instead of
    * simply failing.
    *
    * This option is not yet implemented in js-ipfs. See tracking issue [ipfs/js-ipfs#1997]
    * (https://github.com/ipfs/js-ipfs/issues/1997).
    */
  var allowOffline: js.UndefOr[Boolean] = js.native
  
  /**
    * - Name of the key to be used.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * - Time duration of the record.
    */
  var lifetime: js.UndefOr[String] = js.native
  
  /**
    * - Resolve given path before publishing.
    */
  var resolve: js.UndefOr[Boolean] = js.native
  
  /**
    * - Time duration this record should be cached.
    */
  var ttl: js.UndefOr[String] = js.native
}
object PublishSettings {
  
  @scala.inline
  def apply(): PublishSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishSettings]
  }
  
  @scala.inline
  implicit class PublishSettingsOps[Self <: PublishSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowOffline(value: Boolean): Self = this.set("allowOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOffline: Self = this.set("allowOffline", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    
    @scala.inline
    def setResolve(value: Boolean): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
