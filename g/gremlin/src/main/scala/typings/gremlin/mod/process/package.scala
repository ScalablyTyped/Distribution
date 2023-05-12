package typings.gremlin.mod.process

import typings.gremlin.mod.Newable
import typings.gremlin.mod.process.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def direction: Direction_ = ^.asInstanceOf[js.Dynamic].selectDynamic("direction").asInstanceOf[Direction_]

inline def merge: Merge_ = ^.asInstanceOf[js.Dynamic].selectDynamic("merge").asInstanceOf[Merge_]

inline def operator: Operator_ = ^.asInstanceOf[js.Dynamic].selectDynamic("operator").asInstanceOf[Operator_]

inline def statics: Statics_[GraphTraversal] = ^.asInstanceOf[js.Dynamic].selectDynamic("statics").asInstanceOf[Statics_[GraphTraversal]]

inline def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")().asInstanceOf[AnonymousTraversalSource[S]]
inline def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")(traversalSourceClass.asInstanceOf[js.Any]).asInstanceOf[AnonymousTraversalSource[S]]

inline def withOptions: WithOptions_ = ^.asInstanceOf[js.Dynamic].selectDynamic("withOptions").asInstanceOf[WithOptions_]
