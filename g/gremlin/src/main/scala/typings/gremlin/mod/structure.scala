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
  class Edge protected () extends Element {
    def this(id: Double, outV: Vertex, label: String, inV: Vertex) = this()
    def this(id: Double, outV: Vertex, label: String, inV: Vertex, properties: js.Array[Property]) = this()
  }
  
  @JSImport("gremlin", "structure.Element")
  @js.native
  class Element protected () extends StObject {
    def this(id: Double, label: String) = this()
    
    def equals(other: Element): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Graph")
  @js.native
  class Graph () extends StObject {
    
    def traversal(): GraphTraversalSource[GraphTraversal] = js.native
  }
  
  @JSImport("gremlin", "structure.GraphSONReader")
  @js.native
  class GraphSONReader () extends StObject {
    def this(options: js.Any) = this()
    
    def read(obj: js.Any): js.Any = js.native
  }
  
  @JSImport("gremlin", "structure.GraphSONWriter")
  @js.native
  class GraphSONWriter () extends StObject {
    def this(options: js.Any) = this()
    
    def adaptObject(value: js.Any): js.Any = js.native
    
    def write(obj: js.Any): String = js.native
  }
  
  @JSImport("gremlin", "structure.Long")
  @js.native
  class Long protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @JSImport("gremlin", "structure.Path")
  @js.native
  class Path protected () extends StObject {
    def this(labels: js.Array[String], objects: js.Array[js.Any]) = this()
    
    def equals(other: Path): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Property")
  @js.native
  class Property protected () extends StObject {
    def this(key: String, value: js.Any) = this()
    
    def equals(other: Property): Boolean = js.native
  }
  
  @JSImport("gremlin", "structure.Vertex")
  @js.native
  class Vertex protected () extends Element {
    def this(id: Double, label: String) = this()
    def this(id: Double, label: String, properties: js.Array[VertexProperty]) = this()
  }
  
  @JSImport("gremlin", "structure.VertexProperty")
  @js.native
  class VertexProperty protected () extends Element {
    def this(id: Double, label: String, value: js.Any) = this()
    def this(id: Double, label: String, value: js.Any, properties: js.Array[Property]) = this()
  }
  
  @scala.inline
  def toLong(value: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("toLong")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  @scala.inline
  def toLong(value: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("toLong")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
}
