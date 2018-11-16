package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MathMenu extends js.Object {
  /*This is the hover delay for the display (in milliseconds) for submenus in the contextual menu: when the mouse
          * is over a submenu label for this long, the menu will appear. (The submenu also will appear if you click on its
          * label.)
          */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /*This is the URL for the MathJax Help menu item. When the user selects that item, the browser opens a new window
          * with this URL.
          */
  var helpURL: js.UndefOr[java.lang.String] = js.undefined
  /*These are the settings for the Annotation submenu of the “Show Math As” menu. If the <math> root element has a
          * <semantics> child that contains one of the following annotation formats, the source will be available via the
          * “Show Math As” menu. Each format has a list of possible encodings. For example, "TeX": ["TeX", "LaTeX",
          * "application/x-tex"] will map an annotation with an encoding of "TeX", "LaTeX", or "application/x-tex" to the
          * "TeX" menu.
          */
  var semanticsAnnotations: js.UndefOr[js.Any] = js.undefined
  /*This controls whether the “Contextual Menu” item will be displayed in the “Math Settings” submenu of the MathJax
          * contextual menu. It allows the user to decide whether the MathJax menu or the browser’s default contextual menu
          * will be shown when the context menu click occurs over mathematics typeset by MathJax. Set to false to prevent
          * this menu item from showing.
          */
  var showContext: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls whether the “Font Preference” item will be displayed in the “Math Settings” submenu of the MathJax
           * contextual menu. This submenu lets the user select what font to use in the mathematics produced by the HTML-CSS
           * output processor. Note that changing the selection in the font menu will cause the page to reload. Set to false
           * to prevent this menu item from showing.
           * */
  var showFontMenu: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls whether the “Language” item will be displayed in the MathJax contextual menu. This submenu allows
          * the user to select the language to use for the MathJax user interface, including the contextual menu, the about
          * and help dialogs, the message box at the lower left, and any warning messages produced by MathJax. Set this to
          * false to prevent this menu item from showing. This will force the user to use the language you have set for
          * MathJax.
          */
  var showLocale: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls whether the “MathPlayer” item will be displayed in the “Math Settings” submenu of the MathJax
          * contextual menu. This submenu lets the user select what events should be passed on to the MathPlayer plugin,
          * when it is present. Mouse events can be passed on (so that clicks will be processed by MathPlayer rather than
          * MathJax), and menu events can be passed on (to allow the user access to the MathPlayer menu). Set to false to
          * prevent this menu item from showing.
          * */
  var showMathPlayer: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls whether the “Math Renderer” item will be displayed in the “Math Settings” submenu of the MathJax
          * contextual menu. It allows the user to change between the HTML-CSS, NativeMML, and SVG output processors for
          * the mathematics on the page. Set to false to prevent this menu item from showing.
          */
  var showRenderer: js.UndefOr[scala.Boolean] = js.undefined
  /*This is a list of CSS declarations for styling the menu components. See the definitions in
          * extensions/MathMenu.js for details of what are defined by default. See CSS Style Objects for details on how
          * to specify CSS style in a JavaScript object.
          */
  var styles: js.UndefOr[js.Any] = js.undefined
  /*These are the settings for the window.open() call that creates the Show Source window. The initial width and
          * height will be reset after the source is shown in an attempt to make the window fit the output better.
          */
  var windowSettings: js.UndefOr[js.Any] = js.undefined
}

