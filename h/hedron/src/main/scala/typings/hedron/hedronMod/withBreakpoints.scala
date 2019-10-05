package typings.hedron.hedronMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hedron", "withBreakpoints")
@js.native
object withBreakpoints extends js.Object {
  def apply[T](wrappedComponent: ComponentClass[T with BreakpointsProps, ComponentState]): ComponentClass[T, ComponentState] = js.native
}

