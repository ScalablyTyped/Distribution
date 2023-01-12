package typings.hydraBox

import typings.clownface.mod.GraphPointer
import typings.node.streamMod.Readable
import typings.rdfExt.libDatasetMod.^
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hydra-box.hydra-box.Resource & {clownface (): std.Promise<clownface.clownface.GraphPointer<rdf-js.rdf-js.NamedNode<string>, rdf-ext.rdf-ext/lib/Dataset.^>>} */
  trait ResourceclownfacePromiseG extends StObject {
    
    def clownface(): js.Promise[GraphPointer[NamedNode[String], ^]]
    
    def dataset(): js.Promise[DatasetCore[Quad, Quad]]
    
    var prefetchDataset: DatasetCore[Quad, Quad]
    
    def quadStream(): Stream[Quad] & Readable
    
    var term: NamedNode[String]
    
    var types: Set[NamedNode[String]]
  }
  object ResourceclownfacePromiseG {
    
    inline def apply(
      clownface: () => js.Promise[GraphPointer[NamedNode[String], ^]],
      dataset: () => js.Promise[DatasetCore[Quad, Quad]],
      prefetchDataset: DatasetCore[Quad, Quad],
      quadStream: () => Stream[Quad] & Readable,
      term: NamedNode[String],
      types: Set[NamedNode[String]]
    ): ResourceclownfacePromiseG = {
      val __obj = js.Dynamic.literal(clownface = js.Any.fromFunction0(clownface), dataset = js.Any.fromFunction0(dataset), prefetchDataset = prefetchDataset.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), term = term.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceclownfacePromiseG]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceclownfacePromiseG] (val x: Self) extends AnyVal {
      
      inline def setClownface(value: () => js.Promise[GraphPointer[NamedNode[String], ^]]): Self = StObject.set(x, "clownface", js.Any.fromFunction0(value))
      
      inline def setDataset(value: () => js.Promise[DatasetCore[Quad, Quad]]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
      
      inline def setPrefetchDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "prefetchDataset", value.asInstanceOf[js.Any])
      
      inline def setQuadStream(value: () => Stream[Quad] & Readable): Self = StObject.set(x, "quadStream", js.Any.fromFunction0(value))
      
      inline def setTerm(value: NamedNode[String]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Set[NamedNode[String]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store extends StObject {
    
    var store: typings.rdfjsTypes.streamMod.Store[Quad]
  }
  object Store {
    
    inline def apply(store: typings.rdfjsTypes.streamMod.Store[Quad]): Store = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      inline def setStore(value: typings.rdfjsTypes.streamMod.Store[Quad]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
