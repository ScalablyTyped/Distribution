package typings.leafletDotFeaturegroupDotSubgroup.leafletMod.FeatureGroupNs

import typings.leaflet.leafletMod.FeatureGroup
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extended FeatureGroup that adds its child layers into a parent
  * group when added to a map (e.g., through L.Control.Layers). Typical
  * usage is to dynamically add and remove groups of markers from marker
  * clusters.
  */
@JSGlobal("leaflet.FeatureGroup.SubGroup")
@js.native
/**
  * Instantiates a SubGroup.
  */
class SubGroup[P] () extends FeatureGroup[P] {
  def this(parentGroup: LayerGroup[_]) = this()
  def this(parentGroup: LayerGroup[_], layers: js.Array[Layer]) = this()
  /**
    * Returns the current parent group.
    */
  def getParentGroup(): LayerGroup[_] = js.native
  /**
    * Changes the parent group into which child markers are added to or
    * removed from.
    */
  def setParentGroup(parentGroup: LayerGroup[_]): this.type = js.native
  /**
    * Removes the current sub-group from map before changing the parent
    * group. Re-adds the sub-group to map if it was before changing.
    */
  def setParentGroupSafe(parentGroup: LayerGroup[_]): this.type = js.native
}

