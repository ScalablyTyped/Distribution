package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrRecognizerStatic extends js.Object {
  def attrTest(input: HammerInput): Boolean
  def process(input: HammerInput): js.Any
}

object AttrRecognizerStatic {
  @scala.inline
  def apply(attrTest: HammerInput => Boolean, process: HammerInput => js.Any): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal(attrTest = js.Any.fromFunction1(attrTest), process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
}

