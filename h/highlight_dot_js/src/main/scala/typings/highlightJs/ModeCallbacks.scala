package typings.highlightJs

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* modes */
@js.native
trait ModeCallbacks extends StObject {
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.native
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.native
}
object ModeCallbacks {
  
  @scala.inline
  def apply(): ModeCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeCallbacks]
  }
  
  @scala.inline
  implicit class ModeCallbacksMutableBuilder[Self <: ModeCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
  }
}
