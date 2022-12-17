package typings.jssha.distSha3Mod

import typings.jssha.jsshaStrings.B64
import typings.jssha.jsshaStrings.BYTES
import typings.jssha.jsshaStrings.HEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jssha.anon.ValueString
  - typings.jssha.anon.Format
  - typings.jssha.anon.Value
  - typings.jssha.anon.FormatValue
*/
trait GenericInputType extends StObject
object GenericInputType {
  
  inline def Format(format: B64 | HEX | BYTES, value: String): typings.jssha.anon.Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssha.anon.Format]
  }
  
  inline def FormatValue(value: js.typedarray.Uint8Array): typings.jssha.anon.FormatValue = {
    val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssha.anon.FormatValue]
  }
  
  inline def Value(value: js.typedarray.ArrayBuffer): typings.jssha.anon.Value = {
    val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssha.anon.Value]
  }
  
  inline def ValueString(value: String): typings.jssha.anon.ValueString = {
    val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssha.anon.ValueString]
  }
}
