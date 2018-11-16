package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HystrixProperties extends js.Object {
  var `hystrix.circuit.errorThresholdPercentage`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.sleepWindowInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.volumeThreshold`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.volumeThreshold.forceOverride`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.circuit.volumeThreshold.override`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.execution.timeoutInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.force.circuit.closed`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.force.circuit.open`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.metrics.percentile.window.bucketsNumber`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.percentile.window.timeInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.statistical.window.bucketsNumber`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.statistical.window.timeInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.promise.implementation`: js.UndefOr[stdLib.PromiseConstructorLike] = js.undefined
  var `hystrix.request.volume.rejectionThreshold`: js.UndefOr[scala.Double] = js.undefined
}

