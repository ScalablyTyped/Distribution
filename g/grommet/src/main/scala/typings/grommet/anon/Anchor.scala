package typings.grommet.anon

import typings.grommet.diagramMod.DiagramConnectionAnchor
import typings.grommet.diagramMod.DiagramConnectionType
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends StObject {
  
  var anchor: js.UndefOr[DiagramConnectionAnchor] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var fromTarget: String | js.Object = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[xsmall | small | medium | large | String] = js.native
  
  var thickness: js.UndefOr[hair | xxsmall | xsmall | small | medium | large | String] = js.native
  
  var toTarget: String | js.Object = js.native
  
  var `type`: js.UndefOr[DiagramConnectionType] = js.native
}
object Anchor {
  
  @scala.inline
  def apply(fromTarget: String | js.Object, toTarget: String | js.Object): Anchor = {
    val __obj = js.Dynamic.literal(fromTarget = fromTarget.asInstanceOf[js.Any], toTarget = toTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: DiagramConnectionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFromTarget(value: String | js.Object): Self = StObject.set(x, "fromTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOffset(value: xsmall | small | medium | large | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setThickness(value: hair | xxsmall | xsmall | small | medium | large | String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setToTarget(value: String | js.Object): Self = StObject.set(x, "toTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DiagramConnectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
