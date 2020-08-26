package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsWrap.transformInterfaceFieldsMod.default
import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "TransformInterfaceFields")
@js.native
class TransformInterfaceFields protected () extends default {
  def this(interfaceFieldTransformer: FieldTransformer) = this()
  def this(interfaceFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

