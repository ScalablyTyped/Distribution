package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingOptions extends js.Object {
  var copy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, scala.Unit]] = js.undefined
  var deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var mappedProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, scala.Unit]] = js.undefined
}

