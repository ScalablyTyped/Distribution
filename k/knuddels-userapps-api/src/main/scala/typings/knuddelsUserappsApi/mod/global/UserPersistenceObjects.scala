package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html
	 */
@JSGlobal("UserPersistenceObjects")
@js.native
class UserPersistenceObjects () extends js.Object
/* static members */
@JSGlobal("UserPersistenceObjects")
@js.native
object UserPersistenceObjects extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_deleteAll
  		 * @since AppServer 82478
  		 */
  def deleteAll(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceObjects.html#method_each
  		 */
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
  def getAllKeys(): js.Array[java.lang.String] = js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
}
