package typings
package jqueryDotCycle2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("cycle")
  var cycle_Original: jqueryDotCycle2Lib.JQueryCycle2Ns.Cycle2 = js.native
  def cycle(): JQuery = js.native
  def cycle(methodNameDontCallMe: java.lang.String, arg1DontCallMe: js.Any, arg2DontCallMe: js.Any): JQuery = js.native
  def cycle(options: jqueryDotCycle2Lib.JQueryCycle2Ns.Options): JQuery = js.native
  @JSName("cycle")
  def cycle_add(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.add, newSlide: js.Any): JQuery = js.native
   // string or JQuery
  @JSName("cycle")
  def cycle_destroy(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.destroy): JQuery = js.native
  @JSName("cycle")
  def cycle_goto(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.goto, index: scala.Double): JQuery = js.native
  @JSName("cycle")
  def cycle_next(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.next): JQuery = js.native
  @JSName("cycle")
  def cycle_pause(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.pause): JQuery = js.native
  @JSName("cycle")
  def cycle_prev(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.prev): JQuery = js.native
  @JSName("cycle")
  def cycle_reinit(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.reinit): JQuery = js.native
  @JSName("cycle")
  def cycle_remove(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.remove, index: scala.Double): JQuery = js.native
  @JSName("cycle")
  def cycle_resume(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.resume): JQuery = js.native
  @JSName("cycle")
  def cycle_stop(methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.stop): JQuery = js.native
  @JSName("on")
  def on_cycleafter(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-after`,
    callback: js.Function5[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      /* outgoingSlideEl */ stdLib.Element, 
      /* incomingSlideEl */ stdLib.Element, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclebefore(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-before`,
    callback: js.Function5[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      /* outgoingSlideEl */ stdLib.Element, 
      /* incomingSlideEl */ stdLib.Element, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclebootstrap(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-bootstrap`,
    callback: js.Function3[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      /* API */ jqueryDotCycle2Lib.JQueryCycle2Ns.API, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycledestroyed(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-destroyed`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclefinished(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-finished`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleinitialized(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-initialized`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclenext(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-next`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepageractivated(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-pager-activated`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepaused(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-paused`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepostinitialize(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-post-initialize`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepreinitialize(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-pre-initialize`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleprev(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-prev`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleresumed(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-resumed`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleslideadded(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-slide-added`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* jQueryWrappedSlideEl */ this.type, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleslideremoved(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-slide-removed`,
    callback: js.Function3[
      /* event */ jqueryLib.JQueryEventObject, 
      /* indexOfSlideRemoved */ scala.Double, 
      /* removedSlideEl */ stdLib.Element, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclestopped(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-stopped`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycletransitionstopped(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-transition-stopped`,
    callback: js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleupdateview(
    methodName: jqueryDotCycle2Lib.jqueryDotCycle2LibStrings.`cycle-update-view`,
    callback: js.Function4[
      /* event */ jqueryLib.JQueryEventObject, 
      /* optionHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      /* slideOptionsHash */ jqueryDotCycle2Lib.JQueryCycle2Ns.OptionsWithState, 
      /* currentSlideEl */ stdLib.Element, 
      scala.Unit
    ]
  ): JQuery = js.native
}

