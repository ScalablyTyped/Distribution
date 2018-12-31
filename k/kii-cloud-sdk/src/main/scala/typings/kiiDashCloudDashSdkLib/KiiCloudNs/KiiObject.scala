package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiObject object
  */
@JSGlobal("KiiCloud.KiiObject")
@js.native
class KiiObject () extends js.Object {
  /**
    * Delete the object from the server
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theDeletedObject). theDeletedObject is KiiObject instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var obj = . . .; // a KiiObject
    *     obj.delete({
    *         success: function(theDeletedObject) {
    *             // do something
    *         },
    *
    *         failure: function(theObject, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var obj = . . .; // a KiiObject
    *     obj.delete().then(
    *         function(theDeletedObject) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def delete(): js.Promise[KiiObject] = js.native
  def delete(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject): js.Promise[KiiObject] = js.native
  /**
    * Delete the object body from the server.<br>
    * If the KiiObject has not saved on the cloud or deleted
    * or exist but does not have body object, request will be failed.<br>
    * If succeeded, The object body content type will be nullified.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theDeletedObject). theDeletedObject is the KiiObject instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var obj = . . .; // a KiiObject
    *     obj.deleteBody({
    *         success: function(theDeletedObject) {
    *             // do something
    *         },
    *
    *         failure: function(obj, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var obj = . . .; // a KiiObject
    *     obj.deleteBody().then(
    *         function(theDeletedObject) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def deleteBody(): js.Promise[KiiObject] = js.native
  def deleteBody(callbacks: kiiDashCloudDashSdkLib.Anon_FailureObjAnErrorString): js.Promise[KiiObject] = js.native
  /**
    * Download body data of this object.<br>
    * If the KiiObject has not saved on the cloud or deleted
    * or exist but does not have body object, request will be failed.
    * <br>NOTE: this requires XMLHttpRequest Level 2, FileReader and Blob supports. Do not use it in server code.<br>
    *
    * @param callbacks progress: function called on XMLHttpRequest 'progress' event listener.<br>
    *   sucess: function called when download succeeded.<br>
    *   failure: function called when download failed.
    *
    * @return return promise object.
    *     <br>NOTE: Promise will not handle progress event. Please pass callbacks with progress function to handle progress.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiObject instance which this method was called on.</li>
    *         <li>params[1] is the returned body blob object.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.</li>
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     myObject.downloadBody({
    *         progress: function (oEvent) {
    *           if (oEvent.lengthComputable) {
    *             var percentComplete = oEvent.loaded / oEvent.total;
    *             //getting download progress. You can update progress bar on this function.
    *
    *           }
    *         },
    *         success: function(obj, bodyBlob) {
    *             // Obtaind body contents as bodyBlob.
    *             // content-type managed in Kii Cloud can be obtained from type attr.
    *             // It is same as obj.getBodyContentType();
    *             var contentType = bodyBlob.type;
    *         },
    *         failure: function(obj, anErrorString) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     myObject.downloadBody({
    *         progress: function (oEvent) {
    *           if (oEvent.lengthComputable) {
    *             var percentComplete = oEvent.loaded / oEvent.total;
    *             //getting download progress. You can update progress bar on this function.
    *
    *           }
    *         }
    *     ).then(
    *         function(params) {
    *             // Obtaind body contents as bodyBlob.
    *             // content-type managed in Kii Cloud can be obtained from type attr.
    *             // It is same as obj.getBodyContentType();
    *             var obj = params[0];
    *             var bodyBlob = params[1];
    *             var contentType = bodyBlob.type;
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def downloadBody(): js.Promise[js.Tuple2[KiiObject, stdLib.Blob]] = js.native
  def downloadBody(callbacks: kiiDashCloudDashSdkLib.Anon_FailureObjAnErrorStringSuccess): js.Promise[js.Tuple2[KiiObject, stdLib.Blob]] = js.native
  /**
    * Gets the value associated with the given key
    *
    * @param key The key to retrieve
    *
    * @return The object associated with the key. null or undefined if none exists
    *
    * @example
    *     var obj = . . .; // a KiiObject
    *     var score = obj.get("score");
    */
  def get[T](key: java.lang.String): T = js.native
  /**
    * Get the body content-type.
    * It will be updated after the success of {@link KiiObject#uploadBody} and {@link KiiObject#downloadBody}
    * returns null or undefined when this object doesn't have body content-type information.
    *
    * @return content-type of object body
    */
  def getBodyContentType(): java.lang.String = js.native
  /**
    * Get the server's creation date of this object
    *
    */
  def getCreated(): scala.Double = js.native
  /**
    * Gets the geo point associated with the given key.
    *
    * @param key The key of the geo point to retrieve.
    *
    * @return KiiGeoPoint tied to the key. null if null exists.
    */
  def getGeoPoint(key: java.lang.String): KiiGeoPoint = js.native
  /**
    * Get Id of the object or null if the object ID hasn't been assigned.
    *
    */
  def getID(): java.lang.String = js.native
  /**
    * Gets the array object that contains all keys of custom field.
    * The array of keys from local cache will be returned.
    * To get the latest array of keys from cloud, calling refresh() is necessary prior calling this method.
    * The returned array object does not include reserved keys such as _created, _modified, etc.
    *
    * @return keys An array of all keys of custom field.
    *
    * @example
    *     var obj = . . .; // a KiiObject
    *     for(var key of obj.keys()) {
    *     }
    */
  def getKeys(): js.Array[java.lang.String] = js.native
  /**
    * Get the modified date of the given object, assigned by the server
    *
    */
  def getModified(): java.lang.String = js.native
  /**
    * Get the application-defined type name of the object
    *
    * @return type of this object. null or undefined if none exists
    */
  def getObjectType(): java.lang.String = js.native
  /**
    * Get the UUID of the given object, assigned by the server
    *
    */
  def getUUID(): java.lang.String = js.native
  /**
    * Move KiiObject body from an object to another object.
    * <br>
    * This moving can be allowed under same application, across different scopes
    * and source/target KiiObject have a read and write permission (READ_EXISTING_OBJECT and WRITE_EXISTING_OBJECT).
    * <br><br>If target KiiObject has a body, it will be overwritten.
    *
    * @param targetObjectUri A KiiObject URI which KiiObject body is moved to.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the source KiiObject instance which this method was called on.</li>
    *         <li>params[1] is the target targetObjectUri String.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the source KiiObject instance which this method was called on.</li>
    *         <li>error.targetObjectUri is the targetObjectUri String.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var sourceObject = ...; // Source KiiObject
    *     var targetObject = ...; // Target KiiObject
    *     var targetObjectUri = targetObject.objectURI();
    *     sourceObject.moveBody(targetObjectUri, {
    *         success: function(theSrcObject, theTgtObjectUri) {
    *             // Do something with the objects
    *         },
    *
    *         failure: function(theSrcObject, theTgtObjectUri, anErrorString) {
    *             // Do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var sourceObject = ...; // Source KiiObject
    *     var targetObject = ...; // Target KiiObject
    *     var targetObjectUri = targetObject.objectURI();
    *     sourceObject.moveBody(targetObjectUri).then(
    *         function(params) {
    *             var theSrcObject = params[0];
    *             var theTgtObjectUri = params[1];
    *             // Do something with the objects
    *         },
    *         function(error) {
    *             // Do something with the error response
    *         }
    *     );
    */
  def moveBody(targetObjectUri: java.lang.String): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  def moveBody(targetObjectUri: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheSrcObject): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  /**
    * Get the ACL handle for this file
    *
    * <br><br>Any KiiACLEntry objects added or revoked from this ACL object will be appended to/removed from the server on ACL save.
    *
    * @return A KiiACL object associated with this KiiObject
    *
    * @example
    *     	var obj = . . .; // a KiiObject
    *     	var acl = obj.objectACL();
    */
  def objectACL(): KiiACL = js.native
  /**
    * Get a specifically formatted string referencing the object
    *
    * <br><br>The object must exist in the cloud (have a valid UUID).
    *
    * @return A URI string based on the current object. null if a URI couldn't be generated.
    *
    * @example
    *     var obj = . . .; // a KiiObject
    *     var uri = obj.objectURI();
    */
  def objectURI(): java.lang.String = js.native
  /**
    * Publish object body.<br>
    * Publish object body and obtain public URL links to the body.<br>
    * It doesn't expires.<br>
    * If the KiiObject has not saved on the cloud or deleted
    * or exist but does not have body object, request will be failed.
    *
    * @param callbacks sucess: function called when publish succeeded.<br>
    *   failure: function called when publish failed.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiObject instance which this method was called on.</li>
    *         <li>params[1] is the published url string.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     myObject.publishBody({
    *         success: function(obj, publishedUrl) {
    *             // ex.) You can show publishedUrl in the view.
    *         },
    *         failure: function(obj, anErrorString) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     myObject.publishBody().then(
    *         function(params) {
    *             // ex.) You can show publishedUrl in the view.
    *             var obj = params[0];
    *             var publishedUrl = params[1];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def publishBody(): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  def publishBody(callbacks: kiiDashCloudDashSdkLib.Anon_FailureObj): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  /**
    * Publish object body with expiration date.<br>
    * Publish object body and obtain public URL links to the body.<br>
    * Expires at specified date <br>
    * If the KiiObject has not saved on the cloud or deleted
    * or exist but does not have body object, request will be failed.
    *
    * @param expiresAt expiration date. should specify future date.
    * @param callbacks sucess: function called when publish succeeded.<br>
    *   failure: function called when publish failed.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiObject instance which this method was called on.</li>
    *         <li>params[1] is the published url string.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     var expiresAt = new Date(2014, 11, 24);
    *     myObject.publishBodyExpiresAt(expiresAt, {
    *         success: function(obj, publishedUrl) {
    *             // ex.) You can show publishedUrl in the view.
    *         },
    *         failure: function(obj, anErrorString) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     var expiresAt = new Date(2014, 11, 24);
    *     myObject.publishBodyExpiresAt(expiresAt).then(
    *         function(params) {
    *             // ex.) You can show publishedUrl in the view.
    *             var obj = params[0];
    *             var publishedUrl = params[1];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def publishBodyExpiresAt(expiresAt: stdLib.Date): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  def publishBodyExpiresAt(expiresAt: stdLib.Date, callbacks: kiiDashCloudDashSdkLib.Anon_FailureObj): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  /**
    * Publish object body with expiration duration.<br>
    * Publish object body and obtain public URL links to the body.<br>
    * Expires in specified duration<br>
    * If the KiiObject has not saved on the cloud or deleted
    * or exist but does not have body object, request will be failed.
    *
    * @param expiresIn duration in seconds. greater than 0.
    * @param callbacks sucess: function called when publish succeeded.<br>
    *   failure: function called when publish failed.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiObject instance which this method was called on.</li>
    *         <li>params[1] is the published url string.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     var expiresIn = 60 * 60; // Expires in 1 hour.
    *     myObject.publishBodyExpiresIn(expiresIn, {
    *         success: function(obj, publishedUrl) {
    *             // ex.) You can show publishedUrl in the view.
    *         },
    *         failure: function(obj, anErrorString) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var myObject = KiiObject.objectWithURI('put existing object uri here');
    *     var expiresIn = 60 * 60; // Expires in 1 hour.
    *     myObject.publishBodyExpiresIn(expiresIn).then(
    *         function(params) {
    *             // ex.) You can show publishedUrl in the view.
    *             var obj = params[0];
    *             var publishedUrl = params[1];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def publishBodyExpiresIn(expiresIn: scala.Double): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  def publishBodyExpiresIn(expiresIn: scala.Double, callbacks: kiiDashCloudDashSdkLib.Anon_FailureObj): js.Promise[js.Tuple2[KiiObject, java.lang.String]] = js.native
  /**
    * Updates the local object's data with the user data on the server
    *
    * <br><br>The object must exist on the server. Local data will be overwritten.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theRefreshedObject). theRefreshedObject is KiiObject instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var obj = . . .; // a KiiObject
    *     obj.refresh({
    *         success: function(theRefreshedObject) {
    *             // do something with the refreshed object
    *         },
    *
    *         failure: function(theObject, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var obj = . . .; // a KiiObject
    *     obj.refresh().then(
    *         function(theRefreshedObject) {
    *             // do something with the refreshed object
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def refresh(): js.Promise[KiiObject] = js.native
  def refresh(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject): js.Promise[KiiObject] = js.native
  /**
    * Removes a pair of key/value from this object.
    * This pair is also removed from server when saveAllFields() is succeeded.
    *
    * @param key The key to be removed
    *
    * @example
    *     var obj = . . .; // a KiiObject
    *     obj.remove("score");
    */
  def remove(key: java.lang.String): scala.Unit = js.native
  /**
    * Create or update the KiiObject on KiiCloud.
    * <br><br>When call this method for the object that has not saved on cloud, will send all fields.
    * Call this method for the object that has saved on cloud, Update only updated fields.
    * Do not send fields that has not updated locally. To send all fields regardless of updates, call {@link KiiObject#saveAllFields}.
    *
    * @param callbacks An object with callback methods defined
    *   sucess: function called when save succeeded.<br>
    *   failure: function called when save failed.
    * @param overwrite optional, true by default.
    *   <ul>
    *   <li><b>If overwrite is true:</b>
    *   <ul>
    *   <li>If a KiiObject with the same ID exists in cloud, the local copy will overwrite the remote copy, even if the remote copy is newer. </li>
    *   </ul>
    *   <li><b>Otherwise:</b>
    *   <ul>
    *   <li>If a KiiObject with the same ID exists in cloud and the remote copy is newer, save will fail.</li>
    *   </ul>
    *   </ul>
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theSavedObject). theSavedObject is KiiObject instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var obj = . . .; // a KiiObject
    *     obj.save({
    *         success: function(theSavedObject) {
    *             // do something with the saved object
    *         },
    *
    *         failure: function(theObject, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var obj = . . .; // a KiiObject
    *     obj.save().then(
    *         function(theSavedObject) {
    *             // do something with the saved object
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def save(): js.Promise[KiiObject] = js.native
  def save(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject): js.Promise[KiiObject] = js.native
  def save(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject, overwrite: scala.Boolean): js.Promise[KiiObject] = js.native
  /**
    * Create or update the KiiObject on KiiCloud.
    * <br><br>When call this method for the object that has not saved on cloud, will send all fields.
    * Call this method for the object that has saved on cloud, Update all field of this object.
    *
    * @param callbacks An object with callback methods defined
    *   sucess: function called when save succeeded.<br>
    *   failure: function called when save failed.
    * @param overwrite optional, true by default.
    *   <ul>
    *   <li><b>If overwrite is true:</b>
    *   <ul>
    *   <li>If a KiiObject with the same ID exists in cloud, the local copy will overwrite the remote copy, even if the remote copy is newer. </li>
    *   </ul>
    *   <li><b>Otherwise:</b>
    *   <ul>
    *   <li>If a KiiObject with the same ID exists in cloud and the remote copy is newer, save will fail.</li>
    *   </ul>
    *   </ul>
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theSavedObject). theSavedObject is KiiObject instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var obj = . . .; // a KiiObject
    *     obj.saveAllFields({
    *         success: function(theSavedObject) {
    *             // do something with the saved object
    *         },
    *
    *         failure: function(theObject, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var obj = . . .; // a KiiObject
    *     obj.saveAllFields().then(
    *         function(theSavedObject) {
    *             // do something with the saved object
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def saveAllFields(): js.Promise[KiiObject] = js.native
  def saveAllFields(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject): js.Promise[KiiObject] = js.native
  def saveAllFields(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheObject, overwrite: scala.Boolean): js.Promise[KiiObject] = js.native
  /**
    * Sets a key/value pair to a KiiObject
    *
    * <br><br>If the key already exists, its value will be written over.
    * <br><b>NOTE: Before involving floating point value, please consider using integer instead. For example, use percentage, permil, ppm, etc.</br></b>
    * The reason is:
    *  <li>Will dramatically improve the performance of bucket query.</li>
    *  <li>Bucket query does not support the mixed result of integer and floating point.
    *  ex.) If you use same key for integer and floating point and inquire object with the integer value, objects which has floating point value with the key would not be evaluated in the
    *  query. (and vice versa)</li>
    *
    * @param key The key to set.
    *   if null, empty string or string prefixed with '_' is specified, silently ignored and have no effect.
    *   We don't check if actual type is String or not. If non-string type is specified, it will be encoded as key by JSON.stringify()
    * @param value The value to be set. Object must be JSON-encodable type (dictionary, array, string, number, boolean)
    *   We don't check actual type of the value. It will be encoded as value by JSON.stringify()
    *
    * @example
    *     var obj = . . .; // a KiiObject
    *     obj.set("score", 4298);
    */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Set Geo point to this object with the specified key.
    *
    * @param key The key to set.
    * @param KiiGeoPoint to be tied to the specified key.
    *
    * @throws Specified kiiGeoPint is not an instance of KiiGeoPoint.
    */
  def setGeoPoint(key: java.lang.String, KiiGeoPoint: KiiGeoPoint): scala.Unit = js.native
  /**
    * Upload body data of this object.<br>
    * If the KiiObject has not saved on the cloud or deleted,
    * request will be failed.
    * <br>NOTE: this requires XMLHttpRequest Level 2, FileReader and Blob supports. Do not use it in server code.<br>
    *
    * @param srcDataBlob data to be uploaded.
    *   type is used to determin content-type managed in Kii Cloud.
    *   If type was not specified in the Blob,
    *   'application/octet-stream' will be used.
    * @param callbacks progress: function called on XMLHttpRequest 'progress' event listener.<br>
    *   sucess: function called when upload succeeded.<br>
    *   failure: function called when upload failed.
    *
    * @return return promise object.
    *     <br>NOTE: Promise will not handle progress event. Please pass callbacks with progress function to handle progress.
    *   <ul>
    *     <li>fulfill callback function: function(theObject). theObject is a KiiObject instance which this method was called on.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiObject instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var myObject = Kii.bucketWithName('myBucket').createObject();
    *     myObject.save({
    *         success: function(obj) {
    *             var srcData = new Blob(['Hello Blob'], {type: 'text/plain'});
    *             obj.uploadBody(srcData, {
    *                 progress: function (oEvent) {
    *                   if (oEvent.lengthComputable) {
    *                     var percentComplete = oEvent.loaded / oEvent.total;
    *                     //getting upload progress. You can update progress bar on this function.
    *                   }
    *                 },
    *                 success: function(obj) {
    *                     // Upload succeeded.
    *                 },
    *                 failure: function(obj, anErrorString) {
    *                     // Handle error.
    *                 }
    *             });
    *         },
    *         failure: function(obj, error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     var myObject = Kii.bucketWithName('myBucket').createObject();
    *     myObject.save().then(
    *         function(obj) {
    *             var srcData = new Blob(['Hello Blob'], {type: 'text/plain'});
    *             obj.uploadBody(srcData, {
    *                 progress: function (oEvent) {
    *                   if (oEvent.lengthComputable) {
    *                     var percentComplete = oEvent.loaded / oEvent.total;
    *                     //getting upload progress. You can update progress bar on this function.
    *                   }
    *                 }
    *             }).then(
    *                 function(obj) { // fullfill callback function
    *                     // Upload succeeded.
    *                 },
    *                 function(error) { // reject callback function
    *                     // Handle error.
    *                 }
    *             );
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def uploadBody(srcDataBlob: stdLib.Blob): js.Promise[KiiObject] = js.native
  def uploadBody(srcDataBlob: stdLib.Blob, callbacks: kiiDashCloudDashSdkLib.Anon_FailureObjAnErrorString): js.Promise[KiiObject] = js.native
}

/**
  * Represents a KiiObject object
  */
@JSGlobal("KiiCloud.KiiObject")
@js.native
object KiiObject extends js.Object {
  /**
    * Check if given ID is valid for object ID.
    *  Valid pattern: ^[a-zA-Z0-9-_\\.]{2,100}$
    *
    * @param objectID to be checked.
    *
    * @return true if given ID is valid, false otherwise.
    */
  def isValidObjectID(objectID: java.lang.String): scala.Boolean = js.native
  /**
    * Generate a new KiiObject based on a given URI
    *
    * @param uri The URI of the object to be represented
    *
    * @return A new KiiObject with its parameters filled in from the URI
    *
    * @throws If the URI is not in the proper format
    *
    * @example
    *     var group = new KiiObject.objectWithURI("kiicloud://myuri");
    */
  def objectWithURI(uri: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject = js.native
}

