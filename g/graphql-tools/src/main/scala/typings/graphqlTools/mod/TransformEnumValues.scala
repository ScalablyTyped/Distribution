package typings.graphqlTools.mod

import typings.graphqlToolsWrap.typesMod.EnumValueTransformer
import typings.graphqlToolsWrap.typesMod.LeafValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "TransformEnumValues")
@js.native
class TransformEnumValues protected ()
  extends typings.graphqlToolsWrap.mod.TransformEnumValues {
  def this(enumValueTransformer: EnumValueTransformer) = this()
  def this(enumValueTransformer: EnumValueTransformer, inputValueTransformer: LeafValueTransformer) = this()
  def this(
    enumValueTransformer: EnumValueTransformer,
    inputValueTransformer: js.UndefOr[scala.Nothing],
    outputValueTransformer: LeafValueTransformer
  ) = this()
  def this(
    enumValueTransformer: EnumValueTransformer,
    inputValueTransformer: LeafValueTransformer,
    outputValueTransformer: LeafValueTransformer
  ) = this()
}

