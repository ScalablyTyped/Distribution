package typings.keypressJs.mod

import typings.std.Element
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combo extends js.Object {
  
  var is_counting: js.UndefOr[Boolean] = js.native
  
  var is_exclusive: js.UndefOr[Boolean] = js.native
  
  var is_sequence: js.UndefOr[Boolean] = js.native
  
  var is_solitary: js.UndefOr[Boolean] = js.native
  
  var is_unordered: js.UndefOr[Boolean] = js.native
  
  var keys: js.UndefOr[String] = js.native
  
  var on_keydown: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ] = js.native
  
  var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.native
  
  var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.native
  
  var prevent_default: js.UndefOr[Boolean] = js.native
  
  var prevent_repeat: js.UndefOr[Boolean] = js.native
  
  var `this`: js.UndefOr[Element] = js.native
}
object Combo {
  
  @scala.inline
  def apply(): Combo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Combo]
  }
  
  @scala.inline
  implicit class ComboOps[Self <: Combo] (val x: Self) extends AnyVal {
    
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
    def setIs_counting(value: Boolean): Self = this.set("is_counting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_counting: Self = this.set("is_counting", js.undefined)
    
    @scala.inline
    def setIs_exclusive(value: Boolean): Self = this.set("is_exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_exclusive: Self = this.set("is_exclusive", js.undefined)
    
    @scala.inline
    def setIs_sequence(value: Boolean): Self = this.set("is_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_sequence: Self = this.set("is_sequence", js.undefined)
    
    @scala.inline
    def setIs_solitary(value: Boolean): Self = this.set("is_solitary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_solitary: Self = this.set("is_solitary", js.undefined)
    
    @scala.inline
    def setIs_unordered(value: Boolean): Self = this.set("is_unordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_unordered: Self = this.set("is_unordered", js.undefined)
    
    @scala.inline
    def setKeys(value: String): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setOn_keydown(value: (/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double]) => _): Self = this.set("on_keydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOn_keydown: Self = this.set("on_keydown", js.undefined)
    
    @scala.inline
    def setOn_keyup(value: /* event */ js.UndefOr[KeyboardEvent] => _): Self = this.set("on_keyup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOn_keyup: Self = this.set("on_keyup", js.undefined)
    
    @scala.inline
    def setOn_release(value: /* event */ js.UndefOr[KeyboardEvent] => _): Self = this.set("on_release", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOn_release: Self = this.set("on_release", js.undefined)
    
    @scala.inline
    def setPrevent_default(value: Boolean): Self = this.set("prevent_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevent_default: Self = this.set("prevent_default", js.undefined)
    
    @scala.inline
    def setPrevent_repeat(value: Boolean): Self = this.set("prevent_repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevent_repeat: Self = this.set("prevent_repeat", js.undefined)
    
    @scala.inline
    def setThis(value: Element): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThis: Self = this.set("this", js.undefined)
  }
}
