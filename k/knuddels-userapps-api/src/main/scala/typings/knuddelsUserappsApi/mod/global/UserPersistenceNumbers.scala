package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.AscendingCount
import typings.knuddelsUserappsApi.anon.AscendingMinimumValue
import typings.knuddelsUserappsApi.anon.Count
import typings.knuddelsUserappsApi.anon.MaximumCount
import typings.knuddelsUserappsApi.anon.MaximumValue
import typings.knuddelsUserappsApi.anon.MinimumValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html
  */
@JSGlobal("UserPersistenceNumbers")
@js.native
class UserPersistenceNumbers () extends js.Object

/* static members */
@JSGlobal("UserPersistenceNumbers")
@js.native
object UserPersistenceNumbers extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_addNumber
    */
  def addNumber(key: java.lang.String, value: Double): Double = js.native
  def addNumber(key: java.lang.String, value: Double, parameters: MinimumValue): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_deleteAll
    */
  def deleteAll(key: java.lang.String): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_each
    */
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
  def getAllKeys(): js.Array[java.lang.String] = js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getCount
    */
  def getCount(key: java.lang.String): Double = js.native
  def getCount(key: java.lang.String, parameters: MaximumValue): Double = js.native
  def getPosition(key: java.lang.String, user_or_userId: Double): Double = js.native
  def getPosition(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
    */
  def getPosition(key: java.lang.String, user_or_userId: User): Double = js.native
  def getPosition(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = js.native
  def getRank(key: java.lang.String, user_or_userId: Double): Double = js.native
  def getRank(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
    */
  def getRank(key: java.lang.String, user_or_userId: User): Double = js.native
  def getRank(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntries
    */
  def getSortedEntries(key: java.lang.String): js.Array[UserPersistenceNumberEntry] = js.native
  def getSortedEntries(key: java.lang.String, parameters: Count): js.Array[UserPersistenceNumberEntry] = js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double): js.Array[UserPersistenceNumberEntry] = js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
    */
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User): js.Array[UserPersistenceNumberEntry] = js.native
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSum
    */
  def getSum(key: java.lang.String): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateKey
    */
  def updateKey(oldKeyName: java.lang.String, newKeyName: java.lang.String): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateValue
    */
  def updateValue(key: java.lang.String, oldValue: Double, newValue: Double): Double = js.native
}

