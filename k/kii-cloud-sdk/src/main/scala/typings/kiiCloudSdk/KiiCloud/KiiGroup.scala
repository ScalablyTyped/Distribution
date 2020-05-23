package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.`10`
import typings.kiiCloudSdk.anon.`11`
import typings.kiiCloudSdk.anon.`4`
import typings.kiiCloudSdk.anon.`8`
import typings.kiiCloudSdk.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiGroup object
  */
@js.native
trait KiiGroup extends KiiACLSubject {
  /**
    * Adds a user to the given group
    *
    * <br><br>This method will NOT access the server immediately. You must call save to add the user on the server. This allows multiple users to be added/removed before calling save.
    *
    * @param member The user to be added to the group
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var group = . . .; // a KiiGroup
    *     group.addUser(user);
    *     group.save(callbacks);
    */
  def addUser(member: KiiUser): Unit = js.native
  /**
    * Creates a reference to a bucket for this group
    *
    * <br><br>The bucket will be created/accessed within this group's scope
    *
    * @param bucketName The name of the bucket the user should create/access
    *
    * @return A working KiiBucket object
    *
    * @example
    *     var group = . . .; // a KiiGroup
    *     var bucket = group.bucketWithName("myBucket");
    */
  def bucketWithName(bucketName: String): KiiBucket = js.native
  /**
    * Updates the group name on the server
    *
    * @param newName A String of the desired group name
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theRenamedGroup). theRenamedGroup is KiiGroup instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiGroup instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.changeGroupName("myNewName", {
    *         success: function(theRenamedGroup) {
    *             // do something with the group
    *         },
    *
    *         failure: function(theGroup, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.changeGroupName("myNewName").then(
    *         function(theRenamedGroup) {
    *             // do something with the group
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def changeGroupName(newName: String): js.Promise[KiiGroup] = js.native
  def changeGroupName(newName: String, callbacks: `9`): js.Promise[KiiGroup] = js.native
  /**
    * Delete the group from the server
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theDeletedGroup). theDeletedGroup is KiiGroup instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiGroup instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.delete({
    *         success: function(theDeletedGroup) {
    *             // do something
    *         },
    *
    *         failure: function(theGroup, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.delete({
    *         success: function(theDeletedGroup) {
    *         },
    *
    *         failure: function(theGroup, anErrorString) {
    *         }
    *     }).then(
    *         function(theDeletedGroup) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def delete(): js.Promise[KiiGroup] = js.native
  def delete(callbacks: `9`): js.Promise[KiiGroup] = js.native
  /**
    * Creates a reference to a encrypted bucket for this group
    *
    * <br><br>The bucket will be created/accessed within this group's scope
    *
    * @param bucketName The name of the bucket the user should create/access
    *
    * @return A working KiiEncryptedBucket object
    *
    * @example
    *     var group = . . .; // a KiiGroup
    *     var bucket = group.encryptedBucketWithName("myBucket");
    */
  def encryptedBucketWithName(bucketName: String): KiiBucket = js.native
  /**
    * Returns the owner of this group if this group holds the information of owner.
    *
    * Group will holds the information of owner when "saving group on cloud" or "retrieving group info/owner from cloud".
    * The cache will not be shared among the different instances of KiiGroup.
    * <UL>
    * <LI>This API will not access to server.
    * To update the group owner information on cloud, please call {@link KiiGroup#refresh} or {@link KiiGroup#getOwner}.
    * </LI>
    * <LI>This API does not return all the properties of the owner.
    * To get all owner properties, {@link KiiUser#refresh} is necessary.</LI>
    * </UL>
    *
    * @return KiiUser who owns this group, undefined if this group doesn't hold the information of owner yet.
    *
    * @see KiiGroup#getOwner
    */
  def getCachedOwner(): KiiUser = js.native
  /**
    * Get the ID of the current KiiGroup instance.
    *
    * @return Id of the group or null if the group has not saved to cloud.
    */
  def getID(): String = js.native
  /**
    * Gets a list of all current members of a group
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is a KiiGroup instance which this method was called on.</li>
    *         <li>params[1] is array of memeber KiiUser instances.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiGroup instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.getMemberList({
    *         success: function(theGroup, memberList) {
    *             // do something with the result
    *             for(var i=0; i&lt;memberList.length; i++){
    *                 var u = memberList[i]; // a KiiUser within the group
    *             }
    *         },
    *
    *         failure: function(theGroup, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.getMemberList().then(
    *         function(params) {
    *             var theGroup = params[0];
    *             var memberlist = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;memberList.length; i++){
    *                 var u = memberList[i]; // a KiiUser within the group
    *             }
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def getMemberList(): js.Promise[js.Tuple2[KiiGroup, js.Array[KiiUser]]] = js.native
  def getMemberList(callbacks: `8`): js.Promise[js.Tuple2[KiiGroup, js.Array[KiiUser]]] = js.native
  /**
    * The name of this group
    *
    */
  def getName(): String = js.native
  /**
    * Gets the owner of the associated group
    *
    * This API does not return all the properties of the owner.
    * To get all owner properties, {@link KiiUser#refresh} is necessary.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiGroup instance which this method was called on.</li>
    *         <li>params[1] is an group owner KiiUser instances.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiGroup instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.getOwner({
    *         success: function(theGroup, theOwner) {
    *             // do something
    *         },
    *         failure: function(theGroup, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.getOwner().then(
    *         function(params) {
    *             // do something
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def getOwner(): js.Promise[js.Tuple2[KiiGroup, KiiUser]] = js.native
  def getOwner(callbacks: `11`): js.Promise[js.Tuple2[KiiGroup, KiiUser]] = js.native
  /**
    *
    *
    * @deprecated Use {@link KiiGroup.getId} instead.
    *   Get the UUID of the given group, assigned by the server
    *
    */
  def getUUID(): String = js.native
  /**
    * Gets a list of topics in this group scope
    *
    * @param callbacks An object with callback methods defined
    * @param paginationKey You can specify the pagination key with the nextPaginationKey passed by callbacks.success. If empty string or no string object is provided, this API regards no
    * paginationKey specified.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(params). params is Array instance.
    *         <ul>
    *           <li>params[0] is array of KiiTopic instances.</li>
    *           <li>params[1] is string of nextPaginationKey.</li>
    *         </ul>
    *       </li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.target is the KiiGroup instance which this method was called on. </li>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.listTopics({
    *         success: function(topicList, nextPaginationKey) {
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 group.listTopics({
    *                     success: function(topicList, nextPaginationKey) {...},
    *                     failure: function(anErrorString) {...}
    *                 }, nextPaginationKey);
    *             }
    *         },
    *         failure: function(anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use promise
    *     var group = . . .; // a KiiGroup
    *     group.listTopics().then(
    *         function(params) {
    *             var topicList = params[0];
    *             var nextPaginationKey = params[1];
    *             // do something with the result
    *             for(var i=0; i&lt;topicList.length; i++){
    *                 var topic = topicList[i];
    *             }
    *             if (nextPaginationKey != null) {
    *                 group.listTopics(null, nextPaginationKey).then(
    *                     function(params) {...},
    *                     function(error) {...}
    *                 );
    *             }
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def listTopics(): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  def listTopics(callbacks: `4`, paginationKey: String): js.Promise[js.Tuple2[js.Array[KiiTopic], String]] = js.native
  /**
    * Get a specifically formatted string referencing the group
    *
    * <br><br>The group must exist in the cloud (have a valid UUID).
    *
    * @return A URI string based on the current group. null if a URI couldn't be generated.
    *
    * @example
    *     var group = . . .; // a KiiGroup
    *     var uri = group.objectURI();
    */
  def objectURI(): String = js.native
  /**
    * Updates the local group's data with the group data on the server
    *
    * <br><br>The group must exist on the server. Local data will be overwritten.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(theRefreshedGroup). theRefreshedGroup is KiiGroup instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiGroup instance which this method was called on.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.refresh({
    *         success: function(theRefreshedGroup) {
    *             // do something with the refreshed group
    *         },
    *
    *         failure: function(theGroup, anErrorString) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.refresh().then(
    *         function(theRefreshedGroup) {
    *             // do something with the refreshed group
    *         },
    *         function(error) {
    *             // do something with the error response
    *         }
    *     );
    */
  def refresh(): js.Promise[KiiGroup] = js.native
  def refresh(callbacks: `9`): js.Promise[KiiGroup] = js.native
  /**
    * Removes a user from the given group
    *
    * <br><br>This method will NOT access the server immediately. You must call save to remove the user on the server. This allows multiple users to be added/removed before calling save.
    *
    * @param member The user to be added to the group
    *
    * @example
    *     var user = . . .; // a KiiUser
    *     var group = . . .; // a KiiGroup
    *     group.removeUser(user);
    *     group.save(callbacks);
    */
  def removeUser(member: KiiUser): Unit = js.native
  /**
    * Saves the latest group values to the server
    *
    * <br><br>If the group does not yet exist, it will be created. If the group already exists, the members that have changed will be updated accordingly. If the group already exists and there is
    * no updates of members, it will allways succeed but does not execute update. To change the name of group, use {@link #changeGroupName}.
    *
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *       <ul>
    *         <li>fulfill callback function: function(theSavedGroup). theSavedGroup is KiiGroup instance.</li>
    *         <li>reject callback function: function(error). error is an Error instance.
    *           <ul>
    *             <li>error.target is the KiiGroup instance which this method was called on.</li>
    *             <li>error.message</li>
    *             <li>error.addMembersArray is array of KiiUser to be added as memebers of this group.</li>
    *             <li>error.removeMembersArray is array of KiiUser to be removed from the memebers list of this group.</li>
    *           </ul>
    *         </li>
    *       </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.save({
    *         success: function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *
    *         failure: function(theGroup, anErrorString, addMembersArray, removeMembersArray) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.save().then(
    *         function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *         function(error) {
    *             var theGroup = error.target;
    *             var anErrorString = error.message;
    *             var addMembersArray = error.addMembersArray;
    *             var removeMembersArray = error.removeMembersArray;
    *             // do something with the error response
    *     });
    */
  def save(): js.Promise[KiiGroup] = js.native
  def save(callbacks: `10`): js.Promise[KiiGroup] = js.native
  /**
    * Saves the latest group values to the server with specified owner.
    * This method can be used only by the group owner or app admin.
    *
    * <br><br>If the group does not yet exist, it will be created. If the group already exists, the members and owner that have changed will be updated accordingly. If the group already exists
    * and there is no updates of members and owner, it will allways succeed but does not execute update. To change the name of group, use {@link #changeGroupName}.
    *
    * @param user id of owner
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *       <ul>
    *         <li>fulfill callback function: function(theSavedGroup). theSavedGroup is KiiGroup instance.</li>
    *         <li>reject callback function: function(error). error is an Error instance.
    *           <ul>
    *             <li>error.target is the KiiGroup instance which this method was called on.</li>
    *             <li>error.message</li>
    *             <li>error.addMembersArray is array of KiiUser to be added as memebers of this group.</li>
    *             <li>error.removeMembersArray is array of KiiUser to be removed from the memebers list of this group.</li>
    *           </ul>
    *         </li>
    *       </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     var group = . . .; // a KiiGroup
    *     group.saveWithOwner("UserID of owner", {
    *         success: function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *
    *         failure: function(theGroup, anErrorString, addMembersArray, removeMembersArray) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var group = . . .; // a KiiGroup
    *     group.saveWithOwner("UserID of owner").then(
    *         function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *         function(error) {
    *             var theGroup = error.target;
    *             var anErrorString = error.message;
    *             var addMembersArray = error.addMembersArray;
    *             var removeMembersArray = error.removeMembersArray;
    *             // do something with the error response
    *     });
    */
  def saveWithOwner(user: String): js.Promise[KiiGroup] = js.native
  def saveWithOwner(user: String, callbacks: `10`): js.Promise[KiiGroup] = js.native
  /**
    * Instantiate topic belongs to this group.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: String): KiiTopic = js.native
}

