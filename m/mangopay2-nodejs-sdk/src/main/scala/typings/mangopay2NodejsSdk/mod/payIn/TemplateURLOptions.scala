package typings.mangopay2NodejsSdk.mod.payIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateURLOptions extends js.Object {
  var Payline: String
}

object TemplateURLOptions {
  @scala.inline
  def apply(Payline: String): TemplateURLOptions = {
    val __obj = js.Dynamic.literal(Payline = Payline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateURLOptions]
  }
}

