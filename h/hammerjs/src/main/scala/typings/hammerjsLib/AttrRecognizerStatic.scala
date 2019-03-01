package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrRecognizerStatic extends js.Object {
  def attrTest(input: HammerInput): scala.Boolean
  def process(input: HammerInput): js.Any
}

object AttrRecognizerStatic {
  @scala.inline
  def apply(attrTest: js.Function1[HammerInput, scala.Boolean], process: js.Function1[HammerInput, js.Any]): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrTest")(attrTest)
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
}

