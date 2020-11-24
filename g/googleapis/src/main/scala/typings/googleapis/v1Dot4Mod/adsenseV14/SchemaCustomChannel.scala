package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.AdsAppearOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCustomChannel extends js.Object {
  
  /**
    * Code of this custom channel, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of this custom channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsense#customChannel.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this custom channel.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The targeting information of this custom channel, if activated.
    */
  var targetingInfo: js.UndefOr[AdsAppearOn] = js.native
}
object SchemaCustomChannel {
  
  @scala.inline
  def apply(): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomChannel]
  }
  
  @scala.inline
  implicit class SchemaCustomChannelOps[Self <: SchemaCustomChannel] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetingInfo(value: AdsAppearOn): Self = this.set("targetingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingInfo: Self = this.set("targetingInfo", js.undefined)
  }
}
