package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typings.graphqlToolsWrap.mapFieldsMod.default
import typings.graphqlToolsWrap.typesMod.ErrorsTransformer
import typings.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "MapFields")
@js.native
class MapFields protected () extends default {
  def this(fieldNodeTransformerMap: FieldNodeMappers) = this()
  def this(fieldNodeTransformerMap: FieldNodeMappers, objectValueTransformerMap: ObjectValueTransformerMap) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: js.UndefOr[scala.Nothing],
    errorsTransformer: ErrorsTransformer
  ) = this()
  def this(
    fieldNodeTransformerMap: FieldNodeMappers,
    objectValueTransformerMap: ObjectValueTransformerMap,
    errorsTransformer: ErrorsTransformer
  ) = this()
}

