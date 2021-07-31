package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.anon.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiGroup object
  */
@JSGlobal("KiiCloud.KiiGroup")
@js.native
class KiiGroup ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiGroup
object KiiGroup {
  
  @JSGlobal("KiiCloud.KiiGroup")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def groupWithID(groupId: String): typings.kiiCloudSdk.KiiCloud.KiiGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("groupWithID")(groupId.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
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
  /* static member */
  @scala.inline
  def groupWithName(groupName: String): typings.kiiCloudSdk.KiiCloud.KiiGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("groupWithName")(groupName.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
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
  /* static member */
  @scala.inline
  def groupWithNameAndMembers(groupName: String, members: js.Array[typings.kiiCloudSdk.KiiCloud.KiiUser]): typings.kiiCloudSdk.KiiCloud.KiiGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("groupWithNameAndMembers")(groupName.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
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
  /* static member */
  @scala.inline
  def groupWithURI(uri: String): typings.kiiCloudSdk.KiiCloud.KiiGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("groupWithURI")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiGroup]
  
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
  /* static member */
  @scala.inline
  def registerGroupWithID(groupID: String, groupName: String, members: js.Array[typings.kiiCloudSdk.KiiCloud.KiiUser]): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGroupWithID")(groupID.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiGroup]]
  @scala.inline
  def registerGroupWithID(
    groupID: String,
    groupName: String,
    members: js.Array[typings.kiiCloudSdk.KiiCloud.KiiUser],
    callbacks: `10`
  ): js.Promise[typings.kiiCloudSdk.KiiCloud.KiiGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGroupWithID")(groupID.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], members.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.kiiCloudSdk.KiiCloud.KiiGroup]]
}
