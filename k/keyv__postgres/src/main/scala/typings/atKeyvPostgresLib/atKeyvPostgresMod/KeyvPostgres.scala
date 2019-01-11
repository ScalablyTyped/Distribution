package typings
package atKeyvPostgresLib.atKeyvPostgresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvPostgres
  extends nodeLib.eventsMod.EventEmitter
     with keyvLib.keyvMod.KeyvNs.Store[js.UndefOr[java.lang.String]] {
  var namespace: js.UndefOr[java.lang.String] = js.native
  val ttlSupport: atKeyvPostgresLib.atKeyvPostgresLibNumbers.`false` = js.native
  def set(key: java.lang.String): js.Promise[_] = js.native
  def set(key: java.lang.String, value: java.lang.String): js.Promise[_] = js.native
}

