package typings.hydraBox

import typings.express.mod.Request_
import typings.hydraBox.anon.Store
import typings.hydraBox.mod.PropertyResource
import typings.hydraBox.mod.Resource
import typings.hydraBox.mod.ResourceLoader
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Term
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeResourceLoaderMod {
  
  // tslint:disable-next-line no-empty-interface
  @JSImport("hydra-box/StoreResourceLoader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StoreResourceLoader {
    def this(param0: Store) = this()
    
    /* CompleteClass */
    override def forClassOperation(
      term: NamedNode[String],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[js.Array[Resource]] = js.native
    
    /* CompleteClass */
    override def forPropertyOperation(
      term: NamedNode[String],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[js.Array[PropertyResource]] = js.native
    
    /* CompleteClass */
    override def load(term: Term): js.Promise[Resource] = js.native
  }
  
  // tslint:disable-next-line no-empty-interface
  trait StoreResourceLoader
    extends StObject
       with ResourceLoader {
    
    def load(term: Term): js.Promise[Resource]
  }
  object StoreResourceLoader {
    
    inline def apply(
      forClassOperation: (NamedNode[String], Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]) => js.Promise[js.Array[Resource]],
      forPropertyOperation: (NamedNode[String], Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]) => js.Promise[js.Array[PropertyResource]],
      load: Term => js.Promise[Resource]
    ): StoreResourceLoader = {
      val __obj = js.Dynamic.literal(forClassOperation = js.Any.fromFunction2(forClassOperation), forPropertyOperation = js.Any.fromFunction2(forPropertyOperation), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[StoreResourceLoader]
    }
    
    extension [Self <: StoreResourceLoader](x: Self) {
      
      inline def setLoad(value: Term => js.Promise[Resource]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
}
