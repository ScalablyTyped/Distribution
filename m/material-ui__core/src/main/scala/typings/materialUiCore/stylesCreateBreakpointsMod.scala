package typings.materialUiCore

import typings.materialUiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateBreakpointsMod {
  
  @JSImport("@material-ui/core/styles/createBreakpoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: BreakpointsOptions): Breakpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Breakpoints]
  
  @JSImport("@material-ui/core/styles/createBreakpoints", "keys")
  @js.native
  val keys: js.Array[Breakpoint] = js.native
  
  type Breakpoint = OverridableStringUnion[BreakpointDefaults, BreakpointOverrides]
  
  /* Inlined std.Record<'xs' | 'sm' | 'md' | 'lg' | 'xl', true> */
  trait BreakpointDefaults extends StObject {
    
    var lg: true
    
    var md: true
    
    var sm: true
    
    var xl: true
    
    var xs: true
  }
  object BreakpointDefaults {
    
    inline def apply(): BreakpointDefaults = {
      val __obj = js.Dynamic.literal(lg = true, md = true, sm = true, xl = true, xs = true)
      __obj.asInstanceOf[BreakpointDefaults]
    }
    
    extension [Self <: BreakpointDefaults](x: Self) {
      
      inline def setLg(value: true): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: true): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: true): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: true): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: true): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreakpointOverrides extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint ]: number}
    }}}
    */
  @js.native
  trait BreakpointValues extends StObject
  
  @js.native
  trait Breakpoints extends StObject {
    
    def between(start: Double, end: Double): String = js.native
    def between(start: Double, end: Breakpoint): String = js.native
    def between(start: Breakpoint, end: Double): String = js.native
    def between(start: Breakpoint, end: Breakpoint): String = js.native
    
    def down(key: Double): String = js.native
    def down(key: Breakpoint): String = js.native
    
    var keys: js.Array[Breakpoint] = js.native
    
    def only(key: Breakpoint): String = js.native
    
    def up(key: Double): String = js.native
    def up(key: Breakpoint): String = js.native
    
    var values: BreakpointValues = js.native
    
    /**
      * @deprecated
      * Use the `values` prop instead
      */
    def width(key: Breakpoint): Double = js.native
  }
  
  /* Inlined std.Partial<{  unit :string,   step :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
  trait BreakpointsOptions extends StObject {
    
    var between: js.UndefOr[
        js.Function2[/* start */ Breakpoint | Double, /* end */ Breakpoint | Double, String]
      ] = js.undefined
    
    var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
    
    var keys: js.UndefOr[js.Array[Breakpoint]] = js.undefined
    
    var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var unit: js.UndefOr[String] = js.undefined
    
    var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
    
    var values: js.UndefOr[BreakpointValues] = js.undefined
    
    var width: js.UndefOr[js.Function1[/* key */ Breakpoint, Double]] = js.undefined
  }
  object BreakpointsOptions {
    
    inline def apply(): BreakpointsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointsOptions]
    }
    
    extension [Self <: BreakpointsOptions](x: Self) {
      
      inline def setBetween(value: (/* start */ Breakpoint | Double, /* end */ Breakpoint | Double) => String): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setDown(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setKeys(value: js.Array[Breakpoint]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: Breakpoint*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOnly(value: /* key */ Breakpoint => String): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUp(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setValues(value: BreakpointValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setWidth(value: /* key */ Breakpoint => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
