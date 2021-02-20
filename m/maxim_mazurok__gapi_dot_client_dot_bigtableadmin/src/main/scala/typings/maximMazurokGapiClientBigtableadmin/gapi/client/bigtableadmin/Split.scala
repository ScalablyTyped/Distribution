package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Split extends StObject {
  
  /** Row key to use as an initial tablet boundary. */
  var key: js.UndefOr[String] = js.native
}
object Split {
  
  @scala.inline
  def apply(): Split = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Split]
  }
  
  @scala.inline
  implicit class SplitMutableBuilder[Self <: Split] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
