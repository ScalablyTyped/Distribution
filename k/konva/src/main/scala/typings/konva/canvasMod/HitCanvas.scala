package typings.konva.canvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Canvas", "HitCanvas")
@js.native
class HitCanvas () extends Canvas {
  def this(config: ICanvasConfig) = this()
  
  var hitCanvas: Boolean = js.native
}
