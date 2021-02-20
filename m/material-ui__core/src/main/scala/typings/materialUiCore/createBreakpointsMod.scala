package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBreakpointsMod {
  
  @JSImport("@material-ui/core/styles/createBreakpoints", JSImport.Default)
  @js.native
  def default(options: BreakpointsOptions): Breakpoints = js.native
  
  @JSImport("@material-ui/core/styles/createBreakpoints", "keys")
  @js.native
  val keys: js.Array[Breakpoint] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.xs
    - typings.materialUiCore.materialUiCoreStrings.sm
    - typings.materialUiCore.materialUiCoreStrings.md
    - typings.materialUiCore.materialUiCoreStrings.lg
    - typings.materialUiCore.materialUiCoreStrings.xl
  */
  trait Breakpoint extends StObject
  object Breakpoint {
    
    @scala.inline
    def lg: typings.materialUiCore.materialUiCoreStrings.lg = "lg".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.lg]
    
    @scala.inline
    def md: typings.materialUiCore.materialUiCoreStrings.md = "md".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.md]
    
    @scala.inline
    def sm: typings.materialUiCore.materialUiCoreStrings.sm = "sm".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sm]
    
    @scala.inline
    def xl: typings.materialUiCore.materialUiCoreStrings.xl = "xl".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.xl]
    
    @scala.inline
    def xs: typings.materialUiCore.materialUiCoreStrings.xs = "xs".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.xs]
  }
  
  /* Inlined {[ key in @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint ]: number} */
  @js.native
  trait BreakpointValues extends StObject {
    
    var lg: Double = js.native
    
    var md: Double = js.native
    
    var sm: Double = js.native
    
    var xl: Double = js.native
    
    var xs: Double = js.native
  }
  object BreakpointValues {
    
    @scala.inline
    def apply(lg: Double, md: Double, sm: Double, xl: Double, xs: Double): BreakpointValues = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointValues]
    }
    
    @scala.inline
    implicit class BreakpointValuesMutableBuilder[Self <: BreakpointValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Breakpoints extends StObject {
    
    def between(start: Breakpoint, end: Breakpoint): String = js.native
    
    def down(key: Double): String = js.native
    def down(key: Breakpoint): String = js.native
    
    var keys: js.Array[Breakpoint] = js.native
    
    def only(key: Breakpoint): String = js.native
    
    def up(key: Double): String = js.native
    def up(key: Breakpoint): String = js.native
    
    var values: BreakpointValues = js.native
    
    def width(key: Breakpoint): Double = js.native
  }
  
  /* Inlined std.Partial<{  unit :string,   step :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
  @js.native
  trait BreakpointsOptions extends StObject {
    
    var between: js.UndefOr[js.Function2[/* start */ Breakpoint, /* end */ Breakpoint, String]] = js.native
    
    var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
    
    var keys: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var unit: js.UndefOr[String] = js.native
    
    var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
    
    var values: js.UndefOr[BreakpointValues] = js.native
    
    var width: js.UndefOr[js.Function1[/* key */ Breakpoint, Double]] = js.native
  }
  object BreakpointsOptions {
    
    @scala.inline
    def apply(): BreakpointsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointsOptions]
    }
    
    @scala.inline
    implicit class BreakpointsOptionsMutableBuilder[Self <: BreakpointsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: (/* start */ Breakpoint, /* end */ Breakpoint) => String): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      @scala.inline
      def setDown(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[Breakpoint]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: Breakpoint*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setOnly(value: /* key */ Breakpoint => String): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setUp(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      @scala.inline
      def setValues(value: BreakpointValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setWidth(value: /* key */ Breakpoint => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
