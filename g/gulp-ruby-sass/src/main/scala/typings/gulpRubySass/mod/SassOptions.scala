package typings.gulpRubySass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes all options that available for sass executable.
  * Options are converted from dashed to camelCase
  * @interface SassOptions
  */
@js.native
trait SassOptions extends js.Object {
  var cacheLocation: js.UndefOr[String] = js.native
  var check: js.UndefOr[Boolean] = js.native
  var compass: js.UndefOr[Boolean] = js.native
  var debugInfo: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var lineComments: js.UndefOr[Boolean] = js.native
  var lineNumbers: js.UndefOr[Boolean] = js.native
  var loadPath: js.UndefOr[String | js.Array[String]] = js.native
  var noCache: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[Double] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var require: js.UndefOr[String] = js.native
  var scss: js.UndefOr[Boolean] = js.native
  // Actually, there should be a string. However due to ts spec, overriding member should be the same type or a subtype.
  // http://stackoverflow.com/questions/19605557/incompatible-static-properties-in-three-d-ts-with-latest-typescript
  // We need Options.soucemap to be boolean, so here 'any' is used instead of string.
  var sourcemap: js.UndefOr[js.Any] = js.native
  var stdin: js.UndefOr[Boolean] = js.native
  var stopOnError: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[String] = js.native
  var trace: js.UndefOr[Boolean] = js.native
  var unixNewlines: js.UndefOr[Boolean] = js.native
  var update: js.UndefOr[String] = js.native
  // All listed below options are acceptable by the sass executable and potentially may be used from js.
  // However I doubt are there cases when it's meaningful
  var watch: js.UndefOr[String] = js.native
}

object SassOptions {
  @scala.inline
  def apply(): SassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SassOptions]
  }
  @scala.inline
  implicit class SassOptionsOps[Self <: SassOptions] (val x: Self) extends AnyVal {
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
    def setCacheLocation(value: String): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setCompass(value: Boolean): Self = this.set("compass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompass: Self = this.set("compass", js.undefined)
    @scala.inline
    def setDebugInfo(value: Boolean): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setLineComments(value: Boolean): Self = this.set("lineComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineComments: Self = this.set("lineComments", js.undefined)
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    @scala.inline
    def setLoadPathVarargs(value: String*): Self = this.set("loadPath", js.Array(value :_*))
    @scala.inline
    def setLoadPath(value: String | js.Array[String]): Self = this.set("loadPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadPath: Self = this.set("loadPath", js.undefined)
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setScss(value: Boolean): Self = this.set("scss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScss: Self = this.set("scss", js.undefined)
    @scala.inline
    def setSourcemap(value: js.Any): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStopOnError(value: Boolean): Self = this.set("stopOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnError: Self = this.set("stopOnError", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setUnixNewlines(value: Boolean): Self = this.set("unixNewlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnixNewlines: Self = this.set("unixNewlines", js.undefined)
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setWatch(value: String): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

