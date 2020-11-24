package typings.kiiCloudSdk.KiiCloud

import typings.kiiCloudSdk.anon.`24`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server side code entry in KiiCloud.
  */
@js.native
trait KiiServerCodeEntry extends js.Object {
  
  /**
    * Execute this server code entry.<br>
    *  If argument is an empty object or not type of Object, callbacks.failure or reject callback of promise will be called.<br>
    *
    * @param argument pass to the entry of script in the cloud.
    *   If null is specified, no argument pass to the script.
    * @param callbacks called on completion of execution.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is Array instance.
    *       <ul>
    *         <li>params[0] is the KiiServerCodeEntry instance which this method was called on.</li>
    *         <li>params[1] is the passed argument object.</li>
    *         <li>params[2] is a KiiServerCodeExecResult instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiServerCodeEntry instance which this method was called on.</li>
    *         <li>error.message</li>
    *         <li>error.argument is passed argument object. </li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // Instantiate with the endpoint.
    *     var entry = Kii.serverCodeEntry("main");
    *
    *     // Set the custom parameters.
    *     var arg = {"username":"name_of_my_friend", "password":"password_for_my_friend"};
    *
    *     // Example of executing the Server Code
    *     entry.execute(arg, {
    *
    *        success: function(entry, argument, execResult) {
    *            // do something now that the user is logged in
    *        },
    *
    *        failure: function(entry, argument, execResult, anErrorString) {
    *            // do something with the error response
    *        }
    *     });
    *
    *     // example to use Promise
    *     // Instantiate with the endpoint.
    *     var entry = Kii.serverCodeEntry("main");
    *
    *     // Set the custom parameters.
    *     var arg = {"username":"name_of_my_friend", "password":"password_for_my_friend"};
    *
    *     // Example of executing the Server Code
    *     entry.execute(arg).then(
    *         function(params) {
    *             var entry = params[0];
    *             var argument = params[1];
    *             var execResult = params[2];
    *            // do something
    *         },
    *         function(error) {
    *            // do something with the error response
    *         }
    *     );
    */
  def execute[T](argument: T): js.Promise[js.Tuple3[KiiServerCodeEntry, T, KiiServerCodeExecResult]] = js.native
  def execute[T](argument: T, callbacks: `24`[T]): js.Promise[js.Tuple3[KiiServerCodeEntry, T, KiiServerCodeExecResult]] = js.native
  
  /**
    * Get the entryName of this server code entry.
    *
    * @return entryName.
    */
  def getEntryName(): String = js.native
}
