package typings.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnchorArraySpec = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double], 
    js.UndefOr[java.lang.String]
  ]
  type AnchorContinuousSpec = typings.jsplumb.mod.AnchorContinuousId | (js.Tuple2[typings.jsplumb.mod.AnchorContinuousId, typings.jsplumb.AnonFaces])
  type AnchorDynamicId = typings.jsplumb.jsplumbStrings.AutoDefault
  type AnchorDynamicSpec = js.Array[
    typings.jsplumb.mod.AnchorStaticSpec | typings.jsplumb.mod.AnchorDynamicId | typings.jsplumb.mod.AnchorPerimeterSpec | typings.jsplumb.mod.AnchorContinuousSpec
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.jsplumb.mod.AnchorStaticId
    - typings.jsplumb.mod.AnchorDynamicId
    - typings.jsplumb.mod.AnchorPerimeterId
    - typings.jsplumb.mod.AnchorContinuousId
  */
  type AnchorId = typings.jsplumb.mod._AnchorId | typings.jsplumb.mod.AnchorDynamicId | typings.jsplumb.mod.AnchorPerimeterId
  type AnchorPerimeterId = typings.jsplumb.jsplumbStrings.Perimeter
  type AnchorPerimeterSpec = typings.jsplumb.mod.AnchorPerimeterId | (js.Tuple2[typings.jsplumb.mod.AnchorPerimeterId, typings.jsplumb.AnonAnchorCount])
  type AnchorSpec = typings.jsplumb.mod.AnchorStaticSpec | typings.jsplumb.mod.AnchorDynamicSpec | typings.jsplumb.mod.AnchorPerimeterSpec | typings.jsplumb.mod.AnchorContinuousSpec
  type AnchorStaticSpec = typings.jsplumb.mod.AnchorStaticId | typings.jsplumb.mod.AnchorArraySpec
  type ConnectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.jsplumb.jsplumbStrings.Bezier
    - typings.jsplumb.jsplumbStrings.StateMachine
    - typings.jsplumb.jsplumbStrings.Flowchart
    - typings.jsplumb.jsplumbStrings.Straight
    - typings.jsplumb.mod.UserDefinedConnectorId
  */
  type ConnectorId = typings.jsplumb.mod._ConnectorId | typings.jsplumb.mod.UserDefinedConnectorId
  type ConnectorSpec = typings.jsplumb.mod.ConnectorId | (js.Tuple2[typings.jsplumb.mod.ConnectorId, typings.jsplumb.mod.ConnectorOptions])
  type ElementGroupRef = typings.jsplumb.mod.ElementId | typings.std.Element | (js.Array[typings.std.Element | typings.jsplumb.mod.ElementId])
  type ElementId = java.lang.String
  type ElementRef = typings.jsplumb.mod.ElementId | typings.std.Element
  type EndpointBlank = typings.jsplumb.jsplumbStrings.Blank
  type EndpointBlankOptions = js.Object
  type EndpointDot = typings.jsplumb.jsplumbStrings.Dot
  type EndpointId = typings.jsplumb.mod.EndpointRectangle | typings.jsplumb.mod.EndpointDot | typings.jsplumb.mod.EndpointBlank
  type EndpointRectangle = typings.jsplumb.jsplumbStrings.Rectangle
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  type EndpointSpec = typings.jsplumb.mod.EndpointId | (js.Tuple2[
    typings.jsplumb.mod.EndpointBlank | typings.jsplumb.mod.EndpointDot | typings.jsplumb.mod.EndpointRectangle, 
    typings.jsplumb.mod.EndpointBlankOptions | typings.jsplumb.mod.EndpointDotOptions | typings.jsplumb.mod.EndpointRectangleOptions
  ])
  type OverlaySpec = typings.jsplumb.mod.OverlayId | (js.Tuple2[typings.jsplumb.mod.OverlayId, typings.jsplumb.mod.OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
}
