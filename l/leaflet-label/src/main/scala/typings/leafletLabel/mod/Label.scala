package typings.leafletLabel.mod

import org.scalablytyped.runtime.TopLevel
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IEventPowered<Label> * / any */ @js.native
trait Label extends js.Object {
  
  def close(): Unit = js.native
  
  def onAdd(map: Map_): Unit = js.native
  
  def onRemove(map: Map_): Unit = js.native
  
  def setContent(content: String): Label = js.native
  
  def setLatLng(latlng: LatLng_): Label = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def updateZIndex(zIndex: Double): Unit = js.native
}
@JSImport("leaflet", "Label")
@js.native
object Label extends TopLevel[LabelStatic]
