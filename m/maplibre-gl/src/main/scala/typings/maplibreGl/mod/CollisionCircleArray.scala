package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CollisionCircleArray")
@js.native
open class CollisionCircleArray () extends StObject {
  
  var circles: js.Array[Double] = js.native
  
  var invProjMatrix: mat4 = js.native
  
  var viewportMatrix: mat4 = js.native
}
