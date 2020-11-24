package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OrderDirection extends js.Object
@JSGlobal("Linq4JS.OrderDirection")
@js.native
object OrderDirection extends js.Object {
  
  @js.native
  sealed trait Ascending extends OrderDirection
  
  @js.native
  sealed trait Descending extends OrderDirection
}
