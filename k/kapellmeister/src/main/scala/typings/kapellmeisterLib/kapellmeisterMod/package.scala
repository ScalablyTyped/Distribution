package typings
package kapellmeisterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kapellmeisterMod {
  type CustomInterpolator = js.Function1[/* t */ scala.Double, js.Any]
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type Interpolator = js.Function1[/* t */ scala.Double, scala.Unit]
  type NameSpaceType = js.Array[scala.Double] | js.Array[java.lang.String] | scala.Double | java.lang.String | CustomInterpolator
  type Tween = js.Function0[(js.Function1[/* t */ scala.Double, scala.Unit]) | scala.Null]
}
