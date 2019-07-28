package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeKind extends js.Object

@JSImport("kythe", "EdgeKind")
@js.native
object EdgeKind extends js.Object {
  @js.native
  sealed trait ALIASES extends EdgeKind
  
  @js.native
  sealed trait ALIASES_ROOT extends EdgeKind
  
  @js.native
  sealed trait ANNOTATED_BY extends EdgeKind
  
  @js.native
  sealed trait BOUNDED_LOWER extends EdgeKind
  
  @js.native
  sealed trait BOUNDED_UPPER extends EdgeKind
  
  @js.native
  sealed trait CHILD_OF extends EdgeKind
  
  @js.native
  sealed trait CHILD_OF_CONTEXT extends EdgeKind
  
  @js.native
  sealed trait COMPLETES extends EdgeKind
  
  @js.native
  sealed trait COMPLETES_UNIQUELY extends EdgeKind
  
  @js.native
  sealed trait DEFINES extends EdgeKind
  
  @js.native
  sealed trait DEFINES_BINDING extends EdgeKind
  
  @js.native
  sealed trait DEPENDS extends EdgeKind
  
  @js.native
  sealed trait DOCUMENTS extends EdgeKind
  
  @js.native
  sealed trait EXPORTS extends EdgeKind
  
  @js.native
  sealed trait EXTENDS extends EdgeKind
  
  @js.native
  sealed trait GENERATES extends EdgeKind
  
  @js.native
  sealed trait IMPUTES extends EdgeKind
  
  @js.native
  sealed trait INSTANTIATES extends EdgeKind
  
  @js.native
  sealed trait INSTANTIATES_SPECULATIVE extends EdgeKind
  
  @js.native
  sealed trait NAMED extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES_ROOT extends EdgeKind
  
  @js.native
  sealed trait OVERRIDES_TRANSITIVE extends EdgeKind
  
  @js.native
  sealed trait PARAM extends EdgeKind
  
  @js.native
  sealed trait REF extends EdgeKind
  
  @js.native
  sealed trait REF_CALL extends EdgeKind
  
  @js.native
  sealed trait REF_CALL_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_DOC extends EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS extends EdgeKind
  
  @js.native
  sealed trait REF_EXPANDS_TRANSITIVE extends EdgeKind
  
  @js.native
  sealed trait REF_FILE extends EdgeKind
  
  @js.native
  sealed trait REF_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_IMPORTS extends EdgeKind
  
  @js.native
  sealed trait REF_INCLUDES extends EdgeKind
  
  @js.native
  sealed trait REF_INIT extends EdgeKind
  
  @js.native
  sealed trait REF_INIT_IMPLICIT extends EdgeKind
  
  @js.native
  sealed trait REF_QUERIES extends EdgeKind
  
  @js.native
  sealed trait SATISFIES extends EdgeKind
  
  @js.native
  sealed trait SPECIALIZES extends EdgeKind
  
  @js.native
  sealed trait SPECIALIZES_SPECULATIVE extends EdgeKind
  
  @js.native
  sealed trait TAGGED extends EdgeKind
  
  @js.native
  sealed trait TYPED extends EdgeKind
  
  @js.native
  sealed trait UNDEFINES extends EdgeKind
  
