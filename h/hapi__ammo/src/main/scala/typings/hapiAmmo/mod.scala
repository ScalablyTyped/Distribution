package typings.hapiAmmo

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/ammo", "Clip")
  @js.native
  class Clip protected () extends Transform {
    /**
      * Constructs a new transform steam.
      * 
      * @param range - the requested range.
      */
    def this(range: Range) = this()
  }
  
  @JSImport("@hapi/ammo", "header")
  @js.native
  def header(header: String, length: Double): Null | js.Array[Range] = js.native
  
  @js.native
  trait Range extends StObject {
    
    /**
      * The range start position (inclusive).
      */
    val from: Double = js.native
    
    /**
      * The range end position (inclusive).
      */
    val to: Double = js.native
  }
  object Range {
    
    @scala.inline
    def apply(from: Double, to: Double): Range = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
