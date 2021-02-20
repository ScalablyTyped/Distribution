package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomHeaders extends StObject {
  
  /** Regular expression string to match files */
  var `match`: String = js.native
  
  /** HTTP header name */
  var name: String = js.native
  
  /** HTTP header value */
  var value: String = js.native
}
object CustomHeaders {
  
  @scala.inline
  def apply(`match`: String, name: String, value: String): CustomHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeaders]
  }
  
  @scala.inline
  implicit class CustomHeadersMutableBuilder[Self <: CustomHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
