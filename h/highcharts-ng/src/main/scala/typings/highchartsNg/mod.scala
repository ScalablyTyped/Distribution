package typings.highchartsNg

import typings.highcharts.mod.Options
import typings.highchartsNg.anon.CurrentMax
import typings.highchartsNg.anon.Height
import typings.highchartsNg.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    //Instantiated Chart
    trait HighChartsNGChart
      extends StObject
         with HighChartsNGConfig {
      
      //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
      def getHighcharts(): Any
    }
    object HighChartsNGChart {
      
      inline def apply(getHighcharts: () => Any, options: Options): HighChartsNGChart = {
        val __obj = js.Dynamic.literal(getHighcharts = js.Any.fromFunction0(getHighcharts), options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[HighChartsNGChart]
      }
      
      extension [Self <: HighChartsNGChart](x: Self) {
        
        inline def setGetHighcharts(value: () => Any): Self = StObject.set(x, "getHighcharts", js.Any.fromFunction0(value))
      }
    }
    
    trait HighChartsNGConfig extends StObject {
      
      //function (optional) - setup some logic for the chart
      var func: js.UndefOr[
            js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ Any, 
              Unit
            ]
          ] = js.undefined
      
      //Boolean to control showng loading status on chart (optional)
      //Could be a string if you want to show specific loading text.
      var loading: js.UndefOr[Boolean | String] = js.undefined
      
      //no data text (optional) to show if all series are empty
      var noData: js.UndefOr[String] = js.undefined
      
      var options: Options
      
      //The below properties are watched separately for changes.
      //Series object (optional) - a list of series using normal highcharts series options.
      var series: js.UndefOr[
            js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ Any
            ]
          ] = js.undefined
      
      //size (optional) if left out the chart will default to size of the div or something sensible.
      var size: js.UndefOr[Height] = js.undefined
      
      //Title configuration (optional)
      var title: js.UndefOr[Text] = js.undefined
      
      //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
      var useHighStocks: js.UndefOr[Boolean] = js.undefined
      
      //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
      //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
      var xAxis: js.UndefOr[CurrentMax] = js.undefined
    }
    object HighChartsNGConfig {
      
      inline def apply(options: Options): HighChartsNGConfig = {
        val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[HighChartsNGConfig]
      }
      
      extension [Self <: HighChartsNGConfig](x: Self) {
        
        inline def setFunc(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ Any => Unit
        ): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
        
        inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
        
        inline def setLoading(value: Boolean | String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
        
        inline def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
        
        inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
        
        inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setSeries(
          value: js.Array[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ Any
                ]
        ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        inline def setSeriesVarargs(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ Any)*
        ): Self = StObject.set(x, "series", js.Array(value*))
        
        inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUseHighStocks(value: Boolean): Self = StObject.set(x, "useHighStocks", value.asInstanceOf[js.Any])
        
        inline def setUseHighStocksUndefined: Self = StObject.set(x, "useHighStocks", js.undefined)
        
        inline def setXAxis(value: CurrentMax): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
        
        inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      }
    }
  }
}
