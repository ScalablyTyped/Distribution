package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: js.Any
  
  var infoCount: Double
}
object Info {
  
  @scala.inline
  def apply(info: js.Any, infoCount: Double): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], infoCount = infoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoCount(value: Double): Self = StObject.set(x, "infoCount", value.asInstanceOf[js.Any])
  }
}
