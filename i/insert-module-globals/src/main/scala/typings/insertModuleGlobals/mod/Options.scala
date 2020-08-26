package typings.insertModuleGlobals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When opts.always is true, wrap every file with all the global variables without parsing.
    * This is handy because parsing the scope can take a long time, so you can prioritize fast builds over saving bytes in the final output.
    * When opts.always is truthy but not true, avoid parsing but perform a quick test to determine if wrapping should be skipped.
    */
  var always: js.UndefOr[Boolean] = js.native
  var basedir: js.UndefOr[String] = js.native
  /**
    * If opts.debug is true, an inline source map will be generated to compensate for the extra lines.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Use opts.vars to override the default inserted variables, or set opts.vars[name] to undefined to not insert a variable which would otherwise be inserted.
    *
    * opts.vars properties with a . in their name will be executed instead of the parent object if ONLY that property is used.
    * For example, "Buffer.isBuffer" will mask "Buffer" only when there is a Buffer.isBuffer() call in a file and no other references to Buffer.
    */
  var vars: js.UndefOr[VarsOption] = js.native
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
    def setAlways(value: Boolean): Self = this.set("always", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    @scala.inline
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setVars(value: VarsOption): Self = this.set("vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
  
}

