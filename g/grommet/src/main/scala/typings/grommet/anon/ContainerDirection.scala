package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.grommetStrings.column
import typings.grommet.grommetStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDirection extends StObject {
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var direction: js.UndefOr[column | row] = js.undefined
}
object ContainerDirection {
  
  inline def apply(): ContainerDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDirection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerDirection] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDirection(value: column | row): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
