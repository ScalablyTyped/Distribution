package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "UnwrappedTileID")
@js.native
open class UnwrappedTileID protected () extends StObject {
  def this(wrap: Double, canonical: CanonicalTileID) = this()
  
  var canonical: CanonicalTileID = js.native
  
  var key: String = js.native
  
  var wrap: Double = js.native
}
