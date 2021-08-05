package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.addClass
import typings.jointjs.jointjsStrings.opacity
import typings.jointjs.jointjsStrings.stroke
import typings.jointjs.mod.attributes.NativeSVGAttributes
import typings.jointjs.mod.dia.CellView
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighters {
  
  @JSImport("jointjs", "highlighters")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "highlighters.addClass")
  @js.native
  def addClass: GenericHighlighter[typings.jointjs.jointjsStrings.addClass] = js.native
  inline def addClass_=(x: GenericHighlighter[addClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addClass")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "highlighters.opacity")
  @js.native
  def opacity: GenericHighlighter[typings.jointjs.jointjsStrings.opacity] = js.native
  inline def opacity_=(x: GenericHighlighter[opacity]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "highlighters.stroke")
  @js.native
  def stroke: GenericHighlighter[typings.jointjs.jointjsStrings.stroke] = js.native
  inline def stroke_=(x: GenericHighlighter[stroke]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  
  trait AddClassHighlighterArguments extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object AddClassHighlighterArguments {
    
    inline def apply(): AddClassHighlighterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddClassHighlighterArguments]
    }
    
    extension [Self <: AddClassHighlighterArguments](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait GenericHighlighter[K /* <: HighlighterType */] extends StObject {
    
    def highlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
    def highlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
    
    def unhighlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
    def unhighlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
  }
  
  type GenericHighlighterArguments[K /* <: HighlighterType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.highlighters.HighlighterArgumentsMap[K] */ js.Any
  
  trait GenericHighlighterJSON[K /* <: HighlighterType */] extends StObject {
    
    var name: K
    
    var options: js.UndefOr[GenericHighlighterArguments[K]] = js.undefined
  }
  object GenericHighlighterJSON {
    
    inline def apply[K /* <: HighlighterType */](name: K): GenericHighlighterJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericHighlighterJSON[K]]
    }
    
    extension [Self <: GenericHighlighterJSON[?], K /* <: HighlighterType */](x: Self & GenericHighlighterJSON[K]) {
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: GenericHighlighterArguments[K]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type Highlighter = GenericHighlighter[HighlighterType]
  
  /* Inlined jointjs.jointjs.highlighters.GenericHighlighterArguments<jointjs.jointjs.highlighters.HighlighterType> */
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.rx
    - typings.jointjs.jointjsStrings.className
    - typings.jointjs.jointjsStrings.ry
    - typings.jointjs.jointjsStrings.attrs
    - typings.jointjs.jointjsStrings.padding
  */
  trait HighlighterArguments extends StObject
  object HighlighterArguments {
    
    inline def attrs: typings.jointjs.jointjsStrings.attrs = "attrs".asInstanceOf[typings.jointjs.jointjsStrings.attrs]
    
    inline def className: typings.jointjs.jointjsStrings.className = "className".asInstanceOf[typings.jointjs.jointjsStrings.className]
    
    inline def padding: typings.jointjs.jointjsStrings.padding = "padding".asInstanceOf[typings.jointjs.jointjsStrings.padding]
    
    inline def rx: typings.jointjs.jointjsStrings.rx = "rx".asInstanceOf[typings.jointjs.jointjsStrings.rx]
    
    inline def ry: typings.jointjs.jointjsStrings.ry = "ry".asInstanceOf[typings.jointjs.jointjsStrings.ry]
  }
  
  trait HighlighterArgumentsMap
    extends StObject
       with /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var addClass: AddClassHighlighterArguments
    
    var opacity: OpacityHighlighterArguments
    
    var stroke: StrokeHighlighterArguments
  }
  object HighlighterArgumentsMap {
    
    inline def apply(
      addClass: AddClassHighlighterArguments,
      opacity: OpacityHighlighterArguments,
      stroke: StrokeHighlighterArguments
    ): HighlighterArgumentsMap = {
      val __obj = js.Dynamic.literal(addClass = addClass.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlighterArgumentsMap]
    }
    
    extension [Self <: HighlighterArgumentsMap](x: Self) {
      
      inline def setAddClass(value: AddClassHighlighterArguments): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: OpacityHighlighterArguments): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: StrokeHighlighterArguments): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    }
  }
  
  type HighlighterJSON = GenericHighlighterJSON[HighlighterType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.addClass
    - typings.jointjs.jointjsStrings.opacity
    - typings.jointjs.jointjsStrings.stroke
  */
  trait HighlighterType extends StObject
  
  trait OpacityHighlighterArguments extends StObject
  
  trait StrokeHighlighterArguments extends StObject {
    
    var attrs: js.UndefOr[NativeSVGAttributes] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
  }
  object StrokeHighlighterArguments {
    
    inline def apply(): StrokeHighlighterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrokeHighlighterArguments]
    }
    
    extension [Self <: StrokeHighlighterArguments](x: Self) {
      
      inline def setAttrs(value: NativeSVGAttributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
