package typings.highlightJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in highlight.js.PluginEvent ]:? any} */
@js.native
trait HLJSPlugin extends js.Object {
  
  @JSName("after:highlight")
  var afterColonhighlight: js.UndefOr[js.Any] = js.native
  
  @JSName("after:highlightBlock")
  var afterColonhighlightBlock: js.UndefOr[js.Any] = js.native
  
  @JSName("before:highlight")
  var beforeColonhighlight: js.UndefOr[js.Any] = js.native
  
  @JSName("before:highlightBlock")
  var beforeColonhighlightBlock: js.UndefOr[js.Any] = js.native
}
object HLJSPlugin {
  
  @scala.inline
  def apply(): HLJSPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLJSPlugin]
  }
  
  @scala.inline
  implicit class HLJSPluginOps[Self <: HLJSPlugin] (val x: Self) extends AnyVal {
    
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
    def setAfterColonhighlight(value: js.Any): Self = this.set("after:highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterColonhighlight: Self = this.set("after:highlight", js.undefined)
    
    @scala.inline
    def setAfterColonhighlightBlock(value: js.Any): Self = this.set("after:highlightBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterColonhighlightBlock: Self = this.set("after:highlightBlock", js.undefined)
    
    @scala.inline
    def setBeforeColonhighlight(value: js.Any): Self = this.set("before:highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeColonhighlight: Self = this.set("before:highlight", js.undefined)
    
    @scala.inline
    def setBeforeColonhighlightBlock(value: js.Any): Self = this.set("before:highlightBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeColonhighlightBlock: Self = this.set("before:highlightBlock", js.undefined)
  }
}
