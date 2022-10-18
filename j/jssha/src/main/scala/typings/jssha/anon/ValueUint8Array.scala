package typings.jssha.anon

import typings.jssha.jsshaStrings.UINT8ARRAY
import typings.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueUint8Array
  extends StObject
     with GenericInputType
     with typings.jssha.distSha1Mod.GenericInputType
     with typings.jssha.distSha3Mod.GenericInputType
     with typings.jssha.distSha256Mod.GenericInputType
     with typings.jssha.distSha512Mod.GenericInputType {
  
  var format: UINT8ARRAY
  
  var value: js.typedarray.Uint8Array
}
object ValueUint8Array {
  
  inline def apply(value: js.typedarray.Uint8Array): ValueUint8Array = {
    val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUint8Array]
  }
  
  extension [Self <: ValueUint8Array](x: Self) {
    
    inline def setFormat(value: UINT8ARRAY): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
