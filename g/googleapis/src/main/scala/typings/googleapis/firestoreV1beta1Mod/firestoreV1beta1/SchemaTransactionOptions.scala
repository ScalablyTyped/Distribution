package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a new transaction.
  */
@js.native
trait SchemaTransactionOptions extends js.Object {
  
  /**
    * The transaction can only be used for read operations.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  
  /**
    * The transaction can be used for both read and write operations.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.native
}
object SchemaTransactionOptions {
  
  @scala.inline
  def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  
  @scala.inline
  implicit class SchemaTransactionOptionsOps[Self <: SchemaTransactionOptions] (val x: Self) extends AnyVal {
    
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
    def setReadOnly(value: SchemaReadOnly): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReadWrite(value: SchemaReadWrite): Self = this.set("readWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadWrite: Self = this.set("readWrite", js.undefined)
  }
}
