package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document classification response message.
  */
@js.native
trait SchemaClassifyTextResponse extends js.Object {
  
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
}
object SchemaClassifyTextResponse {
  
  @scala.inline
  def apply(): SchemaClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextResponse]
  }
  
  @scala.inline
  implicit class SchemaClassifyTextResponseOps[Self <: SchemaClassifyTextResponse] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: SchemaClassificationCategory*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[SchemaClassificationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
  }
}
