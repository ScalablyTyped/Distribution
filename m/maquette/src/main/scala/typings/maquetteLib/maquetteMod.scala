package typings
package maquetteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette", JSImport.Namespace)
@js.native
object maquetteMod extends js.Object {
  var createCache: js.Function0[maquetteLib.distInterfacesMod.CalculationCache[js.Any]] = js.native
  var createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ js.Any, java.lang.String | scala.Double], 
    /* createResult */ js.Function2[/* source */ js.Any, /* index */ scala.Double, js.Any], 
    /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ scala.Double, scala.Unit], 
    maquetteLib.distInterfacesMod.Mapping[js.Any, js.Any]
  ] = js.native
  var createProjector: js.Function1[
    /* projectorOptions */ js.UndefOr[maquetteLib.distInterfacesMod.ProjectorOptions], 
    maquetteLib.distInterfacesMod.Projector
  ] = js.native
  var dom: maquetteLib.Anon_Append = js.native
  def h(selector: java.lang.String): maquetteLib.distInterfacesMod.VNode = js.native
  def h(selector: java.lang.String, children: js.Array[maquetteLib.distInterfacesMod.VNodeChild]): maquetteLib.distInterfacesMod.VNode = js.native
  def h(selector: java.lang.String, properties: maquetteLib.distInterfacesMod.VNodeProperties): maquetteLib.distInterfacesMod.VNode = js.native
  def h(
    selector: java.lang.String,
    properties: maquetteLib.distInterfacesMod.VNodeProperties,
    children: js.Array[maquetteLib.distInterfacesMod.VNodeChild]
  ): maquetteLib.distInterfacesMod.VNode = js.native
}

