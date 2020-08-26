package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Option form to request a code.
  */
@js.native
trait CodeAuthorizeOptions extends AuthorizeOptions {
  @JSName("response_type")
  var response_type_CodeAuthorizeOptions: code = js.native
}

object CodeAuthorizeOptions {
  @scala.inline
  def apply(response_type: code, scope: AuthorizeScope): CodeAuthorizeOptions = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAuthorizeOptions]
  }
  @scala.inline
  implicit class CodeAuthorizeOptionsOps[Self <: CodeAuthorizeOptions] (val x: Self) extends AnyVal {
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
    def setResponse_type(value: code): Self = this.set("response_type", value.asInstanceOf[js.Any])
  }
  
}

