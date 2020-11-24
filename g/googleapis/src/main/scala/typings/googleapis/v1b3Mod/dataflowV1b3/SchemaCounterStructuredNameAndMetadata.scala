package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single message which encapsulates structured name and metadata for a
  * given counter.
  */
@js.native
trait SchemaCounterStructuredNameAndMetadata extends js.Object {
  
  /**
    * Metadata associated with a counter
    */
  var metadata: js.UndefOr[SchemaCounterMetadata] = js.native
  
  /**
    * Structured name of the counter.
    */
  var name: js.UndefOr[SchemaCounterStructuredName] = js.native
}
object SchemaCounterStructuredNameAndMetadata {
  
  @scala.inline
  def apply(): SchemaCounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredNameAndMetadata]
  }
  
  @scala.inline
  implicit class SchemaCounterStructuredNameAndMetadataOps[Self <: SchemaCounterStructuredNameAndMetadata] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: SchemaCounterMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: SchemaCounterStructuredName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
