package typings.graphqlBinding

import typings.graphqlBinding.typesMod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/utils/flatten", JSImport.Namespace)
@js.native
object flattenMod extends js.Object {
  def default[T](chunks: js.Array[Interpolation[_]], executionContext: T): js.Array[Interpolation[T]] = js.native
}

