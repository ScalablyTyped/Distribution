package typings.atKeyvMongo.atKeyvMongoMod

import typings.atKeyvMongo.atKeyvMongoNumbers.`false`
import typings.keyv.keyvMod.Store
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvMongo[TValue]
  extends EventEmitter
     with Store[TValue] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `false` = js.native
}

