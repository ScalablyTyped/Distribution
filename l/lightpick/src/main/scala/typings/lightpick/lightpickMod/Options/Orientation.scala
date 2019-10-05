package typings.lightpick.lightpickMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("lightpick", "Options.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Auto extends Orientation
  
  @js.native
  sealed trait Bottom extends Orientation
  
  @js.native
  sealed trait BottomLeft extends Orientation
  
  @js.native
  sealed trait BottomRight extends Orientation
  
  @js.native
  sealed trait Left extends Orientation
  
  @js.native
  sealed trait Right extends Orientation
  
  @js.native
  sealed trait Top extends Orientation
  
  @js.native
  sealed trait TopLeft extends Orientation
  
  @js.native
  sealed trait TopRight extends Orientation
  
  /* "auto" */ val Auto: typings.lightpick.lightpickMod.Options.Orientation.Auto with String = js.native
  /* "bottom" */ val Bottom: typings.lightpick.lightpickMod.Options.Orientation.Bottom with String = js.native
  /* "bottom left" */ val BottomLeft: typings.lightpick.lightpickMod.Options.Orientation.BottomLeft with String = js.native
  /* "bottom right" */ val BottomRight: typings.lightpick.lightpickMod.Options.Orientation.BottomRight with String = js.native
  /* "left" */ val Left: typings.lightpick.lightpickMod.Options.Orientation.Left with String = js.native
  /* "right" */ val Right: typings.lightpick.lightpickMod.Options.Orientation.Right with String = js.native
  /* "top" */ val Top: typings.lightpick.lightpickMod.Options.Orientation.Top with String = js.native
  /* "top left" */ val TopLeft: typings.lightpick.lightpickMod.Options.Orientation.TopLeft with String = js.native
  /* "top right" */ val TopRight: typings.lightpick.lightpickMod.Options.Orientation.TopRight with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
}

