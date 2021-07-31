package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Border
import typings.grommet.anon.Index
import typings.grommet.anon.Light
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.Element
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/List", "List")
  @js.native
  class List protected ()
    extends Component[
          ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
    def this(
      props: ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/List", "List")
  @js.native
  val List: ComponentClass[
    ListProps & (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
    ComponentState
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.grommet.listMod.SideType
    - typings.grommet.anon.Size
  */
  type BorderType = _BorderType | Boolean
  
  trait ListProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var action: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, Unit]] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String | js.Array[String] | Light] = js.undefined
    
    var border: js.UndefOr[BorderType] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Object | String]] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var itemProps: js.UndefOr[StringDictionary[Border]] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onClickItem: js.UndefOr[
        js.Function1[(/* event */ Index) | (/* event */ MouseEvent[Element, NativeMouseEvent]), Unit]
      ] = js.undefined
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pad: js.UndefOr[PadType] = js.undefined
    
    var primaryKey: js.UndefOr[String | (js.Function1[/* item */ js.Any, ReactElement])] = js.undefined
    
    var secondaryKey: js.UndefOr[String | (js.Function1[/* item */ js.Any, ReactElement])] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAction(value: (/* item */ js.Any, /* index */ Double) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBackground(value: String | js.Array[String] | Light): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      @scala.inline
      def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Object | String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: (js.Object | String)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setItemProps(value: StringDictionary[Border]): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropsUndefined: Self = StObject.set(x, "itemProps", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClickItem(value: (/* event */ Index) | (/* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClickItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickItemUndefined: Self = StObject.set(x, "onClickItem", js.undefined)
      
      @scala.inline
      def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: String | (js.Function1[/* item */ js.Any, ReactElement])): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyFunction1(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "primaryKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setSecondaryKey(value: String | (js.Function1[/* item */ js.Any, ReactElement])): Self = StObject.set(x, "secondaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryKeyFunction1(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "secondaryKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSecondaryKeyUndefined: Self = StObject.set(x, "secondaryKey", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.none
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type PadSizeType = _PadSizeType | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.listMod.PadSizeType
    - typings.grommet.anon.Left
  */
  type PadType = _PadType | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.top
    - typings.grommet.grommetStrings.left
    - typings.grommet.grommetStrings.bottom
    - typings.grommet.grommetStrings.right
    - typings.grommet.grommetStrings.horizontal
    - typings.grommet.grommetStrings.vertical
    - typings.grommet.grommetStrings.all
  */
  trait SideType
    extends StObject
       with _BorderType
  object SideType {
    
    @scala.inline
    def all: typings.grommet.grommetStrings.all = "all".asInstanceOf[typings.grommet.grommetStrings.all]
    
    @scala.inline
    def bottom: typings.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typings.grommet.grommetStrings.bottom]
    
    @scala.inline
    def horizontal: typings.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typings.grommet.grommetStrings.horizontal]
    
    @scala.inline
    def left: typings.grommet.grommetStrings.left = "left".asInstanceOf[typings.grommet.grommetStrings.left]
    
    @scala.inline
    def right: typings.grommet.grommetStrings.right = "right".asInstanceOf[typings.grommet.grommetStrings.right]
    
    @scala.inline
    def top: typings.grommet.grommetStrings.top = "top".asInstanceOf[typings.grommet.grommetStrings.top]
    
    @scala.inline
    def vertical: typings.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typings.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.xxsmall
    - typings.grommet.grommetStrings.xsmall
    - typings.grommet.grommetStrings.small
    - typings.grommet.grommetStrings.medium
    - typings.grommet.grommetStrings.large
    - typings.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type SizeType = _SizeType | String
  
  trait _BorderType extends StObject
  
  trait _PadSizeType
    extends StObject
       with _PadType
  
  trait _PadType extends StObject
  
  trait _SizeType extends StObject
}
