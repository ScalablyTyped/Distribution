package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISprite extends IShape {
  def afterFrame(index: scala.Double, func: js.Function0[_]): js.Any = js.native
  def getAnimation(): java.lang.String = js.native
  def getAnimations(): js.Any = js.native
  def getIndex(): scala.Double = js.native
  def setAnimation(anim: java.lang.String): js.Any = js.native
  def setAnimations(animations: js.Any): js.Any = js.native
  def setIndex(index: scala.Double): js.Any = js.native
  def start(): js.Any = js.native
  def stop(): js.Any = js.native
}

