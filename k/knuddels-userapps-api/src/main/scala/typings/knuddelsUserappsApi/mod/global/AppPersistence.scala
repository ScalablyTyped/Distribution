package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html
	 */
@JSGlobal("AppPersistence")
@js.native
class AppPersistence () extends Persistence {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getDatabaseFileSize
  		 */
  def getDatabaseFileSize(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getDatabaseFileSizeLimit
  		 */
  def getDatabaseFileSizeLimit(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getNumberKeys
  		 * @since AppServer 20191007-160000
  		 */
  def getNumberKeys(): js.Array[java.lang.String] = js.native
  def getNumberKeys(keyPattern: java.lang.String): js.Array[java.lang.String] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getObjectKeys
  		 * @since AppServer 20191007-160000
  		 */
  def getObjectKeys(): js.Array[java.lang.String] = js.native
  def getObjectKeys(keyPattern: java.lang.String): js.Array[java.lang.String] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getStringKeys
  		 * @since AppServer 20191007-160000
  		 */
  def getStringKeys(): js.Array[java.lang.String] = js.native
  def getStringKeys(keyPattern: java.lang.String): js.Array[java.lang.String] = js.native
}
