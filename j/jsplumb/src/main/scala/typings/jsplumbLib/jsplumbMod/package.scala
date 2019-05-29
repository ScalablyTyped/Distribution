package typings
package jsplumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsplumbMod {
  type AnchorSpec = AnchorId | (js.Tuple2[AnchorId, AnchorOptions])
  type ConnectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - jsplumbLib.jsplumbLibStrings.Bezier
    - jsplumbLib.jsplumbLibStrings.StateMachine
    - jsplumbLib.jsplumbLibStrings.Flowchart
    - jsplumbLib.jsplumbLibStrings.Straight
    - UserDefinedConnectorId
  */
  type ConnectorId = _ConnectorId | UserDefinedConnectorId
  type ConnectorSpec = ConnectorId | (js.Tuple2[ConnectorId, ConnectorOptions])
  type ElementGroupRef = ElementId | stdLib.Element | (js.Array[stdLib.Element | ElementId])
  type ElementId = java.lang.String
  type ElementRef = ElementId | stdLib.Element
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  /* Rewritten from type alias, can be one of: 
    - jsplumbLib.jsplumbLibStrings.Rectangle
    - jsplumbLib.jsplumbLibStrings.Dot
    - jsplumbLib.jsplumbLibStrings.Blank
    - UserDefinedEndpointId
  */
  type EndpointId = _EndpointId | UserDefinedEndpointId
  type EndpointSpec = EndpointId | (js.Tuple2[EndpointId, EndpointOptions])
  type OverlaySpec = OverlayId | (js.Tuple2[OverlayId, OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
  type UserDefinedEndpointId = java.lang.String
}
