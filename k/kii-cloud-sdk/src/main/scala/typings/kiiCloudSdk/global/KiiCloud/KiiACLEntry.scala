package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.KiiCloud.KiiACLSubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiACLEntry object
  */
@JSGlobal("KiiCloud.KiiACLEntry")
@js.native
class KiiACLEntry ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiACLEntry {
  
  /**
    * Get the action that is being permitted/restricted in this entry
    *
    */
  /* CompleteClass */
  override def getAction(): typings.kiiCloudSdk.KiiCloud.KiiACLAction = js.native
  
  /**
    * Get whether or not the action is being permitted to the subject
    *
    */
  /* CompleteClass */
  override def getGrant(): Boolean = js.native
  
  /**
    * Get the subject that is being permitted/restricted in this entry
    *
    */
  /* CompleteClass */
  override def getSubject[T /* <: KiiACLSubject */](): T = js.native
  
  /**
    * The action that is being permitted/restricted. Possible values:
    * <br><br>
    * KiiACLAction.KiiACLBucketActionCreateObjects,<br>
    * KiiACLAction.KiiACLBucketActionQueryObjects,  <br>
    * KiiACLAction.KiiACLBucketActionDropBucket,<br>
    * KiiACLAction.KiiACLBucketActionReadObjects,<br>
    * KiiACLAction.KiiACLObjectActionRead,<br>
    * KiiACLAction.KiiACLObjectActionWrite,<br>
    * KiiACLAction.KiiACLSubscribeToTopic,<br>
    * KiiACLAction.KiiACLSendMessageToTopic
    *
    * @param value The action being permitted/restricted
    *
    * @throws If the value is not one of the permitted values
    */
  /* CompleteClass */
  override def setAction(value: typings.kiiCloudSdk.KiiCloud.KiiACLAction): Unit = js.native
  
  /**
    * Set whether or not the action is being permitted to the subject
    *
    * @param value true if the action is permitted, false otherwise
    *
    * @throws If the value is not a boolean type
    */
  /* CompleteClass */
  override def setGrant(value: Boolean): Unit = js.native
  
  /**
    * Set the subject to which the action/grant is being applied
    *
    * @param subject instance.
    *
    * @throws If the value is not one of the permitted values
    */
  /* CompleteClass */
  override def setSubject(subject: KiiACLSubject): Unit = js.native
}
object KiiACLEntry {
  
  @JSGlobal("KiiCloud.KiiACLEntry")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def entryWithSubject(Subject: KiiACLSubject, action: typings.kiiCloudSdk.KiiCloud.KiiACLAction): typings.kiiCloudSdk.KiiCloud.KiiACLEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("entryWithSubject")(Subject.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiACLEntry]
}
