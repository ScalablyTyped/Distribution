package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListDelegates method.
  */
@js.native
trait SchemaListDelegatesResponse extends js.Object {
  
  /**
    * List of the user&#39;s delegates (with any verification status).
    */
  var delegates: js.UndefOr[js.Array[SchemaDelegate]] = js.native
}
object SchemaListDelegatesResponse {
  
  @scala.inline
  def apply(): SchemaListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDelegatesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDelegatesResponseOps[Self <: SchemaListDelegatesResponse] (val x: Self) extends AnyVal {
    
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
    def setDelegatesVarargs(value: SchemaDelegate*): Self = this.set("delegates", js.Array(value :_*))
    
    @scala.inline
    def setDelegates(value: js.Array[SchemaDelegate]): Self = this.set("delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegates: Self = this.set("delegates", js.undefined)
  }
}
