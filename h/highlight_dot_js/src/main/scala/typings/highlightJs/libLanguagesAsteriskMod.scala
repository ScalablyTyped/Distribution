package typings.highlightJs

import org.scalablytyped.runtime.Shortcut
import typings.highlightJs.mod.LanguageFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguagesAsteriskMod extends Shortcut {
  
  @JSImport("highlight.js/lib/languages/*", JSImport.Default)
  @js.native
  val default: LanguageFn = js.native
  
  type _To = LanguageFn
  
  /* This means you don't have to write `default`, but can instead just say `libLanguagesAsteriskMod.foo` */
  override def _to: LanguageFn = default
}
