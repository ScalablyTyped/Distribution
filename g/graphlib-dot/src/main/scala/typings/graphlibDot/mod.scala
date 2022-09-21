package typings.graphlibDot

import typings.graphlib.mod.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphlib-dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object graphlibDot {
      
      @JSGlobal("graphlibDot")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Contains the version of the graphlib library used by graphlib-dot.
        */
      @JSGlobal("graphlibDot.graphlib")
      @js.native
      val graphlib: Any = js.native
      
      /**
        * Reads a single DOT graph from the str and returns it a Graph representation.
        * @param str a string in the DOT language representing a graph
        */
      inline def read(str: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(str.asInstanceOf[js.Any]).asInstanceOf[Graph]
      
      /**
        * Parses one or more DOT graphs from str in a manner similar to that used by parse for individual graphs.
        * @param str a string in the DOT language representing one or more graphs
        */
      inline def readMany(str: String): js.Array[Graph] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMany")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Graph]]
      
      /**
        * Writes a String representation of the given graph in the DOT language.
        * @param g a graphlib Graph object
        */
      inline def write(g: Graph): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(g.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  @JSImport("graphlib-dot", "graphlib")
  @js.native
  val graphlib: Any = js.native
  
  inline def read(str: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(str.asInstanceOf[js.Any]).asInstanceOf[Graph]
  
  inline def readMany(str: String): js.Array[Graph] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMany")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Graph]]
  
  inline def write(g: Graph): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(g.asInstanceOf[js.Any]).asInstanceOf[String]
}
