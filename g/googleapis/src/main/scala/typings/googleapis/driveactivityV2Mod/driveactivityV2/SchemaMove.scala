package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMove extends StObject {
  
  /**
    * The added parent object(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.undefined
  
  /**
    * The removed parent object(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.undefined
}
object SchemaMove {
  
  inline def apply(): SchemaMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMove]
  }
  
  extension [Self <: SchemaMove](x: Self) {
    
    inline def setAddedParents(value: js.Array[SchemaTargetReference]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
    
    inline def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
    
    inline def setAddedParentsVarargs(value: SchemaTargetReference*): Self = StObject.set(x, "addedParents", js.Array(value*))
    
    inline def setRemovedParents(value: js.Array[SchemaTargetReference]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
    
    inline def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
    
    inline def setRemovedParentsVarargs(value: SchemaTargetReference*): Self = StObject.set(x, "removedParents", js.Array(value*))
  }
}
