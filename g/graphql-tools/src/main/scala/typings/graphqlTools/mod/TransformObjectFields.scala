package typings.graphqlTools.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "TransformObjectFields")
@js.native
class TransformObjectFields protected ()
  extends typings.graphqlToolsWrap.mod.TransformObjectFields {
  def this(objectFieldTransformer: FieldTransformer) = this()
  def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

