package typings.maquette

import typings.maquette.interfacesMod.Projector
import typings.maquette.interfacesMod.ProjectorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maquette/dist/projector", JSImport.Namespace)
@js.native
object projectorMod extends js.Object {
  
  var createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
}
