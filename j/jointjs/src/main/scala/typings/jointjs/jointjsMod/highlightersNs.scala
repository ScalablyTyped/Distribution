package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.attributesNs.NativeSVGAttributes
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.highlightersNs.AddClassHighlighterArguments
import typings.jointjs.jointjsMod.highlightersNs.GenericHighlighter
import typings.jointjs.jointjsMod.highlightersNs.GenericHighlighterArguments
import typings.jointjs.jointjsMod.highlightersNs.GenericHighlighterJSON
import typings.jointjs.jointjsMod.highlightersNs.HighlighterType
import typings.jointjs.jointjsMod.highlightersNs.OpacityHighlighterArguments
import typings.jointjs.jointjsMod.highlightersNs.StrokeHighlighterArguments
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "highlighters")
@js.native
object highlightersNs extends js.Object {
  trait AddClassHighlighterArguments extends js.Object {
    var className: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait GenericHighlighter[K /* <: HighlighterType */] extends js.Object {
    def highlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
    def highlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
    def unhighlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
    def unhighlight(cellView: CellView, magnetEl: SVGElement, opt: GenericHighlighterArguments[K]): Unit = js.native
  }
  
  trait GenericHighlighterJSON[K /* <: HighlighterType */] extends js.Object {
    var name: K
    var options: js.UndefOr[GenericHighlighterArguments[K]] = js.undefined
  }
  
  trait HighlighterArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    var addClass: AddClassHighlighterArguments
    var opacity: OpacityHighlighterArguments
    var stroke: StrokeHighlighterArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.addClass
    - typings.jointjs.jointjsStrings.opacity
    - typings.jointjs.jointjsStrings.stroke
  */
  trait HighlighterType extends js.Object
  
  trait OpacityHighlighterArguments extends js.Object
  
  trait StrokeHighlighterArguments extends js.Object {
    var attrs: js.UndefOr[NativeSVGAttributes] = js.undefined
    var padding: js.UndefOr[Double] = js.undefined
    var rx: js.UndefOr[Double] = js.undefined
    var ry: js.UndefOr[Double] = js.undefined
  }
  
  var addClass: GenericHighlighter[typings.jointjs.jointjsStrings.addClass] = js.native
  var opacity: GenericHighlighter[typings.jointjs.jointjsStrings.opacity] = js.native
  var stroke: GenericHighlighter[typings.jointjs.jointjsStrings.stroke] = js.native
  type GenericHighlighterArguments[K /* <: HighlighterType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.highlighters.HighlighterArgumentsMap[K] */ js.Any
  type Highlighter = GenericHighlighter[HighlighterType]
  type HighlighterArguments = GenericHighlighterArguments[HighlighterType]
  type HighlighterJSON = GenericHighlighterJSON[HighlighterType]
}

