package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait Question[T /* <: Answers */] extends js.Object {
  /**
    * The default value of the question.
    */
  var default: js.UndefOr[AsyncDynamicQuestionProperty[_, T]] = js.native
  /**
    * Post-processes the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    */
  var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* answers */ T, _]] = js.native
  /**
    * The message to show to the user.
    */
  var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.native
  /**
    * The key to save the answer to the answers-hash.
    */
  var name: js.UndefOr[KeyUnion[T]] = js.native
  /**
    * The prefix of the `message`.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The suffix of the `message`.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * The type of the question.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Validates the integrity of the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    *
    * @returns
    * Either a value indicating whether the answer is valid or a `string` which describes the error.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ] = js.native
  /**
    * A value indicating whether the question should be prompted.
    */
  var when: js.UndefOr[AsyncDynamicQuestionProperty[Boolean, T]] = js.native
}

object Question {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](): Question[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Question[T]]
  }
  @scala.inline
  implicit class QuestionOps[Self <: Question[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with Question[T]) extends AnyVal {
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
    def setDefaultFunction1(value: T => _ | js.Promise[_]): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setDefault(value: AsyncDynamicQuestionProperty[_, T]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFilter(value: (/* input */ js.Any, /* answers */ T) => _): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMessageFunction1(value: T => String | js.Promise[String]): Self = this.set("message", js.Any.fromFunction1(value))
    @scala.inline
    def setMessage(value: AsyncDynamicQuestionProperty[String, T]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setName(value: KeyUnion[T]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidate(
      value: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String])
    ): Self = this.set("validate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setWhenFunction1(value: T => Boolean | js.Promise[Boolean]): Self = this.set("when", js.Any.fromFunction1(value))
    @scala.inline
    def setWhen(value: AsyncDynamicQuestionProperty[Boolean, T]): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

