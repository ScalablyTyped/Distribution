package typings.gulpJade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * If set to true, compiled functions are cached. filename
    * must be set as the cache key.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * Compile to JS instead of HTML.
    */
  var client: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the function source will be included in the
    * compiled template for better error messages (sometimes useful
    * in development). It is enabled by default unless used with
    * express in production mode.
    */
  var compileDebug: js.UndefOr[Boolean] = js.native
  /**
    * Data to be used while parsing jade files. Has lower
    * precedence than locals.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * If set to true, the tokens and function body is logged
    * to stdout
    */
  var debug: js.UndefOr[Boolean] = js.native
  /*******
    * JADE API OPTIONS
    *******/
  /**
    * If the doctype is not specified as part of the
    * template, you can specify it here. It is sometimes
    * useful to get self-closing tags and remove mirroring
    * of boolean attributes.
    */
  var doctype: js.UndefOr[String] = js.native
  /*******
    * GULP-JADE OPTIONS
    *******/
  /**
    * Used to set a version of jade other than this library's
    * dependency, or to customise filters.
    */
  var jade: js.UndefOr[js.Any] = js.native
  /**
    * Locals to be used while parsing jade files. Takes
    * precedence over data.
    */
  var locals: js.UndefOr[js.Any] = js.native
  /**
    * Adds whitespace to the resulting html to make it
    * easier for a human to read using '  ' as indentation.
    * If a string is specified, that will be used as
    * indentation instead (e.g. '\t').
    */
  var pretty: js.UndefOr[Boolean | String] = js.native
  /**
    * Use a self namespace to hold the locals (false by default)
    */
  var self: js.UndefOr[Boolean] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setClient(value: Boolean): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setCompileDebug(value: Boolean): Self = this.set("compileDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompileDebug: Self = this.set("compileDebug", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDoctype(value: String): Self = this.set("doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    @scala.inline
    def setJade(value: js.Any): Self = this.set("jade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJade: Self = this.set("jade", js.undefined)
    @scala.inline
    def setLocals(value: js.Any): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setPretty(value: Boolean | String): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
  
}

