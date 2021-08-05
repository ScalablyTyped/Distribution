package typings.highchartsReactOfficial

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Options
import typings.highchartsReactOfficial.anon.Chart
import typings.highchartsReactOfficial.anon.TypeofHighcharts
import typings.highchartsReactOfficial.highchartsReactMod.HighchartsReact.Props
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highchartsReactMod {
  
  object default extends Shortcut {
    
    @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
    @js.native
    val ^ : ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[Chart]] = js.native
    
    type _To = ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[Chart]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[Chart]] = ^
  }
  
  object HighchartsReact {
    
    /**
      * Properties for a Highcharts component
      */
    trait Props
      extends StObject
         with /* *
      *
      *  Properties
      *
      * */
    /**
      * Indexer for custom properties
      */
    /* key */ StringDictionary[js.Any] {
      
      /**
        * Flag for `Chart.update` call (Default: true)
        */
      var allowChartUpdate: js.UndefOr[Boolean] = js.undefined
      
      /* *
        *
        *  Functions
        *
        * */
      /**
        * Callback for the chart factory
        */
      var callback: js.UndefOr[ChartCallbackFunction] = js.undefined
      
      /**
        * Reference to the chart factory (Default: chart)
        */
      var constructorType: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81 */ js.Any
          ] = js.undefined
      
      /**
        * Properties of the chart container
        */
      var containerProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
      
      /**
        * Highcharts namespace
        */
      var highcharts: js.UndefOr[TypeofHighcharts] = js.undefined
      
      /**
        * Immutably recreates the chart on receiving new props
        */
      var immutable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Highcharts options
        */
      var options: js.UndefOr[Options] = js.undefined
      
      /**
        * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
        * [true, true, true])
        */
      var updateArgs: js.UndefOr[
            js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])
          ] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAllowChartUpdate(value: Boolean): Self = StObject.set(x, "allowChartUpdate", value.asInstanceOf[js.Any])
        
        inline def setAllowChartUpdateUndefined: Self = StObject.set(x, "allowChartUpdate", js.undefined)
        
        inline def setCallback(value: /* chart */ Chart_ => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setConstructorType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81 */ js.Any): Self = StObject.set(x, "constructorType", value.asInstanceOf[js.Any])
        
        inline def setConstructorTypeUndefined: Self = StObject.set(x, "constructorType", js.undefined)
        
        inline def setContainerProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
        
        inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
        
        inline def setHighcharts(value: TypeofHighcharts): Self = StObject.set(x, "highcharts", value.asInstanceOf[js.Any])
        
        inline def setHighchartsUndefined: Self = StObject.set(x, "highcharts", js.undefined)
        
        inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
        
        inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
        
        inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = StObject.set(x, "updateArgs", value.asInstanceOf[js.Any])
        
        inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
        
        inline def setUpdateArgsVarargs(value: Boolean*): Self = StObject.set(x, "updateArgs", js.Array(value :_*))
      }
    }
  }
}
