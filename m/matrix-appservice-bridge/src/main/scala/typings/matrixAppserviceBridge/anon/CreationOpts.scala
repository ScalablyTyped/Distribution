package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.remoteMod.RemoteRoom
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreationOpts extends StObject {
  
  var creationOpts: Record[String, _] = js.native
  
  var remote: js.UndefOr[RemoteRoom] = js.native
}
object CreationOpts {
  
  @scala.inline
  def apply(creationOpts: Record[String, _]): CreationOpts = {
    val __obj = js.Dynamic.literal(creationOpts = creationOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationOpts]
  }
  
  @scala.inline
  implicit class CreationOptsMutableBuilder[Self <: CreationOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationOpts(value: Record[String, _]): Self = StObject.set(x, "creationOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: RemoteRoom): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
