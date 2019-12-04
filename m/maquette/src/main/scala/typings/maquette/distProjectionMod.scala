package typings.maquette

import typings.maquette.distInterfacesMod.Projection
import typings.maquette.distInterfacesMod.ProjectionOptions
import typings.maquette.distInterfacesMod.VNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/projection", JSImport.Namespace)
@js.native
object distProjectionMod extends js.Object {
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

