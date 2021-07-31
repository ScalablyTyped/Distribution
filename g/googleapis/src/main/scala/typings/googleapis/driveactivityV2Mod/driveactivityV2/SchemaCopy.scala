package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was created by copying an existing object.
  */
trait SchemaCopy extends StObject {
  
  /**
    * The the original object.
    */
  var originalObject: js.UndefOr[SchemaTargetReference] = js.undefined
}
object SchemaCopy {
  
  @scala.inline
  def apply(): SchemaCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopy]
  }
  
  @scala.inline
  implicit class SchemaCopyMutableBuilder[Self <: SchemaCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalObject(value: SchemaTargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
