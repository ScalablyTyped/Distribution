package typings.inputMoment.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMomentProps extends js.Object {
  var hourStep: js.UndefOr[Double] = js.undefined
  var minStep: js.UndefOr[Double] = js.undefined
  var moment: Moment
  var nextMonthIcon: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[OnChangeListener] = js.undefined
  var onSave: js.UndefOr[OnSaveListener] = js.undefined
  var prevMonthIcon: js.UndefOr[String] = js.undefined
}

object InputMomentProps {
  @scala.inline
  def apply(
    moment: Moment,
    hourStep: Int | Double = null,
    minStep: Int | Double = null,
    nextMonthIcon: String = null,
    onChange: /* m */ Moment => Unit = null,
    onSave: () => Unit = null,
    prevMonthIcon: String = null
  ): InputMomentProps = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minStep != null) __obj.updateDynamic("minStep")(minStep.asInstanceOf[js.Any])
    if (nextMonthIcon != null) __obj.updateDynamic("nextMonthIcon")(nextMonthIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction0(onSave))
    if (prevMonthIcon != null) __obj.updateDynamic("prevMonthIcon")(prevMonthIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMomentProps]
  }
}

