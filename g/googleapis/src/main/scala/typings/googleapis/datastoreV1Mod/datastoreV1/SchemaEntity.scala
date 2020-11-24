package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Datastore data object.  An entity is limited to 1 megabyte when stored.
  * That _roughly_ corresponds to a limit of 1 megabyte for the serialized form
  * of this message.
  */
@js.native
trait SchemaEntity extends js.Object {
  
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
  implicit class SchemaEntityOps[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: SchemaKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[SchemaValue]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
