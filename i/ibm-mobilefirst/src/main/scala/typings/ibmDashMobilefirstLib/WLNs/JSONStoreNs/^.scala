package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore")
@js.native
object ^ extends js.Object {
  /**
    * Creates a query for advanced find. See WL.JSONStore.QueryPart for more information.
    */
  def QueryPart(): ibmDashMobilefirstLib.WLNs.JSONStoreNs.QueryPartObj = js.native
  /**
    * Changes the password for the internal storage. You must have an initialized collection before calling WL.JSONStore.changePassword.
    */
  def changePassword(
    oldPassword: java.lang.String,
    newPassword: java.lang.String,
    username: java.lang.String,
    options: ibmDashMobilefirstLib.WLNs.Options
  ): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def clearPassword(): scala.Boolean = js.native
  /**
    * Locks access to all the collections until WL.JSONStore.init is called.
    */
  def closeAll(): jqueryLib.JQueryDeferred[_] = js.native
  def closeAll(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * Commit a transaction.
    */
  def commitTransaction(): jqueryLib.JQueryDeferred[scala.Double] = js.native
  /**
    * Completely wipes data for all users, destroys the internal storage, and clears security artifacts.
    * @parameters options is @deprecated
    */
  def destroy(username: java.lang.String): jqueryLib.JQueryDeferred[scala.Double] = js.native
  def destroy(username: java.lang.String, options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[scala.Double] = js.native
  /**
    * @deprecated since version 6.2.0.
    */
  def documentify(id: scala.Double, data: js.Any): js.Any = js.native
  /**
    * Returns information about the file that is used to persist data in the store. The following key value pairs are returned:
    * name - name of the store
    * size - the total size, in bytes, of the store
    * isEncrypted - boolean that is true when encrypted and false otherwise.
    */
  def fileInfo(): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * Provides an accessor to the collection if the collection exists, otherwise it returns undefined.
    */
  def get(collectionName: java.lang.String): ibmDashMobilefirstLib.WLNs.JSONStoreNs.JSONStoreInstance = js.native
  /**
    * Returns the message that is associated with a JSONStore error code.
    */
  def getErrorMessage(errorCode: scala.Double): java.lang.String = js.native
  def init(collections: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def init(collections: js.Any, options: ibmDashMobilefirstLib.WLNs.JSONStoreNs.InitOptions): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def initCollection(name: java.lang.String, searchFields: js.Any): ibmDashMobilefirstLib.WLNs.JSONStoreNs.JSONStoreInstance = js.native
  def initCollection(
    name: java.lang.String,
    searchFields: js.Any,
    options: ibmDashMobilefirstLib.WLNs.JSONStoreNs.InitOptions
  ): ibmDashMobilefirstLib.WLNs.JSONStoreNs.JSONStoreInstance = js.native
  /**
    * Roll back a transaction
    */
  def rollbackTransaction(): jqueryLib.JQueryDeferred[scala.Double] = js.native
  /**
    * Initiates a transaction
    */
  def startTransaction(): jqueryLib.JQueryDeferred[scala.Double] = js.native
  /**
    * Sets the password that is used to generate keys to encrypt data that is stored locally on the device.
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def usePassword(pwd: java.lang.String): scala.Boolean = js.native
}

