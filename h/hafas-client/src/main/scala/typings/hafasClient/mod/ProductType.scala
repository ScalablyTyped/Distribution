package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductType extends StObject {
  
  var default: Boolean
  
  var bitmasks: js.Array[Double]
  
  var id: String
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  
  var name: String
  
  var short: String
}
object ProductType {
  
  inline def apply(
    bitmasks: js.Array[Double],
    default: Boolean,
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    name: String,
    short: String
  ): ProductType = {
    val __obj = js.Dynamic.literal(bitmasks = bitmasks.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductType] (val x: Self) extends AnyVal {
    
    inline def setBitmasks(value: js.Array[Double]): Self = StObject.set(x, "bitmasks", value.asInstanceOf[js.Any])
    
    inline def setBitmasksVarargs(value: Double*): Self = StObject.set(x, "bitmasks", js.Array(value*))
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
