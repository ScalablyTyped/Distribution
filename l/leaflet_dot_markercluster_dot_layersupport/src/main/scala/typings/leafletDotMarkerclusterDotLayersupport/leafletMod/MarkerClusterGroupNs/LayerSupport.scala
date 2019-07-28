package typings.leafletDotMarkerclusterDotLayersupport.leafletMod.MarkerClusterGroupNs

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait LayerSupport extends js.Object {
  def checkIn(layers: js.Array[Layer]): this.type = js.native
  /**
    * Stamps the passed layers as being part of this group, but without adding
    * them to the map right now.
    */
  def checkIn(layers: Layer): this.type = js.native
  def checkOut(layers: js.Array[Layer]): this.type = js.native
  /**
    * Un-stamps the passed layers from being part of this group. It has to
    * remove them from map (if they are) since they will no longer cluster.
    */
  def checkOut(layers: Layer): this.type = js.native
}

