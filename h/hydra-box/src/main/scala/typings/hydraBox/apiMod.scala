package typings.hydraBox

import typings.rdfLoadersRegistry.mod.LoaderRegistry
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("hydra-box/Api", JSImport.Namespace)
  @js.native
  open class ^[D /* <: DatasetCore[Quad, Quad] */] ()
    extends StObject
       with Api[D] {
    def this(options: ApiInit[D]) = this()
  }
  @JSImport("hydra-box/Api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromFile[D /* <: DatasetCore[Quad, Quad] */](fielPath: String): Api[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fielPath.asInstanceOf[js.Any]).asInstanceOf[Api[D]]
  inline def fromFile[D /* <: DatasetCore[Quad, Quad] */](fielPath: String, options: ApiInit[D]): Api[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fielPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api[D]]
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait Api[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var codePath: String = js.native
    
    var dataset: D = js.native
    
    def fromFile(filePath: String): this.type = js.native
    def fromFile(filePath: String, options: ApiInit[DatasetCore[Quad, Quad]]): this.type = js.native
    
    var graph: js.UndefOr[NamedNode[String]] = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    var initialized: Boolean = js.native
    
    var loaderRegistry: LoaderRegistry = js.native
    
    var path: String = js.native
    
    def rebase(from: String, to: String): this.type = js.native
    def rebase(from: String, to: NamedNode[String]): this.type = js.native
    def rebase(from: NamedNode[String], to: String): this.type = js.native
    def rebase(from: NamedNode[String], to: NamedNode[String]): this.type = js.native
    
    var term: js.UndefOr[NamedNode[String]] = js.native
  }
  
  trait ApiInit[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var codePath: js.UndefOr[String] = js.undefined
    
    var dataset: js.UndefOr[D] = js.undefined
    
    var graph: js.UndefOr[NamedNode[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var term: js.UndefOr[Term] = js.undefined
  }
  object ApiInit {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](): ApiInit[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiInit[D]]
    }
    
    extension [Self <: ApiInit[?], D /* <: DatasetCore[Quad, Quad] */](x: Self & ApiInit[D]) {
      
      inline def setCodePath(value: String): Self = StObject.set(x, "codePath", value.asInstanceOf[js.Any])
      
      inline def setCodePathUndefined: Self = StObject.set(x, "codePath", js.undefined)
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setGraph(value: NamedNode[String]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTerm(value: Term): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    }
  }
}
