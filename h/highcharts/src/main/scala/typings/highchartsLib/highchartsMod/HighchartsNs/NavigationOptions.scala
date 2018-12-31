package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of options for buttons and menus appearing in the exporting module.
  */
trait NavigationOptions extends js.Object {
  /**
    * A collection of options for buttons appearing in the exporting module.
    */
  var buttonOptions: js.UndefOr[Button] = js.undefined
  /**
    * CSS styles for the hover state of the individual items within the popup menu appearing by default when the export
    * icon is clicked. The menu items are rendered in HTML.
    * @default {background: '#4572A5', color: '#FFFFFF'}
    * @since 2.0
    */
  var menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * CSS styles for the individual items within the popup menu appearing by default when the export icon is clicked.
    * The menu items are rendered in HTML.
    * @default { padding: '0 5px', background: NONE, color: '#303030'}
    * @since 2.0
    */
  var menuItemStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in
    * HTML.
    * @default { border: '1px solid #A0A0A0', background: '#FFFFFF' }
    * @since 2.0
    */
  var menuStyle: js.UndefOr[js.Object] = js.undefined
}

