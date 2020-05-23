package typings.inboxsdk.mod.Router

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionDescriptor extends js.Object {
  var contentElement: js.UndefOr[HTMLElement] = js.undefined
  var footerLinkText: js.UndefOr[String] = js.undefined
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.undefined
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.undefined
  var title: String
  var titleLinkText: js.UndefOr[String] = js.undefined
}

object SectionDescriptor {
  @scala.inline
  def apply(
    title: String,
    contentElement: HTMLElement = null,
    footerLinkText: String = null,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    onDropdownClick: /* event */ SectionDropdownClickEvent => Unit = null,
    onFooterLinkClick: /* event */ js.Any => Unit = null,
    onTitleLinkClick: () => Unit = null,
    subtitle: String = null,
    tableRows: js.Array[RowDescriptor] = null,
    titleLinkText: String = null
  ): SectionDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement.asInstanceOf[js.Any])
    if (footerLinkText != null) __obj.updateDynamic("footerLinkText")(footerLinkText.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.get.asInstanceOf[js.Any])
    if (onDropdownClick != null) __obj.updateDynamic("onDropdownClick")(js.Any.fromFunction1(onDropdownClick))
    if (onFooterLinkClick != null) __obj.updateDynamic("onFooterLinkClick")(js.Any.fromFunction1(onFooterLinkClick))
    if (onTitleLinkClick != null) __obj.updateDynamic("onTitleLinkClick")(js.Any.fromFunction0(onTitleLinkClick))
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (titleLinkText != null) __obj.updateDynamic("titleLinkText")(titleLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDescriptor]
  }
}

