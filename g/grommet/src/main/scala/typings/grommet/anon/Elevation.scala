package typings.grommet.anon

import typings.grommet.utilsMod.ElevationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elevation extends StObject {
  
  var elevation: js.UndefOr[ElevationType] = js.undefined
}
object Elevation {
  
  inline def apply(): Elevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Elevation] (val x: Self) extends AnyVal {
    
    inline def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
  }
}
