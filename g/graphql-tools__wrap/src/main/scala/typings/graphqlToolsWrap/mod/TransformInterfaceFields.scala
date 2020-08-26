package typings.graphqlToolsWrap.mod

import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "TransformInterfaceFields")
@js.native
class TransformInterfaceFields protected ()
  extends typings.graphqlToolsWrap.transformsMod.TransformInterfaceFields {
  def this(interfaceFieldTransformer: FieldTransformer) = this()
  def this(interfaceFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}

