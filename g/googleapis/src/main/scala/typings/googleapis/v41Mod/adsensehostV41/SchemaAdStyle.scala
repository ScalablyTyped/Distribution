package typings.googleapis.v41Mod.adsensehostV41

import typings.googleapis.anon.Background
import typings.googleapis.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdStyle extends js.Object {
  
  /**
    * The colors included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[Background] = js.native
  
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Size] = js.native
  
  /**
    * Kind this is, in this case adsensehost#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAdStyle {
  
  @scala.inline
  def apply(): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdStyle]
  }
  
  @scala.inline
  implicit class SchemaAdStyleOps[Self <: SchemaAdStyle] (val x: Self) extends AnyVal {
    
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
    def setColors(value: Background): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCorners(value: String): Self = this.set("corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    
    @scala.inline
    def setFont(value: Size): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
