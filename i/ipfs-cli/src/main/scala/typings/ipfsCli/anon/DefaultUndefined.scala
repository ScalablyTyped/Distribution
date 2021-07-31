package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUndefined extends StObject {
  
  var default: Unit
  
  var describe: String
}
object DefaultUndefined {
  
  @scala.inline
  def apply(default: Unit, describe: String): DefaultUndefined = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefined]
  }
  
  @scala.inline
  implicit class DefaultUndefinedMutableBuilder[Self <: DefaultUndefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
  }
}
