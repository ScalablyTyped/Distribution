package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Found extends StObject {
  
  var found: Boolean
  
  var index: Double
}
object Found {
  
  @scala.inline
  def apply(found: Boolean, index: Double): Found = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Found]
  }
  
  @scala.inline
  implicit class FoundMutableBuilder[Self <: Found] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
