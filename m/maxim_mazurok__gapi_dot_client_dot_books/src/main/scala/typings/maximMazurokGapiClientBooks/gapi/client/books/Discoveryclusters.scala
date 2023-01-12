package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Bannerwithcontentcontainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discoveryclusters extends StObject {
  
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer]] = js.undefined
  
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.undefined
  
  var totalClusters: js.UndefOr[Double] = js.undefined
}
object Discoveryclusters {
  
  inline def apply(): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discoveryclusters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Discoveryclusters] (val x: Self) extends AnyVal {
    
    inline def setClusters(value: js.Array[Bannerwithcontentcontainer]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: Bannerwithcontentcontainer*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTotalClusters(value: Double): Self = StObject.set(x, "totalClusters", value.asInstanceOf[js.Any])
    
    inline def setTotalClustersUndefined: Self = StObject.set(x, "totalClusters", js.undefined)
  }
}
