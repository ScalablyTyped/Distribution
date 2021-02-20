package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A deleted object was restored.
  */
@js.native
trait SchemaRestore extends StObject {
  
  /**
    * The type of restore action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaRestore {
  
  @scala.inline
  def apply(): SchemaRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestore]
  }
  
  @scala.inline
  implicit class SchemaRestoreMutableBuilder[Self <: SchemaRestore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
