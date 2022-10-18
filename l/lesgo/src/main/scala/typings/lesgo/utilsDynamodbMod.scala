package typings.lesgo

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDynamodbMod extends Shortcut {
  
  @JSImport("lesgo/utils/dynamodb", JSImport.Default)
  @js.native
  val default: typings.lesgo.servicesDynamoDbServiceMod.default = js.native
  
  type _To = typings.lesgo.servicesDynamoDbServiceMod.default
  
  /* This means you don't have to write `default`, but can instead just say `utilsDynamodbMod.foo` */
  override def _to: typings.lesgo.servicesDynamoDbServiceMod.default = default
}
