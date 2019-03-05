package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- gsapLib.gsapNs.Timeline because Already inherited */ @JSGlobal("gsap.TimelineLite")
@js.native
class TimelineLite () extends SimpleTimeline {
  def this(vars: js.Object) = this()
  /** Adds a label to the timeline, making it easy to mark important positions/times. */
  def addLabel(label: java.lang.String, position: js.Any): TimelineLite = js.native
  /** Inserts a special callback that pauses playback of the timeline at a particular time or label. */
  def addPause(): TimelineLite = js.native
  def addPause(position: js.Any): TimelineLite = js.native
  def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): TimelineLite = js.native
  def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, scala.Unit], params: js.Array[_]): TimelineLite = js.native
  def addPause(
    position: js.Any,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    params: js.Array[_],
    scope: js.Any
  ): TimelineLite = js.native
  /**
    * Adds a callback to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.delayedCall(...) ) but with less code.
    */
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit], params: js.Array[_]): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit], params: js.Array[_], scope: js.Any): TimelineLite = js.native
  def call(
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    params: js.Array[_],
    scope: js.Any,
    position: js.Any
  ): TimelineLite = js.native
  /** Empties the timeline of all tweens, timelines, and callbacks (and optionally labels too). */
  def clear(): TimelineLite = js.native
  def clear(labels: scala.Boolean): TimelineLite = js.native
  /** Returns the time at which the animation will finish according to the parent timeline's local time. */
  def endTime(): scala.Double = js.native
  def endTime(includeRepeats: scala.Boolean): scala.Double = js.native
  /**
    * Adds a TweenLite.from() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.from(...) ) but with less code.
    */
  def from(target: js.Object, duration: scala.Double, vars: js.Object): TimelineLite = js.native
  def from(target: js.Object, duration: scala.Double, vars: js.Object, position: js.Any): TimelineLite = js.native
  /** Adds a TweenLite.fromTo() tween to the end of the timeline - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.fromTo(...) ) but with less code. */
  def fromTo(target: js.Object, duration: scala.Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
  def fromTo(
    target: js.Object,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    position: js.Any
  ): TimelineLite = js.native
  /** Returns an array containing all the tweens and/or timelines nested in this timeline. */
  def getChildren(): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: scala.Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: scala.Boolean, tweens: scala.Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: scala.Boolean, tweens: scala.Boolean, timelines: scala.Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(
    nested: scala.Boolean,
    tweens: scala.Boolean,
    timelines: scala.Boolean,
    ignoreBeforeTime: scala.Double
  ): js.Array[Tween | Timeline] = js.native
  /** Returns the time associated with a particular label. */
  def getLabelTime(label: java.lang.String): scala.Double = js.native
  /** Returns the tweens of a particular object that are inside this timeline. */
  def getTweensOf(target: js.Object): js.Array[Tween] = js.native
  def getTweensOf(target: js.Object, nested: scala.Boolean): js.Array[Tween] = js.native
  /** Returns the most recently added child tween/timeline/callback regardless of its position in the timeline. */
  def recent(): Animation = js.native
  /** Removes a tween, timeline, callback, or label (or array of them) from the timeline. */
  def remove(value: js.Any): TimelineLite = js.native
  /** Removes a label from the timeline and returns the time of that label. */
  def removeLabel(label: java.lang.String): js.Any = js.native
  /** Jumps to a specific time (or label) without affecting whether or not the instance is paused or reversed. */
  def seek(position: java.lang.String): TimelineLite = js.native
  def seek(position: java.lang.String, supressEvents: scala.Boolean): TimelineLite = js.native
  def seek(position: scala.Double): TimelineLite = js.native
  def seek(position: scala.Double, supressEvents: scala.Boolean): TimelineLite = js.native
  /**
    * Adds a zero-duration tween to the end of the timeline (or elsewhere using the "position" parameter) that sets values immediately (when the virtual playhead reaches that
    * position on the timeline) - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.to(target, 0, {...}) ) but with less code.
    */
  def set(target: js.Object, vars: js.Object): TimelineLite = js.native
  def set(target: js.Object, vars: js.Object, position: js.Any): TimelineLite = js.native
  /** Shifts the startTime of the timeline's children by a certain amount and optionally adjusts labels too. */
  def shiftChildren(amount: scala.Double): TimelineLite = js.native
  def shiftChildren(amount: scala.Double, adjustLabels: scala.Boolean): TimelineLite = js.native
  def shiftChildren(amount: scala.Double, adjustLabels: scala.Boolean, ignoreBeforeTime: scala.Double): TimelineLite = js.native
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time,
    * creating an evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFrom(targets: js.Any, duration: scala.Double, vars: js.Object): TimelineLite = js.native
  def staggerFrom(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double): TimelineLite = js.native
  def staggerFrom(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double, position: js.Any): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  /**
    * Tweens an array of targets from and to a common set of values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerFromTo(targets: js.Any, duration: scala.Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    position: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerTo(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double): TimelineLite = js.native
  def staggerTo(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double, position: js.Any): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  /**
    * Adds a TweenLite.to() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.to(...) ) but with less code.
    */
  def to(target: js.Object, duration: scala.Double, vars: js.Object): TimelineLite = js.native
  def to(target: js.Object, duration: scala.Double, vars: js.Object, position: js.Any): TimelineLite = js.native
  /** If true, the timeline's timing mode is frames-based instead of seconds. */
  def useFrames(): scala.Boolean = js.native
  def usesFrames(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("gsap.TimelineLite")
@js.native
object TimelineLite extends js.Object {
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  def exportRoot(): gsapLib.gsapNs.TimelineLite = js.native
  def exportRoot(vars: js.Object): gsapLib.gsapNs.TimelineLite = js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: scala.Boolean): gsapLib.gsapNs.TimelineLite = js.native
}

