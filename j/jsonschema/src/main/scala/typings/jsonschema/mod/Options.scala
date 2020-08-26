package typings.jsonschema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowUnknownAttributes: js.UndefOr[Boolean] = js.native
  var base: js.UndefOr[String] = js.native
  var propertyName: js.UndefOr[String] = js.native
  var rewrite: js.UndefOr[RewriteFunction] = js.native
  var skipAttributes: js.UndefOr[js.Array[String]] = js.native
  var throwError: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowUnknownAttributes(value: Boolean): Self = this.set("allowUnknownAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnknownAttributes: Self = this.set("allowUnknownAttributes", js.undefined)
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
    @scala.inline
    def setRewrite(
      value: (/* instance */ js.Any, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => js.Any
    ): Self = this.set("rewrite", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
    @scala.inline
    def setSkipAttributesVarargs(value: String*): Self = this.set("skipAttributes", js.Array(value :_*))
    @scala.inline
    def setSkipAttributes(value: js.Array[String]): Self = this.set("skipAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAttributes: Self = this.set("skipAttributes", js.undefined)
    @scala.inline
    def setThrowError(value: Boolean): Self = this.set("throwError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowError: Self = this.set("throwError", js.undefined)
  }
  
}

