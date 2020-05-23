package typings.linguiReact.i18nMod

import typings.linguiReact.anon.I18n
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[Boolean] = js.undefined
  var withHash: js.UndefOr[Boolean] = js.undefined
  def children(hasI18nI18nHash: I18n): ReactNode
}

object I18nComponentProps {
  @scala.inline
  def apply(
    children: I18n => ReactNode,
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined
  ): I18nComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nComponentProps]
  }
}

