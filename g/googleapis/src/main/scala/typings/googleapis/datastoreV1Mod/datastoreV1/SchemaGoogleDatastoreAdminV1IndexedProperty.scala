package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A property of an index.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexedProperty extends StObject {
  
  /**
    * The indexed property&#39;s direction.  Must not be DIRECTION_UNSPECIFIED.
    * Required.
    */
  var direction: js.UndefOr[String] = js.native
  
  /**
    * The property name to index. Required.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleDatastoreAdminV1IndexedProperty {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexedProperty]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexedPropertyMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1IndexedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
