package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "highlighters")
@js.native
object highlightersNs extends js.Object {
  trait AddClassHighlighterArguments extends js.Object {
    var className: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait GenericHighlighter[K /* <: HighlighterType */] extends js.Object {
    def highlight(cellView: jointjsLib.jointjsMod.diaNs.CellView, magnetEl: stdLib.SVGElement): scala.Unit = js.native
    def highlight(
      cellView: jointjsLib.jointjsMod.diaNs.CellView,
      magnetEl: stdLib.SVGElement,
      opt: GenericHighlighterArguments[K]
    ): scala.Unit = js.native
    def unhighlight(cellView: jointjsLib.jointjsMod.diaNs.CellView, magnetEl: stdLib.SVGElement): scala.Unit = js.native
    def unhighlight(
      cellView: jointjsLib.jointjsMod.diaNs.CellView,
      magnetEl: stdLib.SVGElement,
      opt: GenericHighlighterArguments[K]
    ): scala.Unit = js.native
  }
  
  trait GenericHighlighterJSON[K /* <: HighlighterType */] extends js.Object {
    var name: K
    var options: js.UndefOr[GenericHighlighterArguments[K]] = js.undefined
  }
  
  trait HighlighterArgumentsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
    var addClass: AddClassHighlighterArguments
    var opacity: OpacityHighlighterArguments
    var stroke: StrokeHighlighterArguments
  }
  
  trait HighlighterType extends js.Object
  
  trait OpacityHighlighterArguments extends js.Object
  
  trait StrokeHighlighterArguments extends js.Object {
    var attrs: js.UndefOr[jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var rx: js.UndefOr[scala.Double] = js.undefined
    var ry: js.UndefOr[scala.Double] = js.undefined
  }
  
  var addClass: GenericHighlighter[jointjsLib.jointjsLibStrings.addClass] = js.native
  var opacity: GenericHighlighter[jointjsLib.jointjsLibStrings.opacity] = js.native
  var stroke: GenericHighlighter[jointjsLib.jointjsLibStrings.stroke] = js.native
  type GenericHighlighterArguments[K /* <: HighlighterType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.highlighters.HighlighterArgumentsMap[K] */ js.Any
  type Highlighter = GenericHighlighter[HighlighterType]
  type HighlighterArguments = GenericHighlighterArguments[HighlighterType]
  type HighlighterJSON = GenericHighlighterJSON[HighlighterType]
}

