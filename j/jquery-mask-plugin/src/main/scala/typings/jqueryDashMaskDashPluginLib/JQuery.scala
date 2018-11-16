package typings
package jqueryDashMaskDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
       * Gets the value of the field without the mask.
       * @returns Value without the mask.
       */
  def cleanVal(): java.lang.String = js.native
  /**
       * Applies the mask to the matching selector elements.
       * @param mask should be a string or a function.
       * @param options should be an options object.
       * @returns The element.
       */
  def mask(mask: java.lang.String): JQuery = js.native
  /**
       * Applies the mask to the matching selector elements.
       * @param mask should be a string or a function.
       * @param options should be an options object.
       * @returns The element.
       */
  def mask(mask: java.lang.String, options: jqueryDashMaskDashPluginLib.jQueryMaskNs.Options): JQuery = js.native
  /**
       * Applies the mask to the matching selector elements.
       * @param mask should be a string or a function.
       * @param options should be an options object.
       * @returns The element.
       */
  def mask(mask: js.Function1[/* value */ java.lang.String, java.lang.String]): JQuery = js.native
  /**
       * Applies the mask to the matching selector elements.
       * @param mask should be a string or a function.
       * @param options should be an options object.
       * @returns The element.
       */
  def mask(
    mask: js.Function1[/* value */ java.lang.String, java.lang.String],
    options: jqueryDashMaskDashPluginLib.jQueryMaskNs.Options
  ): JQuery = js.native
  /**
       * Gets masked value programmatically
       * @returns Masked value.
       */
  def masked(value: java.lang.String): java.lang.String = js.native
  /**
       * Seek and destroy.
       * @returns The element.
       */
  def unmask(): JQuery = js.native
}

