package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a service configuration with its name and id.
  */
@js.native
trait SchemaConfigRef extends StObject {
  
  /**
    * Resource name of a service config. It must have the following format:
    * &quot;services/{service name}/configs/{config id}&quot;.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaConfigRef {
  
  @scala.inline
  def apply(): SchemaConfigRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigRef]
  }
  
  @scala.inline
  implicit class SchemaConfigRefMutableBuilder[Self <: SchemaConfigRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
