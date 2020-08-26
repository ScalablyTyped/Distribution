package typings.ionic.ionic1Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BowerJson extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var name: String = js.native
}

object BowerJson {
  @scala.inline
  def apply(name: String): BowerJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BowerJson]
  }
  @scala.inline
  implicit class BowerJsonOps[Self <: BowerJson] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencies(value: StringDictionary[js.UndefOr[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDevDependencies(value: StringDictionary[js.UndefOr[String]]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
  }
  
}

