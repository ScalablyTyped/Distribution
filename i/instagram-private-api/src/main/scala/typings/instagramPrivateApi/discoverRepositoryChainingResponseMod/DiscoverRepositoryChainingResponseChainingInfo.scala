package typings.instagramPrivateApi.discoverRepositoryChainingResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverRepositoryChainingResponseChainingInfo extends js.Object {
  
  var sources: String = js.native
}
object DiscoverRepositoryChainingResponseChainingInfo {
  
  @scala.inline
  def apply(sources: String): DiscoverRepositoryChainingResponseChainingInfo = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseChainingInfo]
  }
  
  @scala.inline
  implicit class DiscoverRepositoryChainingResponseChainingInfoOps[Self <: DiscoverRepositoryChainingResponseChainingInfo] (val x: Self) extends AnyVal {
    
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
    def setSources(value: String): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
}
