package typings.graphqlDashBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCodegenTypesMod {
  type FlattenInterpolation[P] = InterpolationValue | InterpolationFunction[P]
  type Interpolation[P] = FlattenInterpolation[P] | (js.Array[FlattenInterpolation[P] | js.Array[FlattenInterpolation[P]]])
  type InterpolationValue = String | Double | Boolean
  type Maybe[T] = js.UndefOr[Null | T]
  type SimpleInterpolation = InterpolationValue | (js.Array[InterpolationValue | js.Array[InterpolationValue]])
}
