package typings.licenseCheckerWebpackPlugin.anon

import typings.licenseCheckerWebpackPlugin.mod.OutputWriter
import typings.licenseCheckerWebpackPlugin.mod.OutputWriterArgs
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allow: js.UndefOr[String] = js.native
  var emitError: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[RegExp] = js.native
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var outputFilename: js.UndefOr[String] = js.native
  var outputWriter: js.UndefOr[String | OutputWriter] = js.native
  var `override`: js.UndefOr[Record[String, PartialDependency]] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setAllow(value: String): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    @scala.inline
    def setEmitError(value: Boolean): Self = this.set("emitError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitError: Self = this.set("emitError", js.undefined)
    @scala.inline
    def setFilter(value: RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setOutputFilename(value: String): Self = this.set("outputFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFilename: Self = this.set("outputFilename", js.undefined)
    @scala.inline
    def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = this.set("outputWriter", js.Any.fromFunction1(value))
    @scala.inline
    def setOutputWriter(value: String | OutputWriter): Self = this.set("outputWriter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputWriter: Self = this.set("outputWriter", js.undefined)
    @scala.inline
    def setOverride(value: Record[String, PartialDependency]): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
  
}

