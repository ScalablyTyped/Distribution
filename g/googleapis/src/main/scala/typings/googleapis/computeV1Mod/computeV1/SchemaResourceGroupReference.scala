package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourceGroupReference extends StObject {
  
  /**
    * A URI referencing one of the instance groups or network endpoint groups
    * listed in the backend service.
    */
  var group: js.UndefOr[String] = js.native
}
object SchemaResourceGroupReference {
  
  @scala.inline
  def apply(): SchemaResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroupReference]
  }
  
  @scala.inline
  implicit class SchemaResourceGroupReferenceMutableBuilder[Self <: SchemaResourceGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
