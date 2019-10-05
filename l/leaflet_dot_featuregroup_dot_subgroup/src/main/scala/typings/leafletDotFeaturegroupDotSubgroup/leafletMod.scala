package typings.leafletDotFeaturegroupDotSubgroup

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerGroup
import typings.leafletDotFeaturegroupDotSubgroup.leafletMod.FeatureGroup.SubGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  object FeatureGroup extends js.Object {
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
      extends typings.leaflet.leafletMod.FeatureGroup[P] {
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
    
  }
  
  @js.native
  object featureGroup extends js.Object {
    /**
      * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
      */
    def subGroup(): SubGroup[_] = js.native
    def subGroup(parentGroup: LayerGroup[_]): SubGroup[_] = js.native
    def subGroup(parentGroup: LayerGroup[_], layers: js.Array[Layer]): SubGroup[_] = js.native
  }
  
}

