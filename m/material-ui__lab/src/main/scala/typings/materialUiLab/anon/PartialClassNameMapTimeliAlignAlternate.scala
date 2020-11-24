package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TimelineItem/TimelineItem.TimelineItemClassKey>> */
@js.native
trait PartialClassNameMapTimeliAlignAlternate extends js.Object {
  
  var alignAlternate: js.UndefOr[String] = js.native
  
  var alignLeft: js.UndefOr[String] = js.native
  
  var alignRight: js.UndefOr[String] = js.native
  
  var missingOppositeContent: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapTimeliAlignAlternate {
  
  @scala.inline
  def apply(): PartialClassNameMapTimeliAlignAlternate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTimeliAlignAlternate]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTimeliAlignAlternateOps[Self <: PartialClassNameMapTimeliAlignAlternate] (val x: Self) extends AnyVal {
    
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
    def setAlignAlternate(value: String): Self = this.set("alignAlternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignAlternate: Self = this.set("alignAlternate", js.undefined)
    
    @scala.inline
    def setAlignLeft(value: String): Self = this.set("alignLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignLeft: Self = this.set("alignLeft", js.undefined)
    
    @scala.inline
    def setAlignRight(value: String): Self = this.set("alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignRight: Self = this.set("alignRight", js.undefined)
    
    @scala.inline
    def setMissingOppositeContent(value: String): Self = this.set("missingOppositeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingOppositeContent: Self = this.set("missingOppositeContent", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
