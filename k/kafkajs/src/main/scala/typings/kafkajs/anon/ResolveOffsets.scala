package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOffsets extends StObject {
  
  var groupId: String
  
  var resolveOffsets: js.UndefOr[Boolean] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}
object ResolveOffsets {
  
  inline def apply(groupId: String): ResolveOffsets = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveOffsets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveOffsets] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setResolveOffsets(value: Boolean): Self = StObject.set(x, "resolveOffsets", value.asInstanceOf[js.Any])
    
    inline def setResolveOffsetsUndefined: Self = StObject.set(x, "resolveOffsets", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
