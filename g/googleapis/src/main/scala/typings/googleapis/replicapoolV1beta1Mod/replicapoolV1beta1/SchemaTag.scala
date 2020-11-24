package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine Instance tag, identical to the tags on the corresponding
  * Compute Engine Instance resource.
  */
@js.native
trait SchemaTag extends js.Object {
  
  /**
    * The fingerprint of the tag. Required for updating the list of tags.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  
  /**
    * Items contained in this tag.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTag {
  
  @scala.inline
  def apply(): SchemaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTag]
  }
  
  @scala.inline
  implicit class SchemaTagOps[Self <: SchemaTag] (val x: Self) extends AnyVal {
    
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
    def setFingerPrint(value: String): Self = this.set("fingerPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerPrint: Self = this.set("fingerPrint", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
