package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html
  */
@JSGlobal("UserPersistenceObjects")
@js.native
open class UserPersistenceObjects () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_getNicksByKey
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  def getNicksByKey(key: java.lang.String, callback: js.Function1[/* nicks */ js.Array[java.lang.String], Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_getUserIdsByKey
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  def getUserIdsByKey(key: java.lang.String, callback: js.Function1[/* userIds */ js.Array[Double], Unit]): Unit = js.native
}
object UserPersistenceObjects {
  
  @JSGlobal("UserPersistenceObjects")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_deleteAll
    * @since AppServer 82478
    */
  /* static member */
  inline def deleteAll(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAll")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_each
    */
  /* static member */
  inline def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ js.Object, 
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
      /* value */ js.Object, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ],
    parameters: OnStart
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_getAllKeys
    * @since AppServer 82483
    */
  /* static member */
  inline def getAllKeys(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")().asInstanceOf[js.Array[java.lang.String]]
  inline def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")(filterKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
}
