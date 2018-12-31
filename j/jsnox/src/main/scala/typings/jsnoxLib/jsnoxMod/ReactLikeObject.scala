package typings
package jsnoxLib.jsnoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  def createElement[P](`type`: java.lang.String, props: P, children: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P](
    `type`: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
    props: P,
    children: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
}

