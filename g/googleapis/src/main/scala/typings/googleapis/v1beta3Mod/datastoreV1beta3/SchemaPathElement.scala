package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A (kind, ID/name) pair used to construct a key path.  If either name or ID
  * is set, the element is complete. If neither is set, the element is
  * incomplete.
  */
trait SchemaPathElement extends StObject {
  
  /**
    * The auto-allocated ID of the entity. Never equal to zero. Values less
    * than zero are discouraged and may not be supported in the future.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of the entity. A kind matching regex `__.*__` is
    * reserved/read-only. A kind must not contain more than 1500 bytes when
    * UTF-8 encoded. Cannot be `&quot;&quot;`.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the entity. A name matching regex `__.*__` is
    * reserved/read-only. A name must not be more than 1500 bytes when UTF-8
    * encoded. Cannot be `&quot;&quot;`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPathElement {
  
  @scala.inline
  def apply(): SchemaPathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathElement]
  }
  
  @scala.inline
  implicit class SchemaPathElementMutableBuilder[Self <: SchemaPathElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
