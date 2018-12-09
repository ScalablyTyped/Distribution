package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a KiiACL object
     */
@JSGlobal("KiiCloud.KiiACL")
@js.native
class KiiACL () extends js.Object {
  /**
           * Get the list of active ACLs associated with this object from the server
           *
           * @param callbacks An object with callback methods defined
           *
           * @return return promise object.
           *     <ul>
           *       <li>fulfill callback function: function(params). params is Array instance.
           *         <ul>
           *           <li>params[0] is the KiiACL instance which this method was called on.</li>
           *           <li>params[1] is array of KiiACLEntry instances.</li>
           *         </ul>
           *       </li>
           *       <li>reject callback function: function(error). error is an Error instance.
           *         <ul>
           *           <li>error.target is the KiiACL instance which this method was called on.</li>
           *           <li>error.message</li>
           *         </ul>
           *       </li>
           *     </ul>
           *
           * @example
           *     // example to use callbacks directly
           *     var acl = . . .; // a KiiACL object
           *     acl.listACLEntries({
           *     	success: function(theACL, theEntries) {
           *     		// do something
           *     	},
           *
           *     	failure: function(theACL, anErrorString) {
           *     		// do something with the error response
           *     	}
           *     });
           *
           *     // example to use Promise
           *     var acl = . . .; // a KiiACL object
           *     acl.listACLEntries().then(
           *         function(params) { // fulfill callback function
           *             var theACL = params[0];
           *             var theEntries = params[1];
           *             // do something
           *         },
           *         function(error) { // reject callback function
           *             var theACL = error.target;
           *             var anErrorString = error.message;
           *         		// do something with the error response
           *     });
           */
  def listACLEntries(): js.Promise[js.Tuple2[KiiACL, js.Array[KiiACLEntry]]] = js.native
  /**
           * Get the list of active ACLs associated with this object from the server
           *
           * @param callbacks An object with callback methods defined
           *
           * @return return promise object.
           *     <ul>
           *       <li>fulfill callback function: function(params). params is Array instance.
           *         <ul>
           *           <li>params[0] is the KiiACL instance which this method was called on.</li>
           *           <li>params[1] is array of KiiACLEntry instances.</li>
           *         </ul>
           *       </li>
           *       <li>reject callback function: function(error). error is an Error instance.
           *         <ul>
           *           <li>error.target is the KiiACL instance which this method was called on.</li>
           *           <li>error.message</li>
           *         </ul>
           *       </li>
           *     </ul>
           *
           * @example
           *     // example to use callbacks directly
           *     var acl = . . .; // a KiiACL object
           *     acl.listACLEntries({
           *     	success: function(theACL, theEntries) {
           *     		// do something
           *     	},
           *
           *     	failure: function(theACL, anErrorString) {
           *     		// do something with the error response
           *     	}
           *     });
           *
           *     // example to use Promise
           *     var acl = . . .; // a KiiACL object
           *     acl.listACLEntries().then(
           *         function(params) { // fulfill callback function
           *             var theACL = params[0];
           *             var theEntries = params[1];
           *             // do something
           *         },
           *         function(error) { // reject callback function
           *             var theACL = error.target;
           *             var anErrorString = error.message;
           *         		// do something with the error response
           *     });
           */
  def listACLEntries(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheACLAnErrorString): js.Promise[js.Tuple2[KiiACL, js.Array[KiiACLEntry]]] = js.native
  /**
           * Add a KiiACLEntry to the local object, if not already present. This does not explicitly grant any permissions, which should be done through the KiiACLEntry itself. This method simply adds
           * the entry to the local ACL object so it can be saved to the server.
           *
           * @param entry The KiiACLEntry to add
           *
           * @throws If specified entry is not an instance of KiiACLEntry.
           *
           * @example
           *     var aclEntry = . . .; // a KiiACLEntry object
           *     var acl = . . .; // a KiiACL object
           *     acl.putACLEntry(aclEntry);
           */
  def putACLEntry(entry: KiiACLEntry): scala.Unit = js.native
  /**
           * Remove a KiiACLEntry to the local object. This does not explicitly revoke any permissions, which should be done through the KiiACLEntry itself. This method simply removes the entry from the
           * local ACL object and will not be saved to the server.
           *
           * @param entry The KiiACLEntry to remove
           *
           * @throws If specified entry is not an instance of KiiACLEntry.
           *
           * @example
           *     var aclEntry = . . .; // a KiiACLEntry object
           *     var acl = . . .; // a KiiACL object
           *     acl.removeACLEntry(aclEntry);
           */
  def removeACLEntry(entry: KiiACLEntry): scala.Unit = js.native
  /**
           * Save the list of ACLEntry objects associated with this ACL object to the server
           *
           * @param callbacks An object with callback methods defined
           *
           * @return return promise object.
           *     <ul>
           *       <li>fulfill callback function: function(theSavedACL). theSavedACL is KiiACL instance.</li>
           *       <li>reject callback function: function(error). error is an Error instance.
           *         <ul>
           *           <li>error.target is the KiiACL instance which this method was called on.</li>
           *           <li>error.message</li>
           *         </ul>
           *       </li>
           *     </ul>
           *
           * @example
           *     // example to use callbacks directly
           *     var acl = . . .; // a KiiACL object
           *     acl.save({
           *         success: function(theSavedACL) {
           *             // do something with the saved acl
           *         },
           *
           *         failure: function(theACL, anErrorString) {
           *             // do something with the error response
           *         }
           *     });
           *
           *     // example to use Promise
           *     var acl = . . .; // a KiiACL object
           *     acl.save().then(
           *         function(theSavedACL) { // fulfill callback function
           *             // do something with the saved acl
           *         },
           *         function(error) { // reject callback function
           *             var theACL = error.target;
           *             var anErrorString = error.message;
           *             // do something with the error response
           *     });
           */
  def save(): js.Promise[KiiACL] = js.native
  /**
           * Save the list of ACLEntry objects associated with this ACL object to the server
           *
           * @param callbacks An object with callback methods defined
           *
           * @return return promise object.
           *     <ul>
           *       <li>fulfill callback function: function(theSavedACL). theSavedACL is KiiACL instance.</li>
           *       <li>reject callback function: function(error). error is an Error instance.
           *         <ul>
           *           <li>error.target is the KiiACL instance which this method was called on.</li>
           *           <li>error.message</li>
           *         </ul>
           *       </li>
           *     </ul>
           *
           * @example
           *     // example to use callbacks directly
           *     var acl = . . .; // a KiiACL object
           *     acl.save({
           *         success: function(theSavedACL) {
           *             // do something with the saved acl
           *         },
           *
           *         failure: function(theACL, anErrorString) {
           *             // do something with the error response
           *         }
           *     });
           *
           *     // example to use Promise
           *     var acl = . . .; // a KiiACL object
           *     acl.save().then(
           *         function(theSavedACL) { // fulfill callback function
           *             // do something with the saved acl
           *         },
           *         function(error) { // reject callback function
           *             var theACL = error.target;
           *             var anErrorString = error.message;
           *             // do something with the error response
           *     });
           */
  def save(callbacks: kiiDashCloudDashSdkLib.Anon_FailureTheACL): js.Promise[KiiACL] = js.native
}

