package typings.jssha.anon

import typings.jssha.jsshaStrings.B64
import typings.jssha.jsshaStrings.BYTES
import typings.jssha.jsshaStrings.HEX
import typings.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format
  extends StObject
     with GenericInputType
     with typings.jssha.distSha1Mod.GenericInputType
     with typings.jssha.distSha3Mod.GenericInputType
     with typings.jssha.distSha256Mod.GenericInputType
     with typings.jssha.distSha512Mod.GenericInputType {
  
  var format: B64 | HEX | BYTES
  
  var value: String
}
object Format {
  
  inline def apply(format: B64 | HEX | BYTES, value: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: B64 | HEX | BYTES): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
