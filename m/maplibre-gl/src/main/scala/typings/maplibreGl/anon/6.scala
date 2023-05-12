package typings.maplibreGl.anon

import typings.maplibreGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def cameraAnimation(map: Map): Unit
}
object `6` {
  
  inline def apply(cameraAnimation: Map => Unit): `6` = {
    val __obj = js.Dynamic.literal(cameraAnimation = js.Any.fromFunction1(cameraAnimation))
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setCameraAnimation(value: Map => Unit): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1(value))
  }
}
