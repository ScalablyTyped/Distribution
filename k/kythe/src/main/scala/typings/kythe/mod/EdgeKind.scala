package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EdgeKind extends StObject
@JSImport("kythe", "EdgeKind")
@js.native
object EdgeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EdgeKind with String] = js.native
  
  @js.native
  sealed trait ALIASES extends EdgeKind
  /* "/kythe/edge/aliases" */ val ALIASES: typings.kythe.mod.EdgeKind.ALIASES with String = js.native
  
  @js.native
  sealed trait ALIASES_ROOT extends EdgeKind
  /* "/kythe/edge/aliases/root" */ val ALIASES_ROOT: typings.kythe.mod.EdgeKind.ALIASES_ROOT with String = js.native
  
  @js.native
  sealed trait ANNOTATED_BY extends EdgeKind
  /* "/kythe/edge/annotatedby" */ val ANNOTATED_BY: typings.kythe.mod.EdgeKind.ANNOTATED_BY with String = js.native
  
  @js.native
  sealed trait BOUNDED_LOWER extends EdgeKind
  /* "/kythe/edge/bounded/lower" */ val BOUNDED_LOWER: typings.kythe.mod.EdgeKind.BOUNDED_LOWER with String = js.native
  
  @js.native
  sealed trait BOUNDED_UPPER extends EdgeKind
  /* "/kythe/edge/bounded/upper" */ val BOUNDED_UPPER: typings.kythe.mod.EdgeKind.BOUNDED_UPPER with String = js.native
  
  @js.native
  sealed trait CHILD_OF extends EdgeKind
  /* "/kythe/edge/childof" */ val CHILD_OF: typings.kythe.mod.EdgeKind.CHILD_OF with String = js.native
  
  @js.native
  sealed trait CHILD_OF_CONTEXT extends EdgeKind
  /* "/kythe/edge/childof/context" */ val CHILD_OF_CONTEXT: typings.kythe.mod.EdgeKind.CHILD_OF_CONTEXT with String = js.native
  
  @js.native
  sealed trait COMPLETES extends EdgeKind
  /* "/kythe/edge/completes" */ val COMPLETES: typings.kythe.mod.EdgeKind.COMPLETES with String = js.native
  
  @js.native
  sealed trait COMPLETES_UNIQUELY extends EdgeKind
  /* "/kythe/edge/completes/uniquely" */ val COMPLETES_UNIQUELY: typings.kythe.mod.EdgeKind.COMPLETES_UNIQUELY with String = js.native
  
  @js.native
  sealed trait DEFINES extends EdgeKind
  /* "/kythe/edge/defines" */ val DEFINES: typings.kythe.mod.EdgeKind.DEFINES with String = js.native
  
  @js.native
  sealed trait DEFINES_BINDING extends EdgeKind
  /* "/kythe/edge/defines/binding" */ val DEFINES_BINDING: typings.kythe.mod.EdgeKind.DEFINES_BINDING with String = js.native
  
  @js.native
  sealed trait DEPENDS extends EdgeKind
  /* "/kythe/edge/depends" */ val DEPENDS: typings.kythe.mod.EdgeKind.DEPENDS with String = js.native
  
  @js.native
  sealed trait DOCUMENTS extends EdgeKind
  /* "/kythe/edge/documents" */ val DOCUMENTS: typings.kythe.mod.EdgeKind.DOCUMENTS with String = js.native
  
  @js.native
  sealed trait EXPORTS extends EdgeKind
  /* "/kythe/edge/exports" */ val EXPORTS: typings.kythe.mod.EdgeKind.EXPORTS with String = js.native
  
  @js.native
  sealed trait EXTENDS extends EdgeKind
  /* "/kythe/edge/extends" */ val EXTENDS: typings.kythe.mod.EdgeKind.EXTENDS with String = js.native
  
  @js.native
  sealed trait GENERATES extends EdgeKind
  /* "/kythe/edge/generates" */ val GENERATES: typings.kythe.mod.EdgeKind.GENERATES with String = js.native
  
  @js.native
  sealed trait IMPUTES extends EdgeKind
  /* "/kythe/edge/imputes" */ val IMPUTES: typings.kythe.mod.EdgeKind.IMPUTES with String = js.native
  
  @js.native
  sealed trait INSTANTIATES extends EdgeKind
  /* "/kythe/edge/instantiates" */ val INSTANTIATES: typings.kythe.mod.EdgeKind.INSTANTIATES with String = js.native
  
  @js.native
  sealed trait INSTANTIATES_SPECULATIVE extends EdgeKind
  /* "/kythe/edge/instantiates/speculative" */ val INSTANTIATES_SPECULATIVE: typings.kythe.mod.EdgeKind.INSTANTIATES_SPECULATIVE with String = js.native
  
  @js.native
  sealed trait NAMED extends EdgeKind
  /* "/kythe/edge/named" */ val NAMED: typings.kythe.mod.EdgeKind.NAMED with String = js.native
  
  @js.native
  sealed trait OVERRIDES extends EdgeKind
  /* "/kythe/edge/overrides" */ val OVERRIDES: typings.kythe.mod.EdgeKind.OVERRIDES with String = js.native
  
  @js.native
  sealed trait OVERRIDES_ROOT extends EdgeKind
  /* "/kythe/edge/overrides/root" */ val OVERRIDES_ROOT: typings.kythe.mod.EdgeKind.OVERRIDES_ROOT with String = js.native
  
  @js.native
  sealed trait OVERRIDES_TRANSITIVE extends EdgeKind
  /* "/kythe/edge/overrides/transitive" */ val OVERRIDES_TRANSITIVE: typings.kythe.mod.EdgeKind.OVERRIDES_TRANSITIVE with String = js.native
  
  @js.native
  sealed trait PARAM extends EdgeKind
  /* "/kythe/edge/param" */ val PARAM: typings.kythe.mod.EdgeKind.PARAM with String = js.native
  
  @js.native
  sealed trait REF extends EdgeKind
  /* "/kythe/edge/ref" */ val REF: typings.kythe.mod.EdgeKind.REF with String = js.native
  
  @js.native
  sealed trait REF_CALL extends EdgeKind
  /* "/kythe/edge/ref/call" */ val REF_CALL: typings.kythe.mod.EdgeKind.REF_CALL with String = js.native
  
  @js.native
  sealed trait REF_CALL_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/call/implicit" */ val REF_CALL_IMPLICIT: typings.kythe.mod.EdgeKind.REF_CALL_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_DOC extends EdgeKind
  /* "/kythe/edge/ref/doc" */ val REF_DOC: typings.kythe.mod.EdgeKind.REF_DOC with String = js.native
  
  @js.native
  sealed trait REF_EXPANDS extends EdgeKind
  /* "/kythe/edge/ref/expands" */ val REF_EXPANDS: typings.kythe.mod.EdgeKind.REF_EXPANDS with String = js.native
  
  @js.native
  sealed trait REF_EXPANDS_TRANSITIVE extends EdgeKind
  /* "/kythe/edge/ref/expands/transitive" */ val REF_EXPANDS_TRANSITIVE: typings.kythe.mod.EdgeKind.REF_EXPANDS_TRANSITIVE with String = js.native
  
  @js.native
  sealed trait REF_FILE extends EdgeKind
  /* "/kythe/edge/ref/file" */ val REF_FILE: typings.kythe.mod.EdgeKind.REF_FILE with String = js.native
  
  @js.native
  sealed trait REF_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/implicit" */ val REF_IMPLICIT: typings.kythe.mod.EdgeKind.REF_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_IMPORTS extends EdgeKind
  /* "/kythe/edge/ref/imports" */ val REF_IMPORTS: typings.kythe.mod.EdgeKind.REF_IMPORTS with String = js.native
  
  @js.native
  sealed trait REF_INCLUDES extends EdgeKind
  /* "/kythe/edge/ref/includes" */ val REF_INCLUDES: typings.kythe.mod.EdgeKind.REF_INCLUDES with String = js.native
  
  @js.native
  sealed trait REF_INIT extends EdgeKind
  /* "/kythe/edge/ref/init" */ val REF_INIT: typings.kythe.mod.EdgeKind.REF_INIT with String = js.native
  
  @js.native
  sealed trait REF_INIT_IMPLICIT extends EdgeKind
  /* "/kythe/edge/ref/init/implicit" */ val REF_INIT_IMPLICIT: typings.kythe.mod.EdgeKind.REF_INIT_IMPLICIT with String = js.native
  
  @js.native
  sealed trait REF_QUERIES extends EdgeKind
  /* "/kythe/edge/ref/queries" */ val REF_QUERIES: typings.kythe.mod.EdgeKind.REF_QUERIES with String = js.native
  
  @js.native
  sealed trait SATISFIES extends EdgeKind
  /* "/kythe/edge/satisfies" */ val SATISFIES: typings.kythe.mod.EdgeKind.SATISFIES with String = js.native
  
  @js.native
  sealed trait SPECIALIZES extends EdgeKind
  /* "/kythe/edge/specializes" */ val SPECIALIZES: typings.kythe.mod.EdgeKind.SPECIALIZES with String = js.native
  
  @js.native
  sealed trait SPECIALIZES_SPECULATIVE extends EdgeKind
  /* "/kythe/edge/specializes/speculative" */ val SPECIALIZES_SPECULATIVE: typings.kythe.mod.EdgeKind.SPECIALIZES_SPECULATIVE with String = js.native
  
  @js.native
  sealed trait TAGGED extends EdgeKind
  /* "/kythe/edge/tagged" */ val TAGGED: typings.kythe.mod.EdgeKind.TAGGED with String = js.native
  
  @js.native
  sealed trait TYPED extends EdgeKind
  /* "/kythe/edge/typed" */ val TYPED: typings.kythe.mod.EdgeKind.TYPED with String = js.native
  
  @js.native
  sealed trait UNDEFINES extends EdgeKind
  /* "/kythe/edge/undefines" */ val UNDEFINES: typings.kythe.mod.EdgeKind.UNDEFINES with String = js.native
}
