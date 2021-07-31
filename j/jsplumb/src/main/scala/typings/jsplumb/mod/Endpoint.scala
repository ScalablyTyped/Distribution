package typings.jsplumb.mod

import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint
  extends StObject
     with UIComponent {
  
  var anchor: Anchor
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  def connectorSelector(): Connection
  
  def getElement(): Element
  
  //= 1?
  var id: String
  
  def isEnabled(): Boolean
  
  var maxConnections: Double
  
  var scope: String
  
  def setElement(el: Element): Unit
  
  def setEnabled(enabled: Boolean): Unit
  
  def setEndpoint(spec: EndpointSpec): Unit
  
  def setHover(hover: Boolean): Unit
  
  var `type`: EndpointId
}
object Endpoint {
  
  @scala.inline
  def apply(
    anchor: Anchor,
    connectorSelector: () => Connection,
    getElement: () => Element,
    getParameter: String => js.Any,
    getParameters: () => Record[String, js.Any],
    id: String,
    isEnabled: () => Boolean,
    maxConnections: Double,
    scope: String,
    setElement: Element => Unit,
    setEnabled: Boolean => Unit,
    setEndpoint: EndpointSpec => Unit,
    setHover: Boolean => Unit,
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, js.Any] => Unit,
    `type`: EndpointId
  ): Endpoint = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], connectorSelector = js.Any.fromFunction0(connectorSelector), getElement = js.Any.fromFunction0(getElement), getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), id = id.asInstanceOf[js.Any], isEnabled = js.Any.fromFunction0(isEnabled), maxConnections = maxConnections.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setElement = js.Any.fromFunction1(setElement), setEnabled = js.Any.fromFunction1(setEnabled), setEndpoint = js.Any.fromFunction1(setEndpoint), setHover = js.Any.fromFunction1(setHover), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setConnectorSelector(value: () => Connection): Self = StObject.set(x, "connectorSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => Element): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetElement(value: Element => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEndpoint(value: EndpointSpec => Unit): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHover(value: Boolean => Unit): Self = StObject.set(x, "setHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: EndpointId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
