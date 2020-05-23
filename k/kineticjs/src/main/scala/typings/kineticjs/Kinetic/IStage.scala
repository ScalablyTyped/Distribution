package typings.kineticjs.Kinetic

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStage extends IContainer {
  def add(layer: ILayer): js.Any = js.native
  def clear(): js.Any = js.native
  def getContainer(): HTMLElement = js.native
  def getContent(): HTMLElement = js.native
  def getDOM(): HTMLElement = js.native
  def getIntersection(pos: js.Any): js.Any = js.native
  def getMousePosition(): js.Any = js.native
  def getMousePosition(evt: Event): js.Any = js.native
  def getPointerPosition(): Vector2d = js.native
  def getTouchPosition(): js.Any = js.native
  def getTouchPosition(evt: Event): js.Any = js.native
  def getUserPosition(): js.Any = js.native
  def getUserPosition(evt: Event): js.Any = js.native
  def load(JSON: js.Any): js.Any = js.native
  def reset(): js.Any = js.native
  def toImage(config: js.Any, callback: js.Function0[_]): js.Any = js.native
  def toJSON(): js.Any = js.native
}

