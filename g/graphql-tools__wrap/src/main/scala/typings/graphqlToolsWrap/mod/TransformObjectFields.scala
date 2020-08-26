package typings.graphqlToolsWrap.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "TransformObjectFields")
@js.native
class TransformObjectFields protected ()
  extends typings.graphqlToolsWrap.transformsMod.TransformObjectFields {
  def this(objectFieldTransformer: FieldTransformer) = this()
  def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

