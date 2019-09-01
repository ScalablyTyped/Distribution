package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorContinent extends js.Object {
  var color: String
  var continent: Anon_ActiveBase
  var hover: Anon_ColorString
  var place: Anon_ActiveBase
}

object Anon_ColorContinent {
  @scala.inline
  def apply(color: String, continent: Anon_ActiveBase, hover: Anon_ColorString, place: Anon_ActiveBase): Anon_ColorContinent = {
    val __obj = js.Dynamic.literal(color = color, continent = continent, hover = hover, place = place)
  
    __obj.asInstanceOf[Anon_ColorContinent]
  }
}

