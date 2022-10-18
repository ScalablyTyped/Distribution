package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AssignerProtocol {
  
  @JSImport("kafkajs", "AssignerProtocol")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kafkajs", "AssignerProtocol.MemberAssignment")
  @js.native
  def MemberAssignment: ISerializer[typings.kafkajs.mod.MemberAssignment] = js.native
  inline def MemberAssignment_=(x: ISerializer[MemberAssignment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberAssignment")(x.asInstanceOf[js.Any])
  
  @JSImport("kafkajs", "AssignerProtocol.MemberMetadata")
  @js.native
  def MemberMetadata: ISerializer[typings.kafkajs.mod.MemberMetadata] = js.native
  inline def MemberMetadata_=(x: ISerializer[MemberMetadata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberMetadata")(x.asInstanceOf[js.Any])
}
