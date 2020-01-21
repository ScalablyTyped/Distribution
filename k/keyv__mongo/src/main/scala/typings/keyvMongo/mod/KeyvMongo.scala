package typings.keyvMongo.mod

import typings.keyv.mod.Store
import typings.keyvMongo.keyvMongoBooleans.`false`
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

