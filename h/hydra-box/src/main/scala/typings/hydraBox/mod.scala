package typings.hydraBox

import typings.clownface.mod.GraphPointer
import typings.express.mod.Request_
import typings.express.mod.Router
import typings.hydraBox.anon.ResourceclownfacePromiseG
import typings.hydraBox.apiMod.Api
import typings.hydraBox.middlewareMod.Options
import typings.node.streamMod.Readable
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.QuadPredicate
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hydra-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hydra-box", "Api")
  @js.native
  def Api: typings.hydraBox.apiMod.Api[DatasetCore[Quad, Quad]] = js.native
  inline def Api_=(x: Api[DatasetCore[Quad, Quad]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Api")(x.asInstanceOf[js.Any])
  
  @JSImport("hydra-box", "middleware")
  @js.native
  def middleware: js.Function2[/* api */ Api[DatasetCore[Quad, Quad]], /* options */ js.UndefOr[Options], Router] = js.native
  inline def middleware(api: Api[DatasetCore[Quad, Quad]]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(api.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def middleware(api: Api[DatasetCore[Quad, Quad]], options: Options): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def middleware_=(x: js.Function2[/* api */ Api[DatasetCore[Quad, Quad]], /* options */ js.UndefOr[Options], Router]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middleware")(x.asInstanceOf[js.Any])
  
  trait HydraBox extends StObject {
    
    var api: Api[DatasetCore[Quad, Quad]]
    
    var operation: GraphPointer[Term, DatasetCore[Quad, Quad]]
    
    var operations: js.Array[PotentialOperation]
    
    var resource: ResourceclownfacePromiseG
    
    var term: NamedNode[String]
  }
  object HydraBox {
    
    inline def apply(
      api: Api[DatasetCore[Quad, Quad]],
      operation: GraphPointer[Term, DatasetCore[Quad, Quad]],
      operations: js.Array[PotentialOperation],
      resource: ResourceclownfacePromiseG,
      term: NamedNode[String]
    ): HydraBox = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[HydraBox]
    }
    
    extension [Self <: HydraBox](x: Self) {
      
      inline def setApi(value: Api[DatasetCore[Quad, Quad]]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: GraphPointer[Term, DatasetCore[Quad, Quad]]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperations(value: js.Array[PotentialOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsVarargs(value: PotentialOperation*): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setResource(value: ResourceclownfacePromiseG): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: NamedNode[String]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait PotentialOperation extends StObject {
    
    var operation: GraphPointer[Term, DatasetCore[Quad, Quad]]
    
    var resource: Resource | PropertyResource
  }
  object PotentialOperation {
    
    inline def apply(operation: GraphPointer[Term, DatasetCore[Quad, Quad]], resource: Resource | PropertyResource): PotentialOperation = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotentialOperation]
    }
    
    extension [Self <: PotentialOperation](x: Self) {
      
      inline def setOperation(value: GraphPointer[Term, DatasetCore[Quad, Quad]]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Resource | PropertyResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyResource
    extends StObject
       with Resource {
    
    var `object`: NamedNode[String]
    
    var property: QuadPredicate
  }
  object PropertyResource {
    
    inline def apply(
      dataset: () => js.Promise[DatasetCore[Quad, Quad]],
      `object`: NamedNode[String],
      prefetchDataset: DatasetCore[Quad, Quad],
      property: QuadPredicate,
      quadStream: () => Stream[Quad] & Readable,
      term: NamedNode[String],
      types: Set[NamedNode[String]]
    ): PropertyResource = {
      val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction0(dataset), prefetchDataset = prefetchDataset.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), term = term.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyResource]
    }
    
    extension [Self <: PropertyResource](x: Self) {
      
      inline def setObject(value: NamedNode[String]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: QuadPredicate): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    def dataset(): js.Promise[DatasetCore[Quad, Quad]]
    
    var prefetchDataset: DatasetCore[Quad, Quad]
    
    def quadStream(): Stream[Quad] & Readable
    
    var term: NamedNode[String]
    
    var types: Set[NamedNode[String]]
  }
  object Resource {
    
    inline def apply(
      dataset: () => js.Promise[DatasetCore[Quad, Quad]],
      prefetchDataset: DatasetCore[Quad, Quad],
      quadStream: () => Stream[Quad] & Readable,
      term: NamedNode[String],
      types: Set[NamedNode[String]]
    ): Resource = {
      val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction0(dataset), prefetchDataset = prefetchDataset.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), term = term.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setDataset(value: () => js.Promise[DatasetCore[Quad, Quad]]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
      
      inline def setPrefetchDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "prefetchDataset", value.asInstanceOf[js.Any])
      
      inline def setQuadStream(value: () => Stream[Quad] & Readable): Self = StObject.set(x, "quadStream", js.Any.fromFunction0(value))
      
      inline def setTerm(value: NamedNode[String]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Set[NamedNode[String]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceLoader extends StObject {
    
    def forClassOperation(
      term: NamedNode[String],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[js.Array[Resource]]
    
    def forPropertyOperation(
      term: NamedNode[String],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[js.Array[PropertyResource]]
  }
  object ResourceLoader {
    
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
        ]) => js.Promise[js.Array[PropertyResource]]
    ): ResourceLoader = {
      val __obj = js.Dynamic.literal(forClassOperation = js.Any.fromFunction2(forClassOperation), forPropertyOperation = js.Any.fromFunction2(forPropertyOperation))
      __obj.asInstanceOf[ResourceLoader]
    }
    
    extension [Self <: ResourceLoader](x: Self) {
      
      inline def setForClassOperation(
        value: (NamedNode[String], Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => js.Promise[js.Array[Resource]]
      ): Self = StObject.set(x, "forClassOperation", js.Any.fromFunction2(value))
      
      inline def setForPropertyOperation(
        value: (NamedNode[String], Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => js.Promise[js.Array[PropertyResource]]
      ): Self = StObject.set(x, "forPropertyOperation", js.Any.fromFunction2(value))
    }
  }
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      var hydra: HydraBox
    }
    object Request {
      
      inline def apply(hydra: HydraBox): Request = {
        val __obj = js.Dynamic.literal(hydra = hydra.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setHydra(value: HydraBox): Self = StObject.set(x, "hydra", value.asInstanceOf[js.Any])
      }
    }
  }
}
