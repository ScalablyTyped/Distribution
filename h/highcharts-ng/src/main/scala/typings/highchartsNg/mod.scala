package typings.highchartsNg

import typings.highcharts.mod.Options
import typings.highchartsNg.anon.CurrentMax
import typings.highchartsNg.anon.Height
import typings.highchartsNg.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    //Instantiated Chart
    @js.native
    trait HighChartsNGChart extends HighChartsNGConfig {
      
      //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
      def getHighcharts(): js.Any = js.native
    }
    object HighChartsNGChart {
      
      @scala.inline
      def apply(getHighcharts: () => js.Any, options: Options): HighChartsNGChart = {
        val __obj = js.Dynamic.literal(getHighcharts = js.Any.fromFunction0(getHighcharts), options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[HighChartsNGChart]
      }
      
      @scala.inline
      implicit class HighChartsNGChartMutableBuilder[Self <: HighChartsNGChart] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetHighcharts(value: () => js.Any): Self = StObject.set(x, "getHighcharts", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait HighChartsNGConfig extends StObject {
      
      //function (optional) - setup some logic for the chart
      var func: js.UndefOr[
            js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any, 
              Unit
            ]
          ] = js.native
      
      //Boolean to control showng loading status on chart (optional)
      //Could be a string if you want to show specific loading text.
      var loading: js.UndefOr[Boolean | String] = js.native
      
      //no data text (optional) to show if all series are empty
      var noData: js.UndefOr[String] = js.native
      
      var options: Options = js.native
      
      //The below properties are watched separately for changes.
      //Series object (optional) - a list of series using normal highcharts series options.
      var series: js.UndefOr[
            js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
            ]
          ] = js.native
      
      //size (optional) if left out the chart will default to size of the div or something sensible.
      var size: js.UndefOr[Height] = js.native
      
      //Title configuration (optional)
      var title: js.UndefOr[Text] = js.native
      
      //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
      var useHighStocks: js.UndefOr[Boolean] = js.native
      
      //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
      //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
      var xAxis: js.UndefOr[CurrentMax] = js.native
    }
    object HighChartsNGConfig {
      
      @scala.inline
      def apply(options: Options): HighChartsNGConfig = {
        val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[HighChartsNGConfig]
      }
      
      @scala.inline
      implicit class HighChartsNGConfigMutableBuilder[Self <: HighChartsNGConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFunc(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any => Unit
        ): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
        
        @scala.inline
        def setLoading(value: Boolean | String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
        
        @scala.inline
        def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
        
        @scala.inline
        def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeries(
          value: js.Array[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
                ]
        ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setSeriesVarargs(value: js.Any*): Self = StObject.set(x, "series", js.Array(value :_*))
        
        @scala.inline
        def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUseHighStocks(value: Boolean): Self = StObject.set(x, "useHighStocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseHighStocksUndefined: Self = StObject.set(x, "useHighStocks", js.undefined)
        
        @scala.inline
        def setXAxis(value: CurrentMax): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      }
    }
  }
}
