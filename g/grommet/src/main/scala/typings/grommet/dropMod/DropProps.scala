package typings.grommet.dropMod

import typings.grommet.anon.Bottom
import typings.grommet.anon.Horizontal
import typings.grommet.grommetStrings.align
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.KeyboardType
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropProps extends js.Object {
  
  var align: js.UndefOr[Bottom] = js.native
  
  var elevation: js.UndefOr[ElevationType] = js.native
  
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onEsc: js.UndefOr[KeyboardType] = js.native
  
  var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.native
  
  var plain: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var restrictFocus: js.UndefOr[Boolean] = js.native
  
  var stretch: js.UndefOr[Boolean | align] = js.native
  
  var target: js.UndefOr[js.Object] = js.native
  
  var trapFocus: js.UndefOr[Boolean] = js.native
}
object DropProps {
  
  @scala.inline
  def apply(): DropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropProps]
  }
  
  @scala.inline
  implicit class DropPropsOps[Self <: DropProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: Bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setElevation(value: ElevationType): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setOnClickOutside(value: /* repeated */ js.Any => _): Self = this.set("onClickOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickOutside: Self = this.set("onClickOutside", js.undefined)
    
    @scala.inline
    def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onEsc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEsc: Self = this.set("onEsc", js.undefined)
    
    @scala.inline
    def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRestrictFocus(value: Boolean): Self = this.set("restrictFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictFocus: Self = this.set("restrictFocus", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean | align): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
  }
}
