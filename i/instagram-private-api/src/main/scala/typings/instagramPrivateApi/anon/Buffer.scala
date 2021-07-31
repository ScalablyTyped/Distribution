package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.mod.IgApiClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: typings.node.Buffer
  
  var client: IgApiClient
}
object Buffer {
  
  @scala.inline
  def apply(buffer: typings.node.Buffer, client: IgApiClient): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: typings.node.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: IgApiClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
  }
}
