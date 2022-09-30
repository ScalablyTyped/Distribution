package typings.leaflet.mod

import typings.leaflet.leafletStrings.a
import typings.leaflet.leafletStrings.animate
import typings.leaflet.leafletStrings.animateMotion
import typings.leaflet.leafletStrings.animateTransform
import typings.leaflet.leafletStrings.clipPath
import typings.leaflet.leafletStrings.defs
import typings.leaflet.leafletStrings.desc
import typings.leaflet.leafletStrings.ellipse
import typings.leaflet.leafletStrings.feBlend
import typings.leaflet.leafletStrings.feColorMatrix
import typings.leaflet.leafletStrings.feComponentTransfer
import typings.leaflet.leafletStrings.feComposite
import typings.leaflet.leafletStrings.feConvolveMatrix
import typings.leaflet.leafletStrings.feDiffuseLighting
import typings.leaflet.leafletStrings.feDisplacementMap
import typings.leaflet.leafletStrings.feDistantLight
import typings.leaflet.leafletStrings.feDropShadow
import typings.leaflet.leafletStrings.feFlood
import typings.leaflet.leafletStrings.feFuncA
import typings.leaflet.leafletStrings.feFuncB
import typings.leaflet.leafletStrings.feFuncG
import typings.leaflet.leafletStrings.feFuncR
import typings.leaflet.leafletStrings.feGaussianBlur
import typings.leaflet.leafletStrings.feImage
import typings.leaflet.leafletStrings.feMerge
import typings.leaflet.leafletStrings.feMergeNode
import typings.leaflet.leafletStrings.feMorphology
import typings.leaflet.leafletStrings.feOffset
import typings.leaflet.leafletStrings.fePointLight
import typings.leaflet.leafletStrings.feSpecularLighting
import typings.leaflet.leafletStrings.feSpotLight
import typings.leaflet.leafletStrings.feTile
import typings.leaflet.leafletStrings.feTurbulence
import typings.leaflet.leafletStrings.filter
import typings.leaflet.leafletStrings.foreignObject
import typings.leaflet.leafletStrings.g
import typings.leaflet.leafletStrings.image
import typings.leaflet.leafletStrings.line
import typings.leaflet.leafletStrings.linearGradient
import typings.leaflet.leafletStrings.mask
import typings.leaflet.leafletStrings.metadata
import typings.leaflet.leafletStrings.mpath
import typings.leaflet.leafletStrings.path
import typings.leaflet.leafletStrings.pattern
import typings.leaflet.leafletStrings.radialGradient
import typings.leaflet.leafletStrings.rect
import typings.leaflet.leafletStrings.script
import typings.leaflet.leafletStrings.set
import typings.leaflet.leafletStrings.stop
import typings.leaflet.leafletStrings.style
import typings.leaflet.leafletStrings.switch
import typings.leaflet.leafletStrings.symbol
import typings.leaflet.leafletStrings.text
import typings.leaflet.leafletStrings.textPath
import typings.leaflet.leafletStrings.title
import typings.leaflet.leafletStrings.tspan
import typings.leaflet.leafletStrings.use
import typings.leaflet.leafletStrings.view
import typings.std.SVGAElement
import typings.std.SVGAnimateElement
import typings.std.SVGAnimateMotionElement
import typings.std.SVGAnimateTransformElement
import typings.std.SVGCircleElement
import typings.std.SVGClipPathElement
import typings.std.SVGDefsElement
import typings.std.SVGDescElement
import typings.std.SVGElement
import typings.std.SVGEllipseElement
import typings.std.SVGFEBlendElement
import typings.std.SVGFEColorMatrixElement
import typings.std.SVGFEComponentTransferElement
import typings.std.SVGFECompositeElement
import typings.std.SVGFEConvolveMatrixElement
import typings.std.SVGFEDiffuseLightingElement
import typings.std.SVGFEDisplacementMapElement
import typings.std.SVGFEDistantLightElement
import typings.std.SVGFEDropShadowElement
import typings.std.SVGFEFloodElement
import typings.std.SVGFEFuncAElement
import typings.std.SVGFEFuncBElement
import typings.std.SVGFEFuncGElement
import typings.std.SVGFEFuncRElement
import typings.std.SVGFEGaussianBlurElement
import typings.std.SVGFEImageElement
import typings.std.SVGFEMergeElement
import typings.std.SVGFEMergeNodeElement
import typings.std.SVGFEMorphologyElement
import typings.std.SVGFEOffsetElement
import typings.std.SVGFEPointLightElement
import typings.std.SVGFESpecularLightingElement
import typings.std.SVGFESpotLightElement
import typings.std.SVGFETileElement
import typings.std.SVGFETurbulenceElement
import typings.std.SVGFilterElement
import typings.std.SVGForeignObjectElement
import typings.std.SVGGElement
import typings.std.SVGImageElement
import typings.std.SVGLineElement
import typings.std.SVGLinearGradientElement
import typings.std.SVGMPathElement
import typings.std.SVGMarkerElement
import typings.std.SVGMaskElement
import typings.std.SVGMetadataElement
import typings.std.SVGPathElement
import typings.std.SVGPatternElement
import typings.std.SVGPolygonElement
import typings.std.SVGPolylineElement
import typings.std.SVGRadialGradientElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import typings.std.SVGScriptElement
import typings.std.SVGSetElement
import typings.std.SVGStopElement
import typings.std.SVGStyleElement
import typings.std.SVGSwitchElement
import typings.std.SVGSymbolElement
import typings.std.SVGTSpanElement
import typings.std.SVGTextElement
import typings.std.SVGTextPathElement
import typings.std.SVGTitleElement
import typings.std.SVGUseElement
import typings.std.SVGViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "SVG")
@js.native
open class SVG_ () extends Renderer {
  def this(options: RendererOptions) = this()
}
object SVG_ {
  
