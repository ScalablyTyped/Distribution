package typings.kythe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeKind extends js.Object
@JSImport("kythe", "NodeKind")
@js.native
object NodeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeKind with String] = js.native
  
  @js.native
  sealed trait ABS extends NodeKind
  /* "abs" */ @js.native
  object ABS extends TopLevel[ABS with String]
  
  @js.native
  sealed trait ABSVAR extends NodeKind
  /* "absvar" */ @js.native
  object ABSVAR extends TopLevel[ABSVAR with String]
  
  @js.native
  sealed trait ANCHOR extends NodeKind
  /* "anchor" */ @js.native
  object ANCHOR extends TopLevel[ANCHOR with String]
  
  @js.native
  sealed trait CONSTANT extends NodeKind
  /* "constant" */ @js.native
  object CONSTANT extends TopLevel[CONSTANT with String]
  
  @js.native
  sealed trait DIAGNOSTIC extends NodeKind
  /* "diagnostic" */ @js.native
  object DIAGNOSTIC extends TopLevel[DIAGNOSTIC with String]
  
  @js.native
  sealed trait DOC extends NodeKind
  /* "doc" */ @js.native
  object DOC extends TopLevel[DOC with String]
  
  @js.native
  sealed trait FILE extends NodeKind
  /* "file" */ @js.native
  object FILE extends TopLevel[FILE with String]
  
  @js.native
  sealed trait FUNCTION extends NodeKind
  /* "function" */ @js.native
  object FUNCTION extends TopLevel[FUNCTION with String]
  
  @js.native
  sealed trait INTERFACE extends NodeKind
  /* "interface" */ @js.native
  object INTERFACE extends TopLevel[INTERFACE with String]
  
  @js.native
  sealed trait LOOKUP extends NodeKind
  /* "lookup" */ @js.native
  object LOOKUP extends TopLevel[LOOKUP with String]
  
  @js.native
  sealed trait MACRO extends NodeKind
  /* "macro" */ @js.native
  object MACRO extends TopLevel[MACRO with String]
  
  @js.native
  sealed trait META extends NodeKind
  /* "meta" */ @js.native
  object META extends TopLevel[META with String]
  
  @js.native
  sealed trait NAME extends NodeKind
  /* "name" */ @js.native
  object NAME extends TopLevel[NAME with String]
  
  @js.native
  sealed trait PACKAGE extends NodeKind
  /* "package" */ @js.native
  object PACKAGE extends TopLevel[PACKAGE with String]
  
  @js.native
  sealed trait PROCESS extends NodeKind
  /* "process" */ @js.native
  object PROCESS extends TopLevel[PROCESS with String]
  
  @js.native
  sealed trait RECORD extends NodeKind
  /* "record" */ @js.native
  object RECORD extends TopLevel[RECORD with String]
  
  @js.native
  sealed trait SUM extends NodeKind
  /* "sum" */ @js.native
  object SUM extends TopLevel[SUM with String]
  
  @js.native
  sealed trait SYMBOL extends NodeKind
  /* "symbol" */ @js.native
  object SYMBOL extends TopLevel[SYMBOL with String]
  
  @js.native
  sealed trait TALIAS extends NodeKind
  /* "talias" */ @js.native
  object TALIAS extends TopLevel[TALIAS with String]
  
  @js.native
  sealed trait TAPP extends NodeKind
  /* "tapp" */ @js.native
  object TAPP extends TopLevel[TAPP with String]
  
  @js.native
  sealed trait TBUILTIN extends NodeKind
  /* "tbuiltin" */ @js.native
  object TBUILTIN extends TopLevel[TBUILTIN with String]
  
  @js.native
  sealed trait TNOMINAL extends NodeKind
  /* "tnominal" */ @js.native
  object TNOMINAL extends TopLevel[TNOMINAL with String]
  
  @js.native
  sealed trait TSIGMA extends NodeKind
  /* "tsigma" */ @js.native
  object TSIGMA extends TopLevel[TSIGMA with String]
  
  @js.native
  sealed trait VARIABLE extends NodeKind
  /* "variable" */ @js.native
  object VARIABLE extends TopLevel[VARIABLE with String]
  
  @js.native
  sealed trait VCS extends NodeKind
  /* "vcs" */ @js.native
  object VCS extends TopLevel[VCS with String]
}
