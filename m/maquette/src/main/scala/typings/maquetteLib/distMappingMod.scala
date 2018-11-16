package typings
package maquetteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/mapping", JSImport.Namespace)
@js.native
object distMappingMod extends js.Object {
  var createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ js.Any, java.lang.String | scala.Double], 
    /* createResult */ js.Function2[/* source */ js.Any, /* index */ scala.Double, js.Any], 
    /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ scala.Double, scala.Unit], 
    maquetteLib.distInterfacesMod.Mapping[js.Any, js.Any]
  ] = js.native
}

