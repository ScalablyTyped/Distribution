package typings.jsnox.jsnoxMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  def createElement[P](`type`: String, props: P, children: ReactNode): ReactElement = js.native
  def createElement[P](`type`: ComponentClass[P, ComponentState], props: P, children: ReactNode): ReactElement = js.native
}

