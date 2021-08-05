package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.AscendingCount
import typings.knuddelsUserappsApi.anon.AscendingMinimumValue
import typings.knuddelsUserappsApi.anon.Count
import typings.knuddelsUserappsApi.anon.MaximumCount
import typings.knuddelsUserappsApi.anon.MaximumValue
import typings.knuddelsUserappsApi.anon.MinimumValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html
	 */
@JSGlobal("UserPersistenceNumbers")
@js.native
class UserPersistenceNumbers () extends StObject
object UserPersistenceNumbers {
  
  @JSGlobal("UserPersistenceNumbers")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_addNumber
  		 */
  /* static member */
  inline def addNumber(key: java.lang.String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addNumber")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def addNumber(key: java.lang.String, value: Double, parameters: MinimumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addNumber")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_deleteAll
  		 */
  /* static member */
  inline def deleteAll(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAll")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_each
  		 */
  /* static member */
  inline def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ Double, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  /* static member */
  inline def getAllKeys(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")().asInstanceOf[js.Array[java.lang.String]]
  inline def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")(filterKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getCount
  		 */
  /* static member */
  inline def getCount(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCount(key: java.lang.String, parameters: MaximumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPosition(key: java.lang.String, user_or_userId: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPosition(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  /* static member */
  inline def getPosition(key: java.lang.String, user_or_userId: User): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPosition(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRank(key: java.lang.String, user_or_userId: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRank")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getRank(key: java.lang.String, user_or_userId: Double, parameters: AscendingMinimumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRank")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  /* static member */
  inline def getRank(key: java.lang.String, user_or_userId: User): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRank")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getRank(key: java.lang.String, user_or_userId: User, parameters: AscendingMinimumValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRank")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntries
  		 */
  /* static member */
  inline def getSortedEntries(key: java.lang.String): js.Array[UserPersistenceNumberEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntries")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  inline def getSortedEntries(key: java.lang.String, parameters: Count): js.Array[UserPersistenceNumberEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntries")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  
  inline def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double): js.Array[UserPersistenceNumberEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntriesAdjacent")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  inline def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: Double, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntriesAdjacent")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  /* static member */
  inline def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User): js.Array[UserPersistenceNumberEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntriesAdjacent")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any])).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  inline def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: User, parameters: AscendingCount): js.Array[UserPersistenceNumberEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEntriesAdjacent")(key.asInstanceOf[js.Any], user_or_userId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[UserPersistenceNumberEntry]]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSum
  		 */
  /* static member */
  inline def getSum(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSum")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateKey
  		 */
  /* static member */
  inline def updateKey(oldKeyName: java.lang.String, newKeyName: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateKey")(oldKeyName.asInstanceOf[js.Any], newKeyName.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateValue
  		 */
  /* static member */
  inline def updateValue(key: java.lang.String, oldValue: Double, newValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateValue")(key.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Double]
}
