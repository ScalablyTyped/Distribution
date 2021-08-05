package typings.jointjs

import typings.jointjs.mod.Vectorizer.TextVerticalAnchor
import typings.jointjs.mod.anchors.AnchorArguments
import typings.jointjs.mod.anchors.AnchorType
import typings.jointjs.mod.connectionPoints.ConnectionPointAlignment
import typings.jointjs.mod.connectionPoints.ConnectionPointArguments
import typings.jointjs.mod.connectionPoints.ConnectionPointType
import typings.jointjs.mod.connectors.ConnectorArguments
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.dia.Direction
import typings.jointjs.mod.dia.LinkEnd
import typings.jointjs.mod.dia.OrthogonalDirection
import typings.jointjs.mod.g.CardinalDirection
import typings.jointjs.mod.g.RectangleSide
import typings.jointjs.mod.g.SegmentType
import typings.jointjs.mod.highlighters.HighlighterArguments
import typings.jointjs.mod.highlighters.HighlighterType
import typings.jointjs.mod.routers.RouterArguments
import typings.jointjs.mod.routers.RouterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jointjsStrings {
  
  @js.native
  sealed trait BT extends StObject
  inline def BT: BT = "BT".asInstanceOf[BT]
  
  @js.native
  sealed trait C
    extends StObject
       with SegmentType
  inline def C: C = "C".asInstanceOf[C]
  
  @js.native
  sealed trait E
    extends StObject
       with CardinalDirection
  inline def E: E = "E".asInstanceOf[E]
  
  @js.native
  sealed trait L
    extends StObject
       with SegmentType
  inline def L: L = "L".asInstanceOf[L]
  
  @js.native
  sealed trait LR extends StObject
  inline def LR: LR = "LR".asInstanceOf[LR]
  
  @js.native
  sealed trait M
    extends StObject
       with SegmentType
  inline def M: M = "M".asInstanceOf[M]
  
  @js.native
  sealed trait N
    extends StObject
       with CardinalDirection
  inline def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait NE
    extends StObject
       with CardinalDirection
  inline def NE: NE = "NE".asInstanceOf[NE]
  
  @js.native
  sealed trait NW
    extends StObject
       with CardinalDirection
  inline def NW: NW = "NW".asInstanceOf[NW]
  
  @js.native
  sealed trait RL extends StObject
  inline def RL: RL = "RL".asInstanceOf[RL]
  
  @js.native
  sealed trait S
    extends StObject
       with CardinalDirection
  inline def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait SE
    extends StObject
       with CardinalDirection
  inline def SE: SE = "SE".asInstanceOf[SE]
  
  @js.native
  sealed trait SW
    extends StObject
       with CardinalDirection
  inline def SW: SW = "SW".asInstanceOf[SW]
  
  @js.native
  sealed trait TB extends StObject
  inline def TB: TB = "TB".asInstanceOf[TB]
  
  @js.native
  sealed trait W
    extends StObject
       with CardinalDirection
  inline def W: W = "W".asInstanceOf[W]
  
  @js.native
  sealed trait Z
    extends StObject
       with SegmentType
  inline def Z: Z = "Z".asInstanceOf[Z]
  
  @js.native
  sealed trait addClass
    extends StObject
       with HighlighterType
  inline def addClass: addClass = "addClass".asInstanceOf[addClass]
  
  @js.native
  sealed trait anchor
    extends StObject
       with ConnectionPointType
  inline def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait arc extends StObject
  inline def arc: arc = "arc".asInstanceOf[arc]
  
  @js.native
  sealed trait attrs
    extends StObject
       with HighlighterArguments
  inline def attrs: attrs = "attrs".asInstanceOf[attrs]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bbox
    extends StObject
       with ConnectionPointType
  inline def bbox: bbox = "bbox".asInstanceOf[bbox]
  
  @js.native
  sealed trait blur extends StObject
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bottom
    extends StObject
       with AnchorType
       with ConnectionPointAlignment
       with Direction
       with OrthogonalDirection
       with RectangleSide
       with TextVerticalAnchor
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with Direction
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with Direction
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait bottomLeft
    extends StObject
       with AnchorType
  inline def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  
  @js.native
  sealed trait bottomMiddle extends StObject
  inline def bottomMiddle: bottomMiddle = "bottomMiddle".asInstanceOf[bottomMiddle]
  
  @js.native
  sealed trait bottomRight
    extends StObject
       with AnchorType
  inline def bottomRight: bottomRight = "bottomRight".asInstanceOf[bottomRight]
  
  @js.native
  sealed trait boundary
    extends StObject
       with ConnectionPointType
  inline def boundary: boundary = "boundary".asInstanceOf[boundary]
  
  @js.native
  sealed trait brightness extends StObject
  inline def brightness: brightness = "brightness".asInstanceOf[brightness]
  
  @js.native
  sealed trait c_ extends StObject
  inline def c_ : c_ = "c".asInstanceOf[c_]
  
  @js.native
  sealed trait center
    extends StObject
       with AnchorType
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait className
    extends StObject
       with HighlighterArguments
  inline def className: className = "className".asInstanceOf[className]
  
  @js.native
  sealed trait connectionClosest
    extends StObject
       with AnchorType
  inline def connectionClosest: connectionClosest = "connectionClosest".asInstanceOf[connectionClosest]
  
  @js.native
  sealed trait connectionLength
    extends StObject
       with AnchorType
  inline def connectionLength: connectionLength = "connectionLength".asInstanceOf[connectionLength]
  
  @js.native
  sealed trait connectionPerpendicular
    extends StObject
       with AnchorType
  inline def connectionPerpendicular: connectionPerpendicular = "connectionPerpendicular".asInstanceOf[connectionPerpendicular]
  
  @js.native
  sealed trait connectionRatio
    extends StObject
       with AnchorType
  inline def connectionRatio: connectionRatio = "connectionRatio".asInstanceOf[connectionRatio]
  
  @js.native
  sealed trait contrast extends StObject
  inline def contrast: contrast = "contrast".asInstanceOf[contrast]
  
  @js.native
  sealed trait corner extends StObject
  inline def corner: corner = "corner".asInstanceOf[corner]
  
  @js.native
  sealed trait cubic extends StObject
  inline def cubic: cubic = "cubic".asInstanceOf[cubic]
  
  @js.native
  sealed trait dot extends StObject
  inline def dot: dot = "dot".asInstanceOf[dot]
  
  @js.native
  sealed trait doubleMesh extends StObject
  inline def doubleMesh: doubleMesh = "doubleMesh".asInstanceOf[doubleMesh]
  
  @js.native
  sealed trait dropShadow extends StObject
  inline def dropShadow: dropShadow = "dropShadow".asInstanceOf[dropShadow]
  
  @js.native
  sealed trait dx
    extends StObject
       with AnchorArguments
  inline def dx: dx = "dx".asInstanceOf[dx]
  
  @js.native
  sealed trait dy
    extends StObject
       with AnchorArguments
  inline def dy: dy = "dy".asInstanceOf[dy]
  
  @js.native
  sealed trait elementPadding
    extends StObject
       with RouterArguments
  inline def elementPadding: elementPadding = "elementPadding".asInstanceOf[elementPadding]
  
  @js.native
  sealed trait endDirections
    extends StObject
       with RouterArguments
  inline def endDirections: endDirections = "endDirections".asInstanceOf[endDirections]
  
  @js.native
  sealed trait excludeEnds
    extends StObject
       with RouterArguments
  inline def excludeEnds: excludeEnds = "excludeEnds".asInstanceOf[excludeEnds]
  
  @js.native
  sealed trait excludeTypes
    extends StObject
       with RouterArguments
  inline def excludeTypes: excludeTypes = "excludeTypes".asInstanceOf[excludeTypes]
  
  @js.native
  sealed trait extrapolate
    extends StObject
       with ConnectionPointArguments
  inline def extrapolate: extrapolate = "extrapolate".asInstanceOf[extrapolate]
  
  @js.native
  sealed trait fallbackAt
    extends StObject
       with AnchorArguments
  inline def fallbackAt: fallbackAt = "fallbackAt".asInstanceOf[fallbackAt]
  
  @js.native
  sealed trait fixedAt
    extends StObject
       with AnchorArguments
  inline def fixedAt: fixedAt = "fixedAt".asInstanceOf[fixedAt]
  
  @js.native
  sealed trait fixedDot extends StObject
  inline def fixedDot: fixedDot = "fixedDot".asInstanceOf[fixedDot]
  
  @js.native
  sealed trait gap extends StObject
  inline def gap: gap = "gap".asInstanceOf[gap]
  
  @js.native
  sealed trait grayscale extends StObject
  inline def grayscale: grayscale = "grayscale".asInstanceOf[grayscale]
  
  @js.native
  sealed trait highlight extends StObject
  inline def highlight: highlight = "highlight".asInstanceOf[highlight]
  
  @js.native
  sealed trait hueRotate extends StObject
  inline def hueRotate: hueRotate = "hueRotate".asInstanceOf[hueRotate]
  
  @js.native
  sealed trait insideout
    extends StObject
       with ConnectionPointArguments
  inline def insideout: insideout = "insideout".asInstanceOf[insideout]
  
  @js.native
  sealed trait invert extends StObject
  inline def invert: invert = "invert".asInstanceOf[invert]
  
  @js.native
  sealed trait jump
    extends StObject
       with ConnectorArguments
  inline def jump: jump = "jump".asInstanceOf[jump]
  
  @js.native
  sealed trait jumpover
    extends StObject
       with ConnectorType
  inline def jumpover: jumpover = "jumpover".asInstanceOf[jumpover]
  
  @js.native
  sealed trait l_ extends StObject
  inline def l_ : l_ = "l".asInstanceOf[l_]
  
  @js.native
  sealed trait left
    extends StObject
       with AnchorType
       with ConnectionPointAlignment
       with Direction
       with OrthogonalDirection
       with RectangleSide
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait leftMiddle extends StObject
  inline def leftMiddle: leftMiddle = "leftMiddle".asInstanceOf[leftMiddle]
  
  @js.native
  sealed trait length
    extends StObject
       with AnchorArguments
  inline def length: length = "length".asInstanceOf[length]
  
  @js.native
  sealed trait linearGradient extends StObject
  inline def linearGradient: linearGradient = "linearGradient".asInstanceOf[linearGradient]
  
  @js.native
  sealed trait `longest-path` extends StObject
  inline def `longest-path`: `longest-path` = "longest-path".asInstanceOf[`longest-path`]
  
  @js.native
  sealed trait manhattan
    extends StObject
       with RouterType
  inline def manhattan: manhattan = "manhattan".asInstanceOf[manhattan]
  
  @js.native
  sealed trait maxAllowedDirectionChange
    extends StObject
       with RouterArguments
  inline def maxAllowedDirectionChange: maxAllowedDirectionChange = "maxAllowedDirectionChange".asInstanceOf[maxAllowedDirectionChange]
  
  @js.native
  sealed trait maximumLoops
    extends StObject
       with RouterArguments
  inline def maximumLoops: maximumLoops = "maximumLoops".asInstanceOf[maximumLoops]
  
  @js.native
  sealed trait mesh extends StObject
  inline def mesh: mesh = "mesh".asInstanceOf[mesh]
  
  @js.native
  sealed trait metro
    extends StObject
       with RouterType
  inline def metro: metro = "metro".asInstanceOf[metro]
  
  @js.native
  sealed trait midSide
    extends StObject
       with AnchorType
  inline def midSide: midSide = "midSide".asInstanceOf[midSide]
  
  @js.native
  sealed trait middle
    extends StObject
       with TextVerticalAnchor
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait modelCenter
    extends StObject
       with AnchorType
  inline def modelCenter: modelCenter = "modelCenter".asInstanceOf[modelCenter]
  
  @js.native
  sealed trait negative extends StObject
  inline def negative: negative = "negative".asInstanceOf[negative]
  
  @js.native
  sealed trait `network-simplex` extends StObject
  inline def `network-simplex`: `network-simplex` = "network-simplex".asInstanceOf[`network-simplex`]
  
  @js.native
  sealed trait normal
    extends StObject
       with ConnectorType
       with RouterType
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait offset
    extends StObject
       with ConnectionPointArguments
  inline def offset: offset = "offset".asInstanceOf[offset]
  
  @js.native
  sealed trait oneSide
    extends StObject
       with RouterType
  inline def oneSide: oneSide = "oneSide".asInstanceOf[oneSide]
  
  @js.native
  sealed trait opacity
    extends StObject
       with HighlighterType
  inline def opacity: opacity = "opacity".asInstanceOf[opacity]
  
  @js.native
  sealed trait origin extends StObject
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait orthogonal
    extends StObject
       with RouterType
  inline def orthogonal: orthogonal = "orthogonal".asInstanceOf[orthogonal]
  
  @js.native
  sealed trait outline extends StObject
  inline def outline: outline = "outline".asInstanceOf[outline]
  
  @js.native
  sealed trait padding
    extends StObject
       with AnchorArguments
       with HighlighterArguments
       with RouterArguments
  inline def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait perpendicular
    extends StObject
       with AnchorType
       with RouterArguments
  inline def perpendicular: perpendicular = "perpendicular".asInstanceOf[perpendicular]
  
  @js.native
  sealed trait positive extends StObject
  inline def positive: positive = "positive".asInstanceOf[positive]
  
  @js.native
  sealed trait precision
    extends StObject
       with ConnectionPointArguments
  inline def precision: precision = "precision".asInstanceOf[precision]
  
  @js.native
  sealed trait r extends StObject
  inline def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait radialGradient extends StObject
  inline def radialGradient: radialGradient = "radialGradient".asInstanceOf[radialGradient]
  
  @js.native
  sealed trait radius
    extends StObject
       with ConnectorArguments
  inline def radius: radius = "radius".asInstanceOf[radius]
  
  @js.native
  sealed trait raw
    extends StObject
       with ConnectorArguments
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait rectangle
    extends StObject
       with ConnectionPointType
  inline def rectangle: rectangle = "rectangle".asInstanceOf[rectangle]
  
  @js.native
  sealed trait right
    extends StObject
       with AnchorType
       with ConnectionPointAlignment
       with Direction
       with OrthogonalDirection
       with RectangleSide
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rightMiddle extends StObject
  inline def rightMiddle: rightMiddle = "rightMiddle".asInstanceOf[rightMiddle]
  
  @js.native
  sealed trait rounded
    extends StObject
       with ConnectorType
  inline def rounded: rounded = "rounded".asInstanceOf[rounded]
  
  @js.native
  sealed trait rx
    extends StObject
       with HighlighterArguments
  inline def rx: rx = "rx".asInstanceOf[rx]
  
  @js.native
  sealed trait ry
    extends StObject
       with HighlighterArguments
  inline def ry: ry = "ry".asInstanceOf[ry]
  
  @js.native
  sealed trait saturate extends StObject
  inline def saturate: saturate = "saturate".asInstanceOf[saturate]
  
  @js.native
  sealed trait selector
    extends StObject
       with ConnectionPointArguments
  inline def selector: selector = "selector".asInstanceOf[selector]
  
  @js.native
  sealed trait sepia extends StObject
  inline def sepia: sepia = "sepia".asInstanceOf[sepia]
  
  @js.native
  sealed trait side
    extends StObject
       with RouterArguments
  inline def side: side = "side".asInstanceOf[side]
  
  @js.native
  sealed trait size
    extends StObject
       with ConnectorArguments
  inline def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait smooth
    extends StObject
       with ConnectorType
  inline def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait source
    extends StObject
       with LinkEnd
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait startDirections
    extends StObject
       with RouterArguments
  inline def startDirections: startDirections = "startDirections".asInstanceOf[startDirections]
  
  @js.native
  sealed trait step
    extends StObject
       with RouterArguments
  inline def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait sticky
    extends StObject
       with ConnectionPointArguments
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait stroke
    extends StObject
       with ConnectionPointArguments
       with HighlighterType
  inline def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait target
    extends StObject
       with LinkEnd
  inline def target: target = "target".asInstanceOf[target]
  
  @js.native
  sealed trait `tight-tree` extends StObject
  inline def `tight-tree`: `tight-tree` = "tight-tree".asInstanceOf[`tight-tree`]
  
  @js.native
  sealed trait top
    extends StObject
       with AnchorType
       with ConnectionPointAlignment
       with Direction
       with OrthogonalDirection
       with RectangleSide
       with TextVerticalAnchor
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with Direction
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with Direction
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait topLeft
    extends StObject
       with AnchorType
  inline def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  
  @js.native
  sealed trait topMiddle extends StObject
  inline def topMiddle: topMiddle = "topMiddle".asInstanceOf[topMiddle]
  
  @js.native
  sealed trait topRight
    extends StObject
       with AnchorType
  inline def topRight: topRight = "topRight".asInstanceOf[topRight]
  
  @js.native
  sealed trait z_
    extends StObject
       with SegmentType
  inline def z_ : z_ = "z".asInstanceOf[z_]
}
