package typings.leafletDashLabel.leafletMod

import org.scalablytyped.runtime.TopLevel
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IEventPowered<Label> * / any */ trait Label extends js.Object {
  def close(): Unit
  def onAdd(map: Map): Unit
  def onRemove(map: Map): Unit
  def setContent(content: String): Label
  def setLatLng(latlng: LatLng): Label
  def setOpacity(opacity: Double): Unit
  def updateZIndex(zIndex: Double): Unit
}

@JSImport("leaflet", "Label")
@js.native
object Label extends TopLevel[LabelStatic]

