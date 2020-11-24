package typings.jointjs.mod.dia.Link

import typings.jointjs.mod.connectors.Connector
import typings.jointjs.mod.connectors.ConnectorJSON
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.connectors.GenericConnectorArguments
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.g.Path
import typings.jointjs.mod.routers.GenericRouterArguments
import typings.jointjs.mod.routers.Router
import typings.jointjs.mod.routers.RouterJSON
import typings.jointjs.mod.routers.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericAttributes[T]
  extends typings.jointjs.mod.dia.Cell.GenericAttributes[T] {
  
  var connector: js.UndefOr[Connector | ConnectorJSON] = js.native
  
  var labels: js.UndefOr[js.Array[Label]] = js.native
  
  var manhattan: js.UndefOr[Boolean] = js.native
  
  var router: js.UndefOr[Router | RouterJSON] = js.native
  
  var smooth: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[EndJSON] = js.native
  
  var target: js.UndefOr[EndJSON] = js.native
  
  var vertices: js.UndefOr[js.Array[Point]] = js.native
}
object GenericAttributes {
  
  @scala.inline
  def apply[T](): GenericAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttributes[T]]
  }
  
  @scala.inline
  implicit class GenericAttributesOps[Self <: GenericAttributes[_], T] (val x: Self with GenericAttributes[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorFunction4(
      value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | Path
    ): Self = this.set("connector", js.Any.fromFunction4(value))
    
    @scala.inline
    def setConnector(value: Connector | ConnectorJSON): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[Label]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setManhattan(value: Boolean): Self = this.set("manhattan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManhattan: Self = this.set("manhattan", js.undefined)
    
    @scala.inline
    def setRouterFunction3(
      value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
    ): Self = this.set("router", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRouter(value: Router | RouterJSON): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setSource(value: EndJSON): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: EndJSON): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: Point*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Point]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
