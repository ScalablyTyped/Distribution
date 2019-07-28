package typings.knockoutDashPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPagingOptions extends js.Object {
  var defaults: KnockoutPagingDefaultOptions
  var generators: Anon_Name
}

object KnockoutPagingOptions {
  @scala.inline
  def apply(defaults: KnockoutPagingDefaultOptions, generators: Anon_Name): KnockoutPagingOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults, generators = generators)
  
    __obj.asInstanceOf[KnockoutPagingOptions]
  }
}

