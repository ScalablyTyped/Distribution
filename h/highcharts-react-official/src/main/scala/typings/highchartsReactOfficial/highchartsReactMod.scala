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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highchartsReactMod {
  
  object default extends Shortcut {
    
    @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
    @js.native
    val ^ : ForwardRefExoticComponent[PropsWithoutRef[Props] with RefAttributes[Chart]] = js.native
    
    type _To = ForwardRefExoticComponent[PropsWithoutRef[Props] with RefAttributes[Chart]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ForwardRefExoticComponent[PropsWithoutRef[Props] with RefAttributes[Chart]] = ^
  }
  
  object HighchartsReact {
    
    /**
      * Properties for a Highcharts component
      */
    @js.native
    trait Props
      extends /* *
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
      var allowChartUpdate: js.UndefOr[Boolean] = js.native
      
      /* *
        *
        *  Functions
        *
        * */
      /**
        * Callback for the chart factory
        */
      var callback: js.UndefOr[ChartCallbackFunction] = js.native
      
      /**
        * Reference to the chart factory (Default: chart)
        */
      var constructorType: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81 */ js.Any
          ] = js.native
      
      /**
        * Properties of the chart container
        */
      var containerProps: js.UndefOr[StringDictionary[js.Any]] = js.native
      
      /**
        * Highcharts namespace
        */
      var highcharts: js.UndefOr[TypeofHighcharts] = js.native
      
      /**
        * Immutably recreates the chart on receiving new props
        */
      var immutable: js.UndefOr[Boolean] = js.native
      
      /**
        * Highcharts options
        */
      var options: js.UndefOr[Options] = js.native
      
      /**
        * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
        * [true, true, true])
        */
      var updateArgs: js.UndefOr[
            js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])
          ] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowChartUpdate(value: Boolean): Self = StObject.set(x, "allowChartUpdate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowChartUpdateUndefined: Self = StObject.set(x, "allowChartUpdate", js.undefined)
        
        @scala.inline
        def setCallback(value: /* chart */ Chart_ => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setConstructorType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81 */ js.Any): Self = StObject.set(x, "constructorType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConstructorTypeUndefined: Self = StObject.set(x, "constructorType", js.undefined)
        
        @scala.inline
        def setContainerProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
        
        @scala.inline
        def setHighcharts(value: TypeofHighcharts): Self = StObject.set(x, "highcharts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighchartsUndefined: Self = StObject.set(x, "highcharts", js.undefined)
        
        @scala.inline
        def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
        
        @scala.inline
        def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = StObject.set(x, "updateArgs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
        
        @scala.inline
        def setUpdateArgsVarargs(value: Boolean*): Self = StObject.set(x, "updateArgs", js.Array(value :_*))
      }
    }
  }
}
