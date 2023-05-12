package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mod.DrawCustomModeThis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disable extends StObject {
  
  // ?? ctx
  def disable(ctx: DrawCustomModeThis): Unit
  
  def enable(ctx: DrawCustomModeThis): Unit
}
object Disable {
  
  inline def apply(disable: DrawCustomModeThis => Unit, enable: DrawCustomModeThis => Unit): Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable))
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: DrawCustomModeThis => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
    
    inline def setEnable(value: DrawCustomModeThis => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
  }
}
