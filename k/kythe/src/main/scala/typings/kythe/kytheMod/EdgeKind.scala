package typings.kythe.kytheMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EdgeKind with String] = js.native
  /* "/kythe/edge/aliases" */ @js.native
  object ALIASES extends TopLevel[ALIASES with String]
  
  /* "/kythe/edge/aliases/root" */ @js.native
  object ALIASES_ROOT extends TopLevel[ALIASES_ROOT with String]
  
  /* "/kythe/edge/annotatedby" */ @js.native
  object ANNOTATED_BY extends TopLevel[ANNOTATED_BY with String]
  
  /* "/kythe/edge/bounded/lower" */ @js.native
  object BOUNDED_LOWER extends TopLevel[BOUNDED_LOWER with String]
  
  /* "/kythe/edge/bounded/upper" */ @js.native
  object BOUNDED_UPPER extends TopLevel[BOUNDED_UPPER with String]
  
  /* "/kythe/edge/childof" */ @js.native
  object CHILD_OF extends TopLevel[CHILD_OF with String]
  
  /* "/kythe/edge/childof/context" */ @js.native
  object CHILD_OF_CONTEXT extends TopLevel[CHILD_OF_CONTEXT with String]
  
  /* "/kythe/edge/completes" */ @js.native
  object COMPLETES extends TopLevel[COMPLETES with String]
  
  /* "/kythe/edge/completes/uniquely" */ @js.native
  object COMPLETES_UNIQUELY extends TopLevel[COMPLETES_UNIQUELY with String]
  
  /* "/kythe/edge/defines" */ @js.native
  object DEFINES extends TopLevel[DEFINES with String]
  
  /* "/kythe/edge/defines/binding" */ @js.native
  object DEFINES_BINDING extends TopLevel[DEFINES_BINDING with String]
  
  /* "/kythe/edge/depends" */ @js.native
  object DEPENDS extends TopLevel[DEPENDS with String]
  
  /* "/kythe/edge/documents" */ @js.native
  object DOCUMENTS extends TopLevel[DOCUMENTS with String]
  
  /* "/kythe/edge/exports" */ @js.native
  object EXPORTS extends TopLevel[EXPORTS with String]
  
  /* "/kythe/edge/extends" */ @js.native
  object EXTENDS extends TopLevel[EXTENDS with String]
  
  /* "/kythe/edge/generates" */ @js.native
  object GENERATES extends TopLevel[GENERATES with String]
  
  /* "/kythe/edge/imputes" */ @js.native
  object IMPUTES extends TopLevel[IMPUTES with String]
  
  /* "/kythe/edge/instantiates" */ @js.native
  object INSTANTIATES extends TopLevel[INSTANTIATES with String]
  
  /* "/kythe/edge/instantiates/speculative" */ @js.native
  object INSTANTIATES_SPECULATIVE extends TopLevel[INSTANTIATES_SPECULATIVE with String]
  
  /* "/kythe/edge/named" */ @js.native
  object NAMED extends TopLevel[NAMED with String]
  
  /* "/kythe/edge/overrides" */ @js.native
  object OVERRIDES extends TopLevel[OVERRIDES with String]
  
  /* "/kythe/edge/overrides/root" */ @js.native
  object OVERRIDES_ROOT extends TopLevel[OVERRIDES_ROOT with String]
  
  /* "/kythe/edge/overrides/transitive" */ @js.native
  object OVERRIDES_TRANSITIVE extends TopLevel[OVERRIDES_TRANSITIVE with String]
  
  /* "/kythe/edge/param" */ @js.native
  object PARAM extends TopLevel[PARAM with String]
  
  /* "/kythe/edge/ref" */ @js.native
  object REF extends TopLevel[REF with String]
  
  /* "/kythe/edge/ref/call" */ @js.native
  object REF_CALL extends TopLevel[REF_CALL with String]
  
  /* "/kythe/edge/ref/call/implicit" */ @js.native
  object REF_CALL_IMPLICIT extends TopLevel[REF_CALL_IMPLICIT with String]
  
  /* "/kythe/edge/ref/doc" */ @js.native
  object REF_DOC extends TopLevel[REF_DOC with String]
  
  /* "/kythe/edge/ref/expands" */ @js.native
  object REF_EXPANDS extends TopLevel[REF_EXPANDS with String]
  
  /* "/kythe/edge/ref/expands/transitive" */ @js.native
  object REF_EXPANDS_TRANSITIVE extends TopLevel[REF_EXPANDS_TRANSITIVE with String]
  
  /* "/kythe/edge/ref/file" */ @js.native
  object REF_FILE extends TopLevel[REF_FILE with String]
  
  /* "/kythe/edge/ref/implicit" */ @js.native
  object REF_IMPLICIT extends TopLevel[REF_IMPLICIT with String]
  
  /* "/kythe/edge/ref/imports" */ @js.native
  object REF_IMPORTS extends TopLevel[REF_IMPORTS with String]
  
  /* "/kythe/edge/ref/includes" */ @js.native
  object REF_INCLUDES extends TopLevel[REF_INCLUDES with String]
  
  /* "/kythe/edge/ref/init" */ @js.native
  object REF_INIT extends TopLevel[REF_INIT with String]
  
  /* "/kythe/edge/ref/init/implicit" */ @js.native
  object REF_INIT_IMPLICIT extends TopLevel[REF_INIT_IMPLICIT with String]
  
  /* "/kythe/edge/ref/queries" */ @js.native
  object REF_QUERIES extends TopLevel[REF_QUERIES with String]
  
  /* "/kythe/edge/satisfies" */ @js.native
  object SATISFIES extends TopLevel[SATISFIES with String]
  
  /* "/kythe/edge/specializes" */ @js.native
  object SPECIALIZES extends TopLevel[SPECIALIZES with String]
  
  /* "/kythe/edge/specializes/speculative" */ @js.native
  object SPECIALIZES_SPECULATIVE extends TopLevel[SPECIALIZES_SPECULATIVE with String]
  
  /* "/kythe/edge/tagged" */ @js.native
  object TAGGED extends TopLevel[TAGGED with String]
  
  /* "/kythe/edge/typed" */ @js.native
  object TYPED extends TopLevel[TYPED with String]
  
  /* "/kythe/edge/undefines" */ @js.native
  object UNDEFINES extends TopLevel[UNDEFINES with String]
  
}

