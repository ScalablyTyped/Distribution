package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.UserId_
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "Group")
@js.native
open class Group protected () extends EventEmitter {
  def this(groupId: String) = this()
  
  var avatarUrl: String = js.native
  
  var groupId: String = js.native
  
  var inviter: UserId_ = js.native
  
  var myMembership: String = js.native
  
  var name: String = js.native
  
  def setInviter(inviter: js.Object): Unit = js.native
  
  def setMyMembership(membership: String): Unit = js.native
  
  def setProfile(name: String, avatarUrl: String): Unit = js.native
}
