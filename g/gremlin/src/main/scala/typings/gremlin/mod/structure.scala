package typings.gremlin.mod

import typings.gremlin.mod.process.GraphTraversal
import typings.gremlin.mod.process.GraphTraversalSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structure {
  
  @JSImport("gremlin", "structure")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gremlin", "structure.Edge")
  @js.native
  open class Edge protected () extends Element {
    def this(id: Double, outV: Vertex, label: String, inV: Vertex) = this()
    def this(id: Double, outV: Vertex, label: String, inV: Vertex, properties: js.Array[Property]) = this()
  }
  
  @JSImport("gremlin", "structure.Element")
  @js.native
  open class Element protected () extends StObject {
    def this(id: Double, label: String) = this()
    
    def equals(other: Element): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Graph")
  @js.native
  open class Graph () extends StObject {
    
    def traversal(): GraphTraversalSource[GraphTraversal] = js.native
  }
  
  @JSImport("gremlin", "structure.Long")
  @js.native
  open class Long protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @JSImport("gremlin", "structure.Path")
  @js.native
  open class Path protected () extends StObject {
    def this(labels: js.Array[String], objects: js.Array[Any]) = this()
    
    def equals(other: Path): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Property")
  @js.native
  open class Property protected () extends StObject {
    def this(key: String, value: Any) = this()
    
    def equals(other: Property): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Vertex")
  @js.native
  open class Vertex protected () extends Element {
    def this(id: Double, label: String) = this()
    def this(id: Double, label: String, properties: js.Array[VertexProperty]) = this()
  }
  
  @JSImport("gremlin", "structure.VertexProperty")
  @js.native
  open class VertexProperty protected () extends Element {
    def this(id: Double, label: String, value: Any) = this()
    def this(id: Double, label: String, value: Any, properties: js.Array[Property]) = this()
  }
  
  object io {
    
    @JSImport("gremlin", "structure.io.GraphSONReader")
    @js.native
    open class GraphSONReader () extends StObject {
      def this(options: Any) = this()
      
      def read(obj: Any): Any = js.native
    }
    
    @JSImport("gremlin", "structure.io.GraphSONWriter")
    @js.native
    open class GraphSONWriter () extends StObject {
      def this(options: Any) = this()
      
      def adaptObject(value: Any): Any = js.native
      
      def write(obj: Any): String = js.native
    }
  }
  
  inline def toLong(value: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("toLong")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def toLong(value: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("toLong")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
}
