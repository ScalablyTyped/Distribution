package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event tag override information.
  */
@js.native
trait SchemaEventTagOverride extends StObject {
  
  /**
    * Whether this override is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of this event tag override. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaEventTagOverride {
  
  @scala.inline
  def apply(): SchemaEventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagOverride]
  }
  
  @scala.inline
  implicit class SchemaEventTagOverrideMutableBuilder[Self <: SchemaEventTagOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
