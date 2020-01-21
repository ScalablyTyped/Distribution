package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  var copyright: js.UndefOr[String] = js.undefined
  var link: String
  var logo: js.UndefOr[String] = js.undefined
  var name: String
}

object Product {
  @scala.inline
  def apply(link: String, name: String, copyright: String = null, logo: String = null): Product = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

