package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.AscendingCount
import typings.knuddelsUserappsApi.anon.AscendingMinimumValue
import typings.knuddelsUserappsApi.anon.Count
import typings.knuddelsUserappsApi.anon.MaximumCount
import typings.knuddelsUserappsApi.anon.MaximumValue
import typings.knuddelsUserappsApi.anon.MinimumValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html
	 */
@JSGlobal("UserPersistenceNumbers")
@js.native
class UserPersistenceNumbers () extends StObject
object UserPersistenceNumbers {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_addNumber
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.addNumber")
  @js.native
  def addNumber(key: java.lang.String, value: Double): Double = js.native
  @JSGlobal("UserPersistenceNumbers.addNumber")
  @js.native
  def addNumber(key: java.lang.String, value: Double, parameters: MinimumValue): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_deleteAll
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.deleteAll")
  @js.native
  def deleteAll(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_each
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.each")
  @js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ Double, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ]
  ): Unit = js.native
  @JSGlobal("UserPersistenceNumbers.each")
  @js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ Double, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ],
    parameters: MaximumCount
  ): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getAllKeys")
  @js.native
  def getAllKeys(): js.Array[java.lang.String] = js.native
  @JSGlobal("UserPersistenceNumbers.getAllKeys")
  @js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getCount
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getCount")
  @js.native
  def getCount(key: java.lang.String): Double = js.native
  @JSGlobal("UserPersistenceNumbers.getCount")
  @js.native
  def getCount(key: java.lang.String, parameters: MaximumValue): Double = js.native
  
  @JSGlobal("UserPersistenceNumbers.getPosition")
  @js.native
  def getPosition(key: java.lang.String, user_or_userId: Double): Double = js.native
  @JSGlobal("UserPersistenceNumbers.getPosition")
  @js.native
  def getPosition(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getPosition")
  @js.native
  def getPosition(key: java.lang.String, user_or_userId: User): Double = js.native
  @JSGlobal("UserPersistenceNumbers.getPosition")
  @js.native
  def getPosition(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = js.native
  
  @JSGlobal("UserPersistenceNumbers.getRank")
  @js.native
  def getRank(key: java.lang.String, user_or_userId: Double): Double = js.native
  @JSGlobal("UserPersistenceNumbers.getRank")
  @js.native
  def getRank(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getRank")
  @js.native
  def getRank(key: java.lang.String, user_or_userId: User): Double = js.native
  @JSGlobal("UserPersistenceNumbers.getRank")
  @js.native
  def getRank(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntries
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getSortedEntries")
  @js.native
  def getSortedEntries(key: java.lang.String): js.Array[UserPersistenceNumberEntry] = js.native
  @JSGlobal("UserPersistenceNumbers.getSortedEntries")
  @js.native
  def getSortedEntries(key: java.lang.String, parameters: Count): js.Array[UserPersistenceNumberEntry] = js.native
  
  @JSGlobal("UserPersistenceNumbers.getSortedEntriesAdjacent")
  @js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double): js.Array[UserPersistenceNumberEntry] = js.native
  @JSGlobal("UserPersistenceNumbers.getSortedEntriesAdjacent")
  @js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getSortedEntriesAdjacent")
  @js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User): js.Array[UserPersistenceNumberEntry] = js.native
  @JSGlobal("UserPersistenceNumbers.getSortedEntriesAdjacent")
  @js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSum
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.getSum")
  @js.native
  def getSum(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateKey
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.updateKey")
  @js.native
  def updateKey(oldKeyName: java.lang.String, newKeyName: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateValue
  		 */
  /* static member */
  @JSGlobal("UserPersistenceNumbers.updateValue")
  @js.native
  def updateValue(key: java.lang.String, oldValue: Double, newValue: Double): Double = js.native
}
