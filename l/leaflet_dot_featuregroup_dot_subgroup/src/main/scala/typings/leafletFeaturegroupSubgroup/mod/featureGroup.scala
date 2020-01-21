package typings.leafletFeaturegroupSubgroup.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leafletFeaturegroupSubgroup.mod.FeatureGroup_.SubGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "featureGroup")
@js.native
object featureGroup extends js.Object {
  /**
    * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
    */
  def subGroup(): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup_[_]): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup_[_], layers: js.Array[Layer]): SubGroup[_] = js.native
}

