package typings.mailgen.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var product: Product
  var theme: String | CustomTheme
}

object Option {
  @scala.inline
  def apply(product: Product, theme: String | CustomTheme): Option = {
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option]
  }
}

