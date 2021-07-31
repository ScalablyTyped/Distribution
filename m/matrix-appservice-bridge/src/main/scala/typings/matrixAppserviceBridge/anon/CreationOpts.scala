package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.remoteMod.RemoteRoom
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationOpts extends StObject {
  
  var creationOpts: Record[String, js.Any]
  
  var remote: js.UndefOr[RemoteRoom] = js.undefined
}
object CreationOpts {
  
  @scala.inline
  def apply(creationOpts: Record[String, js.Any]): CreationOpts = {
    val __obj = js.Dynamic.literal(creationOpts = creationOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationOpts]
  }
  
  @scala.inline
  implicit class CreationOptsMutableBuilder[Self <: CreationOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationOpts(value: Record[String, js.Any]): Self = StObject.set(x, "creationOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: RemoteRoom): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
