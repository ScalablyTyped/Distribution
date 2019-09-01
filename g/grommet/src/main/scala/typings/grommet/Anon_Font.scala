package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Font extends js.Object {
  var large: Anon_Height
  var medium: Anon_Height
  var small: Anon_Height
  var xlarge: Anon_Height
}

object Anon_Font {
  @scala.inline
  def apply(large: Anon_Height, medium: Anon_Height, small: Anon_Height, xlarge: Anon_Height): Anon_Font = {
    val __obj = js.Dynamic.literal(large = large, medium = medium, small = small, xlarge = xlarge)
  
    __obj.asInstanceOf[Anon_Font]
  }
}

