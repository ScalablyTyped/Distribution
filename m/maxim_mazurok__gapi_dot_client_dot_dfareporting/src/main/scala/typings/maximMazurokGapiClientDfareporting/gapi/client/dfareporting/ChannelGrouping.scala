package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGrouping extends js.Object {
  
  /** ChannelGrouping fallback name. */
  var fallbackName: js.UndefOr[String] = js.native
  
  /** The kind of resource this is, in this case dfareporting#channelGrouping. */
  var kind: js.UndefOr[String] = js.native
  
  /** ChannelGrouping name. */
  var name: js.UndefOr[String] = js.native
  
  /** The rules contained within this channel grouping. */
  var rules: js.UndefOr[js.Array[ChannelGroupingRule]] = js.native
}
object ChannelGrouping {
  
  @scala.inline
  def apply(): ChannelGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGrouping]
  }
  
  @scala.inline
  implicit class ChannelGroupingOps[Self <: ChannelGrouping] (val x: Self) extends AnyVal {
    
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
    def setFallbackName(value: String): Self = this.set("fallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackName: Self = this.set("fallbackName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ChannelGroupingRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[ChannelGroupingRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
