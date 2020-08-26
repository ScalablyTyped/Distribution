package typings.gulpRubySass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes the node-ruby-sass only options.
  * Attention: sourcemap option type differs from the same SassOption's type.
  * @interface Options
  * @extends SassOptions
  */
@js.native
trait Options extends SassOptions {
  var bundleExec: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  @JSName("sourcemap")
  var sourcemap_Options: js.UndefOr[Boolean] = js.native
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
    def setBundleExec(value: Boolean): Self = this.set("bundleExec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleExec: Self = this.set("bundleExec", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setSourcemap(value: Boolean): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

