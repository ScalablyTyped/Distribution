package typings
package homeworksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * @since 1.0.0
    * @summary dropdown method
    */
  def addHandler(target: JQuery): JQuery = js.native
  /**
    * jQuery homeworks chaining functions
    */
  /**
    * @since 1.0.0
    */
  def bind(eventType: java.lang.String, handler: js.Function1[/* repeated */ js.Any, scala.Unit]): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def checkbox(): JQuery = js.native
  def checkbox(options: homeworksLib.homeworksNs.CheckboxOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def converter(): JQuery = js.native
  def converter(options: homeworksLib.homeworksNs.ConverterOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def dropdown(): JQuery = js.native
  def dropdown(options: homeworksLib.homeworksNs.DropdownOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def input(): JQuery = js.native
  def input(options: homeworksLib.homeworksNs.InputOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def knock(): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def modal(): JQuery = js.native
  def modal(method: java.lang.String): JQuery = js.native
  def modal(method: java.lang.String, options: js.Any): JQuery = js.native
  def modal(options: js.Any): JQuery = js.native
  /**
    * jQuery homeworks events
    */
  /**
    * @since 1.0.44
    */
  def on(
    event: homeworksLib.homeworksNs.StepMoveEventType | homeworksLib.homeworksNs.TabMoveEventType,
    handler: jqueryLib.JQueryNs.EventHandlerBase[_, homeworksLib.homeworksNs.StepEvent | homeworksLib.homeworksNs.TabEvent]
  ): JQuery = js.native
  /**
    * @since 1.0.44
    */
  def on(
    event: homeworksLib.homeworksNs.RippleStartEventType,
    handler: jqueryLib.JQueryNs.EventHandlerBase[_, homeworksLib.homeworksNs.RippleEvent]
  ): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def ripple(): JQuery = js.native
  def ripple(options: js.Any): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def spinner(): JQuery = js.native
  def spinner(options: homeworksLib.homeworksNs.SpinnerOptions): JQuery = js.native
  /**
    * @since 1.0.0
    * @summary ripple method
    */
  def start(): JQuery = js.native
  def start(event: homeworksLib.homeworksNs.RippleEvent): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def step(): JQuery = js.native
  def step(method: java.lang.String): JQuery = js.native
  def step(options: homeworksLib.homeworksNs.StepOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def tab(): JQuery = js.native
  def tab(method: java.lang.String): JQuery = js.native
  def tab(options: homeworksLib.homeworksNs.TabOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def toggle(options: homeworksLib.homeworksNs.ToggleOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def upload(): JQuery = js.native
  def upload(options: homeworksLib.homeworksNs.UploadOptions): JQuery = js.native
}

