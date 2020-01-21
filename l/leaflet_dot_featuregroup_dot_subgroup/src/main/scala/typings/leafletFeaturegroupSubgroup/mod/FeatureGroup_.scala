package typings.leafletFeaturegroupSubgroup.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "FeatureGroup")
@js.native
object FeatureGroup_ extends js.Object {
  /**
    * An extended FeatureGroup that adds its child layers into a parent
    * group when added to a map (e.g., through L.Control.Layers). Typical
    * usage is to dynamically add and remove groups of markers from marker
    * clusters.
    */
  @js.native
  /**
    * Instantiates a SubGroup.
    */
  class SubGroup[P] ()
    extends typings.leaflet.mod.FeatureGroup_[P] {
    def this(parentGroup: LayerGroup_[_]) = this()
    def this(parentGroup: LayerGroup_[_], layers: js.Array[Layer]) = this()
    /**
      * Returns the current parent group.
      */
    def getParentGroup(): LayerGroup_[_] = js.native
    /**
      * Changes the parent group into which child markers are added to or
      * removed from.
      */
    def setParentGroup(parentGroup: LayerGroup_[_]): this.type = js.native
    /**
      * Removes the current sub-group from map before changing the parent
      * group. Re-adds the sub-group to map if it was before changing.
      */
    def setParentGroupSafe(parentGroup: LayerGroup_[_]): this.type = js.native
  }
  
}

