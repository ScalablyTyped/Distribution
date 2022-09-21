package typings.knuddelsUserappBackendApi.mod.global

import typings.knuddelsUserappBackendApi.anon.Ascending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html
  */
@JSGlobal("ToplistAccess")
@js.native
open class ToplistAccess () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_createOrUpdateToplist
    */
  def createOrUpdateToplist(userPersistenceNumberKey: java.lang.String, displayName: java.lang.String): Toplist = js.native
  def createOrUpdateToplist(userPersistenceNumberKey: java.lang.String, displayName: java.lang.String, parameters: Ascending): Toplist = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getAllToplists
    */
  def getAllToplists(): js.Array[Toplist] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getToplist
    */
  def getToplist(userPersistenceNumberKey: java.lang.String): Toplist = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_removeToplist
    */
  def removeToplist(toplist: Toplist): Unit = js.native
}
