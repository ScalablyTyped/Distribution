package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A (kind, ID/name) pair used to construct a key path.  If either name or ID
  * is set, the element is complete. If neither is set, the element is
  * incomplete.
  */
@js.native
trait SchemaPathElement extends js.Object {
  
  /**
    * The auto-allocated ID of the entity. Never equal to zero. Values less
    * than zero are discouraged and may not be supported in the future.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of the entity. A kind matching regex `__.*__` is
    * reserved/read-only. A kind must not contain more than 1500 bytes when
    * UTF-8 encoded. Cannot be `&quot;&quot;`.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the entity. A name matching regex `__.*__` is
    * reserved/read-only. A name must not be more than 1500 bytes when UTF-8
    * encoded. Cannot be `&quot;&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPathElement {
  
  @scala.inline
  def apply(): SchemaPathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathElement]
  }
  
  @scala.inline
  implicit class SchemaPathElementOps[Self <: SchemaPathElement] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
