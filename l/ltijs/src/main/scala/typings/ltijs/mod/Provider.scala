package typings.ltijs.mod

import typings.ltijs.databaseMod.DatabaseOptions
import typings.ltijs.providerMod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltijs", "Provider")
@js.native
class Provider protected ()
  extends typings.ltijs.providerMod.Provider {
  def this(encryptionKey: String, database: DatabaseOptions) = this()
  def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
}

