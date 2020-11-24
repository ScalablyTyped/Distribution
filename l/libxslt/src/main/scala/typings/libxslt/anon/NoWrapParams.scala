package typings.libxslt.anon

import typings.libxslt.libxsltStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoWrapParams extends js.Object {
  
  var noWrapParams: js.UndefOr[Boolean] = js.native
  
  var outputFormat: string = js.native
}
object NoWrapParams {
  
  @scala.inline
  def apply(outputFormat: string): NoWrapParams = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoWrapParams]
  }
  
  @scala.inline
  implicit class NoWrapParamsOps[Self <: NoWrapParams] (val x: Self) extends AnyVal {
    
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
    def setOutputFormat(value: string): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWrapParams(value: Boolean): Self = this.set("noWrapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrapParams: Self = this.set("noWrapParams", js.undefined)
  }
}
