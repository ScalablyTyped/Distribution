package typings.inputmask.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.inputmask.mod._Global_.HTMLElement
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends /**
  * Creates a new Inputmask instance.
  *
  * @param maskOrAlias A mask pattern or a reference to a predefined alias.
  * @param opts Mask options.
  */
Instantiable1[(/* opts */ Options) | (/* maskOrAlias */ String), Instance]
     with /**
  * Creates a new Inputmask instance.
  *
  * @param opts Mask options.
  */
Instantiable0[Instance]
     with Instantiable2[/* maskOrAlias */ String, /* opts */ Options, Instance] {
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
  def apply(maskOrAlias: String): Instance = js.native
  def apply(maskOrAlias: String, opts: Options): Instance = js.native
  def apply(opts: Options): Instance = js.native
  /**
    * Extends the set of available mask aliases.
    */
  def extendAliases(aliases: StringDictionary[Options]): Unit = js.native
  /**
    * Extends the default inputmask options.
    */
  def extendDefaults(opts: Options): Unit = js.native
  /**
    * Extends the set of available definitions.
    */
  def extendDefinitions(definitions: StringDictionary[Definition]): Unit = js.native
  /**
    * Instead of masking an input element it is also possible to use the inputmask for formatting given values.
    * Think of formatting values to show in jqGrid or on other elements then inputs.
    *
    * @param value Value to format.
    * @param opts Mask options.
    */
  def format(value: String, opts: Options): String = js.native
  /**
    * Validate a given value against the mask.
    *
    * @param value Value to validate.
    * @param opts Mask options.
    */
  def isValid(value: String, opts: Options): Boolean = js.native
  /**
    * Remove the inputmask.
    */
  def remove(selectorOrElement: String): Unit = js.native
  def remove(selectorOrElement: HTMLElement): Unit = js.native
  def remove(selectorOrElement: ArrayLike[HTMLElement]): Unit = js.native
  /**
    * The setvalue functionality is to set a value to the inputmask like you would do with jQuery.val, BUT it will
    * trigger the internal event used by the inputmask always, whatever the case. This is particular usefull when
    * cloning an inputmask with jQuery.clone. Cloning an inputmask is not a fully functional clone. On the first
    * event (mouseenter, focus, ...) the inputmask can detect if it where cloned and can reactivate the masking.
    * However when setting the value with jQuery.val there is none of the events triggered in that case. The
    * setvalue functionality does this for you.
    */
  def setValue(selectorOrElement: String, value: String): Unit = js.native
  def setValue(selectorOrElement: HTMLElement, value: String): Unit = js.native
  def setValue(selectorOrElement: ArrayLike[HTMLElement], value: String): Unit = js.native
  /**
    * Unmask a given value against the mask.
    *
    * @param value Value to be unmasked.
    * @param opts Mask options.
    */
  def unmask(value: String, opts: Options): String = js.native
}

