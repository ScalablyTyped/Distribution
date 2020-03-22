package typings.inquirer.mod

import typings.inquirer.AnonIsFinal
import typings.inquirer.inquirerStrings.checkbox
import typings.inquirer.inquirerStrings.confirm
import typings.inquirer.inquirerStrings.editor
import typings.inquirer.inquirerStrings.expand
import typings.inquirer.inquirerStrings.input
import typings.inquirer.inquirerStrings.list
import typings.inquirer.inquirerStrings.number
import typings.inquirer.inquirerStrings.password
import typings.inquirer.inquirerStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents one of the available questions.
  *
  * @template T
  * The type of the answers.
  */
/* Rewritten from type alias, can be one of: 
  - typings.inquirer.mod.EditorQuestion[T]
  - typings.inquirer.mod.ExpandQuestion[T]
  - typings.inquirer.mod.RawListQuestion[T]
  - typings.inquirer.mod.NumberQuestion[T]
  - typings.inquirer.mod.ConfirmQuestion[T]
  - typings.inquirer.mod.ListQuestion[T]
  - typings.inquirer.mod.CheckboxQuestion[T]
  - typings.inquirer.mod.PasswordQuestion[T]
  - typings.inquirer.mod.InputQuestion[T]
*/
trait DistinctQuestion[T /* <: Answers */] extends js.Object

object DistinctQuestion {
  @scala.inline
  def CheckboxQuestion[T /* <: Answers */](
    `type`: checkbox,
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[CheckboxChoiceMap[T]]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def InputQuestion[T /* <: Answers */](
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    transformer: (/* input */ js.Any, T, /* flags */ AnonIsFinal) => String | js.Promise[String] = null,
    `type`: input = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3(transformer))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def RawListQuestion[T /* <: Answers */](
    `type`: rawlist,
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[ListChoiceMap[T]]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def ExpandQuestion[T /* <: Answers */](
    `type`: expand,
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[ExpandChoiceMap[T]]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def ListQuestion[T /* <: Answers */](
    `type`: list,
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[ListChoiceMap[T]]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def EditorQuestion[T /* <: Answers */](
    `type`: editor,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def PasswordQuestion[T /* <: Answers */](
    `type`: password,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    mask: String = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    transformer: (/* input */ js.Any, T, /* flags */ AnonIsFinal) => String | js.Promise[String] = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3(transformer))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def NumberQuestion[T /* <: Answers */](
    `type`: number,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    transformer: (/* input */ js.Any, T, /* flags */ AnonIsFinal) => String | js.Promise[String] = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3(transformer))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
  @scala.inline
  def ConfirmQuestion[T /* <: Answers */](
    `type`: confirm,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): DistinctQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctQuestion[T]]
  }
}

