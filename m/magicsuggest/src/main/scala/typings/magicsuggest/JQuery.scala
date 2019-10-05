package typings.magicsuggest

import typings.magicsuggest.MagicSuggest.Configuration
import typings.magicsuggest.MagicSuggest.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initialize MagicSuggest on this selector
    */
  def magicSuggest(): Instance = js.native
  def magicSuggest(configurationObject: Configuration): Instance = js.native
}

