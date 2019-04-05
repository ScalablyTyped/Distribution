package typings
package hoganDotJsLib.hoganDotJsMod

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
  def render(context: Context): java.lang.String = js.native
  def render(context: Context, partials: Partials): java.lang.String = js.native
  def render(context: Context, partials: Partials, indent: java.lang.String): java.lang.String = js.native
}

