package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.Online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html
  */
@JSGlobal("UserPersistenceStrings")
@js.native
open class UserPersistenceStrings () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getNicksByKey
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  def getNicksByKey(key: java.lang.String, callback: js.Function1[/* nicks */ js.Array[java.lang.String], Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getUserIdsByKey
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  def getUserIdsByKey(key: java.lang.String, callback: js.Function1[/* userIds */ js.Array[Double], Unit]): Unit = js.native
}
object UserPersistenceStrings {
  
  @JSGlobal("UserPersistenceStrings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_deleteAll
    * @since AppServer 82478
    */
  /* static member */
  inline def deleteAll(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAll")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_each
    */
  /* static member */
  inline def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ java.lang.String, 
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
      /* value */ java.lang.String, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ],
    parameters: Online
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_exists
    * @since AppServer 88571
    */
  /* static member */
  inline def exists(key: java.lang.String, value: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def exists(key: java.lang.String, value: java.lang.String, ignoreCase: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getAllKeys
    * @since AppServer 82483
    */
  /* static member */
  inline def getAllKeys(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")().asInstanceOf[js.Array[java.lang.String]]
  inline def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")(filterKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
}
