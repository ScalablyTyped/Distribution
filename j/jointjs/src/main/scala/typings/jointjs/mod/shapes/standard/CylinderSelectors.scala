package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGEllipseAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CylinderSelectors extends StObject {
  
  var body: js.UndefOr[CylinderBodyAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
  
  var top: js.UndefOr[SVGEllipseAttributes] = js.native
}
object CylinderSelectors {
  
  @scala.inline
  def apply(): CylinderSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderSelectors]
  }
  
  @scala.inline
  implicit class CylinderSelectorsMutableBuilder[Self <: CylinderSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CylinderBodyAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTop(value: SVGEllipseAttributes): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
