package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoganTemplate extends js.Object {
  /**
    * Renders the template to a string.
    *
    * @param context - The data to render the template with.
    * @param partials - The partials to render the template with.
    * @param indent - The string to indent when rendering the template.
    * @returns A rendered template.
    */
  def render(context: Context): String = js.native
  def render(context: Context, partials: Partials): String = js.native
  def render(context: Context, partials: Partials, indent: String): String = js.native
}

