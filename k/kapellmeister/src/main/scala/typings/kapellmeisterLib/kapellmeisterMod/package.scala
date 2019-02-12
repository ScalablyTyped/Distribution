package typings
package kapellmeisterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kapellmeisterMod {
  type CustomInterpolator = js.Function1[/* t */ scala.Double, js.Any]
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type Interpolator = js.Function1[/* t */ scala.Double, scala.Unit]
}
