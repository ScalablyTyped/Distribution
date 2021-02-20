package typings.graphlibDot

import typings.graphlib.mod.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object graphlibDot {
      
      /**
        * Contains the version of the graphlib library used by graphlib-dot.
        */
      @JSGlobal("graphlibDot.graphlib")
      @js.native
      val graphlib: js.Any = js.native
      
      /**
        * Reads a single DOT graph from the str and returns it a Graph representation.
        * @param str a string in the DOT language representing a graph
        */
      @JSGlobal("graphlibDot.read")
      @js.native
      def read(str: String): Graph = js.native
      
      /**
        * Parses one or more DOT graphs from str in a manner similar to that used by parse for individual graphs.
        * @param str a string in the DOT language representing one or more graphs
        */
      @JSGlobal("graphlibDot.readMany")
      @js.native
      def readMany(str: String): js.Array[Graph] = js.native
      
      /**
        * Writes a String representation of the given graph in the DOT language.
        * @param g a graphlib Graph object
        */
      @JSGlobal("graphlibDot.write")
      @js.native
      def write(g: Graph): String = js.native
    }
  }
  
  @JSImport("graphlib-dot", "graphlib")
  @js.native
  val graphlib: js.Any = js.native
  
  @JSImport("graphlib-dot", "read")
  @js.native
  def read(str: String): Graph = js.native
  
  @JSImport("graphlib-dot", "readMany")
  @js.native
  def readMany(str: String): js.Array[Graph] = js.native
  
  @JSImport("graphlib-dot", "write")
  @js.native
  def write(g: Graph): String = js.native
}
