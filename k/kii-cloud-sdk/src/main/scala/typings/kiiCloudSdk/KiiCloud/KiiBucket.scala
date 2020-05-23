package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.`5`
import typings.kiiCloudSdk.anon.`6`
import typings.kiiCloudSdk.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiBucket object
  */
@js.native
trait KiiBucket extends js.Object {
  /**
    * Get the ACL handle for this bucket
    *
    * <br><br>Any KiiACLEntry objects added or revoked from this ACL object will be appended to/removed from the server on ACL save.
    *
    * @return A KiiACL object associated with this KiiObject
    *
    * @example
    *         var bucket = . . .; // a KiiBucket
    *         var acl = bucket.acl();
    */
  def acl(): KiiACL = js.native
  /**
    * Execute count aggregation of all clause query on current bucket.
    *
    * @param callbacks An object with callback methods defined.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiBucket instance which this method was called on.</li>
    *         <li>params[1] is a KiiQuery instance.</li>
    *         <li>params[2] is an integer count result. </li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiBucket instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var bucket = . . .; // a KiiBucket
    *     // define the callbacks
    *     var callbacks = {
    *         success: function(bucket, query, count) {
    *             // do something with the results
    *         },
    *
    *         failure: function(bucket, errorString) {
    *             // error happened.
    *         }
    *     };
    *
    *     bucket.count(callbacks);
    *
    *     // example to use Promise
    *     var bucket = . . .; // a KiiBucket
    *     var queryObject = . . .; // a KiiQuery
    *
    *     bucket.count().then(
    *         function(params) {
    *             var bucket = params[0];
    *             var count = params[2];
    *             // do something with the results
    *         },
    *         function(error) {
    *             var bucket = error.target;
    *             var errorString = error.message;
    *             // error happened.
    *         }
    *     );
    */
  def count(): js.Promise[js.Tuple3[KiiBucket, KiiQuery, Double]] = js.native
  def count(callbacks: `6`): js.Promise[js.Tuple3[KiiBucket, KiiQuery, Double]] = js.native
  /**
    * Execute count aggregation of specified query on current bucket.
    * Query that passed as nextQuery in success callback of {@link #executeQuery}, is not
    * supported, callbacks.failure will be fired in this case.
    *
    * @param query to be executed. If null, the operation will be same as {@link #count}.
    * @param callbacks An object with callback methods defined.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiBucket instance which this method was called on.</li>
    *         <li>params[1] is a KiiQuery instance.</li>
    *         <li>params[2] is an integer count result. </li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiBucket instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var bucket = . . .; // a KiiBucket
    *     var queryObject = . . .; // a KiiQuery
    *
    *     // define the callbacks
    *     var callbacks = {
    *         success: function(bucket, query, count) {
    *             // do something with the results
    *         },
    *
    *         failure: function(bucket, errorString) {
    *             // error happened.
    *         }
    *     };
    *
    *     bucket.countWithQuery(queryObject, callbacks);
    *
    *     // example to use Promise
    *     var bucket = . . .; // a KiiBucket
    *     var queryObject = . . .; // a KiiQuery
    *
    *     bucket.countWithQuery(queryObject, callbacks).then(
    *         function(params) {
    *             var bucket = params[0];
    *             var query = params[1];
    *             var count = params[2];
    *             // do something with the results
    *         },
    *         function(error) {
    *             var bucket = error.target;
    *             var errorString = error.message;
    *             // error happened.
    *         }
    *     );
    */
  def countWithQuery(query: KiiQuery): js.Promise[js.Tuple3[KiiBucket, KiiQuery, Double]] = js.native
  def countWithQuery(query: KiiQuery, callbacks: `6`): js.Promise[js.Tuple3[KiiBucket, KiiQuery, Double]] = js.native
  /**
    * Create a KiiObject within the current bucket
    *
    * <br><br>The object will not be created on the server until the KiiObject is explicitly saved. This method simply returns an empty working KiiObject.
    *
    * @return An empty KiiObject with no specific type
    *
    * @example
    *     var bucket = . . .; // a KiiBucket
    *     var object = bucket.createObject();
    */
  def createObject(): KiiObject = js.native
  /**
    * Create a KiiObject within the current bucket, specifying its ID.
    *
    * <br><br> If the object has not exist on KiiCloud, {@link KiiObject#saveAllFields(callback)}
    *   will create new Object which has ID specified in the argument.
    *   If the object exist in KiiCloud, references the existing object which has
    *   specified ID. use {@link KiiObject#refresh(callback)} to retrieve the contents of
    *   KiiObject.
    *
    * @param objectID ID of the obeject you want to instantiate.
    *
    * @return KiiObject instance.
    *
    * @throws objectID is not acceptable.
    *      Refer to {@link KiiObject.isValidObjectID(string)} for details of acceptable string.
    *
    * @example
    *      var bucket = . . .; // KiiBucket
    *      var object = bucket.createObjectWithID('__OBJECT_ID_');
    */
  def createObjectWithID(objectID: String): KiiObject = js.native
  /**
    * Create a KiiObject within the current bucket, with type
    *
    * <br><br>The object will not be created on the server until the KiiObject is explicitly saved. This method simply returns an empty working KiiObject with a specified type. The type allows
    * for better indexing and improved query results. It is recommended to use this method - but for lazy creation, the createObject method is also available.
    *
    * @param type A string representing the desired object type
    *
    * @return An empty KiiObject with specified type
    *
    * @example
    *     var bucket = . . .; // a KiiBucket
    *     var object = bucket.createObjectWithType("scores");
    */
  def createObjectWithType(`type`: String): KiiObject = js.native
  /**
    * Delete the given bucket from the server
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(deletedBucket). deletedBucket is KiiBucket instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiBucket instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var bucket = . . .; // a KiiBucket
    *     bucket.delete({
    *         success: function(deletedBucket) {
    *             // do something with the result
    *         },
    *
    *         failure: function(bucketToDelete, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var bucket = . . .; // a KiiBucket
    *     bucket.delete({
    *         success: function(deletedBucket) {
    *             // do something with the result
    *         },
    *
    *         failure: function(bucketToDelete, anErrorString) {
    *             // do something with the error response
    *         }
    *     }).then(
    *         function(deletedBucket) {
    *           // do something with the result
    *         },
    *         function(error) {
    *           // do something with the error response
    *         }
    *     );
    */
  def delete(): js.Promise[KiiBucket] = js.native
  def delete(callbacks: `7`): js.Promise[KiiBucket] = js.native
  /**
    * Perform a query on the given bucket
    *
    * <br><br>The query will be executed against the server, returning a result set.
    *
    * @param query An object with callback methods defined
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a performed KiiQuery instance.</li>
    *         <li>params[1] is resultSet Array instance. Could be KiiObject, KiiGroup, KiiUser, etc.</li>
    *         <li>params[2] is a KiiQuery instance for next query. If there are no more results to be retrieved, it will be null.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiBucket instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var bucket = . . .; // a KiiBucket
    *     var queryObject = . . .; // a KiiQuery
    *
    *     // define the callbacks (stored in a variable for reusability)
    *     var queryCallbacks = {
    *         success: function(queryPerformed, resultSet, nextQuery) {
    *             // do something with the results
    *             for(var i=0; i&lt;resultSet.length; i++) {
    *                 // do something with the object
    *                 // resultSet[i]; // could be KiiObject, KiiGroup, KiiUser, etc
    *             }
    *
    *             // if there are more results to be retrieved
    *             if(nextQuery != null) {
    *
    *                 // get them and repeat recursively until no results remain
    *                 bucket.executeQuery(nextQuery, queryCallbacks);
    *             }
    *         },
    *
    *         failure: function(bucket, anErrorString) {
    *             // do something with the error response
    *         }
    *     };
    *     bucket.executeQuery(queryObject, queryCallbacks);
    *
    *     // example to use Promise
    *     var bucket = . . .; // a KiiBucket
    *     var queryObject = . . .; // a KiiQuery
    *     bucket.executeQuery(queryObject).then(
    *         function(params) {
    *             var queryPerformed = params[0];
    *             var resultSet = params[1];
    *             var nextQuery = params[2];
    *             // do something with the results
    *             for(var i=0; i&lt;resultSet.length; i++) {
    *                 // do something with the object
    *                 // resultSet[i]; // could be KiiObject, KiiGroup, KiiUser, etc
    *             }
    *
    *             // if there are more results to be retrieved
    *             if(nextQuery != null) {
    *
    *                 // get them and repeat recursively until no results remain
    *                 bucket.executeQuery(nextQuery).then(
    *                     function(params) {
    *                         // next query success
    *                     },
    *                     function(error) {
    *                         // next query failed, please handle the error
    *                     }
    *                 );
    *             }
    *
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def executeQuery[T](query: KiiQuery): js.Promise[js.Tuple3[KiiQuery, js.Array[T], KiiQuery]] = js.native
  def executeQuery[T](query: KiiQuery, callbacks: `5`[T]): js.Promise[js.Tuple3[KiiQuery, js.Array[T], KiiQuery]] = js.native
  /**
    * The name of this bucket
    *
    */
  def getBucketName(): String = js.native
}

