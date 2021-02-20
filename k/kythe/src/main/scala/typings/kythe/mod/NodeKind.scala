package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeKind extends StObject
@JSImport("kythe", "NodeKind")
@js.native
object NodeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeKind with String] = js.native
  
  @js.native
  sealed trait ABS extends NodeKind
  /* "abs" */ val ABS: typings.kythe.mod.NodeKind.ABS with String = js.native
  
  @js.native
  sealed trait ABSVAR extends NodeKind
  /* "absvar" */ val ABSVAR: typings.kythe.mod.NodeKind.ABSVAR with String = js.native
  
  @js.native
  sealed trait ANCHOR extends NodeKind
  /* "anchor" */ val ANCHOR: typings.kythe.mod.NodeKind.ANCHOR with String = js.native
  
  @js.native
  sealed trait CONSTANT extends NodeKind
  /* "constant" */ val CONSTANT: typings.kythe.mod.NodeKind.CONSTANT with String = js.native
  
  @js.native
  sealed trait DIAGNOSTIC extends NodeKind
  /* "diagnostic" */ val DIAGNOSTIC: typings.kythe.mod.NodeKind.DIAGNOSTIC with String = js.native
  
  @js.native
  sealed trait DOC extends NodeKind
  /* "doc" */ val DOC: typings.kythe.mod.NodeKind.DOC with String = js.native
  
  @js.native
  sealed trait FILE extends NodeKind
  /* "file" */ val FILE: typings.kythe.mod.NodeKind.FILE with String = js.native
  
  @js.native
  sealed trait FUNCTION extends NodeKind
  /* "function" */ val FUNCTION: typings.kythe.mod.NodeKind.FUNCTION with String = js.native
  
  @js.native
  sealed trait INTERFACE extends NodeKind
  /* "interface" */ val INTERFACE: typings.kythe.mod.NodeKind.INTERFACE with String = js.native
  
  @js.native
  sealed trait LOOKUP extends NodeKind
  /* "lookup" */ val LOOKUP: typings.kythe.mod.NodeKind.LOOKUP with String = js.native
  
  @js.native
  sealed trait MACRO extends NodeKind
  /* "macro" */ val MACRO: typings.kythe.mod.NodeKind.MACRO with String = js.native
  
  @js.native
  sealed trait META extends NodeKind
  /* "meta" */ val META: typings.kythe.mod.NodeKind.META with String = js.native
  
  @js.native
  sealed trait NAME extends NodeKind
  /* "name" */ val NAME: typings.kythe.mod.NodeKind.NAME with String = js.native
  
  @js.native
  sealed trait PACKAGE extends NodeKind
  /* "package" */ val PACKAGE: typings.kythe.mod.NodeKind.PACKAGE with String = js.native
  
  @js.native
  sealed trait PROCESS extends NodeKind
  /* "process" */ val PROCESS: typings.kythe.mod.NodeKind.PROCESS with String = js.native
  
  @js.native
  sealed trait RECORD extends NodeKind
  /* "record" */ val RECORD: typings.kythe.mod.NodeKind.RECORD with String = js.native
  
  @js.native
  sealed trait SUM extends NodeKind
  /* "sum" */ val SUM: typings.kythe.mod.NodeKind.SUM with String = js.native
  
  @js.native
  sealed trait SYMBOL extends NodeKind
  /* "symbol" */ val SYMBOL: typings.kythe.mod.NodeKind.SYMBOL with String = js.native
  
  @js.native
  sealed trait TALIAS extends NodeKind
  /* "talias" */ val TALIAS: typings.kythe.mod.NodeKind.TALIAS with String = js.native
  
  @js.native
  sealed trait TAPP extends NodeKind
  /* "tapp" */ val TAPP: typings.kythe.mod.NodeKind.TAPP with String = js.native
  
  @js.native
  sealed trait TBUILTIN extends NodeKind
  /* "tbuiltin" */ val TBUILTIN: typings.kythe.mod.NodeKind.TBUILTIN with String = js.native
  
  @js.native
  sealed trait TNOMINAL extends NodeKind
  /* "tnominal" */ val TNOMINAL: typings.kythe.mod.NodeKind.TNOMINAL with String = js.native
  
  @js.native
  sealed trait TSIGMA extends NodeKind
  /* "tsigma" */ val TSIGMA: typings.kythe.mod.NodeKind.TSIGMA with String = js.native
  
  @js.native
  sealed trait VARIABLE extends NodeKind
  /* "variable" */ val VARIABLE: typings.kythe.mod.NodeKind.VARIABLE with String = js.native
  
  @js.native
  sealed trait VCS extends NodeKind
  /* "vcs" */ val VCS: typings.kythe.mod.NodeKind.VCS with String = js.native
}
