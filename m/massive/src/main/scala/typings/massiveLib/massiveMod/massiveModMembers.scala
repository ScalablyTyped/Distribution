package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("massive", JSImport.Namespace)
@js.native
object massiveModMembers extends js.Object {
  def apply(connection: massiveLib.massiveMod.massiveNs.ConnectionInfo | java.lang.String): stdLib.Promise[massiveLib.massiveMod.massiveNs.Database] = js.native
  def apply(
    connection: massiveLib.massiveMod.massiveNs.ConnectionInfo | java.lang.String,
    loaderConfig: massiveLib.massiveMod.massiveNs.Loader
  ): stdLib.Promise[massiveLib.massiveMod.massiveNs.Database] = js.native
  def apply(
    connection: massiveLib.massiveMod.massiveNs.ConnectionInfo | java.lang.String,
    loaderConfig: massiveLib.massiveMod.massiveNs.Loader,
    driverConfig: js.Object
  ): stdLib.Promise[massiveLib.massiveMod.massiveNs.Database] = js.native
}

