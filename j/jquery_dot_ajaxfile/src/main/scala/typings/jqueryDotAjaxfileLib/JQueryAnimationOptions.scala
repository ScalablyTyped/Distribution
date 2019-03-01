package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryAnimationOptions extends js.Object {
  /**
    * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
    */
  var always: js.UndefOr[
    js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _]
  ] = js.undefined
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.Function] = js.undefined
  /**
    * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
    */
  var done: js.UndefOr[
    js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _]
  ] = js.undefined
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[js.Any] = js.undefined
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
    */
  var fail: js.UndefOr[
    js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _]
  ] = js.undefined
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
    */
  var progress: js.UndefOr[
    js.Function3[
      /* animation */ JQueryPromise[_], 
      /* progress */ scala.Double, 
      /* remainingMs */ scala.Double, 
      _
    ]
  ] = js.undefined
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[js.Any] = js.undefined
  /**
    * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
    */
  var specialEasing: js.UndefOr[Object] = js.undefined
  /**
    * A function to call when the animation begins. (version added: 1.8)
    */
  var start: js.UndefOr[js.Function1[/* animation */ JQueryPromise[_], _]] = js.undefined
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[js.Function2[/* now */ scala.Double, /* tween */ js.Any, _]] = js.undefined
}

object JQueryAnimationOptions {
  @scala.inline
  def apply(
    always: js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _] = null,
    complete: js.Function = null,
    done: js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _] = null,
    duration: js.Any = null,
    easing: java.lang.String = null,
    fail: js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ scala.Boolean, _] = null,
    progress: js.Function3[
      /* animation */ JQueryPromise[_], 
      /* progress */ scala.Double, 
      /* remainingMs */ scala.Double, 
      _
    ] = null,
    queue: js.Any = null,
    specialEasing: Object = null,
    start: js.Function1[/* animation */ JQueryPromise[_], _] = null,
    step: js.Function2[/* now */ scala.Double, /* tween */ js.Any, _] = null
  ): JQueryAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (always != null) __obj.updateDynamic("always")(always)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (done != null) __obj.updateDynamic("done")(done)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (queue != null) __obj.updateDynamic("queue")(queue)
    if (specialEasing != null) __obj.updateDynamic("specialEasing")(specialEasing)
    if (start != null) __obj.updateDynamic("start")(start)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[JQueryAnimationOptions]
  }
}

