package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataOptions extends js.Object {
  
  /**
    * An array of keys that should not be added to the metadata object.
    */
  var fillExcept: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of keys that will be added to the metadata object.
    */
  var fillWith: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the key used for the metadata object. Defaults to `metadata`.
    */
  var key: js.UndefOr[String] = js.native
}
object MetadataOptions {
  
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    
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
    def setFillExceptVarargs(value: String*): Self = this.set("fillExcept", js.Array(value :_*))
    
    @scala.inline
    def setFillExcept(value: js.Array[String]): Self = this.set("fillExcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillExcept: Self = this.set("fillExcept", js.undefined)
    
    @scala.inline
    def setFillWithVarargs(value: String*): Self = this.set("fillWith", js.Array(value :_*))
    
    @scala.inline
    def setFillWith(value: js.Array[String]): Self = this.set("fillWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillWith: Self = this.set("fillWith", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
