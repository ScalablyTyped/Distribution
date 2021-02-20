package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Activity in applications other than Drive.
  */
@js.native
trait SchemaApplicationReference extends StObject {
  
  /**
    * The reference type corresponding to this event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaApplicationReference {
  
  @scala.inline
  def apply(): SchemaApplicationReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReference]
  }
  
  @scala.inline
  implicit class SchemaApplicationReferenceMutableBuilder[Self <: SchemaApplicationReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
