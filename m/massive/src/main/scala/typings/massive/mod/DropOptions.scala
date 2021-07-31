package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropOptions extends StObject {
  
  var cascade: js.UndefOr[Boolean] = js.undefined
}
object DropOptions {
  
  @scala.inline
  def apply(): DropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOptions]
  }
  
  @scala.inline
  implicit class DropOptionsMutableBuilder[Self <: DropOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
  }
}
