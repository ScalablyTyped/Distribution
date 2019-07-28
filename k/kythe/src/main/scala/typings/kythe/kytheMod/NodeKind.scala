package typings.kythe.kytheMod

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
  
  /* "abs" */ val ABS: typings.kythe.kytheMod.NodeKind.ABS with String = js.native
  /* "absvar" */ val ABSVAR: typings.kythe.kytheMod.NodeKind.ABSVAR with String = js.native
  /* "anchor" */ val ANCHOR: typings.kythe.kytheMod.NodeKind.ANCHOR with String = js.native
  /* "constant" */ val CONSTANT: typings.kythe.kytheMod.NodeKind.CONSTANT with String = js.native
  /* "diagnostic" */ val DIAGNOSTIC: typings.kythe.kytheMod.NodeKind.DIAGNOSTIC with String = js.native
  /* "doc" */ val DOC: typings.kythe.kytheMod.NodeKind.DOC with String = js.native
  /* "file" */ val FILE: typings.kythe.kytheMod.NodeKind.FILE with String = js.native
  /* "function" */ val FUNCTION: typings.kythe.kytheMod.NodeKind.FUNCTION with String = js.native
  /* "interface" */ val INTERFACE: typings.kythe.kytheMod.NodeKind.INTERFACE with String = js.native
  /* "lookup" */ val LOOKUP: typings.kythe.kytheMod.NodeKind.LOOKUP with String = js.native
  /* "macro" */ val MACRO: typings.kythe.kytheMod.NodeKind.MACRO with String = js.native
  /* "meta" */ val META: typings.kythe.kytheMod.NodeKind.META with String = js.native
  /* "name" */ val NAME: typings.kythe.kytheMod.NodeKind.NAME with String = js.native
  /* "package" */ val PACKAGE: typings.kythe.kytheMod.NodeKind.PACKAGE with String = js.native
  /* "process" */ val PROCESS: typings.kythe.kytheMod.NodeKind.PROCESS with String = js.native
  /* "record" */ val RECORD: typings.kythe.kytheMod.NodeKind.RECORD with String = js.native
  /* "sum" */ val SUM: typings.kythe.kytheMod.NodeKind.SUM with String = js.native
  /* "symbol" */ val SYMBOL: typings.kythe.kytheMod.NodeKind.SYMBOL with String = js.native
  /* "talias" */ val TALIAS: typings.kythe.kytheMod.NodeKind.TALIAS with String = js.native
  /* "tapp" */ val TAPP: typings.kythe.kytheMod.NodeKind.TAPP with String = js.native
  /* "tbuiltin" */ val TBUILTIN: typings.kythe.kytheMod.NodeKind.TBUILTIN with String = js.native
  /* "tnominal" */ val TNOMINAL: typings.kythe.kytheMod.NodeKind.TNOMINAL with String = js.native
  /* "tsigma" */ val TSIGMA: typings.kythe.kytheMod.NodeKind.TSIGMA with String = js.native
  /* "variable" */ val VARIABLE: typings.kythe.kytheMod.NodeKind.VARIABLE with String = js.native
  /* "vcs" */ val VCS: typings.kythe.kytheMod.NodeKind.VCS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeKind with String] = js.native
}

