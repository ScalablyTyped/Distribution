package typings.jqueryTransit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transit //////////////////////////////////////////////////
trait JQueryTransitOptions extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var marginBottom: js.UndefOr[String] = js.undefined
  var marginLeft: js.UndefOr[String] = js.undefined
  var marginRight: js.UndefOr[String] = js.undefined
  var marginTop: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var perspective: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double | String] = js.undefined
  var rotate3d: js.UndefOr[String] = js.undefined
  var rotateX: js.UndefOr[String] = js.undefined
  var rotateY: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var skewX: js.UndefOr[String] = js.undefined
  var skewY: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[(js.Array[Double | String]) | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
}

object JQueryTransitOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    height: Double | String = null,
    margin: String = null,
    marginBottom: String = null,
    marginLeft: String = null,
    marginRight: String = null,
    marginTop: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    perspective: String = null,
    rotate: Double | String = null,
    rotate3d: String = null,
    rotateX: String = null,
    rotateY: String = null,
    scale: Double | js.Array[Double] = null,
    skewX: String = null,
    skewY: String = null,
    transform: String = null,
    transformOrigin: String = null,
    translate: (js.Array[Double | String]) | String = null,
    width: Double | String = null,
    x: Double | String = null,
    y: Double | String = null
  ): JQueryTransitOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotate3d != null) __obj.updateDynamic("rotate3d")(rotate3d.asInstanceOf[js.Any])
    if (rotateX != null) __obj.updateDynamic("rotateX")(rotateX.asInstanceOf[js.Any])
    if (rotateY != null) __obj.updateDynamic("rotateY")(rotateY.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryTransitOptions]
  }
}

