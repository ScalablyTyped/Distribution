package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStage extends IContainer {
  def add(layer: ILayer): js.Any = js.native
  def clear(): js.Any = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getContent(): stdLib.HTMLElement = js.native
  def getDOM(): stdLib.HTMLElement = js.native
  def getIntersection(pos: js.Any): js.Any = js.native
  def getMousePosition(): js.Any = js.native
  def getMousePosition(evt: stdLib.Event): js.Any = js.native
  def getPointerPosition(): Vector2d = js.native
  def getTouchPosition(): js.Any = js.native
  def getTouchPosition(evt: stdLib.Event): js.Any = js.native
  def getUserPosition(): js.Any = js.native
  def getUserPosition(evt: stdLib.Event): js.Any = js.native
  def load(JSON: js.Any): js.Any = js.native
  def reset(): js.Any = js.native
  def toImage(config: js.Any, callback: js.Function0[_]): js.Any = js.native
  def toJSON(): js.Any = js.native
}

