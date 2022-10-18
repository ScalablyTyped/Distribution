package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.utilsMod.AlignContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignSelf extends StObject {
  
  var alignSelf: js.UndefOr[AlignContentType] = js.undefined
  
  var large: js.UndefOr[BoxProps] = js.undefined
  
  var medium: js.UndefOr[BoxProps] = js.undefined
  
  var small: js.UndefOr[BoxProps] = js.undefined
  
  var width: js.UndefOr[String | Min] = js.undefined
}
object AlignSelf {
  
  inline def apply(): AlignSelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelf]
  }
  
  extension [Self <: AlignSelf](x: Self) {
    
    inline def setAlignSelf(value: AlignContentType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setLarge(value: BoxProps): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: BoxProps): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: BoxProps): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setWidth(value: String | Min): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
