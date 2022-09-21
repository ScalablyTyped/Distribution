package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.MaxTimelineEntries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "SyncAccumulator")
@js.native
open class SyncAccumulator () extends StObject {
  def this(options: MaxTimelineEntries) = this()
  
  /**
    * @param fromDatabase default is false
    */
  def accumulate(syncResponse: SyncResponse): Unit = js.native
  def accumulate(syncResponse: SyncResponse, fromDatabase: Boolean): Unit = js.native
  
  /**
    * Return everything under the 'rooms' key from a /sync response which
    * represents all room data that should be stored. This should be paired
    * with the sync token which represents the most recent /sync response
    * provided to accumulate().
    * @param forDatabase True to generate a sync to be saved to storage
    * @return An object with a "nextBatch", "roomsData", "groupsData"
    * and "accountData" keys.
    * The "nextBatch" key is a string which represents at what point in the
    * /sync stream the accumulator reached. This token should be used when
    * restarting a /sync stream at startup. Failure to do so can lead to missing
    * events. The "roomsData" key is an Object which represents the entire
    * /sync response from the 'rooms' key onwards. The "accountData" key is
    * a list of raw events which represent global account data.
    */
  def getJSON(): SyncData = js.native
  def getJSON(forDatabase: Boolean): SyncData = js.native
  
  def getNextBatchToken(): String | Null = js.native
}
