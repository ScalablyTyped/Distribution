package typings.leafletDotFeaturegroupDotSubgroup.leafletMod

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerGroup
import typings.leafletDotFeaturegroupDotSubgroup.leafletMod.FeatureGroupNs.SubGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.featureGroup")
@js.native
object featureGroupNs extends js.Object {
  /**
    * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
    */
  def subGroup(): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup[_]): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup[_], layers: js.Array[Layer]): SubGroup[_] = js.native
}