  @JSImport("leaflet", "SVG")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(name: String): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def create_a(name: a): SVGAElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGAElement]
  
  inline def create_animate(name: animate): SVGAnimateElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGAnimateElement]
  
  inline def create_animateMotion(name: animateMotion): SVGAnimateMotionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGAnimateMotionElement]
  
  inline def create_animateTransform(name: animateTransform): SVGAnimateTransformElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGAnimateTransformElement]
  
  inline def create_circle(name: typings.leaflet.leafletStrings.circle): SVGCircleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGCircleElement]
  
  inline def create_clipPath(name: clipPath): SVGClipPathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGClipPathElement]
  
  inline def create_defs(name: defs): SVGDefsElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGDefsElement]
  
  inline def create_desc(name: desc): SVGDescElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGDescElement]
  
  inline def create_ellipse(name: ellipse): SVGEllipseElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGEllipseElement]
  
  inline def create_feBlend(name: feBlend): SVGFEBlendElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEBlendElement]
  
  inline def create_feColorMatrix(name: feColorMatrix): SVGFEColorMatrixElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEColorMatrixElement]
  
  inline def create_feComponentTransfer(name: feComponentTransfer): SVGFEComponentTransferElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEComponentTransferElement]
  
  inline def create_feComposite(name: feComposite): SVGFECompositeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFECompositeElement]
  
  inline def create_feConvolveMatrix(name: feConvolveMatrix): SVGFEConvolveMatrixElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEConvolveMatrixElement]
  
  inline def create_feDiffuseLighting(name: feDiffuseLighting): SVGFEDiffuseLightingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEDiffuseLightingElement]
  
  inline def create_feDisplacementMap(name: feDisplacementMap): SVGFEDisplacementMapElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEDisplacementMapElement]
  
  inline def create_feDistantLight(name: feDistantLight): SVGFEDistantLightElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEDistantLightElement]
  
  inline def create_feDropShadow(name: feDropShadow): SVGFEDropShadowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEDropShadowElement]
  
  inline def create_feFlood(name: feFlood): SVGFEFloodElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEFloodElement]
  
  inline def create_feFuncA(name: feFuncA): SVGFEFuncAElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEFuncAElement]
  
  inline def create_feFuncB(name: feFuncB): SVGFEFuncBElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEFuncBElement]
  
  inline def create_feFuncG(name: feFuncG): SVGFEFuncGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEFuncGElement]
  
  inline def create_feFuncR(name: feFuncR): SVGFEFuncRElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEFuncRElement]
  
  inline def create_feGaussianBlur(name: feGaussianBlur): SVGFEGaussianBlurElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEGaussianBlurElement]
  
  inline def create_feImage(name: feImage): SVGFEImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEImageElement]
  
  inline def create_feMerge(name: feMerge): SVGFEMergeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEMergeElement]
  
  inline def create_feMergeNode(name: feMergeNode): SVGFEMergeNodeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEMergeNodeElement]
  
  inline def create_feMorphology(name: feMorphology): SVGFEMorphologyElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEMorphologyElement]
  
  inline def create_feOffset(name: feOffset): SVGFEOffsetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEOffsetElement]
  
  inline def create_fePointLight(name: fePointLight): SVGFEPointLightElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFEPointLightElement]
  
  inline def create_feSpecularLighting(name: feSpecularLighting): SVGFESpecularLightingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFESpecularLightingElement]
  
  inline def create_feSpotLight(name: feSpotLight): SVGFESpotLightElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFESpotLightElement]
  
  inline def create_feTile(name: feTile): SVGFETileElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFETileElement]
  
  inline def create_feTurbulence(name: feTurbulence): SVGFETurbulenceElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFETurbulenceElement]
  
  inline def create_filter(name: filter): SVGFilterElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGFilterElement]
  
  inline def create_foreignObject(name: foreignObject): SVGForeignObjectElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGForeignObjectElement]
  
  inline def create_g(name: g): SVGGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGGElement]
  
  inline def create_image(name: image): SVGImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGImageElement]
  
  inline def create_line(name: line): SVGLineElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGLineElement]
  
  inline def create_linearGradient(name: linearGradient): SVGLinearGradientElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGLinearGradientElement]
  
  inline def create_marker(name: typings.leaflet.leafletStrings.marker): SVGMarkerElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGMarkerElement]
  
  inline def create_mask(name: mask): SVGMaskElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGMaskElement]
  
  inline def create_metadata(name: metadata): SVGMetadataElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGMetadataElement]
  
  inline def create_mpath(name: mpath): SVGMPathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGMPathElement]
  
  inline def create_path(name: path): SVGPathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGPathElement]
  
  inline def create_pattern(name: pattern): SVGPatternElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGPatternElement]
  
  inline def create_polygon(name: typings.leaflet.leafletStrings.polygon): SVGPolygonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGPolygonElement]
  
  inline def create_polyline(name: typings.leaflet.leafletStrings.polyline): SVGPolylineElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGPolylineElement]
  
  inline def create_radialGradient(name: radialGradient): SVGRadialGradientElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGRadialGradientElement]
  
  inline def create_rect(name: rect): SVGRectElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGRectElement]
  
  inline def create_script(name: script): SVGScriptElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGScriptElement]
  
  inline def create_set(name: set): SVGSetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGSetElement]
  
  inline def create_stop(name: stop): SVGStopElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGStopElement]
  
  inline def create_style(name: style): SVGStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGStyleElement]
  
  inline def create_svg(name: typings.leaflet.leafletStrings.svg): SVGSVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGSVGElement]
  
  inline def create_switch(name: switch): SVGSwitchElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGSwitchElement]
  
  inline def create_symbol(name: symbol): SVGSymbolElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGSymbolElement]
  
  inline def create_text(name: text): SVGTextElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGTextElement]
  
  inline def create_textPath(name: textPath): SVGTextPathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGTextPathElement]
  
  inline def create_title(name: title): SVGTitleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGTitleElement]
  
  inline def create_tspan(name: tspan): SVGTSpanElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGTSpanElement]
  
  inline def create_use(name: use): SVGUseElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGUseElement]
  
  inline def create_view(name: view): SVGViewElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGViewElement]
  
  inline def pointsToPath(rings: js.Array[PointExpression], closed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToPath")(rings.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[String]
}
