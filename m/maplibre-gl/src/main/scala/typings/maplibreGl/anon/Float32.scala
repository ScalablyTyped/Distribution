package typings.maplibreGl.anon

import typings.std.Float32ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Float32 extends StObject {
  
  var Float32: Float32ArrayConstructor
  
  var Int16: Int16ArrayConstructor
  
  var Int32: Int32ArrayConstructor
  
  var Int8: Int8ArrayConstructor
  
  var Uint16: Uint16ArrayConstructor
  
  var Uint32: Uint32ArrayConstructor
  
  var Uint8: Uint8ArrayConstructor
}
object Float32 {
  
  inline def apply(
    Float32: Float32ArrayConstructor,
    Int16: Int16ArrayConstructor,
    Int32: Int32ArrayConstructor,
    Int8: Int8ArrayConstructor,
    Uint16: Uint16ArrayConstructor,
    Uint32: Uint32ArrayConstructor,
    Uint8: Uint8ArrayConstructor
  ): Float32 = {
    val __obj = js.Dynamic.literal(Float32 = Float32.asInstanceOf[js.Any], Int16 = Int16.asInstanceOf[js.Any], Int32 = Int32.asInstanceOf[js.Any], Int8 = Int8.asInstanceOf[js.Any], Uint16 = Uint16.asInstanceOf[js.Any], Uint32 = Uint32.asInstanceOf[js.Any], Uint8 = Uint8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Float32]
  }
  
  extension [Self <: Float32](x: Self) {
    
    inline def setFloat32(value: Float32ArrayConstructor): Self = StObject.set(x, "Float32", value.asInstanceOf[js.Any])
    
    inline def setInt16(value: Int16ArrayConstructor): Self = StObject.set(x, "Int16", value.asInstanceOf[js.Any])
    
    inline def setInt32(value: Int32ArrayConstructor): Self = StObject.set(x, "Int32", value.asInstanceOf[js.Any])
    
    inline def setInt8(value: Int8ArrayConstructor): Self = StObject.set(x, "Int8", value.asInstanceOf[js.Any])
    
    inline def setUint16(value: Uint16ArrayConstructor): Self = StObject.set(x, "Uint16", value.asInstanceOf[js.Any])
    
    inline def setUint32(value: Uint32ArrayConstructor): Self = StObject.set(x, "Uint32", value.asInstanceOf[js.Any])
    
    inline def setUint8(value: Uint8ArrayConstructor): Self = StObject.set(x, "Uint8", value.asInstanceOf[js.Any])
  }
}
