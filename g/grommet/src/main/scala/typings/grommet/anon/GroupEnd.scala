package typings.grommet.anon

import typings.grommet.boxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupEnd extends StObject {
  
  var body: js.UndefOr[`15`] = js.undefined
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var groupEnd: js.UndefOr[`18`] = js.undefined
  
  var groupHeader: js.UndefOr[Fill] = js.undefined
  
  var header: js.UndefOr[Units] = js.undefined
  
  var icons: js.UndefOr[Ascending] = js.undefined
  
  var pinned: js.UndefOr[Footer] = js.undefined
  
  var primary: js.UndefOr[`21`] = js.undefined
  
  var resize: js.UndefOr[BorderHover] = js.undefined
}
object GroupEnd {
  
  inline def apply(): GroupEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEnd]
  }
  
  extension [Self <: GroupEnd](x: Self) {
    
    inline def setBody(value: `15`): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setGroupEnd(value: `18`): Self = StObject.set(x, "groupEnd", value.asInstanceOf[js.Any])
    
    inline def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
    
    inline def setGroupHeader(value: Fill): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
    
    inline def setHeader(value: Units): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setIcons(value: Ascending): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setPinned(value: Footer): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setPrimary(value: `21`): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setResize(value: BorderHover): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
