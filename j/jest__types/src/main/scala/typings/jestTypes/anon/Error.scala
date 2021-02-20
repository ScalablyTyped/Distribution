package typings.jestTypes.anon

import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends SyncEvent {
  
  var error: Exception = js.native
  
  var name: error_ = js.native
}
object Error {
  
  @scala.inline
  def apply(error: Exception, name: error_): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: error_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
