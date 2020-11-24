package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Continent extends js.Object {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var continent: js.UndefOr[Base] = js.native
  
  var hover: js.UndefOr[`3`] = js.native
  
  var place: js.UndefOr[Base] = js.native
}
object Continent {
  
  @scala.inline
  def apply(): Continent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Continent]
  }
  
  @scala.inline
  implicit class ContinentOps[Self <: Continent] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContinent(value: Base): Self = this.set("continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinent: Self = this.set("continent", js.undefined)
    
    @scala.inline
    def setHover(value: `3`): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setPlace(value: Base): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
  }
}
