package typings.hat

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hat", JSImport.Namespace)
  @js.native
  val ^ : Hat = js.native
  
  type CreateRack = js.Function3[
    /* bits */ js.UndefOr[Double], 
    /* base */ js.UndefOr[Double], 
    /* expandBy */ js.UndefOr[Double], 
    Rack
  ]
  
  @js.native
  trait Hat extends StObject {
    
    def apply(): String = js.native
    def apply(bits: Double): String = js.native
    def apply(bits: Double, base: Double): String = js.native
    def apply(bits: Unit, base: Double): String = js.native
    
    def rack(): Rack = js.native
    def rack(bits: Double): Rack = js.native
    def rack(bits: Double, base: Double): Rack = js.native
    def rack(bits: Double, base: Double, expandBy: Double): Rack = js.native
    def rack(bits: Double, base: Unit, expandBy: Double): Rack = js.native
    def rack(bits: Unit, base: Double): Rack = js.native
    def rack(bits: Unit, base: Double, expandBy: Double): Rack = js.native
    def rack(bits: Unit, base: Unit, expandBy: Double): Rack = js.native
    @JSName("rack")
    var rack_Original: CreateRack = js.native
  }
  
  type HatsList = StringDictionary[Any]
  
  @js.native
  trait Rack extends StObject {
    
    def apply(): String = js.native
    def apply(data: Any): String = js.native
    
    var base: Double = js.native
    
    var bits: Double = js.native
    
    def get(id: String): Any = js.native
    
    var hats: HatsList = js.native
    
    def set(id: String, value: Any): Rack = js.native
  }
  
  type _To = Hat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Hat = ^
}
