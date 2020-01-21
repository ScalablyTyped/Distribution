package typings.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnchorSpec = typings.jsplumb.mod.AnchorId | (js.Tuple2[typings.jsplumb.mod.AnchorId, typings.jsplumb.mod.AnchorOptions])
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
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  /* Rewritten from type alias, can be one of: 
    - typings.jsplumb.jsplumbStrings.Rectangle
    - typings.jsplumb.jsplumbStrings.Dot
    - typings.jsplumb.jsplumbStrings.Blank
    - typings.jsplumb.mod.UserDefinedEndpointId
  */
  type EndpointId = typings.jsplumb.mod._EndpointId | typings.jsplumb.mod.UserDefinedEndpointId
  type EndpointSpec = typings.jsplumb.mod.EndpointId | (js.Tuple2[typings.jsplumb.mod.EndpointId, typings.jsplumb.mod.EndpointOptions])
  type OverlaySpec = typings.jsplumb.mod.OverlayId | (js.Tuple2[typings.jsplumb.mod.OverlayId, typings.jsplumb.mod.OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
  type UserDefinedEndpointId = java.lang.String
}
