package typings
package mailgenLib.mailgenMod.MailgenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var link: java.lang.String
  var logo: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Product {
  @scala.inline
  def apply(
    link: java.lang.String,
    name: java.lang.String,
    copyright: java.lang.String = null,
    logo: java.lang.String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("name")(name)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (logo != null) __obj.updateDynamic("logo")(logo)
    __obj.asInstanceOf[Product]
  }
}

