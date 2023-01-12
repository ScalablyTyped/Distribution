package typings.grommet.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  var circle: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
}
object Circle {
  
  inline def apply(): Circle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
  }
}
