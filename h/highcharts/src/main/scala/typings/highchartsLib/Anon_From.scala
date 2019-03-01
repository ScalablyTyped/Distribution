package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  /**
    * The smallest degree of rotation for a
    * @default 0
    * @since 6.0.0
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of possible orientations for a word, within the range of rotation.from and rotation.to.
    * @default 2
    * @since 6.0.0
    */
  var orientations: js.UndefOr[scala.Double] = js.undefined
  /**
    * The largest degree of rotation for a word.
    * @default 90
    * @since 6.0.0
    */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(
    from: scala.Int | scala.Double = null,
    orientations: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_From]
  }
}

