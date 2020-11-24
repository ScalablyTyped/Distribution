package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialStyleRulesGridList extends js.Object {
  
  var imgFullHeight: js.UndefOr[CSSProperties] = js.native
  
  var imgFullWidth: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var tile: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesGridList {
  
  @scala.inline
  def apply(): PartialStyleRulesGridList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesGridList]
  }
  
  @scala.inline
  implicit class PartialStyleRulesGridListOps[Self <: PartialStyleRulesGridList] (val x: Self) extends AnyVal {
    
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
    def setImgFullHeight(value: CSSProperties): Self = this.set("imgFullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgFullHeight: Self = this.set("imgFullHeight", js.undefined)
    
    @scala.inline
    def setImgFullWidth(value: CSSProperties): Self = this.set("imgFullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgFullWidth: Self = this.set("imgFullWidth", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setTile(value: CSSProperties): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
}
