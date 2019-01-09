package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html
	 */
@JSGlobal("ToplistAccess")
@js.native
class ToplistAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_createOrUpdateToplist
  		 */
  def createOrUpdateToplist(userPersistenceNumberKey: java.lang.String, displayName: java.lang.String): Toplist = js.native
  def createOrUpdateToplist(
    userPersistenceNumberKey: java.lang.String,
    displayName: java.lang.String,
    parameters: knuddelsDashUserappsDashApiLib.Anon_Ascending
  ): Toplist = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getAllToplists
  		 */
  def getAllToplists(): js.Array[Toplist] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getToplist
  		 */
  def getToplist(userPersistenceNumberKey: java.lang.String): Toplist = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_removeToplist
  		 */
  def removeToplist(toplist: Toplist): scala.Unit = js.native
}

