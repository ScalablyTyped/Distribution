package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in highlight.js.PluginEvent ]:? any} */
trait HLJSPlugin extends StObject {
  
  @JSName("after:highlight")
  var afterColonhighlight: js.UndefOr[js.Any] = js.undefined
  
  @JSName("after:highlightBlock")
  var afterColonhighlightBlock: js.UndefOr[js.Any] = js.undefined
  
  @JSName("before:highlight")
  var beforeColonhighlight: js.UndefOr[js.Any] = js.undefined
  
  @JSName("before:highlightBlock")
  var beforeColonhighlightBlock: js.UndefOr[js.Any] = js.undefined
}
object HLJSPlugin {
  
  inline def apply(): HLJSPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLJSPlugin]
  }
  
  extension [Self <: HLJSPlugin](x: Self) {
    
    inline def setAfterColonhighlight(value: js.Any): Self = StObject.set(x, "after:highlight", value.asInstanceOf[js.Any])
    
    inline def setAfterColonhighlightBlock(value: js.Any): Self = StObject.set(x, "after:highlightBlock", value.asInstanceOf[js.Any])
    
    inline def setAfterColonhighlightBlockUndefined: Self = StObject.set(x, "after:highlightBlock", js.undefined)
    
    inline def setAfterColonhighlightUndefined: Self = StObject.set(x, "after:highlight", js.undefined)
    
    inline def setBeforeColonhighlight(value: js.Any): Self = StObject.set(x, "before:highlight", value.asInstanceOf[js.Any])
    
    inline def setBeforeColonhighlightBlock(value: js.Any): Self = StObject.set(x, "before:highlightBlock", value.asInstanceOf[js.Any])
    
    inline def setBeforeColonhighlightBlockUndefined: Self = StObject.set(x, "before:highlightBlock", js.undefined)
    
    inline def setBeforeColonhighlightUndefined: Self = StObject.set(x, "before:highlight", js.undefined)
  }
}
