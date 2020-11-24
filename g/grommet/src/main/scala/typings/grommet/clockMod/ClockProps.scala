package typings.grommet.clockMod

import typings.grommet.grommetStrings.`12`
import typings.grommet.grommetStrings.`24`
import typings.grommet.grommetStrings.analog
import typings.grommet.grommetStrings.backward
import typings.grommet.grommetStrings.digital
import typings.grommet.grommetStrings.forward
import typings.grommet.grommetStrings.hours
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.minutes
import typings.grommet.grommetStrings.seconds
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var hourLimit: js.UndefOr[`12` | `24`] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* time */ String, Unit]] = js.native
  
  var precision: js.UndefOr[hours | minutes | seconds] = js.native
  
  var run: js.UndefOr[Boolean | backward | forward] = js.native
  
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  
  var time: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[analog | digital] = js.native
}
object ClockProps {
  
  @scala.inline
  def apply(): ClockProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockProps]
  }
  
  @scala.inline
  implicit class ClockPropsOps[Self <: ClockProps] (val x: Self) extends AnyVal {
    
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setHourLimit(value: `12` | `24`): Self = this.set("hourLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourLimit: Self = this.set("hourLimit", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* time */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPrecision(value: hours | minutes | seconds): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRun(value: Boolean | backward | forward): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setType(value: analog | digital): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
