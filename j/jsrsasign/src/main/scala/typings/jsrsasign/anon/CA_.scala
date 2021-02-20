package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CA_ extends StObject {
  
  var cA: Boolean = js.native
  
  var pathLen: Double = js.native
}
object CA_ {
  
  @scala.inline
  def apply(cA: Boolean, pathLen: Double): CA_ = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], pathLen = pathLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[CA_]
  }
  
  @scala.inline
  implicit class CA_MutableBuilder[Self <: CA_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLen(value: Double): Self = StObject.set(x, "pathLen", value.asInstanceOf[js.Any])
  }
}
