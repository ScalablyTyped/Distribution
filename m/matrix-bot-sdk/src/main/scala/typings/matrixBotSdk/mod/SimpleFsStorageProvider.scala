package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "SimpleFsStorageProvider")
@js.native
open class SimpleFsStorageProvider protected ()
  extends typings.matrixBotSdk.libStorageSimpleFsStorageProviderMod.SimpleFsStorageProvider {
  /**
    * Creates a new simple file system storage provider.
    * @param {string} filename The file name (typically 'storage.json') to store data within.
    * @param {boolean} trackTransactionsInMemory True (default) to track all received appservice transactions rather than on disk.
    * @param {int} maxInMemoryTransactions The maximum number of transactions to hold in memory before rotating the oldest out. Defaults to 20.
    */
  def this(filename: String) = this()
  def this(filename: String, trackTransactionsInMemory: Boolean) = this()
  def this(filename: String, trackTransactionsInMemory: Boolean, maxInMemoryTransactions: Double) = this()
  def this(filename: String, trackTransactionsInMemory: Unit, maxInMemoryTransactions: Double) = this()
}
