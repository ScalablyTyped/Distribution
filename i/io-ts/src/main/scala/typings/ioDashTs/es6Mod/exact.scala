package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "exact")
@js.native
object exact extends js.Object {
  def apply(codec: HasPropsIntersection): ExactC[HasPropsIntersection] = js.native
  def apply(codec: HasPropsIntersection, name: String): ExactC[HasPropsIntersection] = js.native
  def apply(codec: HasPropsReadonly): ExactC[HasPropsReadonly] = js.native
  def apply(codec: HasPropsReadonly, name: String): ExactC[HasPropsReadonly] = js.native
  def apply(codec: HasPropsRefinement): ExactC[HasPropsRefinement] = js.native
  def apply(codec: HasPropsRefinement, name: String): ExactC[HasPropsRefinement] = js.native
  def apply[C /* <: (InterfaceType[_, _, _, _]) | (StrictType[_, _, _, _]) | (PartialType[_, _, _, _]) */](codec: C): ExactC[C] = js.native
  def apply[C /* <: (InterfaceType[_, _, _, _]) | (StrictType[_, _, _, _]) | (PartialType[_, _, _, _]) */](codec: C, name: String): ExactC[C] = js.native
}

