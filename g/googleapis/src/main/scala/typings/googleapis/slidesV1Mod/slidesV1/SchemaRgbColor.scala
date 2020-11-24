package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An RGB color.
  */
@js.native
trait SchemaRgbColor extends js.Object {
  
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double] = js.native
  
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double] = js.native
  
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double] = js.native
}
object SchemaRgbColor {
  
  @scala.inline
  def apply(): SchemaRgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRgbColor]
  }
  
  @scala.inline
  implicit class SchemaRgbColorOps[Self <: SchemaRgbColor] (val x: Self) extends AnyVal {
    
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
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
  }
}
