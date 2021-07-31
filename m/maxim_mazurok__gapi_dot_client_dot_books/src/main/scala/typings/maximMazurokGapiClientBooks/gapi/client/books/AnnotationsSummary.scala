package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.LayerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsSummary extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[LayerId]] = js.undefined
}
object AnnotationsSummary {
  
  @scala.inline
  def apply(): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsSummary]
  }
  
  @scala.inline
  implicit class AnnotationsSummaryMutableBuilder[Self <: AnnotationsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[LayerId]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: LayerId*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
