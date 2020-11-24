package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.KiiCloud.KiiACLSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiACLEntry object
  */
@JSGlobal("KiiCloud.KiiACLEntry")
@js.native
class KiiACLEntry ()
  extends typings.kiiCloudSdk.KiiCloud.KiiACLEntry
/* static members */
@JSGlobal("KiiCloud.KiiACLEntry")
@js.native
object KiiACLEntry extends js.Object {
  
  /**
    * Create a KiiACLEntry object with a subject and action
    *
    * The entry will not be applied on the server until the KiiACL object is
    * explicitly saved. This method simply returns a working KiiACLEntry with
    * a specified subject and action.
    *
    * @param Subject to which the action/grant is being applied
    * @param action One of the specified KiiACLAction values the
    *   permissions is being applied to
    *
    * @return A KiiACLEntry object with the specified attributes
    *
    * @throws If specified subject is invalid.
    * @throws If the specified action is invalid.
    */
  def entryWithSubject(Subject: KiiACLSubject, action: typings.kiiCloudSdk.KiiCloud.KiiACLAction): typings.kiiCloudSdk.KiiCloud.KiiACLEntry = js.native
}
