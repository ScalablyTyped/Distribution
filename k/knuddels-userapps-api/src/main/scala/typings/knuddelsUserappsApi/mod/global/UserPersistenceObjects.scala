package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html
	 */
@JSGlobal("UserPersistenceObjects")
@js.native
class UserPersistenceObjects () extends StObject
object UserPersistenceObjects {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_deleteAll
  		 * @since AppServer 82478
  		 */
  /* static member */
  @JSGlobal("UserPersistenceObjects.deleteAll")
  @js.native
  def deleteAll(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_each
  		 */
  /* static member */
  @JSGlobal("UserPersistenceObjects.each")
  @js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ js.Object, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ]
  ): Unit = js.native
  @JSGlobal("UserPersistenceObjects.each")
  @js.native
  def each(
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
  ): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  /* static member */
  @JSGlobal("UserPersistenceObjects.getAllKeys")
  @js.native
  def getAllKeys(): js.Array[java.lang.String] = js.native
  @JSGlobal("UserPersistenceObjects.getAllKeys")
  @js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
}
