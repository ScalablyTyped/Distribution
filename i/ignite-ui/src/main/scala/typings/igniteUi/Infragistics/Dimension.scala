package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  /**
    * Returns the caption of the dimension used when displaying the name of the dimension to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns a user-friendly description of the dimension.
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the type of the dimension which is a value from the $.ig.DimensionType enumeration.
    *
    *             $.ig.DimensionType.prototype.unknown = 0;
    *             $.ig.DimensionType.prototype.time = 1;
    *             $.ig.DimensionType.prototype.measure = 2;
    *             $.ig.DimensionType.prototype.other = 3;
    *             $.ig.DimensionType.prototype.quantitative = 5;
    *             $.ig.DimensionType.prototype.accounts = 6;
    *             $.ig.DimensionType.prototype.customers = 7;
    *             $.ig.DimensionType.prototype.products = 8;
    *             $.ig.DimensionType.prototype.scenario = 9;
    *             $.ig.DimensionType.prototype.utility = 10;
    *             $.ig.DimensionType.prototype.currency = 11;
    *             $.ig.DimensionType.prototype.rates = 12;
    *             $.ig.DimensionType.prototype.channel = 13;
    *             $.ig.DimensionType.prototype.promotion = 14;
    *             $.ig.DimensionType.prototype.organization = 15;
    *             $.ig.DimensionType.prototype.billOfMaterials = 16;
    *             $.ig.DimensionType.prototype.geography = 17;
    *
    * @param value
    */
  def dimensionType(value: js.Object): Double
  /**
    * Returns the name of the dimension.
    *
    * @param value
    */
  def name(value: js.Object): String
  /**
    * Returns the unique name of the dimension.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}

object Dimension {
  @scala.inline
  def apply(
    caption: js.Object => String,
    description: js.Object => String,
    dimensionType: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Dimension = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), description = js.Any.fromFunction1(description), dimensionType = js.Any.fromFunction1(dimensionType), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Dimension]
  }
}

