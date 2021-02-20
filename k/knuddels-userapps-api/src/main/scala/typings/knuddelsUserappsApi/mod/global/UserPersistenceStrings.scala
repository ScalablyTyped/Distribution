package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.Online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html
	 */
@JSGlobal("UserPersistenceStrings")
@js.native
class UserPersistenceStrings () extends StObject
object UserPersistenceStrings {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_deleteAll
  		 * @since AppServer 82478
  		 */
  /* static member */
  @JSGlobal("UserPersistenceStrings.deleteAll")
  @js.native
  def deleteAll(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_each
  		 */
  /* static member */
  @JSGlobal("UserPersistenceStrings.each")
  @js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ java.lang.String, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ]
  ): Unit = js.native
  @JSGlobal("UserPersistenceStrings.each")
  @js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ java.lang.String, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ],
    parameters: Online
  ): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_exists
  		 * @since AppServer 88571
  		 */
  /* static member */
  @JSGlobal("UserPersistenceStrings.exists")
  @js.native
  def exists(key: java.lang.String, value: java.lang.String): Boolean = js.native
  @JSGlobal("UserPersistenceStrings.exists")
  @js.native
  def exists(key: java.lang.String, value: java.lang.String, ignoreCase: Boolean): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  /* static member */
  @JSGlobal("UserPersistenceStrings.getAllKeys")
  @js.native
  def getAllKeys(): js.Array[java.lang.String] = js.native
  @JSGlobal("UserPersistenceStrings.getAllKeys")
  @js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
}
