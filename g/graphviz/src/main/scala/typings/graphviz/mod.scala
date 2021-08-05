package typings.graphviz

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphviz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digraph(id: String): Graph_ = ^.asInstanceOf[js.Dynamic].applyDynamic("digraph")(id.asInstanceOf[js.Any]).asInstanceOf[Graph_]
  
  inline def graph(id: String): Graph_ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(id.asInstanceOf[js.Any]).asInstanceOf[Graph_]
  
  inline def parse(path: String, callback: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(path: String, callback: ParseCallback, errback: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Edge = HasAttributes
  
  type ErrorCallback = js.Function3[/* code */ Double, /* stdout */ String, /* stderr */ String, Unit]
  
  @js.native
  trait Graph_
    extends StObject
       with HasAttributes {
    
    // Subgraph (cluster) API
    def addCluster(id: String): Graph_ = js.native
    
    def addEdge(nodeOne: String, nodeTwo: String): Edge = js.native
    def addEdge(nodeOne: String, nodeTwo: String, attrs: Options): Edge = js.native
    def addEdge(nodeOne: String, nodeTwo: Node): Edge = js.native
    def addEdge(nodeOne: String, nodeTwo: Node, attrs: Options): Edge = js.native
    def addEdge(nodeOne: Node, nodeTwo: String): Edge = js.native
    def addEdge(nodeOne: Node, nodeTwo: String, attrs: Options): Edge = js.native
    def addEdge(nodeOne: Node, nodeTwo: Node): Edge = js.native
    def addEdge(nodeOne: Node, nodeTwo: Node, attrs: Options): Edge = js.native
    
    def addNode(id: String): Node = js.native
    def addNode(id: String, attrs: js.Any): Node = js.native
    
    def clusterCount(): Double = js.native
    
    def edgeCount(): Double = js.native
    
    def getCluster(id: String): Graph_ = js.native
    
    def getEdgeAttribut(name: String): js.Any = js.native
    
    def getNodeAttribut(name: String): js.Any = js.native
    
    def nodeCount(): Double = js.native
    
    def output(type_options: String, filename_callback: String): Unit = js.native
    def output(type_options: String, filename_callback: String, errback: ErrorCallback): Unit = js.native
    def output(type_options: String, filename_callback: OutputCallback): Unit = js.native
    def output(type_options: String, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
    def output(type_options: RenderOptions, filename_callback: String): Unit = js.native
    def output(type_options: RenderOptions, filename_callback: String, errback: ErrorCallback): Unit = js.native
    def output(type_options: RenderOptions, filename_callback: OutputCallback): Unit = js.native
    def output(type_options: RenderOptions, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
    
    def render(type_options: String, filename_callback: String): Unit = js.native
    def render(type_options: String, filename_callback: String, errback: ErrorCallback): Unit = js.native
    def render(type_options: String, filename_callback: OutputCallback): Unit = js.native
    def render(type_options: String, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
    def render(type_options: RenderOptions, filename_callback: String): Unit = js.native
    def render(type_options: RenderOptions, filename_callback: String, errback: ErrorCallback): Unit = js.native
    def render(type_options: RenderOptions, filename_callback: OutputCallback): Unit = js.native
    def render(type_options: RenderOptions, filename_callback: OutputCallback, errback: ErrorCallback): Unit = js.native
    
    def setEdgeAttribut(name: String, value: js.Any): Unit = js.native
    
    // Path containing Graphviz binaries.
    def setGraphVizPath(directoryPath: String): Unit = js.native
    
    def setNodeAttribut(name: String, value: js.Any): Unit = js.native
    
    def to_dot(): String = js.native
    
    var use: RenderEngine = js.native
  }
  
  trait HasAttributes extends StObject {
    
    def get(name: String): PossibleValue
    
    def set(name: String, value: PossibleValue): Unit
  }
  object HasAttributes {
    
    inline def apply(get: String => PossibleValue, set: (String, PossibleValue) => Unit): HasAttributes = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HasAttributes]
    }
    
    extension [Self <: HasAttributes](x: Self) {
      
      inline def setGet(value: String => PossibleValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, PossibleValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Node
    extends StObject
       with HasAttributes {
    
    val id: String
  }
  object Node {
    
    inline def apply(get: String => PossibleValue, id: String, set: (String, PossibleValue) => Unit): Node = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = StringDictionary[PossibleValue]
  
  type OutputCallback = js.Function1[/* data */ String, Unit]
  
  type ParseCallback = js.Function1[/* graph */ Graph_, Unit]
  
  type PossibleValue = String | Double | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.graphviz.graphvizStrings.dot
    - typings.graphviz.graphvizStrings.neato
    - typings.graphviz.graphvizStrings.circo
    - typings.graphviz.graphvizStrings.fdp
    - typings.graphviz.graphvizStrings.osage
    - typings.graphviz.graphvizStrings.twopi
  */
  trait RenderEngine extends StObject
  object RenderEngine {
    
    inline def circo: typings.graphviz.graphvizStrings.circo = "circo".asInstanceOf[typings.graphviz.graphvizStrings.circo]
    
    inline def dot: typings.graphviz.graphvizStrings.dot = "dot".asInstanceOf[typings.graphviz.graphvizStrings.dot]
    
    inline def fdp: typings.graphviz.graphvizStrings.fdp = "fdp".asInstanceOf[typings.graphviz.graphvizStrings.fdp]
    
    inline def neato: typings.graphviz.graphvizStrings.neato = "neato".asInstanceOf[typings.graphviz.graphvizStrings.neato]
    
    inline def osage: typings.graphviz.graphvizStrings.osage = "osage".asInstanceOf[typings.graphviz.graphvizStrings.osage]
    
    inline def twopi: typings.graphviz.graphvizStrings.twopi = "twopi".asInstanceOf[typings.graphviz.graphvizStrings.twopi]
  }
  
  trait RenderOptions extends StObject {
    
    /**
      * edge options
      */
    var E: js.UndefOr[Options] = js.undefined
    
    /**
      * graph options
      */
    var G: js.UndefOr[Options] = js.undefined
    
    /**
      * node options
      */
    var N: js.UndefOr[Options] = js.undefined
    
    /**
      * Graphviz path
      * @default $PATH
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * graphviz output file type
      */
    var `type`: RenderType
    
    /**
      * Graphviz command to use
      * @default dot
      */
    var use: js.UndefOr[RenderEngine] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(`type`: RenderType): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setE(value: Options): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      inline def setG(value: Options): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "G", js.undefined)
      
      inline def setN(value: Options): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: RenderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUse(value: RenderEngine): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
  
  type RenderType = String
}
