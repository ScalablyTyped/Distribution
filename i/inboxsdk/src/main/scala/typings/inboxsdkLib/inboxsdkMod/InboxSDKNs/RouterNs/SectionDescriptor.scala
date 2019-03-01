package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionDescriptor extends js.Object {
  var contentElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var footerLinkText: js.UndefOr[java.lang.String] = js.undefined
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, scala.Unit]] = js.undefined
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onTitleLinkClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.undefined
  var title: java.lang.String
  var titleLinkText: js.UndefOr[java.lang.String] = js.undefined
}

object SectionDescriptor {
  @scala.inline
  def apply(
    title: java.lang.String,
    contentElement: stdLib.HTMLElement = null,
    footerLinkText: java.lang.String = null,
    hasDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    onDropdownClick: js.Function1[/* event */ SectionDropdownClickEvent, scala.Unit] = null,
    onFooterLinkClick: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onTitleLinkClick: js.Function0[scala.Unit] = null,
    subtitle: java.lang.String = null,
    tableRows: js.Array[RowDescriptor] = null,
    titleLinkText: java.lang.String = null
  ): SectionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement)
    if (footerLinkText != null) __obj.updateDynamic("footerLinkText")(footerLinkText)
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown)
    if (onDropdownClick != null) __obj.updateDynamic("onDropdownClick")(onDropdownClick)
    if (onFooterLinkClick != null) __obj.updateDynamic("onFooterLinkClick")(onFooterLinkClick)
    if (onTitleLinkClick != null) __obj.updateDynamic("onTitleLinkClick")(onTitleLinkClick)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows)
    if (titleLinkText != null) __obj.updateDynamic("titleLinkText")(titleLinkText)
    __obj.asInstanceOf[SectionDescriptor]
  }
}

