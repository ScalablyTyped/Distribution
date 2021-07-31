package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normal extends StObject {
  
  var normal: Map
}
object Normal {
  
  @scala.inline
  def apply(normal: Map): Normal = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normal]
  }
  
  @scala.inline
  implicit class NormalMutableBuilder[Self <: Normal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormal(value: Map): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
  }
}
