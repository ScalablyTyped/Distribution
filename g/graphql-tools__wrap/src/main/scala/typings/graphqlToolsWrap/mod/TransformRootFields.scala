package typings.graphqlToolsWrap.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.RootFieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "TransformRootFields")
@js.native
class TransformRootFields protected ()
  extends typings.graphqlToolsWrap.transformsMod.TransformRootFields {
  def this(rootFieldTransformer: RootFieldTransformer) = this()
  def this(rootFieldTransformer: RootFieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

