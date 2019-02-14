package typings
package inputmaskLib.inputmaskMod.Global

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
  def inputmask(): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Creates a new Inputmask instance.
    *
    * @param maskOrAlias A mask pattern or a reference to a predefined alias.
    * @param opts Mask options.
    */
  def inputmask(maskOrAlias: java.lang.String): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
  def inputmask(maskOrAlias: java.lang.String, opts: inputmaskLib.inputmaskMod.InputmaskNs.Options): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
  def inputmask(opts: inputmaskLib.inputmaskMod.InputmaskNs.Options): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
  /**
    * Return the default (empty) mask value.
    */
  @JSName("inputmask")
  def inputmask_getemptymask(method: inputmaskLib.inputmaskLibStrings.getemptymask): java.lang.String = js.native
   // tslint:disable-line:unified-signatures
  /**
    * The metadata of the actual mask provided in the mask definitions can be obtained by calling getmetadata. If
    * only a mask is provided the mask definition will be returned by the getmetadata.
    */
  @JSName("inputmask")
  def inputmask_getmetadata(method: inputmaskLib.inputmaskLibStrings.getmetadata): js.Any = js.native
  /**
    * Check whether the returned value is masked or not; currently only works reliably when using `jquery.val` fn
    * to retrieve the value
    */
  @JSName("inputmask")
  def inputmask_hasMaskedValue(method: inputmaskLib.inputmaskLibStrings.hasMaskedValue): scala.Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Verify whether the current value is complete or not.
    */
  @JSName("inputmask")
  def inputmask_isComplete(method: inputmaskLib.inputmaskLibStrings.isComplete): scala.Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Validate a given value against the mask.
    */
  @JSName("inputmask")
  def inputmask_isValid(method: inputmaskLib.inputmaskLibStrings.isValid): scala.Boolean = js.native
   // tslint:disable-line:unified-signatures
  /**
    * Get an option on an existing inputmask.
    *
    * @param key Name of option to retrieve.
    */
  @JSName("inputmask")
  def inputmask_option(method: inputmaskLib.inputmaskLibStrings.option, key: java.lang.String): js.Any = js.native
  /**
    * Set an option on an existing inputmask. The option method is intented for adding extra options like
    * callbacks, etc at a later time to the mask.
    *
    * When extra options are set the mask is automatically reapplied, unless you pas true for the `noremask`
    * argument.
    */
  @JSName("inputmask")
  def inputmask_option(
    method: inputmaskLib.inputmaskLibStrings.option,
    opts: inputmaskLib.inputmaskMod.InputmaskNs.Options
  ): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
  @JSName("inputmask")
  def inputmask_option(
    method: inputmaskLib.inputmaskLibStrings.option,
    opts: inputmaskLib.inputmaskMod.InputmaskNs.Options,
    noremask: scala.Boolean
  ): inputmaskLib.inputmaskMod.InputmaskNs.Instance = js.native
  /**
    * Remove the inputmask.
    */
  @JSName("inputmask")
  def inputmask_remove(method: inputmaskLib.inputmaskLibStrings.remove): scala.Unit = js.native
  /**
    * The `setvalue` functionality is to set a value to the inputmask like you would do with `jQuery.val`, BUT it
    * will trigger the internal event used by the inputmask always, whatever the case. This is particular useful
    * when cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the
    * first event (`mouseenter`, `focus`, ...) the inputmask can detect if it where cloned and can reactivate the
    * masking. However when setting the value with jQuery.val there is none of the events triggered in that case.
    * The `setvalue` functionality does this for you.
    */
  @JSName("inputmask")
  def inputmask_setValue(method: inputmaskLib.inputmaskLibStrings.setValue, value: java.lang.String): scala.Unit = js.native
  /**
    * Gets the unmasked value.
    */
  @JSName("inputmask")
  def inputmask_unmaskedvalue(method: inputmaskLib.inputmaskLibStrings.unmaskedvalue): java.lang.String = js.native
}

