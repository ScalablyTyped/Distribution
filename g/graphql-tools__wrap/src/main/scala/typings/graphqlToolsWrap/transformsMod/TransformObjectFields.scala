package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsWrap.transformObjectFieldsMod.default
import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "TransformObjectFields")
@js.native
class TransformObjectFields protected () extends default {
  def this(objectFieldTransformer: FieldTransformer) = this()
  def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

