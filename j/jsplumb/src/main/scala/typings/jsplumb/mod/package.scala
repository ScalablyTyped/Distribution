package typings.jsplumb.mod

import typings.jsplumb.anon.AnchorCount
import typings.jsplumb.anon.Faces
import typings.jsplumb.jsplumbStrings.AutoDefault
import typings.jsplumb.jsplumbStrings.Blank
import typings.jsplumb.jsplumbStrings.Dot
import typings.jsplumb.jsplumbStrings.Perimeter
import typings.jsplumb.jsplumbStrings.Rectangle
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnchorArraySpec = js.Tuple7[Double, Double, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[String]]

type AnchorContinuousSpec = AnchorContinuousId | (js.Tuple2[AnchorContinuousId, Faces])

type AnchorDynamicId = AutoDefault

type AnchorDynamicSpec = js.Array[AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec]

/* Rewritten from type alias, can be one of: 
  - typings.jsplumb.mod.AnchorStaticId
  - typings.jsplumb.mod.AnchorDynamicId
  - typings.jsplumb.mod.AnchorPerimeterId
  - typings.jsplumb.mod.AnchorContinuousId
*/
type AnchorId = _AnchorId | AnchorDynamicId | AnchorPerimeterId

type AnchorPerimeterId = Perimeter

type AnchorPerimeterSpec = AnchorPerimeterId | (js.Tuple2[AnchorPerimeterId, AnchorCount])

type AnchorSpec = AnchorStaticSpec | AnchorDynamicSpec | AnchorPerimeterSpec | AnchorContinuousSpec

type AnchorStaticSpec = AnchorStaticId | AnchorArraySpec

type ConnectionId = String

/* Rewritten from type alias, can be one of: 
  - typings.jsplumb.jsplumbStrings.Bezier
  - typings.jsplumb.jsplumbStrings.StateMachine
  - typings.jsplumb.jsplumbStrings.Flowchart
  - typings.jsplumb.jsplumbStrings.Straight
  - typings.jsplumb.mod.UserDefinedConnectorId
*/
type ConnectorId = _ConnectorId | UserDefinedConnectorId

type ConnectorSpec = ConnectorId | (js.Tuple2[ConnectorId, ConnectorOptions])

type ElementGroupRef = ElementId | Element | (js.Array[Element | ElementId])

type ElementId = String

type ElementRef = ElementId | Element

type EndpointBlank = Blank

type EndpointBlankOptions = js.Object

type EndpointDot = Dot

type EndpointId = EndpointRectangle | EndpointDot | EndpointBlank

type EndpointRectangle = Rectangle

/* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
type EndpointSpec = EndpointId | (js.Tuple2[
EndpointBlank | EndpointDot | EndpointRectangle, 
EndpointBlankOptions | EndpointDotOptions | EndpointRectangleOptions])

type OrphanedPositions = Record[String, Position]

type OverlaySpec = OverlayId | (js.Tuple2[OverlayId, OverlayOptions])

type Selector = String

type UUID = String

type UserDefinedConnectorId = String
