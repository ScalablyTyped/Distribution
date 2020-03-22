package typings.istanbulLibInstrument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.InstrumenterOptions> */
trait PartialInstrumenterOption extends js.Object {
  var autoWrap: js.UndefOr[Boolean] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var coverageVariable: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var esModules: js.UndefOr[Boolean] = js.undefined
  var preserveComments: js.UndefOr[Boolean] = js.undefined
  var produceSourceMap: js.UndefOr[Boolean] = js.undefined
  var sourceMapUrlCallback: js.UndefOr[js.Function2[/* filename */ String, /* url */ String, Unit]] = js.undefined
}

object PartialInstrumenterOption {
  @scala.inline
  def apply(
    autoWrap: js.UndefOr[Boolean] = js.undefined,
    compact: js.UndefOr[Boolean] = js.undefined,
    coverageVariable: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    esModules: js.UndefOr[Boolean] = js.undefined,
    preserveComments: js.UndefOr[Boolean] = js.undefined,
    produceSourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceMapUrlCallback: (/* filename */ String, /* url */ String) => Unit = null
  ): PartialInstrumenterOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWrap)) __obj.updateDynamic("autoWrap")(autoWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(esModules)) __obj.updateDynamic("esModules")(esModules.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments.asInstanceOf[js.Any])
    if (!js.isUndefined(produceSourceMap)) __obj.updateDynamic("produceSourceMap")(produceSourceMap.asInstanceOf[js.Any])
    if (sourceMapUrlCallback != null) __obj.updateDynamic("sourceMapUrlCallback")(js.Any.fromFunction2(sourceMapUrlCallback))
    __obj.asInstanceOf[PartialInstrumenterOption]
  }
}

