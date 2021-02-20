package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Datastore data object.  An entity is limited to 1 megabyte when stored.
  * That _roughly_ corresponds to a limit of 1 megabyte for the serialized form
  * of this message.
  */
@js.native
trait SchemaEntity extends StObject {
  
  /**
    * The entity&#39;s key.  An entity must have a key, unless otherwise
    * documented (for example, an entity in `Value.entity_value` may have no
    * key). An entity&#39;s kind is its key path&#39;s last element&#39;s kind,
    * or null if it has no key.
    */
  var key: js.UndefOr[SchemaKey] = js.native
  
  /**
    * The entity&#39;s properties. The map&#39;s keys are property names. A
    * property name matching regex `__.*__` is reserved. A reserved property
    * name is forbidden in certain documented contexts. The name must not
    * contain more than 500 characters. The name cannot be `&quot;&quot;`.
    */
  var properties: js.UndefOr[StringDictionary[SchemaValue]] = js.native
}
object SchemaEntity {
  
  @scala.inline
  def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  @scala.inline
  implicit class SchemaEntityMutableBuilder[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: SchemaKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[SchemaValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
