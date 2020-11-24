package typings.konva.anon

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Antialiased extends js.Object {
  
  var antialiased: js.UndefOr[Boolean] = js.native
  
  var shape: js.UndefOr[Shape[ShapeConfig]] = js.native
}
object Antialiased {
  
  @scala.inline
  def apply(): Antialiased = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Antialiased]
  }
  
  @scala.inline
  implicit class AntialiasedOps[Self <: Antialiased] (val x: Self) extends AnyVal {
    
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
    def setAntialiased(value: Boolean): Self = this.set("antialiased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialiased: Self = this.set("antialiased", js.undefined)
    
    @scala.inline
    def setShape(value: Shape[ShapeConfig]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
