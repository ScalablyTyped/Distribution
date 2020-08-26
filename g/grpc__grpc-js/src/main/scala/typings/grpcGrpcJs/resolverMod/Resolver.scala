package typings.grpcGrpcJs.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  /**
    * Indicates that the caller wants new name resolution data. Calling this
    * function may eventually result in calling one of the `ResolverListener`
    * functions, but that is not guaranteed. Those functions will never be
    * called synchronously with the constructor or updateResolution.
    */
  def updateResolution(): Unit = js.native
}

object Resolver {
  @scala.inline
  def apply(updateResolution: () => Unit): Resolver = {
    val __obj = js.Dynamic.literal(updateResolution = js.Any.fromFunction0(updateResolution))
    __obj.asInstanceOf[Resolver]
  }
  @scala.inline
  implicit class ResolverOps[Self <: Resolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUpdateResolution(value: () => Unit): Self = this.set("updateResolution", js.Any.fromFunction0(value))
  }
  
}

