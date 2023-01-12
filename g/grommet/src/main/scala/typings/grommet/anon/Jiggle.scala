package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jiggle extends StObject {
  
  var duration: js.UndefOr[String] = js.undefined
  
  var jiggle: js.UndefOr[`4`] = js.undefined
}
object Jiggle {
  
  inline def apply(): Jiggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jiggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jiggle] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setJiggle(value: `4`): Self = StObject.set(x, "jiggle", value.asInstanceOf[js.Any])
    
    inline def setJiggleUndefined: Self = StObject.set(x, "jiggle", js.undefined)
  }
}
