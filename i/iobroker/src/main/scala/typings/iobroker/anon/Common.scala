package typings.iobroker.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Common extends StObject {
  
  var common: Record[String, js.Any]
  
  var native: Record[String, js.Any]
}
object Common {
  
  @scala.inline
  def apply(common: Record[String, js.Any], native: Record[String, js.Any]): Common = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  @scala.inline
  implicit class CommonMutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: Record[String, js.Any]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Record[String, js.Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
  }
}
