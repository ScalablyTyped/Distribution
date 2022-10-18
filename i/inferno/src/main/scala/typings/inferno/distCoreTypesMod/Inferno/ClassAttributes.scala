package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassAttributes[T]
  extends StObject
     with Attributes {
  
  var ref: js.UndefOr[Ref[T] | RefObject[T]] = js.undefined
}
object ClassAttributes {
  
  inline def apply[T](): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  
  extension [Self <: ClassAttributes[?], T](x: Self & ClassAttributes[T]) {
    
    inline def setRef(value: Ref[T] | RefObject[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
