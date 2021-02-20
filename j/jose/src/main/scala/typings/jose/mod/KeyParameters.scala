package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyParameters extends BasicParameters {
  
  var x5c: js.UndefOr[js.Array[String]] = js.native
  
  var x5t: js.UndefOr[String] = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
object KeyParameters {
  
  @scala.inline
  def apply(): KeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyParameters]
  }
  
  @scala.inline
  implicit class KeyParametersMutableBuilder[Self <: KeyParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    
    @scala.inline
    def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value :_*))
    
    @scala.inline
    def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    
    @scala.inline
    def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
  }
}
