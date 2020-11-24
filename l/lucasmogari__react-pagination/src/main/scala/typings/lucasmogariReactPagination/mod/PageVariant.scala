package typings.lucasmogariReactPagination.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageVariant extends js.Object
@JSImport("@lucasmogari/react-pagination", "PageVariant")
@js.native
object PageVariant extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageVariant with String] = js.native
  
  @js.native
  sealed trait before extends PageVariant
  /* "before" */ @js.native
  object before extends TopLevel[before with String]
  
  @js.native
  sealed trait gap extends PageVariant
  /* "gap" */ @js.native
  object gap extends TopLevel[gap with String]
  
  @js.native
  sealed trait next extends PageVariant
  /* "next" */ @js.native
  object next extends TopLevel[next with String]
}
