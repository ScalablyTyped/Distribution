package typings
package jqueryDashCounttoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  /**
    * The number of decimal places to show when using the default formatter
    */
  var decimals: scala.Double
  /**
    * The number to start counting from
    */
  var from: scala.Double
  /**
    * The number of milliseconds to wait between refreshing the counter
    */
  var refreshInterval: scala.Double
  /**
    * The number of milliseconds it should take to finish counting
    */
  var speed: scala.Double
  /**
    * The number to stop counting at
    */
  var to: scala.Double
  /**
    * A handler that is used to format the current value before rendering to the DOM
    */
  def formatter(
    value: scala.Double,
    options: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-countto.jquery-countto.Options */ js.Object
  ): java.lang.String
  /**
    * A callback function that is triggered when counting finishes
    */
  def onComplete(value: scala.Double): scala.Unit
  /**
    * A callback function that is triggered for every iteration that the counter updates
    */
  def onUpdate(value: scala.Double): scala.Unit
}

object Anon_Decimals {
  @scala.inline
  def apply(
    decimals: scala.Double,
    formatter: js.Function2[
      scala.Double, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-countto.jquery-countto.Options */ js.Object, 
      java.lang.String
    ],
    from: scala.Double,
    onComplete: js.Function1[scala.Double, scala.Unit],
    onUpdate: js.Function1[scala.Double, scala.Unit],
    refreshInterval: scala.Double,
    speed: scala.Double,
    to: scala.Double
  ): Anon_Decimals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decimals")(decimals)
    __obj.updateDynamic("formatter")(formatter)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("onComplete")(onComplete)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.updateDynamic("refreshInterval")(refreshInterval)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_Decimals]
  }
}

