package typings.instagramPrivateApi.directThreadBroadcastOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectTreadBroadcastBaseOptions extends js.Object {
  
  var form: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var item: String = js.native
  
  var qs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var signed: js.UndefOr[Boolean] = js.native
}
object DirectTreadBroadcastBaseOptions {
  
  @scala.inline
  def apply(item: String): DirectTreadBroadcastBaseOptions = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTreadBroadcastBaseOptions]
  }
  
  @scala.inline
  implicit class DirectTreadBroadcastBaseOptionsOps[Self <: DirectTreadBroadcastBaseOptions] (val x: Self) extends AnyVal {
    
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
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: StringDictionary[js.Any]): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setQs(value: StringDictionary[js.Any]): Self = this.set("qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}
