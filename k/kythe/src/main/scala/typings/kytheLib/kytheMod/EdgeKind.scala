package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeKind extends js.Object

@JSImport("kythe", "EdgeKind")
@js.native
object EdgeKind extends js.Object {
  @js.native
  sealed trait ALIASES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait ALIASES_ROOT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait ANNOTATED_BY
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait BOUNDED_LOWER
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait BOUNDED_UPPER
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait CHILD_OF
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait CHILD_OF_CONTEXT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait COMPLETES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait COMPLETES_UNIQUELY
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait DEFINES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait DEFINES_BINDING
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait DEPENDS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait DOCUMENTS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait EXPORTS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait EXTENDS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait GENERATES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait IMPUTES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait INSTANTIATES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait INSTANTIATES_SPECULATIVE
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait NAMED
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait OVERRIDES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait OVERRIDES_ROOT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait OVERRIDES_TRANSITIVE
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait PARAM
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_CALL
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_CALL_IMPLICIT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_DOC
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS_TRANSITIVE
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_FILE
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_IMPLICIT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_IMPORTS
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_INCLUDES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_INIT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_INIT_IMPLICIT
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait REF_QUERIES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait SATISFIES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait SPECIALIZES
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait SPECIALIZES_SPECULATIVE
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait TAGGED
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait TYPED
    extends kytheLib.kytheMod.EdgeKind
  
  @js.native
  sealed trait UNDEFINES
    extends kytheLib.kytheMod.EdgeKind
  
  /* "/kythe/edge/aliases" */ val ALIASES: ALIASES with java.lang.String = js.native
  /* "/kythe/edge/aliases/root" */ val ALIASES_ROOT: ALIASES_ROOT with java.lang.String = js.native
  /* "/kythe/edge/annotatedby" */ val ANNOTATED_BY: ANNOTATED_BY with java.lang.String = js.native
  /* "/kythe/edge/bounded/lower" */ val BOUNDED_LOWER: BOUNDED_LOWER with java.lang.String = js.native
  /* "/kythe/edge/bounded/upper" */ val BOUNDED_UPPER: BOUNDED_UPPER with java.lang.String = js.native
  /* "/kythe/edge/childof" */ val CHILD_OF: CHILD_OF with java.lang.String = js.native
  /* "/kythe/edge/childof/context" */ val CHILD_OF_CONTEXT: CHILD_OF_CONTEXT with java.lang.String = js.native
  /* "/kythe/edge/completes" */ val COMPLETES: COMPLETES with java.lang.String = js.native
  /* "/kythe/edge/completes/uniquely" */ val COMPLETES_UNIQUELY: COMPLETES_UNIQUELY with java.lang.String = js.native
  /* "/kythe/edge/defines" */ val DEFINES: DEFINES with java.lang.String = js.native
  /* "/kythe/edge/defines/binding" */ val DEFINES_BINDING: DEFINES_BINDING with java.lang.String = js.native
  /* "/kythe/edge/depends" */ val DEPENDS: DEPENDS with java.lang.String = js.native
  /* "/kythe/edge/documents" */ val DOCUMENTS: DOCUMENTS with java.lang.String = js.native
  /* "/kythe/edge/exports" */ val EXPORTS: EXPORTS with java.lang.String = js.native
  /* "/kythe/edge/extends" */ val EXTENDS: EXTENDS with java.lang.String = js.native
  /* "/kythe/edge/generates" */ val GENERATES: GENERATES with java.lang.String = js.native
  /* "/kythe/edge/imputes" */ val IMPUTES: IMPUTES with java.lang.String = js.native
  /* "/kythe/edge/instantiates" */ val INSTANTIATES: INSTANTIATES with java.lang.String = js.native
  /* "/kythe/edge/instantiates/speculative" */ val INSTANTIATES_SPECULATIVE: INSTANTIATES_SPECULATIVE with java.lang.String = js.native
  /* "/kythe/edge/named" */ val NAMED: NAMED with java.lang.String = js.native
  /* "/kythe/edge/overrides" */ val OVERRIDES: OVERRIDES with java.lang.String = js.native
  /* "/kythe/edge/overrides/root" */ val OVERRIDES_ROOT: OVERRIDES_ROOT with java.lang.String = js.native
  /* "/kythe/edge/overrides/transitive" */ val OVERRIDES_TRANSITIVE: OVERRIDES_TRANSITIVE with java.lang.String = js.native
  /* "/kythe/edge/param" */ val PARAM: PARAM with java.lang.String = js.native
  /* "/kythe/edge/ref" */ val REF: REF with java.lang.String = js.native
  /* "/kythe/edge/ref/call" */ val REF_CALL: REF_CALL with java.lang.String = js.native
  /* "/kythe/edge/ref/call/implicit" */ val REF_CALL_IMPLICIT: REF_CALL_IMPLICIT with java.lang.String = js.native
  /* "/kythe/edge/ref/doc" */ val REF_DOC: REF_DOC with java.lang.String = js.native
  /* "/kythe/edge/ref/expands" */ val REF_EXPANDS: REF_EXPANDS with java.lang.String = js.native
  /* "/kythe/edge/ref/expands/transitive" */ val REF_EXPANDS_TRANSITIVE: REF_EXPANDS_TRANSITIVE with java.lang.String = js.native
  /* "/kythe/edge/ref/file" */ val REF_FILE: REF_FILE with java.lang.String = js.native
  /* "/kythe/edge/ref/implicit" */ val REF_IMPLICIT: REF_IMPLICIT with java.lang.String = js.native
  /* "/kythe/edge/ref/imports" */ val REF_IMPORTS: REF_IMPORTS with java.lang.String = js.native
  /* "/kythe/edge/ref/includes" */ val REF_INCLUDES: REF_INCLUDES with java.lang.String = js.native
  /* "/kythe/edge/ref/init" */ val REF_INIT: REF_INIT with java.lang.String = js.native
  /* "/kythe/edge/ref/init/implicit" */ val REF_INIT_IMPLICIT: REF_INIT_IMPLICIT with java.lang.String = js.native
  /* "/kythe/edge/ref/queries" */ val REF_QUERIES: REF_QUERIES with java.lang.String = js.native
  /* "/kythe/edge/satisfies" */ val SATISFIES: SATISFIES with java.lang.String = js.native
  /* "/kythe/edge/specializes" */ val SPECIALIZES: SPECIALIZES with java.lang.String = js.native
  /* "/kythe/edge/specializes/speculative" */ val SPECIALIZES_SPECULATIVE: SPECIALIZES_SPECULATIVE with java.lang.String = js.native
  /* "/kythe/edge/tagged" */ val TAGGED: TAGGED with java.lang.String = js.native
  /* "/kythe/edge/typed" */ val TYPED: TYPED with java.lang.String = js.native
  /* "/kythe/edge/undefines" */ val UNDEFINES: UNDEFINES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kytheLib.kytheMod.EdgeKind with java.lang.String] = js.native
}

