package typings.lonaSvgModel

import typings.csscolorparserTs.mod.RGBA
import typings.lonaSvgModel.anon.ControlPoint
import typings.lonaSvgModel.anon.ControlPoint1
import typings.lonaSvgModel.anon.ConvertQuadraticsToCubics
import typings.lonaSvgModel.anon.Fill
import typings.lonaSvgModel.anon.Height
import typings.lonaSvgModel.anon.To
import typings.lonaSvgModel.anon.Type
import typings.lonaSvgModel.anon.`0`
import typings.lonaSvgModel.commandsMod.Command
import typings.lonaSvgModel.elementsMod.Path_
import typings.lonaSvgModel.elementsMod.SVGWithoutQuadratics
import typings.lonaSvgModel.elementsMod.SVG_
import typings.lonaSvgModel.primitivesMod.Point_
import typings.lonaSvgModel.primitivesMod.Rect_
import typings.lonaSvgModel.styleMod.Style_
import typings.lonaSvgModel.svgTypesMod.SVGNode
import typings.lonaSvgModel.svgTypesMod.SVGPathConvertibleNode
import typings.lonaSvgModel.svgTypesMod.SVGRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lona/svg-model/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[`0`]
  
  inline def convert(svg: String): SVGWithoutQuadratics = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any]).asInstanceOf[SVGWithoutQuadratics]
  inline def convert(svg: String, options: js.Object): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  inline def convert(svg: String, options: ConvertQuadraticsToCubics): SVGWithoutQuadratics = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVGWithoutQuadratics]
  
  inline def convert_SVG_(svg: String): SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any]).asInstanceOf[SVG_]
  
  inline def cubicCurve(to: Point_, controlPoint1: Point_, controlPoint2: Point_): ControlPoint1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicCurve")(to.asInstanceOf[js.Any], controlPoint1.asInstanceOf[js.Any], controlPoint2.asInstanceOf[js.Any])).asInstanceOf[ControlPoint1]
  
  inline def getCommandPoints[T /* <: Command */](command: T): js.Array[Point_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandPoints")(command.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point_]]
  
  inline def getDefinition(root: SVGRoot, id: String): js.UndefOr[SVGNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefinition")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGNode]]
  
  inline def getHrefNode(root: SVGRoot, id: String): js.UndefOr[SVGPathConvertibleNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHrefNode")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGPathConvertibleNode]]
  
  inline def line(to: Point_): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(to.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def mapCommandPoints[T /* <: Command */](command: T, transform: js.Function1[/* point */ Point_, Point_]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mapCommandPoints")(command.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def move(to: Point_): To = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(to.asInstanceOf[js.Any]).asInstanceOf[To]
  
  inline def parse(string: String): SVGRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[SVGRoot]
  
  inline def parseCSSColor(css_str: String): RGBA | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCSSColor")(css_str.asInstanceOf[js.Any]).asInstanceOf[RGBA | Null]
  
  inline def path(style: Style_, commands: js.Array[Command]): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(style.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def point(x: Double, y: Double): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point_]
  
  inline def quadCurve(to: Point_, controlPoint: Point_): ControlPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("quadCurve")(to.asInstanceOf[js.Any], controlPoint.asInstanceOf[js.Any])).asInstanceOf[ControlPoint]
  
  inline def rect(x: Double, y: Double, width: Double, height: Double): Rect_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Rect_]
  
  inline def style(): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")().asInstanceOf[Style_]
  inline def style(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity: Fill): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity.asInstanceOf[js.Any]).asInstanceOf[Style_]
  
  inline def svg(attributes: Height, unsupportedFeatures: js.Array[String]): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(attributes.asInstanceOf[js.Any], unsupportedFeatures.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  
  inline def traverse(root: SVGNode, f: js.Function1[/* node */ SVGNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(root.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
