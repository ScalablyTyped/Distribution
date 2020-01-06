package typings.atMaterialDashUiCore.testDashUtilsCreateShallowMod

import typings.atMaterialDashUiCore.Fn_NodeOptionsProps
import typings.enzyme.enzymeMod.EnzymeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowOptions extends js.Object {
  var dive: Boolean = js.native
  var shallow: Fn_NodeOptionsProps = js.native
  var untilSelector: EnzymeSelector = js.native
}

object ShallowOptions {
  @scala.inline
  def apply(dive: Boolean, shallow: Fn_NodeOptionsProps, untilSelector: EnzymeSelector): ShallowOptions = {
    val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShallowOptions]
  }
}

