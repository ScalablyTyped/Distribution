package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Override extends StObject {
  
  var `override`: js.UndefOr[Boolean] = js.native
}
object Override {
  
  @scala.inline
  def apply(): Override = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Override]
  }
  
  @scala.inline
  implicit class OverrideMutableBuilder[Self <: Override] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}
