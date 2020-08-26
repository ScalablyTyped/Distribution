package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var epsilon: js.UndefOr[Double] = js.native
  var matrix: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var parenthesis: js.UndefOr[String] = js.native
  var precision: js.UndefOr[Double] = js.native
  var randomSeed: js.UndefOr[String] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    @scala.inline
    def setMatrix(value: String): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setParenthesis(value: String): Self = this.set("parenthesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParenthesis: Self = this.set("parenthesis", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setRandomSeed(value: String): Self = this.set("randomSeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomSeed: Self = this.set("randomSeed", js.undefined)
  }
  
}

