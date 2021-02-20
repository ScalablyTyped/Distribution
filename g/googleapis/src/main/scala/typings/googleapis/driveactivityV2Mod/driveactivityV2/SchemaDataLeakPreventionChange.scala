package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change in the object&#39;s data leak prevention status.
  */
@js.native
trait SchemaDataLeakPreventionChange extends StObject {
  
  /**
    * The type of Data Leak Prevention (DLP) change.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDataLeakPreventionChange {
  
  @scala.inline
  def apply(): SchemaDataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataLeakPreventionChange]
  }
  
  @scala.inline
  implicit class SchemaDataLeakPreventionChangeMutableBuilder[Self <: SchemaDataLeakPreventionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
