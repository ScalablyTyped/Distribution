package typings.inquirer.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a fetched answer.
  */
@js.native
trait FetchedAnswer extends js.Object {
  /**
    * The value of the answer.
    */
  var answer: js.Any = js.native
  /**
    * The name of the answer.
    */
  var name: String = js.native
}

object FetchedAnswer {
  @scala.inline
  def apply(answer: js.Any, name: String): FetchedAnswer = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchedAnswer]
  }
  @scala.inline
  implicit class FetchedAnswerOps[Self <: FetchedAnswer] (val x: Self) extends AnyVal {
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
    def setAnswer(value: js.Any): Self = this.set("answer", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

