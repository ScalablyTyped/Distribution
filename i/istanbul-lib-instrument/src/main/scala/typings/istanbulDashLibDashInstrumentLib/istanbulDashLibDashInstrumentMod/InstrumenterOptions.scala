package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumenterOptions extends js.Object {
  var autoWrap: scala.Boolean
  var compact: scala.Boolean
  var coverageVariable: java.lang.String
  var debug: scala.Boolean
  var esModules: scala.Boolean
  var preserveComments: scala.Boolean
  var produceSourceMap: scala.Boolean
  def sourceMapUrlCallback(filename: java.lang.String, url: java.lang.String): scala.Unit
}

object InstrumenterOptions {
  @scala.inline
  def apply(
    autoWrap: scala.Boolean,
    compact: scala.Boolean,
    coverageVariable: java.lang.String,
    debug: scala.Boolean,
    esModules: scala.Boolean,
    preserveComments: scala.Boolean,
    produceSourceMap: scala.Boolean,
    sourceMapUrlCallback: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): InstrumenterOptions = {
    val __obj = js.Dynamic.literal(autoWrap = autoWrap, compact = compact, coverageVariable = coverageVariable, debug = debug, esModules = esModules, preserveComments = preserveComments, produceSourceMap = produceSourceMap, sourceMapUrlCallback = sourceMapUrlCallback)
  
    __obj.asInstanceOf[InstrumenterOptions]
  }
}

