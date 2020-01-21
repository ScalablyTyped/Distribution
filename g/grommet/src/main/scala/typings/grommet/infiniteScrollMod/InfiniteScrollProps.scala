package typings.grommet.infiniteScrollMod

import typings.grommet.grommetStrings.window
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var renderMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var scrollableAncestor: js.UndefOr[ReactNode | window] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    children: /* repeated */ js.Any => _ = null,
    items: js.Array[_] = null,
    onMore: /* repeated */ js.Any => _ = null,
    renderMarker: /* repeated */ js.Any => _ = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    scrollableAncestor: ReactNode | window = null,
    show: Int | Double = null,
    step: Int | Double = null
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1(onMore))
    if (renderMarker != null) __obj.updateDynamic("renderMarker")(js.Any.fromFunction1(renderMarker))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

