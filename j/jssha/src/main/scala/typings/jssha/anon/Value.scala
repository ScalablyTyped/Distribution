package typings.jssha.anon

import typings.jssha.jsshaStrings.ARRAYBUFFER
import typings.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with GenericInputType
     with typings.jssha.distSha1Mod.GenericInputType
     with typings.jssha.distSha3Mod.GenericInputType
     with typings.jssha.distSha256Mod.GenericInputType
     with typings.jssha.distSha512Mod.GenericInputType {
  
  var format: ARRAYBUFFER
  
  var value: js.typedarray.ArrayBuffer
}
object Value {
  
  inline def apply(value: js.typedarray.ArrayBuffer): Value = {
    val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ARRAYBUFFER): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
