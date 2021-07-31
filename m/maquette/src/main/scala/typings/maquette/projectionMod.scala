package typings.maquette

import typings.maquette.interfacesMod.Projection
import typings.maquette.interfacesMod.ProjectionOptions
import typings.maquette.interfacesMod.VNode
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  @JSImport("maquette/dist/projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/projection", "createDom")
  @js.native
  def createDom: js.Function4[
    /* vnode */ VNode, 
    /* parentNode */ Node, 
    /* insertBefore */ js.UndefOr[Node | Null], 
    /* projectionOptions */ ProjectionOptions, 
    Unit
  ] = js.native
  @scala.inline
  def createDom_=(
    x: js.Function4[
      /* vnode */ VNode, 
      /* parentNode */ Node, 
      /* insertBefore */ js.UndefOr[Node | Null], 
      /* projectionOptions */ ProjectionOptions, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDom")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "createProjection")
  @js.native
  def createProjection: js.Function2[/* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Projection] = js.native
  @scala.inline
  def createProjection_=(x: js.Function2[/* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Projection]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createProjection")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "extend")
  @js.native
  def extend: js.Function2[/* base */ js.Any, /* overrides */ js.Any, js.Any] = js.native
  @scala.inline
  def extend_=(x: js.Function2[/* base */ js.Any, /* overrides */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "initPropertiesAndChildren")
  @js.native
  def initPropertiesAndChildren: js.Function3[/* domNode */ Node, /* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Unit] = js.native
  @scala.inline
  def initPropertiesAndChildren_=(
    x: js.Function3[/* domNode */ Node, /* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initPropertiesAndChildren")(x.asInstanceOf[js.Any])
}
