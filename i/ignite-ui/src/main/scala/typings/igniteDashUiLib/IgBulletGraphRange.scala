package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBulletGraphRange
  extends /**
	 * Option for IgBulletGraphRange
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush to use to fill the range.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value at which the range ends along the scale.
  	 */
  var endValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the outline to use when rendering the range.
  	 */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value at which the range starts along the scale.
  	 */
  var startValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering this range's outline.
  	 */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
}

