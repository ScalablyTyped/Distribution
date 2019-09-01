package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupHeader extends js.Object {
  var groupHeader: Anon_BackgroundBorderFill
  var icons: Anon_Ascending
  var primary: Anon_Weight
  var resize: Anon_BorderAnonColorSide
}

object Anon_GroupHeader {
  @scala.inline
  def apply(
    groupHeader: Anon_BackgroundBorderFill,
    icons: Anon_Ascending,
    primary: Anon_Weight,
    resize: Anon_BorderAnonColorSide
  ): Anon_GroupHeader = {
    val __obj = js.Dynamic.literal(groupHeader = groupHeader, icons = icons, primary = primary, resize = resize)
  
    __obj.asInstanceOf[Anon_GroupHeader]
  }
}

