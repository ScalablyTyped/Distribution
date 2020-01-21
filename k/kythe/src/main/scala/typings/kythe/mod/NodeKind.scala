package typings.kythe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeKind extends js.Object

@JSImport("kythe", "NodeKind")
@js.native
object NodeKind extends js.Object {
  @js.native
  sealed trait ABS extends NodeKind
  
  @js.native
  sealed trait ABSVAR extends NodeKind
  
  @js.native
  sealed trait ANCHOR extends NodeKind
  
  @js.native
  sealed trait CONSTANT extends NodeKind
  
  @js.native
  sealed trait DIAGNOSTIC extends NodeKind
  
  @js.native
  sealed trait DOC extends NodeKind
  
  @js.native
  sealed trait FILE extends NodeKind
  
  @js.native
  sealed trait FUNCTION extends NodeKind
  
  @js.native
  sealed trait INTERFACE extends NodeKind
  
  @js.native
  sealed trait LOOKUP extends NodeKind
  
  @js.native
  sealed trait MACRO extends NodeKind
  
  @js.native
  sealed trait META extends NodeKind
  
  @js.native
  sealed trait NAME extends NodeKind
  
  @js.native
  sealed trait PACKAGE extends NodeKind
  
  @js.native
  sealed trait PROCESS extends NodeKind
  
  @js.native
  sealed trait RECORD extends NodeKind
  
  @js.native
  sealed trait SUM extends NodeKind
  
  @js.native
  sealed trait SYMBOL extends NodeKind
  
  @js.native
  sealed trait TALIAS extends NodeKind
  
  @js.native
  sealed trait TAPP extends NodeKind
  
  @js.native
  sealed trait TBUILTIN extends NodeKind
  
  @js.native
  sealed trait TNOMINAL extends NodeKind
  
  @js.native
  sealed trait TSIGMA extends NodeKind
  
  @js.native
  sealed trait VARIABLE extends NodeKind
  
  @js.native
  sealed trait VCS extends NodeKind
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeKind with String] = js.native
  /* "abs" */ @js.native
  object ABS extends TopLevel[ABS with String]
  
  /* "absvar" */ @js.native
  object ABSVAR extends TopLevel[ABSVAR with String]
  
  /* "anchor" */ @js.native
  object ANCHOR extends TopLevel[ANCHOR with String]
  
  /* "constant" */ @js.native
  object CONSTANT extends TopLevel[CONSTANT with String]
  
  /* "diagnostic" */ @js.native
  object DIAGNOSTIC extends TopLevel[DIAGNOSTIC with String]
  
  /* "doc" */ @js.native
  object DOC extends TopLevel[DOC with String]
  
  /* "file" */ @js.native
  object FILE extends TopLevel[FILE with String]
  
  /* "function" */ @js.native
  object FUNCTION extends TopLevel[FUNCTION with String]
  
  /* "interface" */ @js.native
  object INTERFACE extends TopLevel[INTERFACE with String]
  
  /* "lookup" */ @js.native
  object LOOKUP extends TopLevel[LOOKUP with String]
  
  /* "macro" */ @js.native
  object MACRO extends TopLevel[MACRO with String]
  
  /* "meta" */ @js.native
  object META extends TopLevel[META with String]
  
  /* "name" */ @js.native
  object NAME extends TopLevel[NAME with String]
  
  /* "package" */ @js.native
  object PACKAGE extends TopLevel[PACKAGE with String]
  
  /* "process" */ @js.native
  object PROCESS extends TopLevel[PROCESS with String]
  
  /* "record" */ @js.native
  object RECORD extends TopLevel[RECORD with String]
  
  /* "sum" */ @js.native
  object SUM extends TopLevel[SUM with String]
  
  /* "symbol" */ @js.native
  object SYMBOL extends TopLevel[SYMBOL with String]
  
  /* "talias" */ @js.native
  object TALIAS extends TopLevel[TALIAS with String]
  
  /* "tapp" */ @js.native
  object TAPP extends TopLevel[TAPP with String]
  
  /* "tbuiltin" */ @js.native
  object TBUILTIN extends TopLevel[TBUILTIN with String]
  
  /* "tnominal" */ @js.native
  object TNOMINAL extends TopLevel[TNOMINAL with String]
  
  /* "tsigma" */ @js.native
  object TSIGMA extends TopLevel[TSIGMA with String]
  
  /* "variable" */ @js.native
  object VARIABLE extends TopLevel[VARIABLE with String]
  
  /* "vcs" */ @js.native
  object VCS extends TopLevel[VCS with String]
  
}

