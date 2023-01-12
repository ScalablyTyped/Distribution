package typings.mapboxMapboxSdk.anon

import typings.node.processMod.global.NodeJS.ReadStream
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var file: Blob | js.typedarray.ArrayBuffer | String | ReadStream
  
  var id: String
  
  var ownerId: js.UndefOr[String] = js.undefined
}
object Id {
  
  inline def apply(file: Blob | js.typedarray.ArrayBuffer | String | ReadStream, id: String): Id = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Blob | js.typedarray.ArrayBuffer | String | ReadStream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
  }
}
