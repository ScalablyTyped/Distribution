package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupState extends StObject {
  
  var metadata: Buffer
  
  var name: String
}
object GroupState {
  
  inline def apply(metadata: Buffer, name: String): GroupState = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupState] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: Buffer): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
