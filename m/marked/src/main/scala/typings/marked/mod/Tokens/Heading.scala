package typings.marked.mod.Tokens

import typings.marked.markedStrings.heading
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading
  extends StObject
     with Token {
  
  var depth: Double
  
  var raw: String
  
  var text: String
  
  var `type`: heading
}
object Heading {
  
  @scala.inline
  def apply(depth: Double, raw: String, text: String): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[Heading]
  }
  
  @scala.inline
  implicit class HeadingMutableBuilder[Self <: Heading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
