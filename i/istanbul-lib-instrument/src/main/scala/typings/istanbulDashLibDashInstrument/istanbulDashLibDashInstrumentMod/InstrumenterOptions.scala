package typings.istanbulDashLibDashInstrument.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumenterOptions extends js.Object {
  var autoWrap: Boolean
  var compact: Boolean
  var coverageVariable: String
  var debug: Boolean
  var esModules: Boolean
  var preserveComments: Boolean
  var produceSourceMap: Boolean
  def sourceMapUrlCallback(filename: String, url: String): Unit
}

object InstrumenterOptions {
  @scala.inline
  def apply(
    autoWrap: Boolean,
    compact: Boolean,
    coverageVariable: String,
    debug: Boolean,
    esModules: Boolean,
    preserveComments: Boolean,
    produceSourceMap: Boolean,
    sourceMapUrlCallback: (String, String) => Unit
  ): InstrumenterOptions = {
    val __obj = js.Dynamic.literal(autoWrap = autoWrap, compact = compact, coverageVariable = coverageVariable, debug = debug, esModules = esModules, preserveComments = preserveComments, produceSourceMap = produceSourceMap, sourceMapUrlCallback = js.Any.fromFunction2(sourceMapUrlCallback))
  
    __obj.asInstanceOf[InstrumenterOptions]
  }
}

