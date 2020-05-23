package typings.karmaMocha.mod

import org.scalablytyped.runtime.StringDictionary
import typings.karmaMocha.karmaMochaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaClientOptions
  extends /** any supported Mocha configuration options */
/* key */ StringDictionary[js.Any] {
  /** This will be exposed in a reporter as `result.mocha.{exportedValue}` */
  var export: js.UndefOr[js.Array[String]] = js.undefined
  /** You can set opts to equal true then plugin will load opts from default location 'test/mocha.opts' */
  var opts: js.UndefOr[`true` | String] = js.undefined
}

object MochaClientOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    export: js.Array[String] = null,
    opts: `true` | String = null
  ): MochaClientOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaClientOptions]
  }
}

