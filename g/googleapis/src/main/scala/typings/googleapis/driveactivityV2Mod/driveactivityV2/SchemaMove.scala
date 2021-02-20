package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was moved.
  */
@js.native
trait SchemaMove extends StObject {
  
  /**
    * The added parent object(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
  
  /**
    * The removed parent object(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
}
object SchemaMove {
  
  @scala.inline
  def apply(): SchemaMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMove]
  }
  
  @scala.inline
  implicit class SchemaMoveMutableBuilder[Self <: SchemaMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedParents(value: js.Array[SchemaTargetReference]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
    
    @scala.inline
    def setAddedParentsVarargs(value: SchemaTargetReference*): Self = StObject.set(x, "addedParents", js.Array(value :_*))
    
    @scala.inline
    def setRemovedParents(value: js.Array[SchemaTargetReference]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
    
    @scala.inline
    def setRemovedParentsVarargs(value: SchemaTargetReference*): Self = StObject.set(x, "removedParents", js.Array(value :_*))
  }
}
