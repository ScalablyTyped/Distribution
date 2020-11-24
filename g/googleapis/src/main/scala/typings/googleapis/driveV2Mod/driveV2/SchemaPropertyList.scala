package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of properties, key-value pairs that are either public or
  * private to an application.
  */
@js.native
trait SchemaPropertyList extends js.Object {
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The list of properties.
    */
  var items: js.UndefOr[js.Array[SchemaProperty]] = js.native
  
  /**
    * This is always drive#propertyList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaPropertyList {
  
  @scala.inline
  def apply(): SchemaPropertyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyList]
  }
  
  @scala.inline
  implicit class SchemaPropertyListOps[Self <: SchemaPropertyList] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaProperty*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaProperty]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
