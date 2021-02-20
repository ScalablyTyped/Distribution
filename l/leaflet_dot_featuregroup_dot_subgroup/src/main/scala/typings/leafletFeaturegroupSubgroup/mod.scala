package typings.leafletFeaturegroupSubgroup

import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leafletFeaturegroupSubgroup.mod.FeatureGroup_.SubGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object FeatureGroup_ {
    
    /**
      * An extended FeatureGroup that adds its child layers into a parent
      * group when added to a map (e.g., through L.Control.Layers). Typical
      * usage is to dynamically add and remove groups of markers from marker
      * clusters.
      */
    @JSImport("leaflet", "FeatureGroup.SubGroup")
    @js.native
    /**
      * Instantiates a SubGroup.
      */
    class SubGroup[P] ()
      extends typings.leaflet.mod.FeatureGroup_[P] {
      def this(parentGroup: LayerGroup_[_]) = this()
      def this(parentGroup: js.UndefOr[scala.Nothing], layers: js.Array[Layer]) = this()
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
  
  object featureGroup {
    
    /**
      * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
      */
    @JSImport("leaflet", "featureGroup.subGroup")
    @js.native
    def subGroup(): SubGroup[_] = js.native
    @JSImport("leaflet", "featureGroup.subGroup")
    @js.native
    def subGroup(parentGroup: js.UndefOr[scala.Nothing], layers: js.Array[Layer]): SubGroup[_] = js.native
    @JSImport("leaflet", "featureGroup.subGroup")
    @js.native
    def subGroup(parentGroup: LayerGroup_[_]): SubGroup[_] = js.native
    @JSImport("leaflet", "featureGroup.subGroup")
    @js.native
    def subGroup(parentGroup: LayerGroup_[_], layers: js.Array[Layer]): SubGroup[_] = js.native
  }
}
