package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeKind extends js.Object

@JSImport("kythe", "NodeKind")
@js.native
object NodeKind extends js.Object {
  @js.native
  sealed trait ABS
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait ABSVAR
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait ANCHOR
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait CONSTANT
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait DIAGNOSTIC
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait DOC
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait FILE
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait FUNCTION
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait INTERFACE
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait LOOKUP
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait MACRO
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait META
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait NAME
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait PACKAGE
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait PROCESS
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait RECORD
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait SUM
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait SYMBOL
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait TALIAS
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait TAPP
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait TBUILTIN
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait TNOMINAL
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait TSIGMA
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait VARIABLE
    extends kytheLib.kytheMod.NodeKind
  
  @js.native
  sealed trait VCS
    extends kytheLib.kytheMod.NodeKind
  
  /* "abs" */ val ABS: ABS with java.lang.String = js.native
  /* "absvar" */ val ABSVAR: ABSVAR with java.lang.String = js.native
  /* "anchor" */ val ANCHOR: ANCHOR with java.lang.String = js.native
  /* "constant" */ val CONSTANT: CONSTANT with java.lang.String = js.native
  /* "diagnostic" */ val DIAGNOSTIC: DIAGNOSTIC with java.lang.String = js.native
  /* "doc" */ val DOC: DOC with java.lang.String = js.native
  /* "file" */ val FILE: FILE with java.lang.String = js.native
  /* "function" */ val FUNCTION: FUNCTION with java.lang.String = js.native
  /* "interface" */ val INTERFACE: INTERFACE with java.lang.String = js.native
  /* "lookup" */ val LOOKUP: LOOKUP with java.lang.String = js.native
  /* "macro" */ val MACRO: MACRO with java.lang.String = js.native
  /* "meta" */ val META: META with java.lang.String = js.native
  /* "name" */ val NAME: NAME with java.lang.String = js.native
  /* "package" */ val PACKAGE: PACKAGE with java.lang.String = js.native
  /* "process" */ val PROCESS: PROCESS with java.lang.String = js.native
  /* "record" */ val RECORD: RECORD with java.lang.String = js.native
  /* "sum" */ val SUM: SUM with java.lang.String = js.native
  /* "symbol" */ val SYMBOL: SYMBOL with java.lang.String = js.native
  /* "talias" */ val TALIAS: TALIAS with java.lang.String = js.native
  /* "tapp" */ val TAPP: TAPP with java.lang.String = js.native
  /* "tbuiltin" */ val TBUILTIN: TBUILTIN with java.lang.String = js.native
  /* "tnominal" */ val TNOMINAL: TNOMINAL with java.lang.String = js.native
  /* "tsigma" */ val TSIGMA: TSIGMA with java.lang.String = js.native
  /* "variable" */ val VARIABLE: VARIABLE with java.lang.String = js.native
  /* "vcs" */ val VCS: VCS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kytheLib.kytheMod.NodeKind with java.lang.String] = js.native
}

