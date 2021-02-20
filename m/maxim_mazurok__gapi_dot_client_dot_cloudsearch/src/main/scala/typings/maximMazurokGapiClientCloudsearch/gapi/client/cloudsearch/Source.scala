package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  /** Source name for content indexed by the Indexing API. */
  var name: js.UndefOr[String] = js.native
  
  /** Predefined content source for Google Apps. */
  var predefinedSource: js.UndefOr[String] = js.native
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPredefinedSource(value: String): Self = StObject.set(x, "predefinedSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedSourceUndefined: Self = StObject.set(x, "predefinedSource", js.undefined)
  }
}
