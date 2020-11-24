package typings.highchartsReactOfficial.highchartsReactMod.HighchartsReact

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Options
import typings.highchartsReactOfficial.anon.TypeofHighcharts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowChartUpdate(value: Boolean): Self = this.set("allowChartUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChartUpdate: Self = this.set("allowChartUpdate", js.undefined)
    
    @scala.inline
    def setCallback(value: /* chart */ Chart_ => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setConstructorType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81 */ js.Any): Self = this.set("constructorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstructorType: Self = this.set("constructorType", js.undefined)
    
    @scala.inline
    def setContainerProps(value: StringDictionary[js.Any]): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setHighcharts(value: TypeofHighcharts): Self = this.set("highcharts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighcharts: Self = this.set("highcharts", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setUpdateArgsVarargs(value: Boolean*): Self = this.set("updateArgs", js.Array(value :_*))
    
    @scala.inline
    def setUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = this.set("updateArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateArgs: Self = this.set("updateArgs", js.undefined)
  }
}
