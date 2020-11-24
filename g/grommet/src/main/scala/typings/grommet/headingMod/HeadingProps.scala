package typings.grommet.headingMod

import typings.grommet.grommetStrings.`1`
import typings.grommet.grommetStrings.`2`
import typings.grommet.grommetStrings.`3`
import typings.grommet.grommetStrings.`4`
import typings.grommet.grommetStrings.`5`
import typings.grommet.grommetStrings.`6`
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PolymorphicType
import typings.grommet.utilsMod.TextAlignType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadingProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var as: js.UndefOr[PolymorphicType] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var level: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | typings.grommet.grommetNumbers.`1` | typings.grommet.grommetNumbers.`2` | typings.grommet.grommetNumbers.`3` | typings.grommet.grommetNumbers.`4` | typings.grommet.grommetNumbers.`5` | typings.grommet.grommetNumbers.`6`
  ] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  
  var textAlign: js.UndefOr[TextAlignType] = js.native
  
  var truncate: js.UndefOr[Boolean] = js.native
}
object HeadingProps {
  
  @scala.inline
  def apply(): HeadingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingProps]
  }
  
  @scala.inline
  implicit class HeadingPropsOps[Self <: HeadingProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: PolymorphicType): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setLevel(
      value: `1` | `2` | `3` | `4` | `5` | `6` | typings.grommet.grommetNumbers.`1` | typings.grommet.grommetNumbers.`2` | typings.grommet.grommetNumbers.`3` | typings.grommet.grommetNumbers.`4` | typings.grommet.grommetNumbers.`5` | typings.grommet.grommetNumbers.`6`
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlignType): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
}
