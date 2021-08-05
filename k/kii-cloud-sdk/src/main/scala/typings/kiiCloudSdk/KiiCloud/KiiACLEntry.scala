package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiACLEntry object
  */
trait KiiACLEntry extends StObject {
  
  /**
    * Get the action that is being permitted/restricted in this entry
    *
    */
  def getAction(): KiiACLAction
  
  /**
    * Get whether or not the action is being permitted to the subject
    *
    */
  def getGrant(): Boolean
  
  /**
    * Get the subject that is being permitted/restricted in this entry
    *
    */
  def getSubject[T /* <: KiiACLSubject */](): T
  
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
  def setAction(value: KiiACLAction): Unit
  
  /**
    * Set whether or not the action is being permitted to the subject
    *
    * @param value true if the action is permitted, false otherwise
    *
    * @throws If the value is not a boolean type
    */
  def setGrant(value: Boolean): Unit
  
  /**
    * Set the subject to which the action/grant is being applied
    *
    * @param subject instance.
    *
    * @throws If the value is not one of the permitted values
    */
  def setSubject(subject: KiiACLSubject): Unit
}
object KiiACLEntry {
  
  inline def apply(
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
  
  extension [Self <: KiiACLEntry](x: Self) {
    
    inline def setGetAction(value: () => KiiACLAction): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
    
    inline def setGetGrant(value: () => Boolean): Self = StObject.set(x, "getGrant", js.Any.fromFunction0(value))
    
    inline def setGetSubject(value: () => js.Any): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    inline def setSetAction(value: KiiACLAction => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
    
    inline def setSetGrant(value: Boolean => Unit): Self = StObject.set(x, "setGrant", js.Any.fromFunction1(value))
    
    inline def setSetSubject(value: KiiACLSubject => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
  }
}
