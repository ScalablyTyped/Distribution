package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsWrap.transformRootFieldsMod.default
import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.RootFieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "TransformRootFields")
@js.native
class TransformRootFields protected () extends default {
  def this(rootFieldTransformer: RootFieldTransformer) = this()
  def this(rootFieldTransformer: RootFieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

