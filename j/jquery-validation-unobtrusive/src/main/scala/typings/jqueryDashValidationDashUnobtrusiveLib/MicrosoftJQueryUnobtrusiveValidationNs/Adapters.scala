package typings
package jqueryDashValidationDashUnobtrusiveLib.MicrosoftJQueryUnobtrusiveValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapters
  extends stdLib.Array[Adapter] {
  def add(adapterName: java.lang.String, fn: js.Function): Adapters = js.native
  def add(adapterName: java.lang.String, params: js.Array[java.lang.String], fn: js.Function): Adapters = js.native
  def addBool(adapterName: java.lang.String): Adapters = js.native
  def addBool(adapterName: java.lang.String, ruleName: java.lang.String): Adapters = js.native
  def addMethod(
    adapterName: java.lang.String,
    fn: js.Function3[/* value */ java.lang.String, /* element */ stdLib.Element, /* params */ js.Any, _]
  ): Adapters = js.native
  def addMinMax(
    adapterName: java.lang.String,
    minRuleName: java.lang.String,
    maxRuleName: java.lang.String,
    minMaxRuleName: java.lang.String
  ): Adapters = js.native
  def addMinMax(
    adapterName: java.lang.String,
    minRuleName: java.lang.String,
    maxRuleName: java.lang.String,
    minMaxRuleName: java.lang.String,
    minAttribute: java.lang.String
  ): Adapters = js.native
  def addMinMax(
    adapterName: java.lang.String,
    minRuleName: java.lang.String,
    maxRuleName: java.lang.String,
    minMaxRuleName: java.lang.String,
    minAttribute: java.lang.String,
    maxAttribute: java.lang.String
  ): Adapters = js.native
  def addSingleVal(adapterName: java.lang.String, attribute: java.lang.String, ruleName: java.lang.String): Adapters = js.native
  def addSingleVal(adapterName: java.lang.String, ruleName: java.lang.String): Adapters = js.native
}

