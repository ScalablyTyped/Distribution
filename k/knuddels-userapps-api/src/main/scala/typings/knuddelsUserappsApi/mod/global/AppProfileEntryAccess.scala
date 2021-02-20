package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/AppProfileEntryAccess.html
	 */
@JSGlobal("AppProfileEntryAccess")
@js.native
class AppProfileEntryAccess () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppProfileEntryAccess.html#method_createOrUpdateEntry
  		 */
  def createOrUpdateEntry(toplist: Toplist, toplistDisplayType: ToplistDisplayType): AppProfileEntry = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppProfileEntryAccess.html#method_getAllProfileEntries
  		 */
  def getAllProfileEntries(): js.Array[AppProfileEntry] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppProfileEntryAccess.html#method_getAppProfileEntry
  		 */
  def getAppProfileEntry(userPersistenceNumberKey: java.lang.String): AppProfileEntry = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppProfileEntryAccess.html#method_removeEntry
  		 */
  def removeEntry(appProfileEntry: AppProfileEntry): Unit = js.native
}
