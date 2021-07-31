package typings.hapiAmmo

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/ammo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def header(header: String, length: Double): Null | js.Array[Range] = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(header.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Null | js.Array[Range]]
  
  trait Range extends StObject {
    
    /**
      * The range start position (inclusive).
      */
    val from: Double
    
    /**
      * The range end position (inclusive).
      */
    val to: Double
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
