package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCopy extends StObject {
  
  /**
    * The original object.
    */
  var originalObject: js.UndefOr[SchemaTargetReference] = js.undefined
}
object SchemaCopy {
  
  inline def apply(): SchemaCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopy]
  }
  
  extension [Self <: SchemaCopy](x: Self) {
    
    inline def setOriginalObject(value: SchemaTargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
