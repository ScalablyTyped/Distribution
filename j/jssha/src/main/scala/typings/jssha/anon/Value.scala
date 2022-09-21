package typings.jssha.anon

import typings.jssha.jsshaStrings.ARRAYBUFFER
import typings.jssha.sha256Mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with GenericInputType
     with typings.jssha.mod.GenericInputType
     with typings.jssha.sha512Mod.GenericInputType
     with typings.jssha.sha3Mod.GenericInputType
     with typings.jssha.sha1Mod.GenericInputType {
  
  var format: ARRAYBUFFER
  
  var value: js.typedarray.ArrayBuffer
}
object Value {
  
  inline def apply(value: js.typedarray.ArrayBuffer): Value = {
    val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setFormat(value: ARRAYBUFFER): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
