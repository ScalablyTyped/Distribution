package typings.inquirer.mod

import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice.
  *
  * @template T
  * The type of the answers.
  */
trait ChoiceOptions[T /* <: Answers */] extends ChoiceBase {
  /**
    * The extra properties of the choice.
    */
  var extra: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the choice to show to the user.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The short form of the name of the choice.
    */
  var short: js.UndefOr[String] = js.undefined
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ChoiceOptions: js.UndefOr[choice] = js.undefined
  /**
    * The value of the choice.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChoiceOptions {
  @scala.inline
  def apply[T](
    extra: js.Any = null,
    name: String = null,
    short: String = null,
    `type`: choice = null,
    value: js.Any = null
  ): ChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptions[T]]
  }
}

