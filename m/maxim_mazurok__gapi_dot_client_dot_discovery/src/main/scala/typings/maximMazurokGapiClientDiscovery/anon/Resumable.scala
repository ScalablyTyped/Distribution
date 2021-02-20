package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resumable extends StObject {
  
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[Multipart] = js.native
  
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[Multipart] = js.native
}
object Resumable {
  
  @scala.inline
  def apply(): Resumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resumable]
  }
  
  @scala.inline
  implicit class ResumableMutableBuilder[Self <: Resumable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResumable(value: Multipart): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    @scala.inline
    def setSimple(value: Multipart): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
