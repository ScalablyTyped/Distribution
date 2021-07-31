package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  var circle: js.UndefOr[String] = js.undefined
}
object Circle {
  
  @scala.inline
  def apply(): Circle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
  }
}
