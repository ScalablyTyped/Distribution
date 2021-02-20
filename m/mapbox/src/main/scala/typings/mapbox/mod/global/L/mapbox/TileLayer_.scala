package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayer_
  extends typings.leaflet.mod.TileLayer_ {
  
  /**
    * Returns this layer's TileJSON object which determines its tile source, zoom bounds and other metadata.
    */
  def getTileJSON(): js.Any = js.native
  
  /**
    * Set the image format of tiles in this layer. You can use lower-quality tiles in order to load maps faster
    */
  def setFormat(format: String): TileLayer_ = js.native
}
