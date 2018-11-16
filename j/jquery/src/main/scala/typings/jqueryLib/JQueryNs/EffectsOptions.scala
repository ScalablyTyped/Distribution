package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @see \`{@link https://api.jquery.com/animate/#animate-properties-options }\`
     */

trait EffectsOptions[TElement]
  extends PlainObject[js.Any] {
  /**
           * A function to be called when the animation on an element completes or stops without completing (its Promise object is either resolved or rejected).
           */
  var always: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * A function that is called once the animation on an element is complete.
           */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, scala.Unit]] = js.undefined
  /**
           * A function to be called when the animation on an element completes (its Promise object is resolved).
           */
  var done: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * A string or number determining how long the animation will run.
           */
  var duration: js.UndefOr[Duration] = js.undefined
  /**
           * A string indicating which easing function to use for the transition.
           */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function to be called when the animation on an element fails to complete (its Promise object is rejected).
           */
  var fail: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties.
           */
  var progress: js.UndefOr[
    js.ThisFunction3[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* progress */ scala.Double, 
      /* remainingMs */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
           */
  var queue: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
           * An object containing one or more of the CSS properties defined by the properties argument and their corresponding easing functions.
           */
  var specialEasing: js.UndefOr[PlainObject[java.lang.String]] = js.undefined
  /**
           * A function to call when the animation on an element begins.
           */
  var start: js.UndefOr[
    js.ThisFunction1[/* this */ TElement, /* animation */ Animation[TElement], scala.Unit]
  ] = js.undefined
  /**
           * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
           */
  var step: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* now */ scala.Double, /* tween */ Tween[TElement], scala.Unit]
  ] = js.undefined
}

