package typings.koaPug.mod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import typings.pug.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PugOptions
  extends Options
     with /* key */ StringDictionary[js.Any] {
  /**
    * Koa instance
    */
  var app: js.UndefOr[^[DefaultState, DefaultContext]] = js.native
  /**
    * Paths of helpers.
    */
  var helperPath: js.UndefOr[js.Array[_]] = js.native
  /**
    * Add a list of variables to make accessible in templates
    */
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The root directory of all Pug templates
    */
  var viewPath: js.UndefOr[String] = js.native
}

object PugOptions {
  @scala.inline
  def apply(): PugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PugOptions]
  }
  @scala.inline
  implicit class PugOptionsOps[Self <: PugOptions] (val x: Self) extends AnyVal {
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
    def setApp(value: ^[DefaultState, DefaultContext]): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setHelperPathVarargs(value: js.Any*): Self = this.set("helperPath", js.Array(value :_*))
    @scala.inline
    def setHelperPath(value: js.Array[_]): Self = this.set("helperPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperPath: Self = this.set("helperPath", js.undefined)
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setViewPath(value: String): Self = this.set("viewPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewPath: Self = this.set("viewPath", js.undefined)
  }
  
}

