package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selection of a collection, such as `messages as m1`.
  */
@js.native
trait SchemaCollectionSelector extends js.Object {
  
  /**
    * When false, selects only collections that are immediate children of the
    * `parent` specified in the containing `RunQueryRequest`. When true,
    * selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.native
  
  /**
    * The collection ID. When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.native
}
object SchemaCollectionSelector {
  
  @scala.inline
  def apply(): SchemaCollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionSelector]
  }
  
  @scala.inline
  implicit class SchemaCollectionSelectorOps[Self <: SchemaCollectionSelector] (val x: Self) extends AnyVal {
    
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
    def setAllDescendants(value: Boolean): Self = this.set("allDescendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDescendants: Self = this.set("allDescendants", js.undefined)
    
    @scala.inline
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionId: Self = this.set("collectionId", js.undefined)
  }
}
