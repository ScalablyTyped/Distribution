package typings.jsTokens.anon

import typings.jsTokens.jsTokensBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jsx extends StObject {
  
  var jsx: `true`
}
object Jsx {
  
  inline def apply(): Jsx = {
    val __obj = js.Dynamic.literal(jsx = true)
    __obj.asInstanceOf[Jsx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jsx] (val x: Self) extends AnyVal {
    
    inline def setJsx(value: `true`): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
  }
}
