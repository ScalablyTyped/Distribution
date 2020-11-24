package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair mapping a theme color type to the concrete color it represents.
  */
@js.native
trait SchemaThemeColorPair extends js.Object {
  
  /**
    * The concrete color corresponding to the theme color type above.
    */
  var color: js.UndefOr[SchemaRgbColor] = js.native
  
  /**
    * The type of the theme color.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaThemeColorPair {
  
  @scala.inline
  def apply(): SchemaThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThemeColorPair]
  }
  
  @scala.inline
  implicit class SchemaThemeColorPairOps[Self <: SchemaThemeColorPair] (val x: Self) extends AnyVal {
    
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
    def setColor(value: SchemaRgbColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
