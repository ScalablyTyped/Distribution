package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Catalog extends js.Object {
  /**
    * Returns the caption of the catalog used when displaying the name of the catalog to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns the description of the catalog which is a human-readable description of the catalog
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the name of the catalog.
    *
    * @param value
    */
  def name(value: js.Object): String
  /**
    * Returns the unique name of the catalog.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}

object Catalog {
  @scala.inline
  def apply(
    caption: js.Object => String,
    description: js.Object => String,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Catalog = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Catalog]
  }
}

