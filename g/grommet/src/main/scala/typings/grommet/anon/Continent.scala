package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Continent extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var continent: js.UndefOr[Base] = js.undefined
  
  var hover: js.UndefOr[`3`] = js.undefined
  
  var place: js.UndefOr[Base] = js.undefined
}
object Continent {
  
  @scala.inline
  def apply(): Continent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Continent]
  }
  
  @scala.inline
  implicit class ContinentMutableBuilder[Self <: Continent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContinent(value: Base): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    @scala.inline
    def setHover(value: `3`): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setPlace(value: Base): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
  }
}
