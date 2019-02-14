package typings
package inputmaskLib.inputmaskMod.InputmaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends org.scalablytyped.runtime.Instantiable2[/* maskOrAlias */ java.lang.String, /* opts */ Options, Instance]
     with /**
  * Creates a new Inputmask instance.
  *
  * @param opts Mask options.
  */
org.scalablytyped.runtime.Instantiable0[Instance]
     with /**
  * Creates a new Inputmask instance.
  *
  * @param maskOrAlias A mask pattern or a reference to a predefined alias.
  * @param opts Mask options.
  */
org.scalablytyped.runtime.Instantiable1[(/* opts */ Options) | (/* maskOrAlias */ java.lang.String), Instance] {
  /**
    * Creates a new Inputmask instance.
    *
    * @param opts Mask options.
    */
  def apply(): Instance = js.native
  /**
    * Creates a new Inputmask instance.
    *
    * @param maskOrAlias A mask pattern or a reference to a predefined alias.
    * @param opts Mask options.
    */
  def apply(maskOrAlias: java.lang.String): Instance = js.native
  def apply(maskOrAlias: java.lang.String, opts: Options): Instance = js.native
  def apply(opts: Options): Instance = js.native
  /**
    * Extends the set of available mask aliases.
    */
  def extendAliases(aliases: org.scalablytyped.runtime.StringDictionary[Options]): scala.Unit = js.native
  /**
    * Extends the default inputmask options.
    */
  def extendDefaults(opts: Options): scala.Unit = js.native
  /**
    * Add new definitions to this inputmask.
    */
  def extendDefinitions(definitions: org.scalablytyped.runtime.StringDictionary[Definition]): scala.Unit = js.native
  /**
    * Instead of masking an input element it is also possible to use the inputmask for formatting given values.
    * Think of formatting values to show in jqGrid or on other elements then inputs.
    *
    * @param value Value to format.
    * @param opts Mask options.
    */
  def format(value: java.lang.String, opts: Options): java.lang.String = js.native
  /**
    * Validate a given value against the mask.
    *
    * @param value Value to validate.
    * @param opts Mask options.
    */
  def isValid(value: java.lang.String, opts: Options): scala.Boolean = js.native
  def remove(selectorOrElement: inputmaskLib.inputmaskMod.Global.HTMLElement): scala.Unit = js.native
  /**
    * Remove the inputmask.
    */
  def remove(selectorOrElement: java.lang.String): scala.Unit = js.native
  def remove(selectorOrElement: stdLib.ArrayLike[inputmaskLib.inputmaskMod.Global.HTMLElement]): scala.Unit = js.native
  def setValue(selectorOrElement: inputmaskLib.inputmaskMod.Global.HTMLElement, value: java.lang.String): scala.Unit = js.native
  /**
    * The setvalue functionality is to set a value to the inputmask like you would do with jQuery.val, BUT it will
    * trigger the internal event used by the inputmask always, whatever the case. This is particular usefull when
    * cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the first
    * event (mouseenter, focus, ...) the inputmask can detect if it where cloned and can reactivate the masking.
    * However when setting the value with jQuery.val there is none of the events triggered in that case. The
    * setvalue functionality does this for you.
    */
  def setValue(selectorOrElement: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setValue(
    selectorOrElement: stdLib.ArrayLike[inputmaskLib.inputmaskMod.Global.HTMLElement],
    value: java.lang.String
  ): scala.Unit = js.native
  /**
    * Unmask a given value against the mask.
    *
    * @param value Value to be unmasked.
    * @param opts Mask options.
    */
  def unmask(value: java.lang.String, opts: Options): java.lang.String = js.native
}

