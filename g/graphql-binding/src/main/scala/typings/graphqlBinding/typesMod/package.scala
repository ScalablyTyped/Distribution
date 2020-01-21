package typings.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FlattenInterpolation[P] = typings.graphqlBinding.typesMod.InterpolationValue | typings.graphqlBinding.typesMod.InterpolationFunction[P]
  type Interpolation[P] = typings.graphqlBinding.typesMod.FlattenInterpolation[P] | (js.Array[
    typings.graphqlBinding.typesMod.FlattenInterpolation[P] | js.Array[typings.graphqlBinding.typesMod.FlattenInterpolation[P]]
  ])
  type InterpolationValue = java.lang.String | scala.Double | scala.Boolean
  type Maybe[T] = js.UndefOr[scala.Null | T]
  type SimpleInterpolation = typings.graphqlBinding.typesMod.InterpolationValue | (js.Array[
    typings.graphqlBinding.typesMod.InterpolationValue | js.Array[typings.graphqlBinding.typesMod.InterpolationValue]
  ])
}
