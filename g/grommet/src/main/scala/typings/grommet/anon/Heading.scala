package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  // deprecated
  var heading: js.UndefOr[`3`] = js.undefined
}
object Heading {
  
  inline def apply(): Heading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heading]
  }
  
  extension [Self <: Heading](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeading(value: `3`): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
