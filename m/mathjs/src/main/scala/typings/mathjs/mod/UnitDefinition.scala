package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitDefinition extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var definition: js.UndefOr[String | Unit] = js.native
  var offset: js.UndefOr[Double] = js.native
  var prefixes: js.UndefOr[String] = js.native
}

object UnitDefinition {
  @scala.inline
  def apply(): UnitDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitDefinition]
  }
  @scala.inline
  implicit class UnitDefinitionOps[Self <: UnitDefinition] (val x: Self) extends AnyVal {
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setDefinition(value: String | Unit): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPrefixes(value: String): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
  }
  
}

