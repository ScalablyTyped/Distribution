package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDescribe extends StObject {
  
  var default: String
  
  var describe: String
}
object DefaultDescribe {
  
  @scala.inline
  def apply(default: String, describe: String): DefaultDescribe = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescribe]
  }
  
  @scala.inline
  implicit class DefaultDescribeMutableBuilder[Self <: DefaultDescribe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
  }
}
