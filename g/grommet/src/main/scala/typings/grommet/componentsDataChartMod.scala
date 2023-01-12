package typings.grommet

import typings.grommet.anon.Dash
import typings.grommet.anon.Gap
import typings.grommet.anon.Height
import typings.grommet.anon.Prefix
import typings.grommet.anon.Side
import typings.grommet.anon.X
import typings.grommet.anon.XY
import typings.grommet.anon.Y
import typings.grommet.componentsGridMod.GridGapType
import typings.grommet.grommetStrings.align
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDataChartMod {
  
  @JSImport("grommet/components/DataChart", "DataChart")
  @js.native
  val DataChart: FC[DataChartProps] = js.native
  
  type ChartType = String | Dash
  
  trait DataChartProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    // axis - when true, {
    //   x: { property: 'date' <if any>, granularity: 'coarse' },
    //   y: { property: property[0].property, granularity: 'coarse' },
    // }
    var axis: js.UndefOr[Boolean | X] = js.undefined
    
    var bounds: js.UndefOr[align | Y] = js.undefined
    
    // chart - if undefined, { type: 'bar', property: <first series property> }
    var chart: js.UndefOr[ChartType | js.Array[ChartType]] = js.undefined
    
    // data - an array of objects containing data values
    var data: js.Array[js.Object]
    
    // detail - whether to show details via hover/touch interaction
    var detail: js.UndefOr[Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactNode])] = js.undefined
    
    var gap: js.UndefOr[GridGapType] = js.undefined
    
    // between axes and guides/visuals
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    // generic
    // guide - when true, {
    //   x: { granularity: 'coarse' },
    //   y: { granularity: 'coarse' },
    // }
    var guide: js.UndefOr[Boolean | XY] = js.undefined
    
    // legend - when true, { side: 'bottom' }
    var legend: js.UndefOr[Boolean | Side] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    // offset - whether to shift the charts to reveal them all, mostly useful
    // for bar charts
    var offset: js.UndefOr[Boolean | Gap] = js.undefined
    
    // pad - padding around the guides/visuals
    // defaults to what's needed based on axis and chart types
    var pad: js.UndefOr[PadType] = js.undefined
    
    var placeholder: js.UndefOr[String | ReactNode] = js.undefined
    
    // series - the data item properties and any
    var series: SeriesType | js.Array[SeriesType]
    
    // generic
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
      ] = js.undefined
  }
  object DataChartProps {
    
    inline def apply(data: js.Array[js.Object], series: SeriesType | js.Array[SeriesType]): DataChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataChartProps] (val x: Self) extends AnyVal {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAxis(value: Boolean | X): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBounds(value: align | Y): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setChart(value: ChartType | js.Array[ChartType]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      inline def setChartVarargs(value: ChartType*): Self = StObject.set(x, "chart", js.Array(value*))
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDetail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, ReactNode])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailFunction2(value: (/* datum */ js.Object, /* index */ Double) => ReactNode): Self = StObject.set(x, "detail", js.Any.fromFunction2(value))
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setGap(value: GridGapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGuide(value: Boolean | XY): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setLegend(value: Boolean | Side): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: Boolean | Gap): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPlaceholder(value: String | ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSeries(value: SeriesType | js.Array[SeriesType]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesVarargs(value: SeriesType*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.coarse
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.fine
  */
  trait GranularityType extends StObject
  object GranularityType {
    
    inline def coarse: typings.grommet.grommetStrings.coarse = "coarse".asInstanceOf[typings.grommet.grommetStrings.coarse]
    
    inline def fine: typings.grommet.grommetStrings.fine = "fine".asInstanceOf[typings.grommet.grommetStrings.fine]
    
    inline def medium: typings.grommet.grommetStrings.medium = "medium".asInstanceOf[typings.grommet.grommetStrings.medium]
  }
  
  type SeriesType = String | Prefix
}
