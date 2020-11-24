package typings.languageTags.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends js.Object
// These are really static integers assigned to Tag.
@JSImport("language-tags/Tag", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  
  @js.native
  sealed trait ERR_DEPRECATED extends ErrorCode
  
  @js.native
  sealed trait ERR_DUPLICATE_VARIANT extends ErrorCode
  
  @js.native
  sealed trait ERR_EXTRA_EXTLANG extends ErrorCode
  
  @js.native
  sealed trait ERR_EXTRA_LANGUAGE extends ErrorCode
  
  @js.native
  sealed trait ERR_EXTRA_REGION extends ErrorCode
  
  @js.native
  sealed trait ERR_EXTRA_SCRIPT extends ErrorCode
  
  @js.native
  sealed trait ERR_NO_LANGUAGE extends ErrorCode
  
  @js.native
  sealed trait ERR_SUBTAG_DEPRECATED extends ErrorCode
  
  @js.native
  sealed trait ERR_SUPPRESS_SCRIPT extends ErrorCode
  
  @js.native
  sealed trait ERR_TOO_LONG extends ErrorCode
  
  @js.native
  sealed trait ERR_UNKNOWN extends ErrorCode
  
  @js.native
  sealed trait ERR_WRONG_ORDER extends ErrorCode
}
