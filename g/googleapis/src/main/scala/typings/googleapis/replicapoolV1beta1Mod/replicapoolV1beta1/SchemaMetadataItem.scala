package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine metadata item, defined as a key:value pair. Identical to
  * the metadata on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadataItem extends js.Object {
  
  /**
    * A metadata key.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A metadata value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaMetadataItem {
  
  @scala.inline
  def apply(): SchemaMetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataItem]
  }
  
  @scala.inline
  implicit class SchemaMetadataItemOps[Self <: SchemaMetadataItem] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
