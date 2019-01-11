package typings
package atKeyvMongoLib.atKeyvMongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvMongo[TValue]
  extends nodeLib.eventsMod.EventEmitter
     with keyvLib.keyvMod.KeyvNs.Store[TValue] {
  var namespace: js.UndefOr[java.lang.String] = js.native
  val ttlSupport: atKeyvMongoLib.atKeyvMongoLibNumbers.`false` = js.native
}

