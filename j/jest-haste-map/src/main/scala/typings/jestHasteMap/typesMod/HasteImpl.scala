package typings.jestHasteMap.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasteImpl extends js.Object {
  def getHasteName(filePath: Path): js.UndefOr[String] = js.native
}

object HasteImpl {
  @scala.inline
  def apply(getHasteName: Path => js.UndefOr[String]): HasteImpl = {
    val __obj = js.Dynamic.literal(getHasteName = js.Any.fromFunction1(getHasteName))
    __obj.asInstanceOf[HasteImpl]
  }
  @scala.inline
  implicit class HasteImplOps[Self <: HasteImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetHasteName(value: Path => js.UndefOr[String]): Self = this.set("getHasteName", js.Any.fromFunction1(value))
  }
  
}

