package typings.lib0

import org.scalablytyped.runtime.Instantiable1
import typings.lib0.prngXoroshiro128plusMod.Xoroshiro128plus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prngMod {
  
  @JSImport("lib0/prng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lib0/prng", "DefaultPRNG")
  @js.native
  open class DefaultPRNG protected () extends Xoroshiro128plus {
    /**
      * @param {number} seed Unsigned 32 bit number
      */
    def this(seed: Double) = this()
  }
  @JSImport("lib0/prng", "DefaultPRNG")
  @js.native
  val DefaultPRNG: Instantiable1[/* seed */ Double, Xoroshiro128plus] = js.native
  
  inline def bool(gen: PRNG): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(gen.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def char(gen: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("char")(gen.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def create(seed: Double): PRNG = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(seed.asInstanceOf[js.Any]).asInstanceOf[PRNG]
  
  inline def int31(gen: PRNG, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int31")(gen.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def int32(gen: PRNG, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int32")(gen.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def int53(gen: PRNG, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int53")(gen.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def letter(gen: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("letter")(gen.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def oneOf[T](gen: PRNG, array: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(gen.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def real53(gen: PRNG): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("real53")(gen.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uint16Array(gen: PRNG, len: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("uint16Array")(gen.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  
  inline def uint32(gen: PRNG, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uint32")(gen.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uint32Array(gen: PRNG, len: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("uint32Array")(gen.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  
  inline def uint53(gen: PRNG, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uint53")(gen.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uint8Array(gen: PRNG, len: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("uint8Array")(gen.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def utf16Rune(gen: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf16Rune")(gen.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def utf16String(gen: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf16String")(gen.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def utf16String(gen: PRNG, maxlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utf16String")(gen.asInstanceOf[js.Any], maxlen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def word(gen: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("word")(gen.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def word(gen: PRNG, minLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("word")(gen.asInstanceOf[js.Any], minLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def word(gen: PRNG, minLen: Double, maxLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("word")(gen.asInstanceOf[js.Any], minLen.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def word(gen: PRNG, minLen: Unit, maxLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("word")(gen.asInstanceOf[js.Any], minLen.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PRNG extends StObject {
    
    /**
      * Generate new number
      */
    def next(): Double
    /**
      * Generate new number
      */
    @JSName("next")
    var next_Original: generatorNext
  }
  object PRNG {
    
    inline def apply(next: () => Double): PRNG = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[PRNG]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PRNG] (val x: Self) extends AnyVal {
      
      inline def setNext(value: () => Double): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type generatorNext = js.Function0[Double]
}
