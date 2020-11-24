package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.mapbox.gridControl")
@js.native
object gridControl extends js.Object {
  
  // GridControl
  //////////////////////////////////////////////////////////////////////
  /**
    * Interaction is what we call interactive parts of maps that are created with
    * the powerful tooltips & regions system in TileMill. Under the hood, it's powered by the open UTFGrid specification.
    */
  def apply(layer: String): GridControl_ = js.native
  def apply(layer: String, options: GridControlOptions): GridControl_ = js.native
}
