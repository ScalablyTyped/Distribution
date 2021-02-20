package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InheritanceOptions extends StObject {
  
  var only: js.UndefOr[Boolean] = js.native
}
object InheritanceOptions {
  
  @scala.inline
  def apply(): InheritanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritanceOptions]
  }
  
  @scala.inline
  implicit class InheritanceOptionsMutableBuilder[Self <: InheritanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
  }
}
