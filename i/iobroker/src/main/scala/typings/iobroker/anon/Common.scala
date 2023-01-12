package typings.iobroker.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Common extends StObject {
  
  var common: Record[String, Any]
  
  var native: Record[String, Any]
}
object Common {
  
  inline def apply(common: Record[String, Any], native: Record[String, Any]): Common = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
    
    inline def setCommon(value: Record[String, Any]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Record[String, Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
  }
}
