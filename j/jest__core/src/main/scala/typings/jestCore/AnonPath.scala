package typings.jestCore

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  def testPathPattern(path: Path): Boolean
}

object AnonPath {
  @scala.inline
  def apply(testPathPattern: Path => Boolean): AnonPath = {
    val __obj = js.Dynamic.literal(testPathPattern = js.Any.fromFunction1(testPathPattern))
  
    __obj.asInstanceOf[AnonPath]
  }
}

