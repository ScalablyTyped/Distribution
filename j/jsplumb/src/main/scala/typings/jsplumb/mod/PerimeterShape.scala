package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsplumb.jsplumbStrings.Circle
  - typings.jsplumb.jsplumbStrings.Ellipse
  - typings.jsplumb.jsplumbStrings.Triangle
  - typings.jsplumb.jsplumbStrings.Diamond
  - typings.jsplumb.jsplumbStrings.Rectangle
  - typings.jsplumb.jsplumbStrings.Square
*/
trait PerimeterShape extends js.Object

object PerimeterShape {
  @scala.inline
  def Circle: typings.jsplumb.jsplumbStrings.Circle = this.cast("Circle")
  @scala.inline
  def Diamond: typings.jsplumb.jsplumbStrings.Diamond = this.cast("Diamond")
  @scala.inline
  def Ellipse: typings.jsplumb.jsplumbStrings.Ellipse = this.cast("Ellipse")
  @scala.inline
  def Rectangle: typings.jsplumb.jsplumbStrings.Rectangle = this.cast("Rectangle")
  @scala.inline
  def Square: typings.jsplumb.jsplumbStrings.Square = this.cast("Square")
  @scala.inline
  def Triangle: typings.jsplumb.jsplumbStrings.Triangle = this.cast("Triangle")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

