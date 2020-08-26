package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsWrap.transformInputObjectFieldsMod.default
import typings.graphqlToolsWrap.typesMod.InputFieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.InputFieldTransformer
import typings.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "TransformInputObjectFields")
@js.native
class TransformInputObjectFields protected () extends default {
  def this(inputFieldTransformer: InputFieldTransformer) = this()
  def this(inputFieldTransformer: InputFieldTransformer, inputFieldNodeTransformer: InputFieldNodeTransformer) = this()
  def this(
    inputFieldTransformer: InputFieldTransformer,
    inputFieldNodeTransformer: js.UndefOr[scala.Nothing],
    inputObjectNodeTransformer: InputObjectNodeTransformer
  ) = this()
  def this(
    inputFieldTransformer: InputFieldTransformer,
    inputFieldNodeTransformer: InputFieldNodeTransformer,
    inputObjectNodeTransformer: InputObjectNodeTransformer
  ) = this()
}

