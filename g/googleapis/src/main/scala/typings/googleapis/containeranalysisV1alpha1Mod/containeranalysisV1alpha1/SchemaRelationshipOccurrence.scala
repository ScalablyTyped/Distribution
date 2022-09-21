package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelationshipOccurrence extends StObject {
  
  /**
    * A place for the SPDX file creator to record any general comments about the relationship
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of relationship between the source and target SPDX elements
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelationshipOccurrence {
  
  inline def apply(): SchemaRelationshipOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipOccurrence]
  }
  
  extension [Self <: SchemaRelationshipOccurrence](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
