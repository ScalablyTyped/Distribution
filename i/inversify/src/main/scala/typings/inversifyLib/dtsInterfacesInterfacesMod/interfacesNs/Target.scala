package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var id: scala.Double = js.native
  var metadata: js.Array[Metadata] = js.native
  var name: QueryableString = js.native
  var serviceIdentifier: ServiceIdentifier[_] = js.native
  var `type`: TargetType = js.native
  def getCustomTags(): js.Array[Metadata] | scala.Null = js.native
  def getNamedTag(): Metadata | scala.Null = js.native
  def hasTag(key: java.lang.String): scala.Boolean = js.native
  def hasTag(key: js.Symbol): scala.Boolean = js.native
  def hasTag(key: scala.Double): scala.Boolean = js.native
  def isArray(): scala.Boolean = js.native
  def isNamed(): scala.Boolean = js.native
  def isOptional(): scala.Boolean = js.native
  def isTagged(): scala.Boolean = js.native
  def matchesArray(name: ServiceIdentifier[_]): scala.Boolean = js.native
  def matchesNamedTag(name: java.lang.String): scala.Boolean = js.native
  def matchesTag(key: java.lang.String): js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  def matchesTag(key: js.Symbol): js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  def matchesTag(key: scala.Double): js.Function1[/* value */ js.Any, scala.Boolean] = js.native
}

