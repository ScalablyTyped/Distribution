package typings.grommet.anon

import typings.grommet.boxMod.BoxProps
import typings.grommet.dropMod.DropProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDrop extends StObject {
  
  var content: js.UndefOr[BoxProps] = js.undefined
  
  var drop: js.UndefOr[DropProps] = js.undefined
}
object ContentDrop {
  
  inline def apply(): ContentDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDrop]
  }
  
  extension [Self <: ContentDrop](x: Self) {
    
    inline def setContent(value: BoxProps): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDrop(value: DropProps): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
  }
}
