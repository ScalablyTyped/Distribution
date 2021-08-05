package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node information for nodes appearing in a QueryPlan.plan_nodes.
  */
trait SchemaPlanNode extends StObject {
  
  /**
    * List of child node `index`es and their relationship to this parent.
    */
  var childLinks: js.UndefOr[js.Array[SchemaChildLink]] = js.undefined
  
  /**
    * The display name for the node.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The execution statistics associated with the node, contained in a group
    * of key-value pairs. Only present if the plan was returned as a result of
    * a profile query. For example, number of executions, number of rows/time
    * per execution etc.
    */
  var executionStats: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The `PlanNode`&#39;s index in node list.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to determine the type of node. May be needed for visualizing
    * different kinds of nodes differently. For example, If the node is a
    * SCALAR node, it will have a condensed representation which can be used to
    * directly embed a description of the node in its parent.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Attributes relevant to the node contained in a group of key-value pairs.
    * For example, a Parameter Reference node could have the following
    * information in its metadata:      { &quot;parameter_reference&quot;:
    * &quot;param1&quot;,       &quot;parameter_type&quot;: &quot;array&quot; }
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Condensed representation for SCALAR nodes.
    */
  var shortRepresentation: js.UndefOr[SchemaShortRepresentation] = js.undefined
}
object SchemaPlanNode {
  
  inline def apply(): SchemaPlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlanNode]
  }
  
  extension [Self <: SchemaPlanNode](x: Self) {
    
    inline def setChildLinks(value: js.Array[SchemaChildLink]): Self = StObject.set(x, "childLinks", value.asInstanceOf[js.Any])
    
    inline def setChildLinksUndefined: Self = StObject.set(x, "childLinks", js.undefined)
    
    inline def setChildLinksVarargs(value: SchemaChildLink*): Self = StObject.set(x, "childLinks", js.Array(value :_*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExecutionStats(value: StringDictionary[js.Any]): Self = StObject.set(x, "executionStats", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatsUndefined: Self = StObject.set(x, "executionStats", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setShortRepresentation(value: SchemaShortRepresentation): Self = StObject.set(x, "shortRepresentation", value.asInstanceOf[js.Any])
    
    inline def setShortRepresentationUndefined: Self = StObject.set(x, "shortRepresentation", js.undefined)
  }
}
