package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a parameter&#39;s name and location. The parameter may be passed as
  * either an HTTP header or a URL query parameter, and if both are passed the
  * behavior is implementation-dependent.
  */
@js.native
trait SchemaSystemParameter extends js.Object {
  /**
    * Define the HTTP header name to use for the parameter. It is case
    * insensitive.
    */
  var httpHeader: js.UndefOr[String] = js.native
  /**
    * Define the name of the parameter, such as &quot;api_key&quot; . It is
    * case sensitive.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Define the URL query parameter name to use for the parameter. It is case
    * sensitive.
    */
  var urlQueryParameter: js.UndefOr[String] = js.native
}

object SchemaSystemParameter {
  @scala.inline
  def apply(): SchemaSystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameter]
  }
  @scala.inline
  implicit class SchemaSystemParameterOps[Self <: SchemaSystemParameter] (val x: Self) extends AnyVal {
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
    def setHttpHeader(value: String): Self = this.set("httpHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHeader: Self = this.set("httpHeader", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrlQueryParameter(value: String): Self = this.set("urlQueryParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlQueryParameter: Self = this.set("urlQueryParameter", js.undefined)
  }
  
}

