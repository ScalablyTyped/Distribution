package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.A
import typings.inferno.infernoStrings.I
import typings.inferno.infernoStrings.`1`
import typings.inferno.infernoStrings.a_
import typings.inferno.infernoStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var reversed: js.UndefOr[Boolean | Null] = js.undefined
  
  var start: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I | Null] = js.undefined
}
object OlHTMLAttributes {
  
  inline def apply[T](): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
  
  extension [Self <: OlHTMLAttributes[?], T](x: Self & OlHTMLAttributes[T]) {
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedNull: Self = StObject.set(x, "reversed", null)
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: `1` | a_ | A | i_ | I): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
