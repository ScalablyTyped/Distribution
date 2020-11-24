package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathMenu extends js.Object {
  
  /*This is the hover delay for the display (in milliseconds) for submenus in the contextual menu: when the mouse
    * is over a submenu label for this long, the menu will appear. (The submenu also will appear if you click on its
    * label.)
    */
  var delay: js.UndefOr[Double] = js.native
  
  /*This is the URL for the MathJax Help menu item. When the user selects that item, the browser opens a new window
    * with this URL.
    */
  var helpURL: js.UndefOr[String] = js.native
  
  /*These are the settings for the Annotation submenu of the “Show Math As” menu. If the <math> root element has a
    * <semantics> child that contains one of the following annotation formats, the source will be available via the
    * “Show Math As” menu. Each format has a list of possible encodings. For example, "TeX": ["TeX", "LaTeX",
    * "application/x-tex"] will map an annotation with an encoding of "TeX", "LaTeX", or "application/x-tex" to the
    * "TeX" menu.
    */
  var semanticsAnnotations: js.UndefOr[js.Any] = js.native
  
  /*This controls whether the “Contextual Menu” item will be displayed in the “Math Settings” submenu of the MathJax
    * contextual menu. It allows the user to decide whether the MathJax menu or the browser’s default contextual menu
    * will be shown when the context menu click occurs over mathematics typeset by MathJax. Set to false to prevent
    * this menu item from showing.
    */
  var showContext: js.UndefOr[Boolean] = js.native
  
  /*This controls whether the “Font Preference” item will be displayed in the “Math Settings” submenu of the MathJax
    * contextual menu. This submenu lets the user select what font to use in the mathematics produced by the HTML-CSS
    * output processor. Note that changing the selection in the font menu will cause the page to reload. Set to false
    * to prevent this menu item from showing.
    * */
  var showFontMenu: js.UndefOr[Boolean] = js.native
  
  /*This controls whether the “Language” item will be displayed in the MathJax contextual menu. This submenu allows
    * the user to select the language to use for the MathJax user interface, including the contextual menu, the about
    * and help dialogs, the message box at the lower left, and any warning messages produced by MathJax. Set this to
    * false to prevent this menu item from showing. This will force the user to use the language you have set for
    * MathJax.
    */
  var showLocale: js.UndefOr[Boolean] = js.native
  
  /*This controls whether the “MathPlayer” item will be displayed in the “Math Settings” submenu of the MathJax
    * contextual menu. This submenu lets the user select what events should be passed on to the MathPlayer plugin,
    * when it is present. Mouse events can be passed on (so that clicks will be processed by MathPlayer rather than
    * MathJax), and menu events can be passed on (to allow the user access to the MathPlayer menu). Set to false to
    * prevent this menu item from showing.
    * */
  var showMathPlayer: js.UndefOr[Boolean] = js.native
  
  /*This controls whether the “Math Renderer” item will be displayed in the “Math Settings” submenu of the MathJax
    * contextual menu. It allows the user to change between the HTML-CSS, NativeMML, and SVG output processors for
    * the mathematics on the page. Set to false to prevent this menu item from showing.
    */
  var showRenderer: js.UndefOr[Boolean] = js.native
  
  /*This is a list of CSS declarations for styling the menu components. See the definitions in
    * extensions/MathMenu.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.native
  
  /*These are the settings for the window.open() call that creates the Show Source window. The initial width and
    * height will be reset after the source is shown in an attempt to make the window fit the output better.
    */
  var windowSettings: js.UndefOr[js.Any] = js.native
}
object MathMenu {
  
  @scala.inline
  def apply(): MathMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMenu]
  }
  
  @scala.inline
  implicit class MathMenuOps[Self <: MathMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHelpURL(value: String): Self = this.set("helpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpURL: Self = this.set("helpURL", js.undefined)
    
    @scala.inline
    def setSemanticsAnnotations(value: js.Any): Self = this.set("semanticsAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemanticsAnnotations: Self = this.set("semanticsAnnotations", js.undefined)
    
    @scala.inline
    def setShowContext(value: Boolean): Self = this.set("showContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowContext: Self = this.set("showContext", js.undefined)
    
    @scala.inline
    def setShowFontMenu(value: Boolean): Self = this.set("showFontMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFontMenu: Self = this.set("showFontMenu", js.undefined)
    
    @scala.inline
    def setShowLocale(value: Boolean): Self = this.set("showLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocale: Self = this.set("showLocale", js.undefined)
    
    @scala.inline
    def setShowMathPlayer(value: Boolean): Self = this.set("showMathPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMathPlayer: Self = this.set("showMathPlayer", js.undefined)
    
    @scala.inline
    def setShowRenderer(value: Boolean): Self = this.set("showRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRenderer: Self = this.set("showRenderer", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWindowSettings(value: js.Any): Self = this.set("windowSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSettings: Self = this.set("windowSettings", js.undefined)
  }
}
