package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/LinearProgress/LinearProgress.LinearProgressClassKey>> */
@js.native
trait PartialClassNameMapLinear extends js.Object {
  
  var bar: js.UndefOr[String] = js.native
  
  var bar1Buffer: js.UndefOr[String] = js.native
  
  var bar1Determinate: js.UndefOr[String] = js.native
  
  var bar1Indeterminate: js.UndefOr[String] = js.native
  
  var bar2Buffer: js.UndefOr[String] = js.native
  
  var bar2Indeterminate: js.UndefOr[String] = js.native
  
  var barColorPrimary: js.UndefOr[String] = js.native
  
  var barColorSecondary: js.UndefOr[String] = js.native
  
  var buffer: js.UndefOr[String] = js.native
  
  var colorPrimary: js.UndefOr[String] = js.native
  
  var colorSecondary: js.UndefOr[String] = js.native
  
  var dashed: js.UndefOr[String] = js.native
  
  var dashedColorPrimary: js.UndefOr[String] = js.native
  
  var dashedColorSecondary: js.UndefOr[String] = js.native
  
  var determinate: js.UndefOr[String] = js.native
  
  var indeterminate: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapLinear {
  
  @scala.inline
  def apply(): PartialClassNameMapLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapLinear]
  }
  
  @scala.inline
  implicit class PartialClassNameMapLinearOps[Self <: PartialClassNameMapLinear] (val x: Self) extends AnyVal {
    
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
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setBar1Buffer(value: String): Self = this.set("bar1Buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar1Buffer: Self = this.set("bar1Buffer", js.undefined)
    
    @scala.inline
    def setBar1Determinate(value: String): Self = this.set("bar1Determinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar1Determinate: Self = this.set("bar1Determinate", js.undefined)
    
    @scala.inline
    def setBar1Indeterminate(value: String): Self = this.set("bar1Indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar1Indeterminate: Self = this.set("bar1Indeterminate", js.undefined)
    
    @scala.inline
    def setBar2Buffer(value: String): Self = this.set("bar2Buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar2Buffer: Self = this.set("bar2Buffer", js.undefined)
    
    @scala.inline
    def setBar2Indeterminate(value: String): Self = this.set("bar2Indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar2Indeterminate: Self = this.set("bar2Indeterminate", js.undefined)
    
    @scala.inline
    def setBarColorPrimary(value: String): Self = this.set("barColorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColorPrimary: Self = this.set("barColorPrimary", js.undefined)
    
    @scala.inline
    def setBarColorSecondary(value: String): Self = this.set("barColorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColorSecondary: Self = this.set("barColorSecondary", js.undefined)
    
    @scala.inline
    def setBuffer(value: String): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    
    @scala.inline
    def setDashed(value: String): Self = this.set("dashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashed: Self = this.set("dashed", js.undefined)
    
    @scala.inline
    def setDashedColorPrimary(value: String): Self = this.set("dashedColorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashedColorPrimary: Self = this.set("dashedColorPrimary", js.undefined)
    
    @scala.inline
    def setDashedColorSecondary(value: String): Self = this.set("dashedColorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashedColorSecondary: Self = this.set("dashedColorSecondary", js.undefined)
    
    @scala.inline
    def setDeterminate(value: String): Self = this.set("determinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterminate: Self = this.set("determinate", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: String): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
