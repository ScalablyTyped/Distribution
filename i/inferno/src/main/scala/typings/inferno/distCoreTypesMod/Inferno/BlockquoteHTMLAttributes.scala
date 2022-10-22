package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockquoteHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[String | Null] = js.undefined
}
object BlockquoteHTMLAttributes {
  
  inline def apply[T](): BlockquoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockquoteHTMLAttributes[T]]
  }
  
  extension [Self <: BlockquoteHTMLAttributes[?], T](x: Self & BlockquoteHTMLAttributes[T]) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteNull: Self = StObject.set(x, "cite", null)
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
