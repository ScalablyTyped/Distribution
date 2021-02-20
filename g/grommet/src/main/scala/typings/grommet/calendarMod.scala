package typings.grommet

import typings.grommet.grommetNumbers.`0`
import typings.grommet.grommetNumbers.`1`
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.onSelect
import typings.grommet.grommetStrings.small
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.AnimateType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[
          CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Calendar", "Calendar")
  @js.native
  val Calendar: ComponentClass[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @js.native
  trait CalendarProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var animate: js.UndefOr[AnimateType] = js.native
    
    var bounds: js.UndefOr[js.Array[String]] = js.native
    
    var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var date: js.UndefOr[String] = js.native
    
    var dates: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
    
    var daysOfWeek: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var firstDayOfWeek: js.UndefOr[`0` | `1`] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var header: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var onReference: js.UndefOr[js.Function1[/* reference */ String, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* select */ String | js.Array[String], _]] = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var reference: js.UndefOr[String] = js.native
    
    var showAdjacentDays: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | String] = js.native
  }
  object CalendarProps {
    
    @scala.inline
    def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setBounds(value: js.Array[String]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setBoundsVarargs(value: String*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: /* repeated */ js.Any => _): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDates(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
      
      @scala.inline
      def setDatesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "dates", js.Array(value :_*))
      
      @scala.inline
      def setDaysOfWeek(value: Boolean): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
      
      @scala.inline
      def setDisabled(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisabledVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: `0` | `1`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHeader(value: /* repeated */ js.Any => _): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnReference(value: /* reference */ String => Unit): Self = StObject.set(x, "onReference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReferenceUndefined: Self = StObject.set(x, "onReference", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* select */ String | js.Array[String] => _): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      @scala.inline
      def setShowAdjacentDays(value: Boolean): Self = StObject.set(x, "showAdjacentDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAdjacentDaysUndefined: Self = StObject.set(x, "showAdjacentDays", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type CalendarType = CalendarProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onSelect])
}
