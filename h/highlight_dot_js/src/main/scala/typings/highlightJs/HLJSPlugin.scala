package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in highlight.js.PluginEvent ]:? any} */
@js.native
trait HLJSPlugin extends StObject {
  
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
  implicit class HLJSPluginMutableBuilder[Self <: HLJSPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterColonhighlight(value: js.Any): Self = StObject.set(x, "after:highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColonhighlightBlock(value: js.Any): Self = StObject.set(x, "after:highlightBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColonhighlightBlockUndefined: Self = StObject.set(x, "after:highlightBlock", js.undefined)
    
    @scala.inline
    def setAfterColonhighlightUndefined: Self = StObject.set(x, "after:highlight", js.undefined)
    
    @scala.inline
    def setBeforeColonhighlight(value: js.Any): Self = StObject.set(x, "before:highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeColonhighlightBlock(value: js.Any): Self = StObject.set(x, "before:highlightBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeColonhighlightBlockUndefined: Self = StObject.set(x, "before:highlightBlock", js.undefined)
    
    @scala.inline
    def setBeforeColonhighlightUndefined: Self = StObject.set(x, "before:highlight", js.undefined)
  }
}
