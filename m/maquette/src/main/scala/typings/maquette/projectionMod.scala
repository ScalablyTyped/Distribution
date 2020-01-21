package typings.maquette

import typings.maquette.interfacesMod.Projection
import typings.maquette.interfacesMod.ProjectionOptions
import typings.maquette.interfacesMod.VNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/projection", JSImport.Namespace)
@js.native
object projectionMod extends js.Object {
  var createDom: js.Function4[
    /* vnode */ VNode, 
    /* parentNode */ Node, 
    /* insertBefore */ js.UndefOr[Node | Null], 
    /* projectionOptions */ ProjectionOptions, 
    Unit
  ] = js.native
  var createProjection: js.Function2[/* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Projection] = js.native
  var extend: js.Function2[/* base */ js.Any, /* overrides */ js.Any, js.Any] = js.native
  var initPropertiesAndChildren: js.Function3[/* domNode */ Node, /* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Unit] = js.native
}

