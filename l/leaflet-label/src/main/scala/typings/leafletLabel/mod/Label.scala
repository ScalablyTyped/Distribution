package typings.leafletLabel.mod

import org.scalablytyped.runtime.TopLevel
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IEventPowered<Label> * / any */ trait Label extends js.Object {
  def close(): Unit
  def onAdd(map: Map_): Unit
  def onRemove(map: Map_): Unit
  def setContent(content: String): Label
  def setLatLng(latlng: LatLng_): Label
  def setOpacity(opacity: Double): Unit
  def updateZIndex(zIndex: Double): Unit
}

@JSImport("leaflet", "Label")
@js.native
object Label extends TopLevel[LabelStatic]

