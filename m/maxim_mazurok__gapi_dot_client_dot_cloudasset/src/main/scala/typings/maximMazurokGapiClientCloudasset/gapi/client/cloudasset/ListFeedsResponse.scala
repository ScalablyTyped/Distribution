package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFeedsResponse extends js.Object {
  
  /** A list of feeds. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.native
}
object ListFeedsResponse {
  
  @scala.inline
  def apply(): ListFeedsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeedsResponse]
  }
  
  @scala.inline
  implicit class ListFeedsResponseOps[Self <: ListFeedsResponse] (val x: Self) extends AnyVal {
    
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
    def setFeedsVarargs(value: Feed*): Self = this.set("feeds", js.Array(value :_*))
    
    @scala.inline
    def setFeeds(value: js.Array[Feed]): Self = this.set("feeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeeds: Self = this.set("feeds", js.undefined)
  }
}
