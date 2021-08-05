package typings.grommet.anon

import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Horizontal extends StObject {
  
  var horizontal: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
  
  var vertical: js.UndefOr[auto | hidden | scroll | visible] = js.undefined
}
object Horizontal {
  
  inline def apply(): Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Horizontal]
  }
  
  extension [Self <: Horizontal](x: Self) {
    
    inline def setHorizontal(value: auto | hidden | scroll | visible): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: auto | hidden | scroll | visible): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
