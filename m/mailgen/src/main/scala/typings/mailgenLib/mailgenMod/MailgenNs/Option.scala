package typings
package mailgenLib.mailgenMod.MailgenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var product: Product
  var theme: java.lang.String | CustomTheme
}

object Option {
  @scala.inline
  def apply(product: Product, theme: java.lang.String | CustomTheme): Option = {
    val __obj = js.Dynamic.literal(product = product, theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option]
  }
}

