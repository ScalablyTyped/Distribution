package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhenSchemaOptions extends js.Object {
  
  /**
    * the alternative schema type if the condition is false. Required if then is missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.native
}
object WhenSchemaOptions {
  
  @scala.inline
  def apply(): WhenSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenSchemaOptions]
  }
  
  @scala.inline
  implicit class WhenSchemaOptionsOps[Self <: WhenSchemaOptions] (val x: Self) extends AnyVal {
    
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
    def setOtherwise(value: SchemaLike): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherwise: Self = this.set("otherwise", js.undefined)
    
    @scala.inline
    def setOtherwiseNull: Self = this.set("otherwise", null)
    
    @scala.inline
    def setThen(value: SchemaLike): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    
    @scala.inline
    def setThenNull: Self = this.set("then", null)
  }
}
