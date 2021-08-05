package typings.knockoutPostbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var postbox: KnockoutPostBox
}
object KnockoutStatic {
  
  inline def apply(postbox: KnockoutPostBox): KnockoutStatic = {
    val __obj = js.Dynamic.literal(postbox = postbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setPostbox(value: KnockoutPostBox): Self = StObject.set(x, "postbox", value.asInstanceOf[js.Any])
  }
}
