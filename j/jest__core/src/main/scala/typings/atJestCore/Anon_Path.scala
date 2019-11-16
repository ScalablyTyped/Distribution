package typings.atJestCore

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  def testPathPattern(path: Path): Boolean
}

object Anon_Path {
  @scala.inline
  def apply(testPathPattern: Path => Boolean): Anon_Path = {
    val __obj = js.Dynamic.literal(testPathPattern = js.Any.fromFunction1(testPathPattern))
  
    __obj.asInstanceOf[Anon_Path]
  }
}

