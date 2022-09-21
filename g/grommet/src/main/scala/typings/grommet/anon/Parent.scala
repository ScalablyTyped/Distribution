package typings.grommet.anon

import typings.grommet.boxMod.BoxProps
import typings.grommet.headingMod.HeadingProps
import typings.grommet.paragraphMod.ParagraphProps
import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var actions: js.UndefOr[BoxProps] = js.undefined
  
  var large: js.UndefOr[Columns] = js.undefined
  
  var medium: js.UndefOr[Columns] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
  
  var parent: js.UndefOr[BoxProps] = js.undefined
  
  var responsive: js.UndefOr[Areas] = js.undefined
  
  var size: js.UndefOr[MediumSmall] = js.undefined
  
  var small: js.UndefOr[Columns] = js.undefined
  
  var subtitle: js.UndefOr[ParagraphProps] = js.undefined
  
  var title: js.UndefOr[HeadingProps] = js.undefined
}
object Parent {
  
  inline def apply(): Parent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setActions(value: BoxProps): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setLarge(value: Columns): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: Columns): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setParent(value: BoxProps): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResponsive(value: Areas): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSize(value: MediumSmall): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSmall(value: Columns): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setSubtitle(value: ParagraphProps): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: HeadingProps): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
