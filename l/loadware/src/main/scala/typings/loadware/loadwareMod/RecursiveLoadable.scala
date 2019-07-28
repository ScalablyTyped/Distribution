package typings.loadware.loadwareMod

import typings.loadware.AnyFunction
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveLoadable[F /* <: AnyFunction */] extends Array[F | Loadable[F]]

