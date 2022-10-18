package typings.materialUiCore

import typings.materialUiCore.stylesCreateBreakpointsMod.Breakpoints
import typings.materialUiCore.stylesCreateSpacingMod.Spacing
import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateMixinsMod {
  
  @JSImport("@material-ui/core/styles/createMixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(breakpoints: Breakpoints, spacing: Spacing, mixins: MixinsOptions): Mixins = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoints.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], mixins.asInstanceOf[js.Any])).asInstanceOf[Mixins]
  
  @js.native
  trait Mixins extends StObject {
    
    def gutters(): CSSProperties = js.native
    def gutters(styles: CSSProperties): CSSProperties = js.native
    
    var toolbar: CSSProperties = js.native
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
  trait MixinsOptions extends StObject {
    
    var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.undefined
    
    var toolbar: js.UndefOr[CSSProperties] = js.undefined
  }
  object MixinsOptions {
    
    inline def apply(): MixinsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinsOptions]
    }
    
    extension [Self <: MixinsOptions](x: Self) {
      
      inline def setGutters(value: /* styles */ js.UndefOr[CSSProperties] => CSSProperties): Self = StObject.set(x, "gutters", js.Any.fromFunction1(value))
      
      inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
      
      inline def setToolbar(value: CSSProperties): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
}
