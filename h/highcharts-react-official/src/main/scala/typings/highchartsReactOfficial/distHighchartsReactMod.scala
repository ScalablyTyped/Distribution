package typings.highchartsReactOfficial

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Options
import typings.highchartsReactOfficial.anon.TypeofHighcharts
import typings.highchartsReactOfficial.distHighchartsReactMod.HighchartsReact.Props
import typings.highchartsReactOfficial.distHighchartsReactMod.HighchartsReact.RefObject
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHighchartsReactMod {
  
  object default extends Shortcut {
    
    @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
    @js.native
    val ^ : ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = js.native
    
    type _To = ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = ^
  }
  
  object HighchartsReact extends Shortcut {
    
    @JSImport("highcharts-react-official/dist/highcharts-react", "HighchartsReact")
    @js.native
    val ^ : ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = js.native
    
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
    /* key */ StringDictionary[Any] {
      
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
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87, starting with typings.highchartsReactOfficial.highchartsReactOfficialStrings.getMagnitude, typings.highchartsReactOfficial.highchartsReactOfficialStrings.attr, typings.highchartsReactOfficial.highchartsReactOfficialStrings.discardElement */ Any
          ] = js.undefined
      
      /**
        * Properties of the chart container
        */
      var containerProps: js.UndefOr[StringDictionary[Any]] = js.undefined
      
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setAllowChartUpdate(value: Boolean): Self = StObject.set(x, "allowChartUpdate", value.asInstanceOf[js.Any])
        
        inline def setAllowChartUpdateUndefined: Self = StObject.set(x, "allowChartUpdate", js.undefined)
        
        inline def setCallback(value: /* chart */ Chart_ => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setConstructorType(
          value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87, starting with typings.highchartsReactOfficial.highchartsReactOfficialStrings.getMagnitude, typings.highchartsReactOfficial.highchartsReactOfficialStrings.attr, typings.highchartsReactOfficial.highchartsReactOfficialStrings.discardElement */ Any
        ): Self = StObject.set(x, "constructorType", value.asInstanceOf[js.Any])
        
        inline def setConstructorTypeUndefined: Self = StObject.set(x, "constructorType", js.undefined)
        
        inline def setContainerProps(value: StringDictionary[Any]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
        
        inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
        
        inline def setHighcharts(value: TypeofHighcharts): Self = StObject.set(x, "highcharts", value.asInstanceOf[js.Any])
        
        inline def setHighchartsUndefined: Self = StObject.set(x, "highcharts", js.undefined)
        
        inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
        
        inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
        
        inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = StObject.set(x, "updateArgs", value.asInstanceOf[js.Any])
        
        inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
        
        inline def setUpdateArgsVarargs(value: Boolean*): Self = StObject.set(x, "updateArgs", js.Array(value*))
      }
    }
    
    /**
      * Properties for a HighchartsReact component
      */
    trait RefObject extends StObject {
      
      var chart: Chart_
      
      /**
        * React reference
        */
      var container: typings.react.mod.RefObject[HTMLDivElement]
    }
    object RefObject {
      
      inline def apply(chart: Chart_, container: typings.react.mod.RefObject[HTMLDivElement]): RefObject = {
        val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
        __obj.asInstanceOf[RefObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RefObject] (val x: Self) extends AnyVal {
        
        inline def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
        
        inline def setContainer(value: typings.react.mod.RefObject[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]]
    
    /* This means you don't have to write `^`, but can instead just say `HighchartsReact.foo` */
    override def _to: ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = ^
  }
}
