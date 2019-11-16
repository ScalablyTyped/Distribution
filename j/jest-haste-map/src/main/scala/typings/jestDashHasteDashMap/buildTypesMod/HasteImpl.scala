package typings.jestDashHasteDashMap.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteImpl extends js.Object {
  def getHasteName(filePath: Path): js.UndefOr[String]
}

object HasteImpl {
  @scala.inline
  def apply(getHasteName: Path => js.UndefOr[String]): HasteImpl = {
    val __obj = js.Dynamic.literal(getHasteName = js.Any.fromFunction1(getHasteName))
  
    __obj.asInstanceOf[HasteImpl]
  }
}

