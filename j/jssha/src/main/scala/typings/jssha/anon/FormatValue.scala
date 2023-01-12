package typings.jssha.anon

import typings.jssha.jsshaStrings.UINT8ARRAY
import typings.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatValue
  extends StObject
     with GenericInputType
     with typings.jssha.distSha1Mod.GenericInputType
     with typings.jssha.distSha3Mod.GenericInputType
     with typings.jssha.distSha256Mod.GenericInputType
     with typings.jssha.distSha512Mod.GenericInputType {
  
  var format: UINT8ARRAY
  
  var value: js.typedarray.Uint8Array
}
object FormatValue {
  
  inline def apply(value: js.typedarray.Uint8Array): FormatValue = {
    val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatValue] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: UINT8ARRAY): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
