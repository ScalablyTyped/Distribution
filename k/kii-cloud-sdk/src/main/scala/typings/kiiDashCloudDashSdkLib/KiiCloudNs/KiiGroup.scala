package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiGroup object
  */
@JSGlobal("KiiCloud.KiiGroup")
@js.native
class KiiGroup () extends js.Object {
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
  def addUser(member: KiiUser): scala.Unit = js.native
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
  def bucketWithName(bucketName: java.lang.String): KiiBucket = js.native
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
  def changeGroupName(newName: java.lang.String): js.Promise[KiiGroup] = js.native
  def changeGroupName(
    newName: java.lang.String,
    callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorStringFailureSuccessTheGroup
  ): js.Promise[KiiGroup] = js.native
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
  def delete(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorStringFailureSuccessTheDeletedGroup): js.Promise[KiiGroup] = js.native
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
  def encryptedBucketWithName(bucketName: java.lang.String): KiiBucket = js.native
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
  def getID(): java.lang.String = js.native
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
  def getMemberList(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorStringFailureMemberList): js.Promise[js.Tuple2[KiiGroup, js.Array[KiiUser]]] = js.native
  /**
    * The name of this group
    *
    */
  def getName(): java.lang.String = js.native
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
  def getOwner(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorStringFailureSuccessTheGroupTheOwner): js.Promise[js.Tuple2[KiiGroup, KiiUser]] = js.native
  /**
    *
    *
    * @deprecated Use {@link KiiGroup.getId} instead.
    *   Get the UUID of the given group, assigned by the server
    *
    */
  def getUUID(): java.lang.String = js.native
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
  def listTopics(): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorString): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
  def listTopics(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorString, paginationKey: java.lang.String): js.Promise[js.Tuple2[js.Array[KiiTopic], java.lang.String]] = js.native
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
  def objectURI(): java.lang.String = js.native
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
  def refresh(callbacks: kiiDashCloudDashSdkLib.Anon_AnErrorStringFailureSuccessTheGroup): js.Promise[KiiGroup] = js.native
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
  def removeUser(member: KiiUser): scala.Unit = js.native
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
  def save(callbacks: kiiDashCloudDashSdkLib.Anon_AddMembersArrayAnErrorString): js.Promise[KiiGroup] = js.native
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
  def saveWithOwner(user: java.lang.String): js.Promise[KiiGroup] = js.native
  def saveWithOwner(user: java.lang.String, callbacks: kiiDashCloudDashSdkLib.Anon_AddMembersArrayAnErrorString): js.Promise[KiiGroup] = js.native
  /**
    * Instantiate topic belongs to this group.
    *
    * @param topicName name of the topic. Must be a not empty string.
    *
    * @return topic instance.
    */
  def topicWithName(topicName: java.lang.String): KiiTopic = js.native
}

/**
  * Represents a KiiGroup object
  */
@JSGlobal("KiiCloud.KiiGroup")
@js.native
object KiiGroup extends js.Object {
  /**
    * Instantiate KiiGroup that refers to existing group which has specified ID.
    * You have to specify the ID of existing KiiGroup. Unlike KiiObject,
    * you can not assign ID in the client side.<br>
    * <b>NOTE</b>: This API does not access to the server.
    * After instantiation, call {@link KiiGroup#refresh} to fetch the properties.
    *
    * @param groupId ID of the KiiGroup to instantiate.
    *
    * @return instance of KiiGroup.
    *
    * @throws when passed groupID is empty or null.
    *
    * @example
    *     var group = new KiiUser.groupWithID("__GROUP_ID__");
    */
  def groupWithID(groupId: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup = js.native
  /**
    * Creates a reference to a group with the given name
    * <br><br>
    * <b>Note:</b>
    * Returned instance from this API can not operate existing KiiGroup.<br>
    * If you want to operate existing KiiGroup, please use {@link KiiGroup.groupWithURI}.
    *
    * @param groupName An application-specific group name
    *
    * @return A new KiiGroup reference
    *
    * @example
    *     var group = new KiiGroup.groupWithName("myGroup");
    */
  def groupWithName(groupName: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup = js.native
  /**
    * Creates a reference to a group with the given name and a list of default members
    * <br><br>
    * <b>Note:</b>
    * Returned instance from this API can not operate existing KiiGroup.<br>
    * If you want to operate existing KiiGroup, please use {@link KiiGroup.groupWithURI}.
    *
    * @param groupName An application-specific group name
    * @param members An array of KiiUser objects to add to the group
    *
    * @return A new KiiGroup reference
    *
    * @example
    *     var group = new KiiGroup.groupWithName("myGroup", members);
    */
  def groupWithNameAndMembers(groupName: java.lang.String, members: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]): kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup = js.native
  /**
    * Generate a new KiiGroup based on a given URI
    * <br><br>
    * <b>Note:</b>
    * Returned instance from this API can operate existing KiiGroup.<br>
    * If you want to create a new KiiGroup, please use {@link KiiGroup.groupWithName}.
    *
    * @param uri The URI of the group to be represented
    *
    * @return A new KiiGroup with its parameters filled in from the URI
    *
    * @throws If the URI given is invalid
    *
    * @example
    *     var group = new KiiGroup.groupWithURI("kiicloud://myuri");
    */
  def groupWithURI(uri: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup = js.native
  /**
    * Register new group own by current user on Kii Cloud with specified ID.
    *
    * <br><br>If the group that has specified id already exists, registration will be failed.
    *
    * @param groupID ID of the KiiGroup
    * @param groupName Name of the KiiGroup
    * @param members An array of KiiUser objects to add to the group
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
    *     var members = [];
    *     members.push(KiiUser.userWithID("Member User Id"));
    *     KiiGroup.registerGroupWithID("Group ID", "Group Name", members, {
    *         success: function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *         failure: function(theGroup, anErrorString, addMembersArray, removeMembersArray) {
    *             // do something with the error response
    *         }
    *     });
    *
    *     // example to use Promise
    *     var members = [];
    *     members.push(KiiUser.userWithID("Member User Id"));
    *     KiiGroup.registerGroupWithID("Group ID", "Group Name", members).then(
    *         function(theSavedGroup) {
    *             // do something with the saved group
    *         },
    *         function(error) {
    *             var theGroup = error.target;
    *             var anErrorString = error.message;
    *             var addMembersArray = error.addMembersArray;
    *             // do something with the error response
    *     });
    */
  def registerGroupWithID(
    groupID: java.lang.String,
    groupName: java.lang.String,
    members: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]
  ): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup] = js.native
  def registerGroupWithID(
    groupID: java.lang.String,
    groupName: java.lang.String,
    members: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser],
    callbacks: kiiDashCloudDashSdkLib.Anon_AddMembersArrayAnErrorString
  ): js.Promise[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup] = js.native
}

