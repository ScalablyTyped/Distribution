package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataType extends StObject
@JSGlobal("DataType")
@js.native
object DataType extends StObject {
  
  @js.native
  sealed trait Json
    extends StObject
       with DataType
  
  @js.native
  sealed trait Text
    extends StObject
       with DataType
  
  @js.native
  sealed trait Xml
    extends StObject
       with DataType
}
