package typings.grpcGrpcJs.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  /**
    * Indicates that the caller wants new name resolution data. Calling this
    * function may eventually result in calling one of the `ResolverListener`
    * functions, but that is not guaranteed. Those functions will never be
    * called synchronously with the constructor or updateResolution.
    */
  def updateResolution(): Unit
}

object Resolver {
  @scala.inline
  def apply(updateResolution: () => Unit): Resolver = {
    val __obj = js.Dynamic.literal(updateResolution = js.Any.fromFunction0(updateResolution))
    __obj.asInstanceOf[Resolver]
  }
}

