package typings.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsplumbMod {
  import typings.std.Element

  type AnchorSpec = AnchorId | (js.Tuple2[AnchorId, AnchorOptions])
  type ConnectionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.jsplumb.jsplumbStrings.Bezier
    - typings.jsplumb.jsplumbStrings.StateMachine
    - typings.jsplumb.jsplumbStrings.Flowchart
    - typings.jsplumb.jsplumbStrings.Straight
    - typings.jsplumb.jsplumbMod.UserDefinedConnectorId
  */
  type ConnectorId = _ConnectorId | UserDefinedConnectorId
  type ConnectorSpec = ConnectorId | (js.Tuple2[ConnectorId, ConnectorOptions])
  type ElementGroupRef = ElementId | Element | (js.Array[Element | ElementId])
  type ElementId = String
  type ElementRef = ElementId | Element
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  /* Rewritten from type alias, can be one of: 
    - typings.jsplumb.jsplumbStrings.Rectangle
    - typings.jsplumb.jsplumbStrings.Dot
    - typings.jsplumb.jsplumbStrings.Blank
    - typings.jsplumb.jsplumbMod.UserDefinedEndpointId
  */
  type EndpointId = _EndpointId | UserDefinedEndpointId
  type EndpointSpec = EndpointId | (js.Tuple2[EndpointId, EndpointOptions])
  type OverlaySpec = OverlayId | (js.Tuple2[OverlayId, OverlayOptions])
  type Selector = String
  type UUID = String
  type UserDefinedConnectorId = String
  type UserDefinedEndpointId = String
}
