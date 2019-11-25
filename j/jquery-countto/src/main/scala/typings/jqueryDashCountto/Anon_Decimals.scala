package typings.jqueryDashCountto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  /**
    * The number of decimal places to show when using the default formatter
    */
  var decimals: Double
  /**
    * The number to start counting from
    */
  var from: Double
  /**
    * The number of milliseconds to wait between refreshing the counter
    */
  var refreshInterval: Double
  /**
    * The number of milliseconds it should take to finish counting
    */
  var speed: Double
  /**
    * The number to stop counting at
    */
  var to: Double
  /**
    * A handler that is used to format the current value before rendering to the DOM
    */
  def formatter(
    value: Double,
    options: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-countto.jquery-countto.Options */ js.Object
  ): String
  /**
    * A callback function that is triggered when counting finishes
    */
  def onComplete(value: Double): Unit
  /**
    * A callback function that is triggered for every iteration that the counter updates
    */
  def onUpdate(value: Double): Unit
}

object Anon_Decimals {
  @scala.inline
  def apply(
    decimals: Double,
    formatter: (Double, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-countto.jquery-countto.Options */ js.Object) => String,
    from: Double,
    onComplete: Double => Unit,
    onUpdate: Double => Unit,
    refreshInterval: Double,
    speed: Double,
    to: Double
  ): Anon_Decimals = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], formatter = js.Any.fromFunction2(formatter), from = from.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), onUpdate = js.Any.fromFunction1(onUpdate), refreshInterval = refreshInterval.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Decimals]
  }
}

