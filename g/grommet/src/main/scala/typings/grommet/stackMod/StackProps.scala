package typings.grommet.stackMod

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.first
import typings.grommet.grommetStrings.last
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
  ] = js.native
  
  var fill: js.UndefOr[FillType] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var guidingChild: js.UndefOr[Double | first | last] = js.native
  
  var interactiveChild: js.UndefOr[Double | first | last] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
}
object StackProps {
  
  @scala.inline
  def apply(): StackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackProps]
  }
  
  @scala.inline
  implicit class StackPropsOps[Self <: StackProps] (val x: Self) extends AnyVal {
    
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
    def setAnchor(
      value: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
    ): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setFill(value: FillType): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setGuidingChild(value: Double | first | last): Self = this.set("guidingChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuidingChild: Self = this.set("guidingChild", js.undefined)
    
    @scala.inline
    def setInteractiveChild(value: Double | first | last): Self = this.set("interactiveChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractiveChild: Self = this.set("interactiveChild", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
}
