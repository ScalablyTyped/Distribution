package typings.interactjsTypes

import typings.interactjsTypes.anon.BeforeEndSetStart
import typings.interactjsTypes.anon.PartialRestrictOptionsele
import typings.interactjsTypes.anon.RestrictOptionselementRec
import typings.interactjsTypes.interactjsTypesStrings.restrictRect
import typings.interactjsTypes.modifiersRestrictPointerMod.RestrictState
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersRestrictRectMod {
  
  object default {
    
    inline def apply(): Modifier[RestrictOptionselementRec, RestrictState, restrictRect, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[RestrictOptionselementRec, RestrictState, restrictRect, Any]]
    inline def apply(_options: PartialRestrictOptionsele): Modifier[RestrictOptionselementRec, RestrictState, restrictRect, Any] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[RestrictOptionselementRec, RestrictState, restrictRect, Any]]
    
    @JSImport("@interactjs/modifiers/restrict/rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/rect", "default._defaults")
    @js.native
    def defaults: RestrictOptionselementRec = js.native
    
    inline def defaults_=(x: RestrictOptionselementRec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/rect", "default._methods")
    @js.native
    def methods: BeforeEndSetStart = js.native
    
    inline def methods_=(x: BeforeEndSetStart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  object restrictRect {
    
    @JSImport("@interactjs/modifiers/restrict/rect", "restrictRect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/rect", "restrictRect.defaults")
    @js.native
    def defaults: RestrictOptionselementRec = js.native
    inline def defaults_=(x: RestrictOptionselementRec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    inline def set(arg: ModifierArg[RestrictState]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def start(arg: ModifierArg[RestrictState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
