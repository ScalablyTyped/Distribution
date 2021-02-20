package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was deleted.
  */
@js.native
trait SchemaDelete extends StObject {
  
  /**
    * The type of delete action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDelete {
  
  @scala.inline
  def apply(): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelete]
  }
  
  @scala.inline
  implicit class SchemaDeleteMutableBuilder[Self <: SchemaDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
