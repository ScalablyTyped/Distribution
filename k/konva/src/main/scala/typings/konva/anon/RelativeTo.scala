package typings.konva.anon

import typings.konva.libContainerMod.Container
import typings.konva.libNodeMod.NodeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeTo extends StObject {
  
  var relativeTo: js.UndefOr[Container[typings.konva.libNodeMod.Node[NodeConfig]]] = js.undefined
  
  var skipShadow: js.UndefOr[Boolean] = js.undefined
  
  var skipStroke: js.UndefOr[Boolean] = js.undefined
  
  var skipTransform: js.UndefOr[Boolean] = js.undefined
}
object RelativeTo {
  
  inline def apply(): RelativeTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeTo] (val x: Self) extends AnyVal {
    
    inline def setRelativeTo(value: Container[typings.konva.libNodeMod.Node[NodeConfig]]): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setSkipShadow(value: Boolean): Self = StObject.set(x, "skipShadow", value.asInstanceOf[js.Any])
    
    inline def setSkipShadowUndefined: Self = StObject.set(x, "skipShadow", js.undefined)
    
    inline def setSkipStroke(value: Boolean): Self = StObject.set(x, "skipStroke", value.asInstanceOf[js.Any])
    
    inline def setSkipStrokeUndefined: Self = StObject.set(x, "skipStroke", js.undefined)
    
    inline def setSkipTransform(value: Boolean): Self = StObject.set(x, "skipTransform", value.asInstanceOf[js.Any])
    
    inline def setSkipTransformUndefined: Self = StObject.set(x, "skipTransform", js.undefined)
  }
}
