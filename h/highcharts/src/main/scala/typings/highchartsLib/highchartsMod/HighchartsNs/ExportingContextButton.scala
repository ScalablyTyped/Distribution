package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExportingContextButton extends Button {
  /**
           * A collection of config options for the menu items. Each options object consists of a text option which is a
           * string to show in the menu item, as well as an onclick parameter which is a callback function to run on click.
           *
           * By default, there is the 'Print' menu item plus one menu item for each of the available export types. Menu items
           * can be customized by defining a new array of items and assigning null to unwanted positions.
           * @since 2.0
           */
  var menuItems: js.UndefOr[js.Array[java.lang.String] | js.Array[MenuItem]] = js.undefined
  /**
           * A click handler callback to use on the button directly instead of the popup menu.
           * @since 2.0
           */
  var onclick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * The symbol for the button. Points to a definition function in the Highcharts.Renderer.symbols collection. The
           * default exportIcon function is part of the exporting module.
           * @default 'menu'
           */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The horizontal position of the button relative to the align option.
           * @default -10
           */
  var x: js.UndefOr[scala.Double] = js.undefined
}

