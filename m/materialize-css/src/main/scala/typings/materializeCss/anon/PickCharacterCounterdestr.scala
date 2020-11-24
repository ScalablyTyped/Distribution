package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.CharacterCounter, 'destroy'> */
@js.native
trait PickCharacterCounterdestr extends js.Object {
  
  var destroy: js.UndefOr[js.Any] = js.native
}
object PickCharacterCounterdestr {
  
  @scala.inline
  def apply(): PickCharacterCounterdestr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCharacterCounterdestr]
  }
  
  @scala.inline
  implicit class PickCharacterCounterdestrOps[Self <: PickCharacterCounterdestr] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
}
