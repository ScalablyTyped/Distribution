package typings
package graphqlDashQueryDashComplexityLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  type Complexity = scala.Double | ComplexityResolver
  type ComplexityResolver = js.Function2[/* args */ js.Any, /* complexity */ scala.Double, scala.Double]
}
