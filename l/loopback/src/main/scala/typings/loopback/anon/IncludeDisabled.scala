package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeDisabled extends StObject {
  
  var includeDisabled: Boolean = js.native
}
object IncludeDisabled {
  
  @scala.inline
  def apply(includeDisabled: Boolean): IncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDisabled]
  }
  
  @scala.inline
  implicit class IncludeDisabledMutableBuilder[Self <: IncludeDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
  }
}
