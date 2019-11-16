package typings.atKeystonejsAdapterDashKnex.atKeystonejsAdapterDashKnexMod

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseKeystoneAdapter
import typings.knex.knexMod.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/adapter-knex", "KnexAdapter")
@js.native
class KnexAdapter () extends BaseKeystoneAdapter {
  def this(options: KnexAdaptorOptions) = this()
  def disconnect(): Unit = js.native
  def dropDatabase(): js.Promise[Raw[_]] = js.native
}

