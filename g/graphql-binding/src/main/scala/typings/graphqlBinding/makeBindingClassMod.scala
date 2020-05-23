package typings.graphqlBinding

import typings.graphqlBinding.anon.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/makeBindingClass", JSImport.Namespace)
@js.native
object makeBindingClassMod extends js.Object {
  def makeBindingClass[T](hasSchema: Schema): T = js.native
}

