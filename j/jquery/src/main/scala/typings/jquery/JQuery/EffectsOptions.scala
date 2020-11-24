package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see \`{@link https://api.jquery.com/animate/#animate-properties-options }\`
  */
@js.native
trait EffectsOptions[TElement]
  extends PlainObject[js.Any] {
  
  /**
    * A function to be called when the animation on an element completes or stops without completing (its Promise object is either resolved or rejected).
    */
  var always: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * A function that is called once the animation on an element is complete.
    */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, Unit]] = js.native
  
  /**
    * A function to be called when the animation on an element completes (its Promise object is resolved).
    */
  var done: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Duration] = js.native
  
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * A function to be called when the animation on an element fails to complete (its Promise object is rejected).
    */
  var fail: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties.
    */
  var progress: js.UndefOr[
    js.ThisFunction3[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* progress */ Double, 
      /* remainingMs */ Double, 
      Unit
    ]
  ] = js.native
  
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[Boolean | String] = js.native
  
  /**
    * An object containing one or more of the CSS properties defined by the properties argument and their corresponding easing functions.
    */
  var specialEasing: js.UndefOr[PlainObject[String]] = js.native
  
  /**
    * A function to call when the animation on an element begins.
    */
  var start: js.UndefOr[js.ThisFunction1[/* this */ TElement, /* animation */ Animation[TElement], Unit]] = js.native
  
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit]
  ] = js.native
}
object EffectsOptions {
  
  @scala.inline
  def apply[TElement](): EffectsOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectsOptions[TElement]]
  }
  
  @scala.inline
  implicit class EffectsOptionsOps[Self <: EffectsOptions[_], TElement] (val x: Self with EffectsOptions[TElement]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlways(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self = this.set("always", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    
    @scala.inline
    def setComplete(value: js.ThisFunction0[/* this */ TElement, Unit]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDone(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFail(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setProgress(
      value: js.ThisFunction3[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* progress */ Double, 
          /* remainingMs */ Double, 
          Unit
        ]
    ): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setQueue(value: Boolean | String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setSpecialEasing(value: PlainObject[String]): Self = this.set("specialEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialEasing: Self = this.set("specialEasing", js.undefined)
    
    @scala.inline
    def setStart(value: js.ThisFunction1[/* this */ TElement, /* animation */ Animation[TElement], Unit]): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStep(value: js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit]): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
