package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiACLEntry object
  */
@js.native
trait KiiACLEntry extends js.Object {
  
  /**
    * Get the action that is being permitted/restricted in this entry
    *
    */
  def getAction(): KiiACLAction = js.native
  
  /**
    * Get whether or not the action is being permitted to the subject
    *
    */
  def getGrant(): Boolean = js.native
  
  /**
    * Get the subject that is being permitted/restricted in this entry
    *
    */
  def getSubject[T /* <: KiiACLSubject */](): T = js.native
  
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
  def setAction(value: KiiACLAction): Unit = js.native
  
  /**
    * Set whether or not the action is being permitted to the subject
    *
    * @param value true if the action is permitted, false otherwise
    *
    * @throws If the value is not a boolean type
    */
  def setGrant(value: Boolean): Unit = js.native
  
  /**
    * Set the subject to which the action/grant is being applied
    *
    * @param subject instance.
    *
    * @throws If the value is not one of the permitted values
    */
  def setSubject(subject: KiiACLSubject): Unit = js.native
}
object KiiACLEntry {
  
  @scala.inline
  def apply(
    getAction: () => KiiACLAction,
    getGrant: () => Boolean,
    getSubject: () => js.Any,
    setAction: KiiACLAction => Unit,
    setGrant: Boolean => Unit,
    setSubject: KiiACLSubject => Unit
  ): KiiACLEntry = {
    val __obj = js.Dynamic.literal(getAction = js.Any.fromFunction0(getAction), getGrant = js.Any.fromFunction0(getGrant), getSubject = js.Any.fromFunction0(getSubject), setAction = js.Any.fromFunction1(setAction), setGrant = js.Any.fromFunction1(setGrant), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[KiiACLEntry]
  }
  
  @scala.inline
  implicit class KiiACLEntryOps[Self <: KiiACLEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAction(value: () => KiiACLAction): Self = this.set("getAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrant(value: () => Boolean): Self = this.set("getGrant", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => js.Any): Self = this.set("getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAction(value: KiiACLAction => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGrant(value: Boolean => Unit): Self = this.set("setGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: KiiACLSubject => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
  }
}
