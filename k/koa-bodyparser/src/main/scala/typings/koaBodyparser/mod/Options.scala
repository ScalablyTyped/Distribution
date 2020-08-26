package typings.koaBodyparser.mod

import typings.koa.mod.Context
import typings.koaBodyparser.anon.Form
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * custom json request detect function. Default is null
    */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
  /**
    *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
    */
  var enableTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * requested encoding. Default is utf-8 by co-body
    */
  var encode: js.UndefOr[String] = js.native
  /**
    * support extend types
    */
  var extendTypes: js.UndefOr[Form] = js.native
  /**
    * limit of the urlencoded body. If the body ends up being larger than this limit
    * a 413 error code is returned. Default is 56kb
    */
  var formLimit: js.UndefOr[String] = js.native
  /**
    * limit of the json body. Default is 1mb
    */
  var jsonLimit: js.UndefOr[String] = js.native
  /**
    * support custom error handle
    */
  var onerror: js.UndefOr[js.Function2[/* err */ Error, /* ctx */ Context, Unit]] = js.native
  /**
    * when set to true, JSON parser will only accept arrays and objects. Default is true
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * limit of the text body. Default is 1mb.
    */
  var textLimit: js.UndefOr[String] = js.native
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
    def setDetectJSON(value: /* ctx */ Context => Boolean): Self = this.set("detectJSON", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDetectJSON: Self = this.set("detectJSON", js.undefined)
    @scala.inline
    def setEnableTypesVarargs(value: String*): Self = this.set("enableTypes", js.Array(value :_*))
    @scala.inline
    def setEnableTypes(value: js.Array[String]): Self = this.set("enableTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTypes: Self = this.set("enableTypes", js.undefined)
    @scala.inline
    def setEncode(value: String): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setExtendTypes(value: Form): Self = this.set("extendTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendTypes: Self = this.set("extendTypes", js.undefined)
    @scala.inline
    def setFormLimit(value: String): Self = this.set("formLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormLimit: Self = this.set("formLimit", js.undefined)
    @scala.inline
    def setJsonLimit(value: String): Self = this.set("jsonLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonLimit: Self = this.set("jsonLimit", js.undefined)
    @scala.inline
    def setOnerror(value: (/* err */ Error, /* ctx */ Context) => Unit): Self = this.set("onerror", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTextLimit(value: String): Self = this.set("textLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLimit: Self = this.set("textLimit", js.undefined)
  }
  
}

