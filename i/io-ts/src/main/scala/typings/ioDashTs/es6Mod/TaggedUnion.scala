package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedUnion[Tag /* <: String */, A, O]
  extends UnionType[js.Array[Tagged[Tag, js.Any, js.Any]], A, O, js.Any]
     with _Tagged[Tag, A, O]

@JSImport("io-ts/es6", "taggedUnion")
@js.native
object taggedUnion extends js.Object {
  def apply[Tag /* <: String */, CS /* <: js.Array[Mixed] */](tag: Tag, codecs: CS): TaggedUnionC[Tag, CS] = js.native
  def apply[Tag /* <: String */, CS /* <: js.Array[Mixed] */](tag: Tag, codecs: CS, name: String): TaggedUnionC[Tag, CS] = js.native
}

