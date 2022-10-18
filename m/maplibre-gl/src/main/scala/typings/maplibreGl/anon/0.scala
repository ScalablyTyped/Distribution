package typings.maplibreGl.anon

import typings.maplibreGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def cameraAnimation(map: Map): Unit
}
object `0` {
  
  inline def apply(cameraAnimation: Map => Unit): `0` = {
    val __obj = js.Dynamic.literal(cameraAnimation = js.Any.fromFunction1(cameraAnimation))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCameraAnimation(value: Map => Unit): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1(value))
  }
}
