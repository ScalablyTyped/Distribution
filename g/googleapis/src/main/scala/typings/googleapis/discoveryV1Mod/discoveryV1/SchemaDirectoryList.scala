package typings.googleapis.discoveryV1Mod.discoveryV1

import typings.googleapis.anon.DiscoveryLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDirectoryList extends js.Object {
  
  /**
    * Indicate the version of the Discovery API used to generate this doc.
    */
  var discoveryVersion: js.UndefOr[String] = js.native
  
  /**
    * The individual directory entries. One entry per api/version pair.
    */
  var items: js.UndefOr[js.Array[DiscoveryLink]] = js.native
  
  /**
    * The kind for this response.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDirectoryList {
  
  @scala.inline
  def apply(): SchemaDirectoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectoryList]
  }
  
  @scala.inline
  implicit class SchemaDirectoryListOps[Self <: SchemaDirectoryList] (val x: Self) extends AnyVal {
    
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
    def setDiscoveryVersion(value: String): Self = this.set("discoveryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryVersion: Self = this.set("discoveryVersion", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DiscoveryLink*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DiscoveryLink]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
