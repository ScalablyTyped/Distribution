package typings.atKeyvMysql.atKeyvMysqlMod

import typings.atKeyvMysql.atKeyvMysqlNumbers.`false`
import typings.keyv.keyvMod.Store
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvMysql
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `false` = js.native
  def set(key: String): js.Promise[_] = js.native
  def set(key: String, value: String): js.Promise[_] = js.native
}

