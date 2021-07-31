package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxBytes extends StObject {
  
  var maxBytes: Double
  
  var output: String
  
  var parse: Boolean
}
object MaxBytes {
  
  @scala.inline
  def apply(maxBytes: Double, output: String, parse: Boolean): MaxBytes = {
    val __obj = js.Dynamic.literal(maxBytes = maxBytes.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBytes]
  }
  
  @scala.inline
  implicit class MaxBytesMutableBuilder[Self <: MaxBytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
