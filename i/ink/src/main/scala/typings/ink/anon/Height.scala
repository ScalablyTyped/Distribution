package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var output: String
}
object Height {
  
  @scala.inline
  def apply(height: Double, output: String): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
