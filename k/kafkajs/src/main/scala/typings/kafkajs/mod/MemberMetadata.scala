package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberMetadata extends StObject {
  
  var topics: js.Array[String]
  
  var userData: Buffer
  
  var version: Double
}
object MemberMetadata {
  
  inline def apply(topics: js.Array[String], userData: Buffer, version: Double): MemberMetadata = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberMetadata] (val x: Self) extends AnyVal {
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setUserData(value: Buffer): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
