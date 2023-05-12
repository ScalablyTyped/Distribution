package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.ink.anon.Children
import typings.ink.buildDomMod.DOMElement
import typings.ink.buildStylesMod.Styles
import typings.ink.inkStrings.textWrap
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.typeFest.anon.RequireExactProps
import typings.typeFest.sourceExceptMod.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsBoxMod extends Shortcut {
  
  /**
    * `<Box>` is an essential Ink component to build your layout. It's like `<div style="display: flex">` in the browser.
    */
  @JSImport("ink/build/components/Box", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[Props & Children & RefAttributes[DOMElement]] = js.native
  
  type Props = Except[Styles, textWrap, RequireExactProps]
  
  type _To = ForwardRefExoticComponent[Props & Children & RefAttributes[DOMElement]]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsBoxMod.foo` */
  override def _to: ForwardRefExoticComponent[Props & Children & RefAttributes[DOMElement]] = default
}
