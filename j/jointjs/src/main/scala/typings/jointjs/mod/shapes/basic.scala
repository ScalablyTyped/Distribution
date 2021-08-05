package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.Attributes
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basic {
  
  @JSImport("jointjs", "shapes.basic.Circle")
  @js.native
  class Circle () extends Generic {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Ellipse")
  @js.native
  class Ellipse () extends Generic {
    def this(attributes: GenericAttributes[EllipseSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipseSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Generic")
  @js.native
  class Generic () extends Element {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Image")
  @js.native
  class Image () extends Generic {
    def this(attributes: GenericAttributes[ImageSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[ImageSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Path")
  @js.native
  class Path () extends Generic {
    def this(attributes: GenericAttributes[PathSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PathSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Polygon")
  @js.native
  class Polygon () extends Generic {
    def this(attributes: GenericAttributes[PolygonSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Polyline")
  @js.native
  class Polyline () extends Generic {
    def this(attributes: GenericAttributes[PolylineSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolylineSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Rect")
  @js.native
  class Rect () extends Generic {
    def this(attributes: GenericAttributes[RectSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[RectSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Rhombus")
  @js.native
  class Rhombus () extends Generic {
    def this(attributes: GenericAttributes[PathSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PathSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.Text")
  @js.native
  class Text () extends Generic {
    def this(attributes: GenericAttributes[SVGTextSelector]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGTextSelector], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.basic.TextBlock")
  @js.native
  class TextBlock () extends Generic {
    def this(attributes: GenericAttributes[TextBlockSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[TextBlockSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  trait CircleSelectors
    extends StObject
       with SVGTextSelector
       with SVGCircleSelector
  object CircleSelectors {
    
    inline def apply(): CircleSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleSelectors]
    }
  }
  
  trait EllipseSelectors
    extends StObject
       with SVGTextSelector
       with SVGEllipseSelector
  object EllipseSelectors {
    
    inline def apply(): EllipseSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipseSelectors]
    }
  }
  
  trait ImageSelectors
    extends StObject
       with SVGTextSelector
       with SVGImageSelector
  object ImageSelectors {
    
    inline def apply(): ImageSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageSelectors]
    }
  }
  
  trait PathSelectors
    extends StObject
       with SVGTextSelector
       with SVGPathSelector
  object PathSelectors {
    
    inline def apply(): PathSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathSelectors]
    }
  }
  
  trait PolygonSelectors
    extends StObject
       with SVGTextSelector
       with SVGPolygonSelector
  object PolygonSelectors {
    
    inline def apply(): PolygonSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolygonSelectors]
    }
  }
  
  trait PolylineSelectors
    extends StObject
       with SVGTextSelector
       with SVGPolylineSelector
  object PolylineSelectors {
    
    inline def apply(): PolylineSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolylineSelectors]
    }
  }
  
  trait RectSelectors
    extends StObject
       with SVGTextSelector
       with SVGRectSelector
  object RectSelectors {
    
    inline def apply(): RectSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectSelectors]
    }
  }
  
  trait TextBlockSelectors
    extends StObject
       with SVGTextSelector
       with SVGRectSelector {
    
    @JSName(".content")
    var Dotcontent: js.UndefOr[SVGTextAttributes] = js.undefined
  }
  object TextBlockSelectors {
    
    inline def apply(): TextBlockSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextBlockSelectors]
    }
    
    extension [Self <: TextBlockSelectors](x: Self) {
      
      inline def setDotcontent(value: SVGTextAttributes): Self = StObject.set(x, ".content", value.asInstanceOf[js.Any])
      
      inline def setDotcontentUndefined: Self = StObject.set(x, ".content", js.undefined)
    }
  }
}
