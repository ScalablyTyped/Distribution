package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The read-only metadata about a profile.
  */
trait SchemaProfileMetadata extends StObject {
  
  /**
    * The profile object type.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * The user types.
    */
  var userTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaProfileMetadata {
  
  @scala.inline
  def apply(): SchemaProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileMetadata]
  }
  
  @scala.inline
  implicit class SchemaProfileMetadataMutableBuilder[Self <: SchemaProfileMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setUserTypes(value: js.Array[String]): Self = StObject.set(x, "userTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypesUndefined: Self = StObject.set(x, "userTypes", js.undefined)
    
    @scala.inline
    def setUserTypesVarargs(value: String*): Self = StObject.set(x, "userTypes", js.Array(value :_*))
  }
}
