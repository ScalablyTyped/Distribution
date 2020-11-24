package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key-value pair of detailed information about the client which invoked the
  * test. Examples: {&#39;Version&#39;, &#39;1.0&#39;}, {&#39;Release
  * Track&#39;, &#39;BETA&#39;}.
  */
@js.native
trait SchemaClientInfoDetail extends js.Object {
  
  /**
    * Required. The key of detailed client information.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Required. The value of detailed client information.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaClientInfoDetail {
  
  @scala.inline
  def apply(): SchemaClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfoDetail]
  }
  
  @scala.inline
  implicit class SchemaClientInfoDetailOps[Self <: SchemaClientInfoDetail] (val x: Self) extends AnyVal {
    
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
