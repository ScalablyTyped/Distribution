package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataType extends js.Object
@JSGlobal("DataType")
@js.native
object DataType extends js.Object {
  
  @js.native
  sealed trait Json extends DataType
  
  @js.native
  sealed trait Text extends DataType
  
  @js.native
  sealed trait Xml extends DataType
}
