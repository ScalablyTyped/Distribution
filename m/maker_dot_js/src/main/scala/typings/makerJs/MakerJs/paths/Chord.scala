package typings.makerJs.MakerJs.paths

import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for chord, which is simply a line path that connects the endpoints of an arc.
  *
  * @param arc Arc to use as the basic for the chord.
  */
trait Chord extends IPathLine

object Chord {
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String, layer: String = null): Chord = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chord]
  }
}

