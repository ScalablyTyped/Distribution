package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.exponential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base
  extends StObject
     with typings.maplibreGl.mod.InterpolationType
     with typings.maplibreGl.distStyleSpecMod.InterpolationType {
  
  var base: Double
  
  var name: exponential
}
object Base {
  
  inline def apply(base: Double): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = "exponential")
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setName(value: exponential): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
