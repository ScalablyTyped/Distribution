package typings.knockout.mod.utils

import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostJsonOptions extends js.Object {
  
  var includeFields: js.UndefOr[js.Array[String]] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var submitter: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Unit]] = js.native
}
object PostJsonOptions {
  
  @scala.inline
  def apply(): PostJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostJsonOptions]
  }
  
  @scala.inline
  implicit class PostJsonOptionsOps[Self <: PostJsonOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeFieldsVarargs(value: String*): Self = this.set("includeFields", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFields(value: js.Array[String]): Self = this.set("includeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFields: Self = this.set("includeFields", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setSubmitter(value: /* form */ HTMLFormElement => Unit): Self = this.set("submitter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubmitter: Self = this.set("submitter", js.undefined)
  }
}