  /* "/kythe/edge/aliases" */ val ALIASES: typings.kythe.kytheMod.EdgeKind.ALIASES with String = js.native
  /* "/kythe/edge/aliases/root" */ val ALIASES_ROOT: typings.kythe.kytheMod.EdgeKind.ALIASES_ROOT with String = js.native
  /* "/kythe/edge/annotatedby" */ val ANNOTATED_BY: typings.kythe.kytheMod.EdgeKind.ANNOTATED_BY with String = js.native
  /* "/kythe/edge/bounded/lower" */ val BOUNDED_LOWER: typings.kythe.kytheMod.EdgeKind.BOUNDED_LOWER with String = js.native
  /* "/kythe/edge/bounded/upper" */ val BOUNDED_UPPER: typings.kythe.kytheMod.EdgeKind.BOUNDED_UPPER with String = js.native
  /* "/kythe/edge/childof" */ val CHILD_OF: typings.kythe.kytheMod.EdgeKind.CHILD_OF with String = js.native
  /* "/kythe/edge/childof/context" */ val CHILD_OF_CONTEXT: typings.kythe.kytheMod.EdgeKind.CHILD_OF_CONTEXT with String = js.native
  /* "/kythe/edge/completes" */ val COMPLETES: typings.kythe.kytheMod.EdgeKind.COMPLETES with String = js.native
  /* "/kythe/edge/completes/uniquely" */ val COMPLETES_UNIQUELY: typings.kythe.kytheMod.EdgeKind.COMPLETES_UNIQUELY with String = js.native
  /* "/kythe/edge/defines" */ val DEFINES: typings.kythe.kytheMod.EdgeKind.DEFINES with String = js.native
  /* "/kythe/edge/defines/binding" */ val DEFINES_BINDING: typings.kythe.kytheMod.EdgeKind.DEFINES_BINDING with String = js.native
  /* "/kythe/edge/depends" */ val DEPENDS: typings.kythe.kytheMod.EdgeKind.DEPENDS with String = js.native
  /* "/kythe/edge/documents" */ val DOCUMENTS: typings.kythe.kytheMod.EdgeKind.DOCUMENTS with String = js.native
  /* "/kythe/edge/exports" */ val EXPORTS: typings.kythe.kytheMod.EdgeKind.EXPORTS with String = js.native
  /* "/kythe/edge/extends" */ val EXTENDS: typings.kythe.kytheMod.EdgeKind.EXTENDS with String = js.native
  /* "/kythe/edge/generates" */ val GENERATES: typings.kythe.kytheMod.EdgeKind.GENERATES with String = js.native
  /* "/kythe/edge/imputes" */ val IMPUTES: typings.kythe.kytheMod.EdgeKind.IMPUTES with String = js.native
  /* "/kythe/edge/instantiates" */ val INSTANTIATES: typings.kythe.kytheMod.EdgeKind.INSTANTIATES with String = js.native
  /* "/kythe/edge/instantiates/speculative" */ val INSTANTIATES_SPECULATIVE: typings.kythe.kytheMod.EdgeKind.INSTANTIATES_SPECULATIVE with String = js.native
  /* "/kythe/edge/named" */ val NAMED: typings.kythe.kytheMod.EdgeKind.NAMED with String = js.native
  /* "/kythe/edge/overrides" */ val OVERRIDES: typings.kythe.kytheMod.EdgeKind.OVERRIDES with String = js.native
  /* "/kythe/edge/overrides/root" */ val OVERRIDES_ROOT: typings.kythe.kytheMod.EdgeKind.OVERRIDES_ROOT with String = js.native
  /* "/kythe/edge/overrides/transitive" */ val OVERRIDES_TRANSITIVE: typings.kythe.kytheMod.EdgeKind.OVERRIDES_TRANSITIVE with String = js.native
  /* "/kythe/edge/param" */ val PARAM: typings.kythe.kytheMod.EdgeKind.PARAM with String = js.native
  /* "/kythe/edge/ref" */ val REF: typings.kythe.kytheMod.EdgeKind.REF with String = js.native
  /* "/kythe/edge/ref/call" */ val REF_CALL: typings.kythe.kytheMod.EdgeKind.REF_CALL with String = js.native
  /* "/kythe/edge/ref/call/implicit" */ val REF_CALL_IMPLICIT: typings.kythe.kytheMod.EdgeKind.REF_CALL_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/doc" */ val REF_DOC: typings.kythe.kytheMod.EdgeKind.REF_DOC with String = js.native
  /* "/kythe/edge/ref/expands" */ val REF_EXPANDS: typings.kythe.kytheMod.EdgeKind.REF_EXPANDS with String = js.native
  /* "/kythe/edge/ref/expands/transitive" */ val REF_EXPANDS_TRANSITIVE: typings.kythe.kytheMod.EdgeKind.REF_EXPANDS_TRANSITIVE with String = js.native
  /* "/kythe/edge/ref/file" */ val REF_FILE: typings.kythe.kytheMod.EdgeKind.REF_FILE with String = js.native
  /* "/kythe/edge/ref/implicit" */ val REF_IMPLICIT: typings.kythe.kytheMod.EdgeKind.REF_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/imports" */ val REF_IMPORTS: typings.kythe.kytheMod.EdgeKind.REF_IMPORTS with String = js.native
  /* "/kythe/edge/ref/includes" */ val REF_INCLUDES: typings.kythe.kytheMod.EdgeKind.REF_INCLUDES with String = js.native
  /* "/kythe/edge/ref/init" */ val REF_INIT: typings.kythe.kytheMod.EdgeKind.REF_INIT with String = js.native
  /* "/kythe/edge/ref/init/implicit" */ val REF_INIT_IMPLICIT: typings.kythe.kytheMod.EdgeKind.REF_INIT_IMPLICIT with String = js.native
  /* "/kythe/edge/ref/queries" */ val REF_QUERIES: typings.kythe.kytheMod.EdgeKind.REF_QUERIES with String = js.native
  /* "/kythe/edge/satisfies" */ val SATISFIES: typings.kythe.kytheMod.EdgeKind.SATISFIES with String = js.native
  /* "/kythe/edge/specializes" */ val SPECIALIZES: typings.kythe.kytheMod.EdgeKind.SPECIALIZES with String = js.native
  /* "/kythe/edge/specializes/speculative" */ val SPECIALIZES_SPECULATIVE: typings.kythe.kytheMod.EdgeKind.SPECIALIZES_SPECULATIVE with String = js.native
  /* "/kythe/edge/tagged" */ val TAGGED: typings.kythe.kytheMod.EdgeKind.TAGGED with String = js.native
  /* "/kythe/edge/typed" */ val TYPED: typings.kythe.kytheMod.EdgeKind.TYPED with String = js.native
  /* "/kythe/edge/undefines" */ val UNDEFINES: typings.kythe.kytheMod.EdgeKind.UNDEFINES with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EdgeKind with String] = js.native
}

