package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event child relationship resource.
  */
trait SchemaEventChild extends StObject {
  
  /**
    * The ID of the child event.
    */
  var childId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventChild.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEventChild {
  
  @scala.inline
  def apply(): SchemaEventChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventChild]
  }
  
  @scala.inline
  implicit class SchemaEventChildMutableBuilder[Self <: SchemaEventChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
