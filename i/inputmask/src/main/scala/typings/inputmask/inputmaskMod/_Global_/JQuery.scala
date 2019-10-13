package typings.inputmask.inputmaskMod._Global_

import typings.inputmask.inputmaskMod.Instance
import typings.inputmask.inputmaskMod.Options
import typings.inputmask.inputmaskStrings.getemptymask
import typings.inputmask.inputmaskStrings.getmetadata
import typings.inputmask.inputmaskStrings.hasMaskedValue
import typings.inputmask.inputmaskStrings.isComplete
import typings.inputmask.inputmaskStrings.isValid
import typings.inputmask.inputmaskStrings.option
import typings.inputmask.inputmaskStrings.remove
import typings.inputmask.inputmaskStrings.setValue
import typings.inputmask.inputmaskStrings.unmaskedvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Creates a new Inputmask instance.
    *
    * @param opts Mask options.
    */
  def inputmask(): Instance = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Creates a new Inputmask instance.
    *
    * @param maskOrAlias A mask pattern or a reference to a predefined alias.
    * @param opts Mask options.
    */
  def inputmask(maskOrAlias: String): Instance = js.native
  def inputmask(maskOrAlias: String, opts: Options): Instance = js.native
  def inputmask(opts: Options): Instance = js.native
  /**
    * Return the default (empty) mask value.
    */
  @JSName("inputmask")
  def inputmask_getemptymask(method: getemptymask): String = js.native
   // tslint:disable-line:unified-signatures
  /**
    * The metadata of the actual mask provided in the mask definitions can be obtained by calling getmetadata. If
    * only a mask is provided the mask definition will be returned by the getmetadata.
    */
  @JSName("inputmask")
  def inputmask_getmetadata(method: getmetadata): js.Any = js.native
  /**
    * Check whether the returned value is masked or not; currently only works reliably when using `jquery.val` fn
    * to retrieve the value
    */
  @JSName("inputmask")
  def inputmask_hasMaskedValue(method: hasMaskedValue): Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Verify whether the current value is complete or not.
    */
  @JSName("inputmask")
  def inputmask_isComplete(method: isComplete): Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Validate a given value against the mask.
    */
  @JSName("inputmask")
  def inputmask_isValid(method: isValid): Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Get an option on an existing inputmask.
    *
    * @param key Name of option to retrieve.
    */
  @JSName("inputmask")
  def inputmask_option(method: option, key: String): js.Any = js.native
  /**
    * Set an option on an existing inputmask. The option method is intented for adding extra options like
    * callbacks, etc at a later time to the mask.
    *
    * When extra options are set the mask is automatically reapplied, unless you pas true for the `noremask`
    * argument.
    */
  @JSName("inputmask")
  def inputmask_option(method: option, opts: Options): Instance = js.native
  @JSName("inputmask")
  def inputmask_option(method: option, opts: Options, noremask: Boolean): Instance = js.native
  /**
    * Remove the inputmask.
    */
  @JSName("inputmask")
  def inputmask_remove(method: remove): Unit = js.native
  /**
    * The `setvalue` functionality is to set a value to the inputmask like you would do with `jQuery.val`, BUT it
    * will trigger the internal event used by the inputmask always, whatever the case. This is particular useful
    * when cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the
    * first event (`mouseenter`, `focus`, ...) the inputmask can detect if it where cloned and can reactivate the
    * masking. However when setting the value with jQuery.val there is none of the events triggered in that case.
    * The `setvalue` functionality does this for you.
    */
  @JSName("inputmask")
  def inputmask_setValue(method: setValue, value: String): Unit = js.native
  /**
    * Gets the unmasked value.
    */
  @JSName("inputmask")
  def inputmask_unmaskedvalue(method: unmaskedvalue): String = js.native
}

