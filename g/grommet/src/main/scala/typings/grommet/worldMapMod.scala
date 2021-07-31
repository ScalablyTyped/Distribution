package typings.grommet

import typings.grommet.anon.Dark
import typings.grommet.anon.Location
import typings.grommet.anon.Name
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SVGProps
import typings.std.Omit
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worldMapMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/WorldMap", "WorldMap")
  @js.native
  class WorldMap protected ()
    extends Component[WorldMapProps & (Omit[SVGProps[SVGSVGElement], color]), ComponentState, js.Any] {
    def this(props: WorldMapProps & (Omit[SVGProps[SVGSVGElement], color])) = this()
    def this(props: WorldMapProps & (Omit[SVGProps[SVGSVGElement], color]), context: js.Any) = this()
  }
  @JSImport("grommet/components/WorldMap", "WorldMap")
  @js.native
  val WorldMap: ComponentClass[WorldMapProps & (Omit[SVGProps[SVGSVGElement], color]), ComponentState] = js.native
  
  trait WorldMapProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var continents: js.UndefOr[js.Array[Name]] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hoverColor: js.UndefOr[String | Dark] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.undefined
    
    var places: js.UndefOr[js.Array[Location]] = js.undefined
  }
  object WorldMapProps {
    
    @scala.inline
    def apply(): WorldMapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorldMapProps]
    }
    
    @scala.inline
    implicit class WorldMapPropsMutableBuilder[Self <: WorldMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContinents(value: js.Array[Name]): Self = StObject.set(x, "continents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinentsUndefined: Self = StObject.set(x, "continents", js.undefined)
      
      @scala.inline
      def setContinentsVarargs(value: Name*): Self = StObject.set(x, "continents", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHoverColor(value: String | Dark): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnSelectPlace(value: /* place */ js.Array[Double] => Unit): Self = StObject.set(x, "onSelectPlace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectPlaceUndefined: Self = StObject.set(x, "onSelectPlace", js.undefined)
      
      @scala.inline
      def setPlaces(value: js.Array[Location]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
      
      @scala.inline
      def setPlacesVarargs(value: Location*): Self = StObject.set(x, "places", js.Array(value :_*))
    }
  }
}
