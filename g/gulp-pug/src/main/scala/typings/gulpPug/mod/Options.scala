package typings.gulpPug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any options from [Pug's API](https://pugjs.org/api/reference.html) in addition to `pug`'s own options.
  */
@js.native
trait Options
  extends typings.pug.mod.Options {
  /**
    * Compile Pug to JavaScript code.
    */
  var client: js.UndefOr[Boolean] = js.native
  /**
    * Same as `opts.locals`.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Locals to compile the Pug with. You can also provide locals through the `data` field of the file object,
    * e.g. with [`gulp-data`](https://npmjs.com/gulp-data). They will be merged with `opts.locals`.
    */
  var locals: js.UndefOr[js.Any] = js.native
  /**
    * A custom instance of Pug for `gulp-pug` to use.
    */
  var pug: js.UndefOr[js.Any] = js.native
  /**
    * Display name of file from stream that is being compiled.
    */
  var verbose: js.UndefOr[Boolean] = js.native
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
    def setClient(value: Boolean): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLocals(value: js.Any): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setPug(value: js.Any): Self = this.set("pug", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePug: Self = this.set("pug", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

