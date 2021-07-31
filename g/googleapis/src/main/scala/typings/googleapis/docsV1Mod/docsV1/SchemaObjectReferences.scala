package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of object IDs.
  */
trait SchemaObjectReferences extends StObject {
  
  /**
    * The object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaObjectReferences {
  
  @scala.inline
  def apply(): SchemaObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectReferences]
  }
  
  @scala.inline
  implicit class SchemaObjectReferencesMutableBuilder[Self <: SchemaObjectReferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
  }
}
