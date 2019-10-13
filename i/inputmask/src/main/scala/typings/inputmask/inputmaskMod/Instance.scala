package typings.inputmask.inputmaskMod

import typings.inputmask.inputmaskMod._Global_.HTMLElement
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Return the default (empty) mask value.
    */
  def getemptymask(): String = js.native
  /**
    * The metadata of the actual mask provided in the mask definitions can be obtained by calling getmetadata. If
    * only a mask is provided the mask definition will be returned by the getmetadata.
    */
  def getmetadata(): js.Any = js.native
  /**
    * Check whether the returned value is masked or not; currently only works reliably when using `jquery.val` fn
    * to retrieve the value
    */
  def hasMaskedValue(): Boolean = js.native
  /**
    * Verify whether the current value is complete or not.
    */
  def isComplete(): Boolean = js.native
  /**
    * Validate a given value against the mask.
    */
  def isValid(): Boolean = js.native
  /**
    * Create a mask for the input.
    *
    * @param el Element selector, a single element or an array of elements.
    */
  def mask(selectorOrElement: String): Instance = js.native
  def mask(selectorOrElement: HTMLElement): Instance = js.native
  def mask(selectorOrElement: ArrayLike[HTMLElement]): Instance = js.native
  /**
    * Get an option on an existing inputmask.
    *
    * @param key Name of option to retrieve.
    */
  def option(key: String): js.Any = js.native
  /**
    * Set an option on an existing inputmask. The option method is intented for adding extra options like
    * callbacks, etc at a later time to the mask.
    *
    * When extra options are set the mask is automatically reapplied, unless you pas true for the `noremask`
    * argument.
    */
  def option(opts: Options): Instance = js.native
  def option(opts: Options, noremask: Boolean): Instance = js.native
  /**
    * Remove the inputmask.
    */
  def remove(): Unit = js.native
  /**
    * The `setvalue` functionality is to set a value to the inputmask like you would do with `jQuery.val`, BUT it
    * will trigger the internal event used by the inputmask always, whatever the case. This is particular useful
    * when cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the
    * first event (`mouseenter`, `focus`, ...) the inputmask can detect if it where cloned and can reactivate the
    * masking. However when setting the value with jQuery.val there is none of the events triggered in that case.
    * The `setvalue` functionality does this for you.
    */
  def setValue(value: String): Unit = js.native
  /**
    * Gets the unmasked value.
    */
  def unmaskedvalue(): String = js.native
}

