package typings.invityApi.mod

import typings.invityApi.invityApiStrings.Blocked_
import typings.invityApi.invityApiStrings.Cancelled_
import typings.invityApi.invityApiStrings.Error_
import typings.invityApi.invityApiStrings.Pending_
import typings.invityApi.invityApiStrings.Refunded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.invityApi.invityApiStrings.Cancelled_
  - typings.invityApi.invityApiStrings.Pending_
  - typings.invityApi.invityApiStrings.InProgress
  - typings.invityApi.invityApiStrings.Blocked_
  - typings.invityApi.invityApiStrings.Completed
  - typings.invityApi.invityApiStrings.Refunded_
  - typings.invityApi.invityApiStrings.Error_
*/
trait SavingsTradeItemStatus extends StObject
object SavingsTradeItemStatus {
  
  inline def Blocked: Blocked_ = "Blocked".asInstanceOf[Blocked_]
  
  inline def Cancelled: Cancelled_ = "Cancelled".asInstanceOf[Cancelled_]
  
  inline def Completed: typings.invityApi.invityApiStrings.Completed = "Completed".asInstanceOf[typings.invityApi.invityApiStrings.Completed]
  
  inline def Error: Error_ = "Error".asInstanceOf[Error_]
  
  inline def InProgress: typings.invityApi.invityApiStrings.InProgress = "InProgress".asInstanceOf[typings.invityApi.invityApiStrings.InProgress]
  
  inline def Pending: Pending_ = "Pending".asInstanceOf[Pending_]
  
  inline def Refunded: Refunded_ = "Refunded".asInstanceOf[Refunded_]
}
