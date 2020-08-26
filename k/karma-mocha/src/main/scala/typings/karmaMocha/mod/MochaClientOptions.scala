package typings.karmaMocha.mod

import org.scalablytyped.runtime.StringDictionary
import typings.karmaMocha.karmaMochaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaClientOptions
  extends /** any supported Mocha configuration options */
/* key */ StringDictionary[js.Any] {
  /** This will be exposed in a reporter as `result.mocha.{exportedValue}` */
  var export: js.UndefOr[js.Array[String]] = js.native
  /** You can set opts to equal true then plugin will load opts from default location 'test/mocha.opts' */
  var opts: js.UndefOr[`true` | String] = js.native
}

object MochaClientOptions {
  @scala.inline
  def apply(): MochaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaClientOptions]
  }
  @scala.inline
  implicit class MochaClientOptionsOps[Self <: MochaClientOptions] (val x: Self) extends AnyVal {
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
    def setExportVarargs(value: String*): Self = this.set("export", js.Array(value :_*))
    @scala.inline
    def setExport(value: js.Array[String]): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    @scala.inline
    def setOpts(value: `true` | String): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
  
}

