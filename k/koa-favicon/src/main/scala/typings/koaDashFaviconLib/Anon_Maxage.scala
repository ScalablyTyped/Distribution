package typings
package koaDashFaviconLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maxage extends js.Object {
  /**
    * cache-control max-age directive in ms, defaulting to 1 day.
    */
  var maxage: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Maxage {
  @scala.inline
  def apply(maxage: scala.Int | scala.Double = null): Anon_Maxage = {
    val __obj = js.Dynamic.literal()
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Maxage]
  }
}

